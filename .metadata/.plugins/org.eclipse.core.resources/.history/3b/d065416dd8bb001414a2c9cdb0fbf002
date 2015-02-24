package visitor;

import syntaxtree.*;
import java.util.*;
import errorMsg.*;
// The purpose of this class is to:
// - link each variable reference to its corresponding VarDecl
//   (via its 'link' instance variable)
//   - undefined variable names are reported
// - link each type reference to its corresponding ClassDecl
//   - undefined type names are reported
// - link each Break expression to its enclosing While
//   statement
//   - a break that is not inside any while loop is reported
// - report conflicting local variable names (including formal
//   parameter names)
// - ensure that no instance variable has the name 'length'
public class Sem3Visitor extends ASTvisitor {
	
	Hashtable<String, ClassDecl> globalSymTab;
	ClassDecl currentClass;
	Hashtable<String, VarDecl> localSymTab;
	ErrorMsg errorMsg;
	Stack<While> loopStack;
	LocalVarDecl currentLocalDecl;
	
	public Sem3Visitor(Hashtable globalSymTb, ErrorMsg e) {
		errorMsg = e;
		initInstanceVars(globalSymTb);
	}

	private void initInstanceVars(Hashtable<String,ClassDecl> globalTab) {
		loopStack = new Stack<While>();
		globalSymTab = globalTab;
		localSymTab = new Hashtable<String,VarDecl>();
		currentClass = null;
		currentLocalDecl = null;
	}
}

	
