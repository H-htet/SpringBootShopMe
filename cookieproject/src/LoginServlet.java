

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("link.html").include(request, response);
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		if(password.equals("admin123")) {
			out.println("You are successfully logged in!");
			out.println("<br>Welcome, "+name);			
			Cookie ck=new Cookie("name", name);
			response.addCookie(ck);
		}else {
			out.print("sorry, username or password error!");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		out.close();
		
		/*PrintWriter out = response.getWriter();
		//request.getRequestDispatcher("welcome.html").include(request, response);
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		Cookie c[] = request.getCookies();*/
		
		
		
		
		
		/*if(ck!=null) {	
			String ckname = ck[0].getValue();	
			out.print(ckname);
			if(ckname.equals(name) && password.equals("admin123")) {
				out.println("Welcome Back, the visitor!!" + ckname);
			}
		}else {
				if(password.equals("admin123")) {
					out.println("Welcome "+name);
					out.println("You are the first visitor!!");					
				} else {
					out.print("sorry, username or password error!");
					request.getRequestDispatcher("login.html").include(request, response);
				}				
		}*/
		
		/*if(c!=null) {	
			request.getRequestDispatcher("welcome.html").include(request, response);
			String ckname = c[0].getValue();	
			out.print(ckname);
			if(ckname.equals(name) && password.equals("admin123")) {
				out.println("Welcome Back, the visitor!!" + ckname);
		}*/
		
		/*if(c!=null) 
		{	
			String ckname = c[0].getValue();	
			out.print(ckname);
			if(!ckname.equals("") || ckname!=null ) {
				if(ckname.equals(name)) {
					request.getRequestDispatcher("welcome.html").include(request, response);
					out.println("Welcome Back, the visitor!!" + ckname);
				}
			}
		} 
		
		if (c==null)
		{			
			if(password.equals("admin123")) {
				request.getRequestDispatcher("welcome.html").include(request, response);
				out.println("Welcome "+name);
				out.println("You are the first visitor!!");	
				Cookie ck=new Cookie("name", name);
				response.addCookie(ck);
			} else {				
				out.print("sorry, username or password error!");
				request.getRequestDispatcher("login.html").include(request, response);				
			}		
		}*/
		
		
	}
}
	
				
		
		
		/*if(password.equals("admin123")) {
			request.getRequestDispatcher("welcome.html").include(request, response);
			out.println("Welcome "+name);
			out.println("You are the first visitor!!");	
			Cookie ck=new Cookie("name", name);
			response.addCookie(ck);
		} 	
		
		else {
			out.print("sorry, username or password error!");
			request.getRequestDispatcher("login.html").include(request, response);
		}	*/	
		
	

	


