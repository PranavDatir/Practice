package day4.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import day4.beans.Restaurant;
import day4.dao.DaoInterface;
import day4.dao.RestaurantDao;

/**
 * Servlet implementation class CreateRestaurantServlet
 */
@WebServlet("/CreateRestaurantServlet")
public class CreateRestaurantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//Capturing Restaurant specific information:
		String rest_Id = request.getParameter("restaurantId");
		String rest_Name = request.getParameter("restaurantName");
		String rest_Cuisine = request.getParameter("restaurantCuisine");
		String rest_Branches = request.getParameter("restaurantBranches");

		//Converting the Strings into Integers as required
		int r_id = Integer.parseInt(rest_Id);
		int r_branches = Integer.parseInt(rest_Branches);
		//System.out.println(rest_id + " " + rest_name + " " + rest_cuisine + " " + rest_branches);
		
		//Populating a Restaurant object based upon the information coming from client
		Restaurant rst = new Restaurant(r_id, rest_Name, rest_Cuisine, r_branches);
		//Populating RestaurantDao object to perform Record Insertion
		DaoInterface<Restaurant, Integer> idao = new RestaurantDao();
		//Invoking 'create()' method to insert the record
		idao.create(rst);
		out.println("<h2>Restaurant created successfully..</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
