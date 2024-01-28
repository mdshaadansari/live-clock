import java.io.IOException;
import java.io.Writer;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

@WebServlet("/test.jtc")
public class testServlet extends HttpServlet{ 
static int count=0; 

protected void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException { 
	count++;  
System.out.println("---service---:"+count   ); 
Writer out=res.getWriter(); 
 Date dt=new Date(); 
 out.write("<h1>"+  dt); 

 if(count<=10){  
res.setHeader("Refresh","1");    
 }else{ 
 
	 res.setHeader("Refresh", "1;URL=http://google.com");

 
  }
 }  
} 