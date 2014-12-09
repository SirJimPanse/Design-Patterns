package Composite;

import Visitor.Visitor;
import Component.Expression;

public class MinusOperation extends Operation {

	Expression left;
	Expression right;

	public MinusOperation(Expression left, Expression right) {
		super(left, right);
		this.left = left;
		this.right = right;
	}

	@Override
	public Expression getLeft() {
		return left;
	}

	@Override
	public Expression getRight() {
		return right;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}

}
