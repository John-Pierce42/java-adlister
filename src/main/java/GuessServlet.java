import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




        request.getRequestDispatcher("/guessing.jsp").forward(request,response);
  }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int random = (int)(Math.random() * 3 + 1);

//        System.out.println(request.getParameter("guess"));
        String guess = request.getParameter("guess");
        int num = Integer.parseInt(guess);

        System.out.println(random);
        String message = "";

        if(random == num){
            System.out.println("you got it right");;
            message = "you got it right!";
        } else{
            System.out.println("you got it wrong");
            message = "you got it wrong";
        }

        request.setAttribute("random", random);

        request.setAttribute("message", message);
        request.getRequestDispatcher("/outcome.jsp").forward(request,response);
    }
}
