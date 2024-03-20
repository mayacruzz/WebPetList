import java.util.List;

import controller.OwnerHelper;
import model.Owner;

/**
 * Maya Cruz - Gcruz
 * CIS175 - Spring 2024
 * Mar 17, 2024
 */
public class OwnerTester {
	
	public static void main(String[] args) {
		
		Owner hillary = new Owner("Hillary");
        OwnerHelper oh = new OwnerHelper();
        oh.insertOwner(hillary);
        
        Owner tracey = new Owner("Tracey");
        oh.insertOwner(tracey);

        
        List<Owner> allOwners = oh.showAllOwners();
        for(Owner a: allOwners) {
             System.out.println(a.toString());
        }
	}
}
