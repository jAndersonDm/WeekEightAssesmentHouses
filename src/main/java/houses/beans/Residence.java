/**
 * @author $${Josiah Anderson} - janderson78@dmacc.edu
 * CIS175 - Spring 2022
 * $${3/17/2022}
 */

package houses.beans;


import javax.persistence.Embeddable;

@Embeddable
public class Residence {

	private String name;
	private String phone;
	
	public Residence() {
		super();
	}

	public Residence(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	@Override
	public String toString() {
		return "Resident - name = " + name + ", phone = " + phone;
	}

	
}
