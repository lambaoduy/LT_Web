package ServletPackage;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.net.URL;
import java.util.StringTokenizer;

/**
 * Servlet implementation class CurrencyServlet
 */
@WebServlet("/updateCurrency")
public class CurrencyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CurrencyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Nhận giá trị từ dropdown (form)
		String selectedCurrency = request.getParameter("currency");

		// Cập nhật thông tin tiền tệ vào session hoặc cơ sở dữ liệu
		HttpSession session = request.getSession();
		session.setAttribute("currency", selectedCurrency);

		// Xử lý dựa trên giá trị tiền tệ được chọn
		String currencyName = "";
		switch (selectedCurrency) {
		case "USD":
			currencyName = "Dollar (USD)";
			break;
		case "EUR":
			currencyName = "Euro (EUR)";
			break;
		case "VND":
			currencyName = "Vietnam Dong (VND)";
			break;
		default:
			currencyName = "Unknown Currency";
			break;
		}
		String referer = request.getHeader("Referer");

        if (referer != null) {
            System.out.println("Page that referred this request: " + referer);
        } else {
            System.out.println("No referer found.");
        }
        URL url = new URL(referer);

        // Lấy phần đường dẫn (path)
        String path = url.getPath();

        // Tách phần cuối cùng (men.jsp)
        String filename = path.substring(path.lastIndexOf("/") + 1);
        System.out.println(filename);
		RequestDispatcher dispatcher = request.getRequestDispatcher(filename);
		dispatcher.forward(request, response);
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
