import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="Color pages", urlPatterns="/pickcolors")
public class ColorPage extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response){

    }

}
