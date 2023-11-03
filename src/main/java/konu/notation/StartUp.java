package konu.notation;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/anasayfa"})
public class StartUp extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest reg, HttpServletResponse resp) throws IOException {
		PrintWriter writer = resp.getWriter();
		resp.setCharacterEncoding("UTF-8"); // tum karakterlere uyum saglamis olacak
		resp.setHeader("content-type", "text/html;charset=UTF-8"); //content-type tex.. oldugunu soyluyorum
		
		writer.write("<h1>HOSGELDINIZ</h1>");
		
		List<String> takimlar = new ArrayList<String>() {
			{
				add("Galatasaray");
				add("Fenerbahce");
				add("Besiktas");
				add("Trabzonspor");
			}
		};
		
		ArrayList<String> renkler = new ArrayList<>() {
			{
				add("red");
				add("blue");
				add("black");
				add("green");
			}
		};
		
		
		writer.write("<table>");
		writer.write("<tr>");
		writer.write("<th>");
		writer.write("Takimlar");
		writer.write("</th>");
		writer.write("</tr>");
		
		String[] stilRenkleri = new String[renkler.size()];
		stilRenkleri = renkler.toArray(stilRenkleri);
		
		int index = 0;
		
		for(String takim: takimlar) {
			writer.write("<tr>");
			writer.write("<td style='color:"+stilRenkleri[index++]+";'>");
			writer.write(takim);
			writer.write("</td>");
			writer.write("</tr>");
		}
		
		writer.write("</table>");
		
		
		
	}

}
