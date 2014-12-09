package Factory;

import Iterator.AbstractIterator;

public abstract class AbstractFactory {
	
	public abstract AbstractIterator getIterator(String iteratorType);

}
