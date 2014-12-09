package Composite;

import Component.Expression;

public abstract class Operation implements Expression {

  public Operation(Expression left, Expression right) {}

  @Override
  public abstract void print();

  @Override
  public abstract double evaluate();


}
