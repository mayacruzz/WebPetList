package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Maya Cruz - Gcruz
 * CIS175 - Spring 2024
 * Mar 18, 2024
 */
@Entity
public class ListDetails {
	
	@Id
	@GeneratedValue
	private int id;
    private String listName;
    private LocalDate listDate;
    @ManyToOne (cascade=CascadeType.PERSIST)
    private Owner owner;
    @OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
    private List<ListPet> listOfPets;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getListName() {
		return listName;
	}
	public void setListName(String listName) {
		this.listName = listName;
	}
	public LocalDate getListDate() {
		return listDate;
	}
	public void setListDate(LocalDate listDate) {
		this.listDate = listDate;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public List<ListPet> getListOfPets() {
		return listOfPets;
	}
	public void setListOfPets(List<ListPet> listOfPets) {
		this.listOfPets = listOfPets;
	}
    
	public ListDetails() {
		super();
	}
		
	@Override
	public String toString() {
		return "ListDetails [id=" + id + ", listName=" + listName + ", listDate=" + listDate + ", owner=" + owner
				+ ", listOfPets=" + listOfPets + "]";
	}
	public ListDetails(int id, String listName, LocalDate listDate, Owner owner, List<ListPet> listOfPets) {
		this.id = id;
		this.listName = listName;
		this.listDate = listDate;
		this.owner = owner;
		this.listOfPets = listOfPets; 
	}
	
	public ListDetails(String listName, LocalDate listDate, Owner owner, List<ListPet> listOfPets) {
		this.listName = listName;
		this.listDate = listDate;
		this.owner = owner;
		this.listOfPets = listOfPets;
	}
	
	public ListDetails(String listName, LocalDate listDate, Owner owner) {
		this.listName = listName;
		this.listDate = listDate;
		this.owner = owner;
	}

}