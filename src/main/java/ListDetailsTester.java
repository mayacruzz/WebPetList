import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import controller.ListDetailsHelper;
import controller.OwnerHelper;
import model.ListDetails;
import model.ListPet;
import model.Owner;

/**
 * Maya Cruz - Gcruz
 * CIS175 - Spring 2024
 * Mar 18, 2024
 */
public class ListDetailsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Owner cal = new Owner("Cal");
		
        ListDetailsHelper ldh = new ListDetailsHelper();
        
        ListPet cat = new ListPet("Cat", "Mittens", 4);
        ListPet dog = new ListPet("Dog", "Osa", 2);
        
        List<ListPet> calsPets = new ArrayList<ListPet>();
        	calsPets.add(cat);
        	calsPets.add(dog);
        	ListDetails calsList = new ListDetails("Cal's PetList", LocalDate.now(), cal);
        		        		 
        	calsList.setListOfPets(calsPets);
        	ldh.insertNewListDetails(calsList);
        	
        	List<ListDetails> allLists = ldh.getLists();
        	for(ListDetails a: allLists) {
        		System.out.println(a.toString());
        		}
	}
}
