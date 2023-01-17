package web;
import dao.UserDao;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException,IOException{
		
		res.setContentType("text/html");		
		PrintWriter pw = res.getWriter();
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		try {
			if (UserDao.validate(username,password)){
				RequestDispatcher rs = req.getRequestDispatcher("");
				rs.forward(req, res);			
			}else {
				pw.println("Wrong username or password");
				RequestDispatcher rs = req.getRequestDispatcher("");
				rs.forward(req, res);
			}
		} catch (Exception e) {
			e.printStackTrace();		
		}
		
		
		
		
	}

}
