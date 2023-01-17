package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import dao.UserDao;

@WebServlet("/register")
public class UserServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserDao userDao;
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
			throws ServletException, IOException{
		
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		int age = Integer.parseInt(req.getParameter("age"));
		
		User user = new User(fname,lname,username,password,age);
		
		try {
			userDao.registerUser(user);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
