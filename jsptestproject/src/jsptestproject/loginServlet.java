package jsptestproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
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
		String l_email = request.getParameter("login_email");
		String l_passw = request.getParameter("login_passw"); 
		List<ProfileRegisterBean> list= (List<ProfileRegisterBean>) request.getServletContext().getAttribute("list");		
		Iterator<ProfileRegisterBean> itr = list.iterator();
		while(itr.hasNext()) {
			ProfileRegisterBean i = itr.next();	
			if(i.getEmail().equals(l_email) && i.getPassword().equals(l_passw)) {
				request.getSession().setAttribute("sesuser", i);
				request.getServletContext().setAttribute("auser", i);
				request.getRequestDispatcher("showAll.jsp").include(request, response);	
			}else {			
			request.getRequestDispatcher("login.jsp").include(request, response);
			out.println("<span style='color:red'>Email or Password incorrect</span>");
			}
		}
	}
}
