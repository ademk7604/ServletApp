package beispiel1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/toplama","/addition"})
public class StartUp extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setHeader("content-type", "text/html;charset=UTF-8");
		
		resp.sendRedirect("index.html");
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setHeader("content-type", "text/html;charset=UTF-8");
		//Html dosyasini duzenleyelim
		
		PrintWriter output =resp.getWriter();
		
		int sayi1 = Integer.parseInt(req.getParameter("sayi1"));
		int sayi2 = Integer.parseInt(req.getParameter("sayi2"));
		
		output.println("<p>Sonuc: "+(sayi1+sayi2)+"</p>");
	}

}
