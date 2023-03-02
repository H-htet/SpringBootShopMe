package jsptestproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProfileRegisterServlet
 */
@WebServlet("/ProfileRegisterServlet")
public class ProfileRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileRegisterServlet() {
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
		ProfileRegisterBean bean = new ProfileRegisterBean();		
		bean.setEmail(request.getParameter("email"));
		bean.setPassword(request.getParameter("password"));
		bean.setComfirm_password(request.getParameter("comfirm_password"));
		bean.setName(request.getParameter("name"));
		bean.setGender(request.getParameter("gender"));
		bean.setCourse(request.getParameter("course"));
		bean.setEducation(request.getParameter("education"));
		
		List<ProfileRegisterBean> list=new ArrayList();
		list.add(bean);
		request.getServletContext().setAttribute("list", list);
		request.getRequestDispatcher("login.jsp").forward(request, response);		
	}

}
