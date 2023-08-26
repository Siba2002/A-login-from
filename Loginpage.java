import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Loginpage extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String pwd,nm,eml,reg;
		nm=req.getParameter("txtnm");
		eml=req.getParameter("txtmail");
		pwd=req.getParameter("txtpwd");
		reg=req.getParameter("numreg");
		if(pwd.equals("Siba@12345"))
		{
			//pw.print("Hello"+ nm +"congrats");
			 pw.print("<HTML><center><BODY bgcolor=white text=red>");
		 pw.print("<font size=10>Succes!!!!</font>"); 
		 pw.print("</body></html>");
		}
		else
		{
			//pw.print("Sorry wrong passoward");
			 pw.print("<HTML><center><BODY bgcolor=white text=red>");
		 pw.print("<font size=10>Sorry wrong passoward</font>"); 
		 pw.print("</body></html>");
		}
	}
}
		
		