package Leaf;

import Visitor.Visitor;
import Component.Expression;

/**
 * @param args
 */
public class Operand implements Expression {
	double op;
	String var;

	public Operand(String var, double op) {
		this.op = op;
		this.var = var;
	}

	@Override
	public Expression getLeft() {
		return null;
	}

	@Override
	public Expression getRight() {
		return null;
	}
	
	public double getNum(){
		return op;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
