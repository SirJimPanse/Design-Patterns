package Composite;

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
  public void print() {
    System.out.print("(");
    left.print();
    System.out.print("-");
    right.print();
    System.out.print(")");
  }

  @Override
  public double evaluate() {
    return left.evaluate() - right.evaluate();
  }

}
