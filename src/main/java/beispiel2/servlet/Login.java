package beispiel2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/login","/GirisYap"})
public class Login extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		
		res.sendRedirect("login.html");
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		PrintWriter output = res.getWriter();
		
		//admin
		//admin123
		if(username.equals("admin") && password.equals("admin123")) {
			output.println("<h1>Entry successful!</h1>");
		}else if(username.equals("admin")) {
			output.println("<h1>The password incorrectly!</h1>");
		}else {
			output.println("<h1>The username is incorrect!</h1>");
		}
		
		
		
	}

}
