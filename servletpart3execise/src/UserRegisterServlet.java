

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserRegisterServlet
 */
@WebServlet("/UserRegisterServlet")
public class UserRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegisterServlet() {
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
		
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String address=request.getParameter("address");
		
		request.getServletContext().setAttribute("name", name);
		request.getServletContext().setAttribute("password", password);
		request.getServletContext().setAttribute("email", email);
		request.getServletContext().setAttribute("gender", gender);
		request.getServletContext().setAttribute("address", address);
		
		if(name.equals("")||password.equals("")||email.equals("")) {			
			request.getRequestDispatcher("userRegister.html").include(request, response);;
			out.print("<p style='color:red'>Fill the blank!</p>");
		}else {
			
			request.getRequestDispatcher("userLogin.html").include(request, response);
			out.print("<p style='color:blue'>Successfully Register!!!</p>+'"+name+"'");			
		}
	}

}
