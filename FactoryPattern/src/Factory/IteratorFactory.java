package Factory;

import Iterator.AbstractIterator;
import Iterator.PostOrderIterator;
import Iterator.PreOrderIterator;
import Iterator.InOrderIterator;

public class IteratorFactory extends AbstractFactory {

	@Override
	public AbstractIterator getIterator(String iteratorType) {
		if (iteratorType == null) {
			return null;
		}
		
		if (iteratorType.equalsIgnoreCase("PostOrderIterator")) {
			return new PostOrderIterator();
		} else if (iteratorType.equalsIgnoreCase("InOrderIterator")) {
			return new InOrderIterator();
		} else if (iteratorType.equalsIgnoreCase("PreOrderIterator")) {
			return new PreOrderIterator();
		}
		
		return null;
	}

}
