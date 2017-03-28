package com.snapshop.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("SERVER CALLED");
//		String sampleResponse = "[{'_id':'58d09213321ffe85db6ab9c1','itemId':132644,'itemTitle':'Canon T3i','price':'$3,238.23','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d0921311a39191888f3243','itemId':659090,'itemTitle':'Canon 5D Mark 3','price':'$1,438.38','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d09213df5e98207d677b78','itemId':236291,'itemTitle':'Canon T5i','price':'$1,269.75','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d09213f36e09820f865c89','itemId':908988,'itemTitle':'Canon T3i','price':'$3,920.77','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d092130a69a121986124b1','itemId':362126,'itemTitle':'Sony Cyber shot','price':'$1,998.21','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d09213e6d7bb12a3a24d60','itemId':671460,'itemTitle':'Nikon D7000','price':'$3,520.12','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d09213cd5df3a5f8d007ab','itemId':497943,'itemTitle':'Canon T5i','price':'$1,634.72','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'}]";
		String sampleResponse = "{'cards':{'card_1':{'cardName':'Shopping card Horizontal 1','items':[{'_id':'58d09213321ffe85db6ab9c1','itemId':132644,'itemTitle':'Canon T3i','price':'$3,238.23','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d0921311a39191888f3243','itemId':659090,'itemTitle':'Canon 5D Mark 3','price':'$1,438.38','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d09213df5e98207d677b78','itemId':236291,'itemTitle':'Canon T5i','price':'$1,269.75','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d09213f36e09820f865c89','itemId':908988,'itemTitle':'Canon T3i','price':'$3,920.77','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d092130a69a121986124b1','itemId':362126,'itemTitle':'Sony Cyber shot','price':'$1,998.21','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d09213e6d7bb12a3a24d60','itemId':671460,'itemTitle':'Nikon D7000','price':'$3,520.12','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d09213cd5df3a5f8d007ab','itemId':497943,'itemTitle':'Canon T5i','price':'$1,634.72','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'}]},'card_2':{'cardName':'Shopping card Vertical 1','items':[{'_id':'58d09213321ffe85db6ab9c1','itemId':132644,'itemTitle':'Canon T3i','price':'$3,238.23','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d0921311a39191888f3243','itemId':659090,'itemTitle':'Canon 5D Mark 3','price':'$1,438.38','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d09213df5e98207d677b78','itemId':236291,'itemTitle':'Canon T5i','price':'$1,269.75','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d09213f36e09820f865c89','itemId':908988,'itemTitle':'Canon T3i','price':'$3,920.77','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d092130a69a121986124b1','itemId':362126,'itemTitle':'Sony Cyber shot','price':'$1,998.21','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d09213e6d7bb12a3a24d60','itemId':671460,'itemTitle':'Nikon D7000','price':'$3,520.12','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d09213cd5df3a5f8d007ab','itemId':497943,'itemTitle':'Canon T5i','price':'$1,634.72','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'}]},'card_3':{'cardName':'Shopping card Horizontal 2','items':[{'_id':'58d09213321ffe85db6ab9c1','itemId':132644,'itemTitle':'Canon T3i','price':'$3,238.23','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d0921311a39191888f3243','itemId':659090,'itemTitle':'Canon 5D Mark 3','price':'$1,438.38','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d09213df5e98207d677b78','itemId':236291,'itemTitle':'Canon T5i','price':'$1,269.75','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d09213f36e09820f865c89','itemId':908988,'itemTitle':'Canon T3i','price':'$3,920.77','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d092130a69a121986124b1','itemId':362126,'itemTitle':'Sony Cyber shot','price':'$1,998.21','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d09213e6d7bb12a3a24d60','itemId':671460,'itemTitle':'Nikon D7000','price':'$3,520.12','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'},{'_id':'58d09213cd5df3a5f8d007ab','itemId':497943,'itemTitle':'Canon T5i','price':'$1,634.72','imageUrl':'http://thumbs.ebaystatic.com/images/g/EHIAAOSw4DJYj6MA/s-l225.jpg','actionUrl':'http://ebay.com/itm/undefined'}]}}}";
		response.setContentType("application/json");
	    response.getWriter().write(sampleResponse);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
