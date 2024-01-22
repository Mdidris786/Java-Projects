package document.ex;

import java.io.IOException;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
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
		// TODO Auto-generated method stub
String n=request.getParameter("txtUser");
		
		String p=request.getParameter("txtPass");
		
		
		PrintWriter pw=response.getWriter();
		if(n.equals(p))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Homepage.jsp");
			
			rd.forward(request,response);
			
		}
		else
		{
RequestDispatcher rd=request.getRequestDispatcher("Errorpage.jsp");
			
			rd.forward(request,response);
			
		}
	}

}
