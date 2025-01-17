package ServletPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

import java.io.IOException;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import bean.User;
import database.DAOFactory;
import database.UserDao;
import database.UserImp;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String destination = "/register.jsp";
//		tạo userdao
		UserDao users = DAOFactory.getInstance().getUserDao();
//		Lay thong tin tu request
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		String role = request.getParameter("role");
//		them user vao session
		if (users.checkPass(email,password)!=null) {
			User user =users.checkPass(email,password);
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
//			chuyen des sang index
			destination = "/men.jsp";
			System.out.println("success");
		}
//		dieu huong sang index
		response.sendRedirect(request.getContextPath() + destination);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
