/**
 * 
 */
package hr.fer.oprpp1.custom.collections;

/** Class that is top level for a certain use within the other
 * 	class. Should not be used because it's functionality is
 * 	not implemented within this class.
 * 
 *  @author adrian
 *
 */
public interface Processor<E> {
	
	public void process(E value);
}
