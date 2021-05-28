import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="WonServlet", urlPatterns = "/correct")
public class WonServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String guess = request.getParameter("guess");

        if(guess.equals("2")){
            response.sendRedirect("/outcome.jsp");
        } else {
            response.sendRedirect("/outcome.jsp");
        }

        request.setAttribute("userguess", guess);
        request.getRequestDispatcher("/outcome.jsp").forward(request,response);
    }
}
