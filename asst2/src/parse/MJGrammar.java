package parse;
import java.util.List;
import errorMsg.*;
import syntaxtree.*;

public class MJGrammar
		implements wrangLR.runtime.MessageObject, wrangLR.runtime.FilePosObject {
	
	public static final boolean FILTER_GRAMMAR = true;
	
	// constructor
	public MJGrammar(ErrorMsg em) {
		errorMsg = em;
		topObject = null;
	}
	
	// error message object
	private ErrorMsg errorMsg;
	
	// object returned by the parse
	private Program topObject;

	// method for printing error message
	public void error(int pos, String msg) {
		errorMsg.error(pos, msg);
	}

	// method for printing warning message
	public void warning(int pos, String msg) {
		errorMsg.warning(pos, msg);
	}

	// method for converting file position to line/character
	// position
	public String filePosString(int pos) {
		return errorMsg.lineAndChar(pos);
	}
	
	// method to register a newline
	public void registerNewline(int pos) {
		errorMsg.newline(pos-1);
	}

	// returns the object produced by the parse
	public Program parseResult() {
		return topObject;
	}
	
	//===============================================================
	// start symbol
	//===============================================================

	//: <start> ::= ws* <program> =>
	public void topLevel(Program obj) {
		topObject = obj;
	}
	
	//================================================================
	//top-level program constructs
	//================================================================

	//: <program> ::= # <class decl>+ =>
	public Program createProgram(int pos, List<ClassDecl> vec) {
		return new Program(pos, new ClassDeclList(vec));
	}

	//: <extendsID> ::= `extends ID => pass
	//: <class decl> ::= `class # ID <extendsID>? `{ <decl in class>* `} =>
	public ClassDecl createClassDecl(int pos, String name, String str, List<Decl> vec) {
		
		if(str == null){
			return new ClassDecl(pos, name, "Object", new DeclList(vec));
		}
		
		return new ClassDecl(pos, name, str, new DeclList(vec));
	}
	
	

	//: <decl in class> ::= <method decl> => pass
	//: <decl in class> ::= <instVarDecl> => pass

	
    //: <instVarDecl> ::= <type> # ID `; =>
    public Decl newInstVarDecl(Type type, int pos, String str) {
        return new InstVarDecl(pos, type, str);
    }
	
	//: <method decl> ::= `public `void # ID `( `) `{ <stmt>* `} =>
	public Decl createMethodDeclVoid(int pos, String name, List<Statement> stmts) {
		return new MethodDeclVoid(pos, name, new VarDeclList(new VarDeclList()),
				new StatementList(stmts));
	}
	
	//: <method decl> ::= `public `void # ID `( <formal list> `) `{ <stmt>* `} =>
	public Decl createMethodDeclVoidFormal(int pos, String str, VarDeclList list, List<Statement> stmts) {
		return new MethodDeclVoid(pos, str, list, new StatementList(stmts));
	}
	
	//: <method decl> ::= `public <type> # ID `( `) `{ <stmt>* `return <exp> `; `} =>
	public Decl createMethodDeclNonVoid(Type type, int pos, String str, List<Statement> stmts, Exp exp) {
		return new MethodDeclNonVoid(pos, type, str, new VarDeclList(new VarDeclList()), new StatementList(stmts), exp);
	}

	//: <method decl> ::= `public <type> # ID `( <formal list> `) `{ <stmt>* `return <exp> `; `} =>
	public Decl createMethodDeclNonVoidWithElements(Type type, int pos, String str, VarDeclList list, List<Statement> stmts, Exp exp){
		return new MethodDeclNonVoid(pos, type, str, list, new StatementList(stmts), exp);
	}
	
	
	//: <type> ::= # `int =>
	public Type intType(int pos) {
		return new IntegerType(pos);
	}
	//: <type> ::= # `boolean =>
	public Type booleanType(int pos) {
		return new BooleanType(pos);
	}
	//: <type> ::= # ID =>
	public Type identifierType(int pos, String name) {
		return new IdentifierType(pos, name);
	}
	//: <type> ::= # <type> <empty bracket pair> =>
	public Type newArrayType(int pos, Type t, Object dummy) {
		return new ArrayType(pos, t);
	}
	
    //: <listElm> ::= `, <type> # ID => 
    public VarDecl newListElement(Type type, int pos, String str){
    	return new FormalDecl(pos, type, str);
    }
    
    //: <formal list> ::= `( <type> # ID <listElm>* `) =>
    public VarDeclList newVarDeclList(Type type, int pos, String str, List<VarDecl> elements){
    	VarDecl firstElm = new FormalDecl(pos, type, str);
    	elements.add(firstElm);
    	return new VarDeclList(elements);
    }
    

	//: <empty bracket pair> ::= `[ `] => null

	//================================================================
	//statement-level program constructs
	//================================================================
	
	//: <stmt> ::= <assign> `; => pass
	
	//: <stmt> ::= # <call exp> `; => 
	public Statement newCall(int pos, Exp exp){
		return new ExpStatement(pos, exp);
	}
	
	//: <stmt> ::= # `{ <stmt>* `} =>
	public Statement newBlock(int pos, List<Statement> sl) {
		return new Block(pos, new StatementList(sl));
	}
	
	//: <stmt> ::= <local var decl> `; => pass
	
    //: <stmt> ::= # `while `( <exp> `) <stmt> =>
    public Statement newWhile(int pos, Exp exp, Statement stmt) {
        return new While(pos, exp, stmt);
    }
    
    //if needs to be in two methods
    //: <stmt> ::= # `if `( <exp> `) <stmt> `else <stmt> =>
    public Statement newIfElse(int pos, Exp exp, Statement stmt1, Statement stmt2){
    	return new If(pos, exp, stmt1, stmt2);
    }
    
    //: <stmt> ::= # `if `( <exp> `) <stmt> !`else <stmt> =>
    public Statement newIf(int pos, Exp exp, Statement stmt1, Statement stmt2){
    	return new If(pos, exp, stmt1, stmt2);
    }    
	
	//: <assign> ::= <exp> # `= <exp> =>
	public Statement assign(Exp lhs, int pos, Exp rhs) {
		return new Assign(pos, lhs, rhs);
	}

	//: <local var decl> ::= <type> # ID `= <exp> =>
	public Statement localVarDecl(Type t, int pos, String name, Exp init) {
		return new LocalVarDecl(pos, t, name, init);
	}
	
    //: <stmt> ::= # `break `; =>
    public Statement newBreak(int pos) {
        return new Break(pos);
    }
    //: <stmt> ::= # `; =>
    public Statement newEmptyStatement(int pos) {
        return new Block(pos, new StatementList());
    }
	
	//================================================================
	//assign
	//================================================================
	
	//: assign ::= # `++ ID =>
	public Statement newPlusPlusAssign(int pos, String str){
		return new Assign(pos, new IdentifierExp(pos, str), new IdentifierExp(pos, str));
	}
	
	//: assign ::= # `-- ID =>
	public Statement newMinusMinusAssign(int pos, String str){
		return new Assign(pos, new IdentifierExp(pos, str), new IdentifierExp(pos, str));
	}

	//: assign ::= # ID `++ =>
	public Statement newAssignPlusPlus(int pos, String str){
		return new Assign(pos, new IdentifierExp(pos, str), new IdentifierExp(pos, str));
	}
	
	//: assign ::= # ID `-- =>
	public Statement newAssignMinusMinus(int pos, String str){
		return new Assign(pos, new IdentifierExp(pos, str), new IdentifierExp(pos, str));
	}
	//================================================================
	//expressions
	//================================================================
	
	//: <exp> ::= <exp> # `|| <exp2> =>
	public Exp newOr(Exp e1, int pos, Exp e2){
		return new Or(pos, e1, e2);
	}
	
	//: <exp> ::= <exp2> => pass
	
	//: <exp2> ::= <exp2> # `&& <exp3> =>
	public Exp newAnd(Exp e1, int pos, Exp e2){
		return new And(pos, e1, e2);
	}
	//: <exp2> ::= <exp3> => pass
	
	//: <exp3> ::= <exp3> # `!= <exp4> =>
	public Exp newNotEqual(Exp e1, int pos, Exp e2){
		return new Not(pos, new Equals(pos, e1, e2));
	}
	
	//: <exp3> ::= <exp3> # `== <exp4> =>
	public Exp newEqualEquals(Exp e1, int pos, Exp e2){
		return new Equals(pos, e1, e2);
	}
	
	//: <exp3> ::= <exp4> => pass
	
	//: <exp4> ::= <exp4> # `< <exp5> =>
	public Exp newLessThan(Exp e1, int pos, Exp e2){
		return new LessThan(pos, e1, e2);
	}
	//: <exp4> ::= <exp4> # `> <exp5> =>
	public Exp newGreaterThan(Exp e1, int pos, Exp e2){
		return new GreaterThan(pos, e1, e2);
	}
	//: <exp4> ::= <exp4> # `instanceof ID =>
	public Exp newInstanceOf(Exp exp, int pos, String str){
		return new InstanceOf(pos, exp, identifierType(pos, str));
	}
	//: <exp4> ::= <exp4> # `<= <exp5> =>
	public Exp newLessThanOrEqual(Exp e1, int pos, Exp e2){
		return new Not(pos, new GreaterThan(pos, e1, e2));
	}
	//: <exp4> ::= <exp4> # `>= <exp5> =>
	public Exp newGreaterThanOrEqual(Exp e1, int pos, Exp e2){
		return new Not(pos, new LessThan(pos, e1, e2));
	}

	//: <exp4> ::= <exp5> => pass
	
	//: <exp5> ::= <exp5> # `+ <exp6> =>
	public Exp newPlus(Exp e1, int pos, Exp e2) {
		return new Plus(pos, e1, e2);
	}
	//: <exp5> ::= <exp5> # `- <exp6> =>
	public Exp newMinus(Exp e1, int pos, Exp e2){
		return new Minus(pos, e1, e2);
	}
	
	//: <exp5> ::= <exp6> => pass

	//: <exp6> ::= <exp6> # `* <exp7> =>
	public Exp newTimes(Exp e1, int pos, Exp e2) {
		return new Times(pos, e1, e2);
	}
	//: <exp6> ::= <exp6> # `/ <exp7> =>
	public Exp newDivide(Exp e1, int pos, Exp e2) {
		return new Divide(pos, e1, e2);
	}
	//: <exp6> ::= <exp6> # `% <exp7> =>
	public Exp newRemainder(Exp e1, int pos, Exp e2) {
		return new Remainder(pos, e1, e2);
	}
	
	//: <exp6> ::= <exp7> => pass

	//: <exp7> ::= <cast exp> => pass
	//: <exp7> ::= <unary exp> => pass

	//: <cast exp> ::= # `( <type> `) <cast exp> =>
	public Exp newCast(int pos, Type t, Exp e) {
		return new Cast(pos, t, e);
	}
	//: <cast exp> ::= # `( <type> `) <exp8> => Exp newCast(int, Type, Exp)

	//: <unary exp> ::= # `- <unary exp> =>
	public Exp newUnaryMinus(int pos, Exp e) {
		return new Minus(pos, new IntegerLiteral(pos, 0), e);
	}
	//: <unary exp> ::= # `+ <unary exp> =>
	public Exp newUnaryPlus(int pos, Exp e) {
		return new Plus(pos, new IntegerLiteral(pos, 0), e);
	}
	//: <unary exp> ::= # `! <unary exp> =>
	public Exp newUnaryNot(int pos, Exp e) {
		return new Not(pos, e);
	}

	//: <unary exp> ::= <exp8> => pass

	//: <exp8> ::= # ID  =>
	public Exp newIdentfierExp(int pos, String name) {
		return new IdentifierExp(pos, name);
	}
	//: <exp8> ::= <exp8> !<empty bracket pair> # `[ <exp> `] =>
	public Exp newArrayLookup(Exp e1, int pos, Exp e2) {
		return new ArrayLookup(pos, e1, e2);
	}
	//: <exp8> ::= # INTLIT =>
	public Exp newIntegerLiteral(int pos, int n) {
		return new IntegerLiteral(pos, n);
	}
	//: <exp8> ::= # STRINGLIT =>
	public Exp newStringLiteral(int pos, String str) {
		return new StringLiteral(pos, str);
	}
	//: <exp8> ::= # CHARLIT =>
	public Exp newCharLiteral(int pos, int val){
		return new IntegerLiteral(pos, val);
	}
	//: <exp8> ::= # `false =>
	public Exp newFalse(int pos){
		return new False(pos);
	}
	//: <exp8> ::= # `this =>
	public Exp newThis(int pos){
		return new This(pos);
	}
	//: <exp8> ::= # `true =>
	public Exp newTrue(int pos){
		return new True(pos);
	}
	//: <exp8> ::= # `null =>
	public Exp newNull(int pos){
		return new Null(pos);
	}
	//: <exp8> ::= # <exp8> `. ID =>
	public Exp newInstVarAccess(int pos, Exp exp, String str){
		return new InstVarAccess(pos, exp, str);
	}
	//: <exp8> ::= # `new ID `( `) =>
	public Exp newIdentity(int pos, String str){
		IdentifierType type = new IdentifierType(pos, str);
		return new NewObject(pos, type);
	}
	//: <exp8> ::= !<cast exp> `( <exp> `) => pass
    
	//: <exp8> ::= <call exp> => pass
	
	//: <call exp> ::= # <exp8> `. ID `( <exp list> `) =>
    public Exp newCallExp(int pos, Exp exp, String str, ExpList expList) {
        return new Call(pos, exp, str, expList);
    }
	
    //: <recurse> ::= `, <exp8> => pass
    //: <exp list> ::= <exp8> <recurse>* =>
    public ExpList newExpList(Exp e1, List<Exp> e2) {
        e2.add(e1);
        return new ExpList(e2);
    }
    
    //: <call exp> ::= # `super `. ID `( <exp list>? `) =>
    public Exp newSuperMethod(int pos, String str, ExpList expList) {
        return new Call(pos, new Super(pos), str, expList);
    }
    
    //: <call exp> ::= # ID `( <exp list>? `) => 
	public Exp newThisMethod(int pos, String str, ExpList expList){
		return new Call(pos, new This(pos), str, expList);
	}
	
	
	//================================================================
	// Lexical grammar for filtered language begins here: DO NOT MODIFY
	// ANYTHING BELOW THIS, UNLESS YOU REPLACE IT WITH YOUR ENTIRE
	// LEXICAL GRAMMAR, and set the constant FILTER_GRAMMAR (defined
	// near the top of this file) to false.
	//================================================================

	//: letter ::= {"a".."z" "A".."Z"} => pass
	//: letter128 ::= {225..250 193..218} =>
	public char sub128(char orig) {
		return (char)(orig-128);
	}
	//: digit ::= {"0".."9"} => pass
	//: digit128 ::= {176..185} => char sub128(char)
	//: any ::= {0..127} => pass
	//: any128 ::= {128..255} => char sub128(char)
	//: ws ::= " "
	//: ws ::= {10} registerNewline
	//: registerNewline ::= # => void registerNewline(int)
	//: `boolean ::= "#bo" ws*
	//: `class ::= "#cl" ws*
	//: `extends ::= "#ex" ws*
	//: `void ::= "#vo" ws*
	//: `int ::= "#it" ws*
	//: `while ::= "#wh" ws*
	//: `if ::= '#+' ws*
	//: `else ::= "#el" ws*
	//: `for ::= "#fo" ws*
	//: `break ::= "#br" ws*
	//: `this ::= "#th" ws*
	//: `false ::= '#fa' ws*
	//: `true ::= "#tr" ws*
	//: `super ::= "#su" ws*
	//: `null ::= "#nu" ws*
	//: `return ::= "#re" ws*
	//: `instanceof ::= "#in" ws*
	//: `new ::= "#ne" ws*
	//: `abstract ::= "#ab" ws*
	//: `assert ::= "#as" ws*
	//: `byte ::= "#by" ws*
	//: `case ::= "#ce" ws*
	//: `catch ::= "#ca" ws*
	//: `char ::= "#ch" ws*
	//: `const ::= "#ct" ws*
	//: `continue ::= "#co" ws*
	//: `default ::= "#de" ws*
	//: `do ::= "#-" ws*
	//: `double ::= "#do" ws*
	//: `enum ::= "#en" ws*
	//: `final ::= "#fi" ws*
	//: `finally ::= "#fy" ws*
	//: `float ::= "#fl" ws*
	//: `goto ::= "#go" ws*
	//: `implements ::= "#is" ws*
	//: `import ::= "#im" ws*
	//: `interface ::= "#ie" ws*
	//: `long ::= "#lo" ws*
	//: `native ::= "#na" ws*
	//: `package ::= "#pa" ws*
	//: `private ::= "#pr" ws*
	//: `protected ::= "#pd" ws*
	//: `public ::= "#pu" ws*
	//: `short ::= "#sh" ws*
	//: `static ::= '#sc' ws*
	//: `strictfp ::= "#st" ws*
	//: `switch ::= "#sw" ws*
	//: `synchronized ::= "#sy" ws*
	//: `throw ::= "#tw" ws*
	//: `throws ::= "#ts" ws*
	//: `transient ::= "#tt" ws*
	//: `try ::= "#ty" ws*
	//: `volatile ::= "#ve" ws*
	
	//: `! ::=  "!" ws* => void
	//: `!= ::=  "@!" ws* => void
	//: `% ::= "%" ws* => void
	//: `&& ::= "@&" ws* => void
	//: `* ::= "*" ws* => void
	//: `( ::= "(" ws* => void
	//: `) ::= ")" ws* => void
	//: `{ ::= "{" ws* => void
	//: `} ::= "}" ws* => void
	//: `- ::= "-" ws* => void
	//: `+ ::= "+" ws* => void
	//: `= ::= "=" ws* => void
	//: `== ::= "@=" ws* => void
	//: `[ ::= "[" ws* => void
	//: `] ::= "]" ws* => void
	//: `|| ::= "@|" ws* => void
	//: `< ::= "<" ws* => void
	//: `<= ::= "@<" ws* => void
	//: `, ::= "," ws* => void
	//: `> ::= ">"  !'=' ws* => void
	//: `>= ::= "@>" ws* => void
	//: `: ::= ":" ws* => void
	//: `. ::= "." ws* => void
	//: `; ::= ";" ws* => void
	//: `++ ::= "@+" ws* => void
	//: `-- ::= "@-" ws* => void
	//: `/ ::= "/" ws* => void

	
	//: ID ::= letter128 ws* => text
	//: ID ::= letter idChar* idChar128 ws* => text
	
	//: INTLIT ::= {"1".."9"} digit* digit128 ws* => 
	public int convertToInt(char c, List<Character> mid, char last) {
		return Integer.parseInt(""+c+mid+last);
	}
	//: INTLIT ::= digit128 ws* => 
	public int convertToInt(char c) {
		return Integer.parseInt(""+c);
	}
	//: INTLIT ::= "0" hexDigit* hexDigit128 ws* => 
	public int convert16ToInt(char c, List<Character> mid, char last) {
		return Integer.parseInt(""+c+mid+last, 16);
	}
	//: STRINGLIT ::= '@"' ws* =>
	public String emptyString(char x, char xx) {
		return "";
	}
	//: STRINGLIT ::= '"' any* any128 ws* =>
	public String string(char x, List<Character> mid, char last) {
		return ""+mid+last;
	}
	//: CHARLIT ::= "'" any ws* =>
	public int charVal(char x, char val) {
		return val;
	}
	
	//: idChar ::= letter => pass
	//: idChar ::= digit => pass
	//: idChar ::= "_" => pass
	//: idChar128 ::= letter128 => pass
	//: idChar128 ::= digit128 => pass
	//: idChar128 ::= {223} => 
	public char underscore(char x) {
		return '_';
	}
	//: hexDigit ::= {"0".."9" "a".."z" "A".."Z"} => pass
	//: hexDigit128 ::= {176..185 225..230 193..198} => char sub128(char)

}

