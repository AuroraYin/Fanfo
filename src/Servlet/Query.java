package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eshore.DAOFactory;
import com.eshore.Restaurant;

/**
 * Servlet implementation class Query
 */
@WebServlet("/Query")
public class Query extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Query() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
//		Restaurant res=null;
//		String city=(request.getParameter("city"));
//		int id=(Integer.parseInt(request.getParameter("id")));
//		try {
//			res= DAOFactory.getIEmpRestaurantDAOInstance().findByUserId(id);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		List<Restaurant> res=null;
		String city=(request.getParameter("city"));
		String style=(request.getParameter("style"));
		String key=(request.getParameter("key"));
		int id=(Integer.parseInt(request.getParameter("id")));
		try {
			res= DAOFactory.getIEmpRestaurantDAOInstance().findByCityAndKey(city,key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getSession().setAttribute("res", res);
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/res_return.jsp");rd.forward(request,response);
	}

}
