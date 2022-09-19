package Cookies;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import jakarta.servlet.http.Cookie;
/**
 * Servlet implementation class cookie
 */
public class cookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	     Cookie[] cookies = request.getCookies();
	        if (cookies != null) {
	            for (Cookie cookie : cookies) {
	                if (cookie.getName().equals("name")) {
	                    request.setAttribute("name", cookie.getValue());
	                }
	            }
	        }
		this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		String lastname = request.getParameter("lastname");
		request.setAttribute("lastname", lastname);
		String age = request.getParameter("age");
		request.setAttribute("age", age);
		Cookie cookie = new Cookie("name",name);
		cookie.setMaxAge(60 * 60 );
		response.addCookie(cookie);
		this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);


	}

}
