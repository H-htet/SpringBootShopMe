package bookmanagement.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bookmanagement.model.BookBean;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBookServlet() {
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
		BookBean  bean = new BookBean();
		bean.setBookCode(request.getParameter("code"));
		bean.setBookTitle(request.getParameter("title"));
		bean.setBookAuthor(request.getParameter("author"));
		bean.setBookPrice(request.getParameter("price"));		
		if(bean.getBookCode().equals("") || bean.getBookTitle().equals("") || bean.getBookAuthor().equals("") || bean.getBookPrice().equals("")){
			request.setAttribute("error", "Field cannot be blank!");
			request.setAttribute("bean", bean);
			request.getRequestDispatcher("addbook.jsp").forward(request, response);
		} else {
			List<BookBean> list= (List<BookBean>) request.getServletContext().getAttribute("list");
			if(list==null) {
				list=new ArrayList();
			}
			list.add(bean);
			request.getServletContext().setAttribute("list", list);
			request.getRequestDispatcher("displaybook.jsp").forward(request, response);
		}
		}

}
