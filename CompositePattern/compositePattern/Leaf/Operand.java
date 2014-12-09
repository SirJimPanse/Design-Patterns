package Leaf;

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
  public void print() {
    System.out.print(var + "(" + op + ")");
  }

  @Override
  public double evaluate() {
    return op;
  }



}
