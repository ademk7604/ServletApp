package konuGiris;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StartUp extends HttpServlet{
	// client ile server arasindaki iletisimi sagliyor
	//2. Servlet kaynak kodunun olustur.
	//2. web.xml icerisinde mapliyoruz
	//3. Apache Tomcat sunucusunu baslatiyoruz
	//4. web tarayisini acip Servlet imize istekte bulunuyoruz.
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTP-8");
		resp.setHeader("content-type", "text/html;UTF-8");
		
		PrintWriter printWriter = resp.getWriter();
		String str = "Merhabalar, Hos Geldiniz!";
		printWriter.write(str);
		
		
	}

}
