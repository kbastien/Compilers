package visitor;

import syntaxtree.*;

import errorMsg.*;
import java.io.*;

public class CG3Visitor extends ASTvisitor {


	// the purpose here is to annotate things with their offsets:
	// - formal parameters, with respect to the (callee) frame
	// - local variables, with respect to the frame
	// - instance variables, with respect to their slot in the object
	// - methods, with respect to their slot in the v-table
	// - while statements, with respect to the stack-size at the time
	//   of loop-exit
	
	// IO stream to which we will emit code
	CodeStream code;

	// current stack height
	int stackHeight;
	
	// error-message object
	ErrorMsg errorMsg;
	
	public CG3Visitor(ErrorMsg e, PrintStream out) {
		initInstanceVars(e, out);
	}
	
	private void initInstanceVars(ErrorMsg e, PrintStream out) {
		errorMsg = e;
		code = new CodeStream(out, errorMsg);
		stackHeight = 0;
	}
	
	public Object visitPlus(Plus n){
		n.left.accept(this);
		n.right.accept(this);
		
		code.emit(n, "lw $t0,($sp)");
		code.emit(n, "lw $t1,8($sp)");
		code.emit(n, "addu $t0,$t0,$t1");
		code.emit(n, "addu $sp,$sp,8");
		code.emit(n, "sw $t0,($sp)");
		stackHeight = stackHeight - 8;
		return null;
	}
	
	public Object visitMinus(Minus n){
		n.left.accept(this);
		n.right.accept(this);
		
		code.emit(n, "lw $t0,($sp)");
		code.emit(n, "lw $t1,8($sp)");
		
		//TODO: possibly with the operands reversed
		code.emit(n, "subu $t0,$t0,$t1");
		code.emit(n, "subu $sp,$sp,8");
		code.emit(n, "sw $t0,($sp)");
		stackHeight = stackHeight - 8;
		return null;
	}
	
	public Object visitIntegerLiteral(IntegerLiteral n){
		code.emit(n, "subu $sp,$sp,8");
		stackHeight = stackHeight - 8;
		code.emit(n, "sw $s5,4($sp)");
		code.emit(n, "li $t0," + n.val);
		code.emit(n, "sw $t0,($sp)");
		return null;
	}
	
	public Object visitStringLiteral(Null n){
		code.emit(n, "subu $sp,$sp,4");
		stackHeight = stackHeight - 4;
		code.emit(n, "la $t0," + n.uniqueId);
		code.emit(n, "sw $t0,($sp)");
		return null;
	}
	
	public Object visitThis(This n){
		code.emit(n, "subu $sp,$sp,4");
		stackHeight = stackHeight - 4;
		code.emit(n, "sw $s2,($sp)");
		return null;
	}
}


	
