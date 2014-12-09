package Client;

import Composite.MinusOperation;
import Composite.MultiOperation;
import Composite.Operation;
import Composite.PlusOperation;
import Leaf.Operand;

public class Client {

  public static void main(String[] args) {
    Operand varA = new Operand("a", 1);
    Operand varB = new Operand("b", 2);
    Operand varC = new Operand("c", 3);
    Operand varD = new Operand("d", 4);

    Operation root =
        new PlusOperation(new MultiOperation(new PlusOperation(varA, varB), new MinusOperation(
            varA, varC)), new MinusOperation(new MultiOperation(varB, varD), varA));

    root.print();
    System.out.println("= " + root.evaluate());

  }

}
