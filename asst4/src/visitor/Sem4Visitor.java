package visitor;

import syntaxtree.*;

import java.util.*;

import errorMsg.*;
// The purpose of this class is to do type-checking and related
// actions.  These include:
// - evaluate the type for each expression, filling in the 'type'
//   link for each
// - ensure that each expression follows MiniJava's type rules (e.g.,
//   that the arguments to '*' are both integer, the argument to
//   '.length' is an array, etc.)
// - ensure that each method-call follows Java's type rules:
//   - there exists a method for the given class (or a superclass)
//     for the receiver's object type
//   - the method has the correct number of parameters
//   - the types of each actual parameter is compatible with that
//     of its corresponding formal parameter
// - ensure that for each instance variable access (e.g., abc.foo),
//   there is an instance variable defined for the given class (or
//   in a superclass
//   - sets the 'varDec' link in the InstVarAccess to refer to the
//     method
// - ensure that the RHS expression in each assignment statement is
//   type-compatible with its corresponding LHS
//   - also checks that the LHS an lvalue
// - ensure that if a method with a given name is defined in both
//   a subclass and a superclass, that they have the same parameters
//   (with identical types) and the same return type
// - ensure that the declared return-type of a method is compatible
//   with its "return" expression
// - ensuring that the type of the control expression for an if- or
//   while-statement is boolean
public class Sem4Visitor extends ASTvisitor {
	
	ClassDecl currentClass;
	IdentifierType currentClassType;
	IdentifierType currentSuperclassType;
	ErrorMsg errorMsg;
	Hashtable<String,ClassDecl> globalSymTab;
	
	BooleanType theBoolType;
	IntegerType theIntType;
	NullType theNullType;
	VoidType theVoidType;
	IdentifierType theStringType;
	
	public Sem4Visitor(Hashtable<String,ClassDecl> globalSymTb, ErrorMsg e) {
		globalSymTab = globalSymTb;
		errorMsg = e;
		initInstanceVars();
	}

	private void initInstanceVars() {
		currentClass = null;
		
		theBoolType = new BooleanType(-1);
		theIntType = new IntegerType(-1);
		theNullType = new NullType(-1);
		theVoidType = new VoidType(-1);
		if (globalSymTab != null) {
			theStringType = new IdentifierType(-1, "String");
			theStringType.link = globalSymTab.get("String");
		}
	}
	
	public boolean matchTypesExact(Type have, Type need, int pos){
		if(have == null || need == null){
			return false;
		}
		else if(have.equals(need)){
			return true;
		}
		
		if(pos >= 0){
			errorMsg.error(pos,"Error: Incompatible types");
		}
		return false;	
	}
	
	public boolean matchTypesAssign(Type src, Type target, int pos){
		if(src == null || target == null){
			return false;
		}
		else if(((src instanceof VoidType) || (target instanceof VoidType)) && (pos >= 0)){
			errorMsg.error(pos,"Error: Incompatible types");
			return false;
		}
		else if(src.equals(target)){
			return true;
		}
		else if(src instanceof NullType && ((target instanceof IdentifierType) || (target instanceof ArrayType))){
			return true;
		}
		else if(src instanceof ArrayType){
			if(target instanceof IdentifierType){
				if(((IdentifierType)target).name.equals("Object")){
					return true;
				}
			}
		}
		//traversing thru all the superclasses to see if srs and target match
		else if((src instanceof IdentifierType) && (target instanceof IdentifierType)) {
			IdentifierType s = (IdentifierType) src;
			IdentifierType t = (IdentifierType) target;
			ClassDecl cd = s.link;
			
			if(((IdentifierType) t).name.equals("Object")){
				return true;
			}
			while(cd.superLink != null) {
				if(cd.name.equals(t.name)) {
					return true;
				}
				cd = cd.superLink;
			}
		}
		
		if(pos >= 0){
			errorMsg.error(pos,"Error: Incompatible types");
		}
		
		return false;
	}
	
	public boolean matchTypesEqCompare(Type t1, Type t2, int pos){
		if(t1 == null || t2 == null){
			return false;
		}
		else if(matchTypesAssign(t1, t2, -1)){
			return true;
		}
		else if(matchTypesAssign(t2, t1, -1)){
			return true;
		}
		if(pos >= 0){
			errorMsg.error(pos,"Error: Incompatible types");
		}	
		return false;
	}
	
	public InstVarDecl instVarLookup(String name, ClassDecl clas, int pos, String msg){
		if(clas.instVarTable.containsKey(name)){
			return clas.instVarTable.get(name);
		}
		//need to recurse thru looking in the instance variable
		//symbol table of the superclass, then the super-super-class, etc
		else if(instVarLookupHelp(name, clas) != null){
			return instVarLookupHelp(name, clas);
		}
		else{
			errorMsg.error(pos,msg);
			return null;
		}
	}
	
	//helper method for the instVarLookup
	private InstVarDecl instVarLookupHelp(String name, ClassDecl sup){
		if(sup.instVarTable.containsKey(name)){
			return sup.instVarTable.get(name);
		}
		else if(sup.superLink == null){
			return null;
		}
		
		return instVarLookupHelp(name, sup.superLink);
	}
	
	public InstVarDecl instVarLookup(String name, Type t, int pos, String msg){
		if(t == null){
			return null;
		}
		else if(!(t instanceof IdentifierType)){
			errorMsg.error(pos,msg);
			return null;
		}
		else{
			return instVarLookup(name, ((IdentifierType) t), pos, msg);
		}
	}
	
	public MethodDecl methodLookup(String name, ClassDecl clas, int pos, String msg){
		if(clas.methodTable.containsKey(name)){
			return clas.methodTable.get(name);
		}
		//need to recurse thru looking in the method
		//symbol table of the superclass, then the super-super-class, etc
		else if(methodLookupHelp(name, clas) != null){
			return methodLookupHelp(name, clas);
		}
		else{
			errorMsg.error(pos,msg);
			return null;
		}
	}
	
	private MethodDecl methodLookupHelp(String name, ClassDecl sup){
		if(sup.methodTable.containsKey(name)){
			return sup.methodTable.get(name);
		}
		
		if(sup.superLink == null){
			return null;
		}
		else{
			return methodLookupHelp(name, sup.superLink);	
		}
		
	}
	
	public MethodDecl methodLookup(String name, Type t, int pos, String msg){
		if(t == null){
			return null;
		}
		else if(!(t instanceof IdentifierType)){
			errorMsg.error(pos,msg);
			return null;
		}
		else{
			return methodLookup(name, ((IdentifierType) t).link, pos, msg);
		}
	}
	
	public Type returnTypeFor(MethodDecl md){
		if(md instanceof MethodDeclVoid){
			return theVoidType;
		}
		else{
			return ((MethodDeclNonVoid) md).rtnType;
		}
	}
	
	public Object visitIntegerLiteral(IntegerLiteral n){
		super.visitIntegerLiteral(n);
		n.type = theIntType;
		return null;
	}
	
	public Object visitStringLiteral(StringLiteral n){
		super.visitStringLiteral(n);
		n.type = theStringType;
		return null;
	}
	
	
	public Object visitIdentifierExp(IdentifierExp n){
		super.visitIdentifierExp(n);
		n.type = n.link.type;
		return null;
	}
	
	public Object visitNull(Null n){
		super.visitNull(n);
		n.type = theNullType;
		return null;
	}
	
	public Object visitTrue(True n){
		super.visitTrue(n);
		n.type = theBoolType;
		return null;
	}
	
	public Object visitFalse(False n){
		super.visitFalse(n);
		n.type = theBoolType;
		return null;
	}
	
	public Object visitThis(This n){
		super.visitThis(n);
		n.type = currentClassType;
		return null;
	}
	
	public Object visitSuper(Super n){
		super.visitSuper(n);
		n.type = currentSuperclassType;
		return null;
	}
	
	
	public boolean isBothMatch(Type lhs, Type rhs, int pos){
		if(matchTypesExact(lhs, theIntType, pos) && matchTypesExact(rhs, theIntType, pos)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public Object visitPlus(Plus n){
		super.visitPlus(n);
		if(isBothMatch(n.left.type, n.right.type, n.pos)){
			n.type = theIntType;
			return null;
		}
		else{
			errorMsg.error(n.pos, "Error: Both operands types don't exactly match");
			return null;
		}
	}
	
	public Object visitMinus(Minus n){
		super.visitMinus(n);
		if(isBothMatch(n.left.type, n.right.type, n.pos)){
			n.type = theIntType;
			return null;
		}
		else{
			errorMsg.error(n.pos, "Error: Both operands types don't exactly match");
			return null;
		}
	}
	
	public Object visitTimes(Times n){
		super.visitTimes(n);
		if(isBothMatch(n.left.type, n.right.type, n.pos)){
			n.type = theIntType;
			return null;
		}
		else{
			errorMsg.error(n.pos, "Error: Both operands types don't exactly match");
			return null;
		}
	}
	
	public Object visitDivide(Divide n){
		super.visitDivide(n);
		if(isBothMatch(n.left.type, n.right.type, n.pos)){
			n.type = theIntType;
			return null;
		}
		else{
			errorMsg.error(n.pos, "Error: Both operands types don't exactly match");
			return null;
		}
	}

	public Object visitRemainder(Remainder n){
		super.visitRemainder(n);
		if(isBothMatch(n.left.type, n.right.type, n.pos)){
			n.type = theIntType;
			return null;
		}
		else{
			errorMsg.error(n.pos, "Error: Both operands types don't exactly match");
			return null;
		}
	}
	
	public Object visitGreaterThan(GreaterThan n){
		super.visitGreaterThan(n);
		if(isBothMatch(n.left.type, n.right.type, n.pos)){
			n.type = theBoolType;
			return null;
		}
		else{
			errorMsg.error(n.pos, "Error: Both operands types don't both exactly match theIntType");
			return null;
		}
	}
	
	public Object visitLessThan(LessThan n){
		super.visitLessThan(n);
		if(isBothMatch(n.left.type, n.right.type, n.pos)){
			n.type = theBoolType;
			return null;
		}
		else{
			errorMsg.error(n.pos, "Error: Both operands types don't both exactly match theIntType");
			return null;
		}
	}
	
	public Object visitEquals(Equals n){
		super.visitEquals(n);
		if(matchTypesEqCompare(n.left.type, n.right.type, n.pos)){
			n.type = theBoolType;
			return null;
		}
		else{
			errorMsg.error(n.pos, "Error: Operand types don't match each other for equality");
			return null;	
		}
	}
	
	public Object visitNot(Not n){
		super.visitNot(n);
		if(matchTypesExact(n.type, theBoolType, n.pos)){
			n.type = theBoolType;
			return null;
		}
		else{
			errorMsg.error(n.pos, "Error: The operand type doesn't exactly match theBoolType");
			return null;
		}
	}
	
	public Object visitAnd(And n){
		super.visitAnd(n);
		if(matchTypesExact(n.left.type, theBoolType, n.pos) && matchTypesExact(n.right.type, theBoolType, n.pos)){
			n.type = theBoolType;
			return null;
		}
		else{
			errorMsg.error(n.pos, "Error: The operands types doesn't exactly match theBoolType");
			return null;
		}
	}
	
	public Object visitOr(Or n){
		super.visitOr(n);
		if(matchTypesExact(n.left.type, theBoolType, n.pos) && matchTypesExact(n.right.type, theBoolType, n.pos)){
			n.type = theBoolType;
			return null;
		}
		else{
			errorMsg.error(n.pos, "Error: The operands types doesn't exactly match theBoolType");
			return null;
		}
	}
	
	public Object visitArrayLength(ArrayLength n){
		super.visitArrayLength(n);
		if((n.exp.type != null) && matchTypesExact(n.exp.type, theBoolType, n.pos)){
			n.type = theIntType;
			return null;
		}
		else{
			errorMsg.error(n.pos, "Error: The operand type doesn't exactly match theBoolType");
			return null;
		}

	}
	
	public Object visitArrayLookup(ArrayLookup n){
		super.visitArrayLookup(n);
		if(matchTypesExact(n.idxExp.type, theIntType, n.pos) && (n.arrExp.type instanceof ArrayType) && (n.arrExp != null)){
			n.type = n.arrExp.type;
			return null;
		}
		else{
			errorMsg.error(n.pos, "Error: Incompatible types ");
			return null;
		}
	}
	
	public Object visitInstVarAccess(InstVarAccess n){
		super.visitInstVarAccess(n);
		if(n.exp.type == null){
			return null;
		}
		if(instVarLookup(n.varName, n.type, n.pos, "Error: Instance Variable not defined") != null){
			n.varDec = instVarLookup(n.varName, n.type, n.pos, "Instance Variable");
			n.type = n.varDec.type;
			return null;
		}
		else{
			errorMsg.error(n.pos, "Error: Instance variable is not defined");
			return null;
		}
	}
	
	public Object visitCast(Cast n){
		super.visitCast(n);
		if(!(matchTypesAssign(n.castType, n.exp.type, n.pos) && matchTypesAssign(n.exp.type, n.castType, n.pos))){
			errorMsg.error(n.pos, "Error: Types are not assignment-compatible");
		}
		n.type = n.castType;
		return null;
	}
	
	public Object visitInstanceOf(InstanceOf n){
		super.visitInstanceOf(n);
		if(!(matchTypesAssign(n.checkType, n.exp.type, n.pos) || matchTypesAssign(n.exp.type, n.checkType, n.pos))){
			errorMsg.error(n.pos, "Error: Incompatible types");
		}
		n.type = theBoolType;
		return null;
	}
	
	public Object visitNewObject(NewObject n){
		super.visitNewObject(n);
		n.type = n.objType;
		return null;
	}
	
	public Object visitNewArray(NewArray n){
		super.visitNewArray(n);
		if(matchTypesExact(n.sizeExp.type, theIntType, n.pos)){
			n.type = n.objType;
			return null;
		}
		else{
			return null;	
		}
	}
	
	public Object visitCall(Call n){
		super.visitCall(n);
		if(n.obj.type == null){
			return null;
		}
		n.methodLink = methodLookup(n.methName, n.obj.type, n.pos, "Error: Method does not exist");
		if(n.methodLink == null){
			return null;
		}
		//check that the number of actual parameters (in the call)
		//matches the number of formal parameters in the method declaration
		if(n.parms.size() != n.methodLink.formals.size()){
			errorMsg.error(n.pos, "Error: Incorrect number of parameters in the method declaration");
			return null;
		}
		else{
			for(int i=0; i < n.parms.size(); i++){
				matchTypesAssign(n.parms.elementAt(i).type, n.methodLink.formals.elementAt(i).type, n.parms.elementAt(i).pos);
			}
		}
		//sets the type field to be the method�s declared return-type
		n.type = this.returnTypeFor(n.methodLink);
		return null;
	}
	
	public Object visitAssign(Assign n){
		super.visitAssign(n);
		if(n.lhs.type == null || n.rhs.type == null){
			return null;
		}
		
		if(n.lhs instanceof IdentifierExp || n.lhs instanceof ArrayLookup || n.lhs instanceof InstVarAccess){
			if(matchTypesAssign(n.rhs.type, n.lhs.type, -1)){
				return null;
			}
			else{
				errorMsg.error(n.pos, "Error: Incompatible types, LHS and RHS don't match");
			}
		}
		else{
			errorMsg.error(n.pos, "Error: LHS is not a l-value");
		}
		return null;
	}
	
	public Object visitLocalVarDecl(LocalVarDecl n){
		super.visitLocalVarDecl(n);
        if(matchTypesAssign(n.initExp.type, n.type, -1)){
        	return null;
        }
        else{
        	errorMsg.error(n.initExp.pos, "Error: the type of the initialization-expression isn't assignment-compatible with the declared type of the variable");
        }
		return null;
	}
	
//	check that the type of the condition-expression exactly matches theBoolType
	public Object visitIf(If n){
		super.visitIf(n);
		if(matchTypesExact(n.exp.type, theBoolType, -1)){
        	return null;
        }
        else{
        	errorMsg.error(n.pos, "Error: the type of the if expression doesn't exactly matches");
        }
		return null;
	}
	
	public Object visitWhile(While n){
		super.visitWhile(n);
		if(matchTypesExact(n.exp.type, theBoolType, -1)){
        	return null;
        }
        else{
        	errorMsg.error(n.pos, "Error: the type of the while expression doesn't exactly matches");
        }
		return null;
	}
	
	public Object visitMethodDeclVoid(MethodDeclVoid n){
		super.visitMethodDeclVoid(n);
		while(currentClass.superLink != null){
			//if a superclass defines a method by the same name
			if(this.currentClass.superLink.methodTable.containsKey(n.name)){
				MethodDecl meth = currentClass.superLink.methodTable.get(n.name);
				//check: the superclass method is also a MethodDeclVoid
				if(!(meth instanceof MethodDeclNonVoid)){
					errorMsg.error(n.pos, "Error: Superclass method isn't a MethodDeclNonVoid");
					return null;
				}
				//check: the number of parameters for the two methods match exactly
				if(meth.formals.size() != n.formals.size()){
					errorMsg.error(n.pos, "Error: number of parameters don't match exactly");
					return null;
				}
				//check: the types of parameters for the two methods match exactly
				for(int i = 0; i < n.formals.size(); i++){
					matchTypesExact(n.formals.elementAt(i).type, meth.formals.elementAt(i).type, n.pos);
				}
				//set our superMethod field to that of the superclass method declaration
				n.superMethod = meth;
			}
			if(currentClass.superLink != null){
				currentClass = currentClass.superLink;
			}		
			else{
				break;
			}
		}
		return null;
	}
	
	public Object visitMethodDeclNonVoid(MethodDeclNonVoid n){
		super.visitMethodDeclNonVoid(n);
		if(!matchTypesAssign(n.rtnExp.type, n.rtnType, -1)){
        	errorMsg.error(n.rtnExp.pos, "Error: type of the return expression isn't assignment-compatible w/ declared return-type of the method");
        }
		
		while(currentClass.superLink != null){
			//if a superclass defines a method by the same name
			if(this.currentClass.superLink.methodTable.containsKey(n.name)){
				MethodDecl meth = currentClass.superLink.methodTable.get(n.name);
				//check: the superclass method is also a MethodDeclNonVoid
				if(!(meth instanceof MethodDeclNonVoid)){
					errorMsg.error(n.pos, "Error: Superclass method isn't a MethodDeclNonVoid");
					return null;
				}
				//check: number of parameters match exactly
				if(meth.formals.size() != n.formals.size()){
					errorMsg.error(n.pos, "Error: number of parameters don't match exactly");
					return null;
				}
				
				//check: types of parameters match exactly
				for(int i = 0; i < n.formals.size(); i++){
					matchTypesExact(n.formals.elementAt(i).type, meth.formals.elementAt(i).type, n.pos);
				}
				
				//check: the return types for the two methods match exactly
				//set set our superMethod field to that of the superclass method declaration
				if(matchTypesExact(n.rtnType, ((MethodDeclNonVoid) meth).rtnType , -1)){
					n.superMethod = meth;
					return null;
		        }
		        else{
		        	errorMsg.error(n.rtnType.pos, "Error: return types for the two methods don't match exactly");
		        }
			}
			if(currentClass.superLink != null){
				currentClass = currentClass.superLink;
			}		
			else{
				break;
			}
		}
		return null;
	}
	
	public Object visitClassDecl(ClassDecl n){
		//set currentClass to refer to this class declaration
		currentClass = n;
		//set currentClassType to refer to a new IdentifierTyp object that refers to this class
		IdentifierType id = new IdentifierType(n.pos, n.name);
		id.link = currentClass;
		currentClassType = id;
		
		//set currentSuperclassType to refer to a new IdentifierType object that refers to the ClassDecl that is this class� superclass
		IdentifierType sup = new IdentifierType(n.superLink.pos, n.superName);
		sup.link = n.superLink;
		currentSuperclassType = sup;
		
		super.visitClassDecl(n);
		return null;
	}
	
	
	
}
