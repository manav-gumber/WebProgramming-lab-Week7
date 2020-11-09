import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class File extends HttpServlet
{
  public void doGet(HttpServletRequest reg, HttpServletResponse res) throws ServletException, IOException
  {
    res.setContentType("text/html");
    PrintWriter p=res.getWriter();
    p.println("<html><head><title>Univ Mgmt</title></head><body>");
    p.println("<h1>Hello</h1><p style='color:blue;'><mark>");
    p.println("Servlet made by Apoorv Jain, Manav Gumber and Sweta Nayak using Tomcat and Xampp.");
    p.println("</mark></p>");
    p.println("<button><a href='http://localhost:82/web_dev/week_5/final%20no%20details/home.html'>Go to SAM UNIV Home");
    p.println("</a></button>");
    p.println("</body></html>");
    p.close();
  }
}
