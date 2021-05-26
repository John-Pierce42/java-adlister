import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloWorld", urlPatterns = "/hello")

public class HelloWorldServlet extends HttpServlet {
//instantiating the name
    String name;

// instantiating the viewCount
     int viewCount;

     String reset;


    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.getWriter().println("<h1>Hello World!</h1>");

        name = req.getParameter("name");

        if(name != null){
            res.getWriter().println("<h2>Hello " + name + "!</h2>");
        } else {
            res.getWriter().println("<h2>Hello World!</h2>");
        }

//====== view counter =======================================================|

        viewCount++;

        reset = req.getParameter("reset");

        if(viewCount > 0){
            res.getWriter().println("Resetting to 0");
        } else {
            res.getWriter().println("The sites view count is: " + viewCount);
        }

        res.getWriter().println("The sites view count is: " + viewCount);
//        res.getWriter().println(req.getParameter("name"));
    }
}
