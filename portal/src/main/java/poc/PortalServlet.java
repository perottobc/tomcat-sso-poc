package poc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PortalServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setStatus(200);
		PrintWriter writer = response.getWriter();
		writer.println("<html><body>Do <a href=\"http://localhost:8080/analyze-1.0/\">Analyze</a></body></html>	");
		writer.close();
	}
}
