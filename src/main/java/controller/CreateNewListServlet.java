package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListDetails;
import model.ListPet;
import model.Owner;

/**
 * Servlet implementation class CreateNewListServlet
 */
@WebServlet("/createNewListServlet")
public class CreateNewListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateNewListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ListPetHelper lih = new ListPetHelper();
        String listName = request.getParameter("listName");
        System.out.println("List Name: "+ listName);
        
        String month = request.getParameter("month");
        String day = request.getParameter("day");
        String year = request.getParameter("year");
        String ownerName = request.getParameter("ownerwName");
        LocalDate ld;
        try {
            ld = LocalDate.of(Integer.parseInt(year),
Integer.parseInt(month), Integer.parseInt(day));
       }catch(NumberFormatException ex) {
            ld = LocalDate.now();
       }
        
        String[] selectedItems = request.getParameterValues("allItemsToAdd");
        	List<ListPet> selectedItemsInList = new ArrayList<ListPet>();
        		//make sure something was selected – otherwise we get a null pointer exception
        		
        		if (selectedItems != null && selectedItems.length > 0)
        		{
        			if (selectedItems != null && selectedItems.length > 0)
        			for(int i = 0; i<selectedItems.length; i++) {
        			     System.out.println(selectedItems[i]);
        			     ListPet c =
        			lih.searchForItemById(Integer.parseInt(selectedItems[i]));
        			               selectedItemsInList.add(c);
        			} }
        			          Owner owner = new Owner(ownerName);
        			          ListDetails cld = new ListDetails(listName, ld,
        			owner);
        			          
        			          cld.setListOfPets(selectedItemsInList);
        			          ListDetailsHelper slh = new ListDetailsHelper();
        			          slh.insertNewListDetails(cld);
        			          
        			          System.out.println("Success!");
        			          System.out.println(cld.toString());
        			     getServletContext().getRequestDispatcher("/viewAllListsServlet").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
