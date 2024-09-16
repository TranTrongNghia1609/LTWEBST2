package vn.iostar.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/login","/dangnhap"})

public class LoginController extends HttpServlet{
	private static final long serialVersionUID = -5660203773190134466L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {

			    
		/*
		 * String username = req.getParameter("username"); String password =
		 * req.getParameter("password");
		 * 
		 * PrintWriter out = resp.getWriter();
		 * 
		 * out.println("<b>UserName<b>: " +username + "<br>" +"<b> PassWord<b>: "
		 * +password);
		 */
		RequestDispatcher rd = req.getRequestDispatcher("/views/index.html");
	    rd.forward(req, resp);
			     
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
				//Nhan du lieu tu request URL
			    String username = req.getParameter("username");
			    String password = req.getParameter("password");
			    String remember = req.getParameter("remember");
			    
			    String alerMsg = "";
			    //Truyen du lieu ra views	
			    boolean kt = false;
			    if(username.equals("nghia") && password.equals("123")){
			    	req.setAttribute("uName", username);
				    kt = true;
				    req.setAttribute("msg", kt);
			    }
			    else {
			    	kt = false;
			    	req.setAttribute("msg", kt);
			    }
			    
			    
			    RequestDispatcher rd = req.getRequestDispatcher("/views/home.jsp");
			    rd.forward(req, res);
			}
	

}
