/**
 * @author ${Josiah Anderson} - janderson78@dmacc.edu
 * CIS175 - Fall 2021
 * ${date}
 */
package houses.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Houses {

	@Id
	@GeneratedValue
	private long id;
	
	private String street;
	private String city;
	private String state;
	private int residenceNum;
	
	@Autowired
	private Residence headResident;
	
	
	public Houses(String street, String city) {
		super();
		this.street = street;
		this.city = city;
		this.residenceNum = 1;
	}
	
	public Houses(String street, String city, String state) {
		super();
		
		this.street = street;
		this.city = city;
		this.state = state;
		this.residenceNum = 1;
	}
	
	
	public Houses(String street, String city, String state, int numRes) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.residenceNum = numRes;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public int getResidenceNum() {
		return residenceNum;
	}
	public void setResidenceNum(int residenceNum) {
		this.residenceNum = residenceNum;
	}
	public Residence getHeadResident() {
		return headResident;
	}
	public void setHeadResident(Residence headResident) {
		this.headResident = headResident;
	}
	
	
	@Override
	public String toString() {
		return "House Info - id = " + id + ", " + "street = " + street + ", city = " + city + ", state = " + state + "Head resident = " + headResident + ", " + " Number of Residence = " + residenceNum;
	}
	
}
