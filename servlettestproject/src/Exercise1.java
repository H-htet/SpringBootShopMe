

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exercise1
 */
@WebServlet("/Exercise1")
public class Exercise1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exercise1() {
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
		String name = request.getParameter("name");
		String dob = request.getParameter("dob");
		String[] subject =  request.getParameterValues("subject");
		String gender = request.getParameter("gender");
		
		out.println("Name : "+name);
		out.println("DOB : " +dob);
		
		if("male".equals(gender)) {
			out.println("Gender : "+ gender);
		} else if("female".equals(gender)) {
			out.println("Gender : "+ gender);
		}
		
		for(String s:subject) 
			//out.println(s);	
			switch(s) {
			case "Java":
				out.println("Subject1 : "+s);	
				break;
			case "PHP":
				out.println("Subject2 : "+s);	
				break;
			case "Android":
				out.println("Subject3 : "+s);	
				break;
			case "ASP":
				out.println("Subject4 : "+s);	
				break;
			}
	}

}
