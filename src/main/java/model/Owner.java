package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Maya Cruz - Gcruz
 * CIS175 - Spring 2024
 * Mar 17, 2024
 */

@Entity
@Table(name="owner")
public class Owner {
	
	@Id
    @GeneratedValue
	private int id;
    private String ownerName;
	
    
	public Owner() {
		super();
	}

	public Owner(int id, String ownerName) {
		super();
		this.id = id;
		this.ownerName = ownerName;
	}
	
	public Owner(String ownerName) {
        super();
        this.ownerName = ownerName;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}

	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "Owner [id=" + id + ", ownerName=" + ownerName + "]";
	}


}
