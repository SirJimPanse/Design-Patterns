package Composite;

import Visitor.Visitor;
import Component.Expression;

public class PlusOperation extends Operation {

	Expression left;
	Expression right;

	public PlusOperation(Expression left, Expression right) {
		super(left, right);
		this.left = left;
		this.right = right;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

	@Override
	public Expression getLeft() {
		// TODO Auto-generated method stub
		return left;
	}

	@Override
	public Expression getRight() {
		// TODO Auto-generated method stub
		return right;
	}
}
