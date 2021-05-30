import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name="View Color", urlPatterns="/viewcolor")
public class ViewColor extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userColor = request.getParameter("color");

        request.setAttribute("userColor", userColor);
        request.getRequestDispatcher("/colorOutcome.jsp").forward(request, response);
    }
}
