import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Page Counter Servlet", urlPatterns = "/counter")
public class PageCounterServlet extends HttpServlet {

    private int counter;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        counter++;

        response.getWriter().println("<h1>The count of this page is : " + counter + ".</h1>");


    }

}
