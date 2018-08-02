/**
 * 
 */
package countries;

/**
 * @author juliadart
 *
 */
public class Countries {
	private String name;

	/**
	 * @param name
	 */
	public Countries(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

}
