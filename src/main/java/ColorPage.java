import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name="Color pages", urlPatterns="/pickcolor")
public class ColorPage extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/colorForm.jsp").forward(request, response);

    }

//    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String userColor = request.getParameter("color");
//
//        request.setAttribute("userColor", userColor);
//        request.getRequestDispatcher("/colorOutcome.jsp").forward(request, response);
//
//        System.out.println(request.getParameter("color"));
//    }

}
