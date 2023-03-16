package hr.fer.oprpp1.custom.scripting.elems;

import java.util.Objects;

/**	Class inherits Element class and it is used for creating elements representing function.
 *  
 * 	@author adrian
 *
 */

public class ElementFunction extends Element {
	private String name;
	
	/** Constructor for this class.
	 * 	
	 * @param String which represents a name of a function
	 */
	public ElementFunction(String name) {
		this.name = name;
	}
	
	/** Getter for name.
	 * 	
	 * @return String which represents name of a function
	 * 
	 */
	@Override
	public String asText() {
		return this.name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElementFunction other = (ElementFunction) obj;
		return Objects.equals(name, other.name);
	}
	
	

}
