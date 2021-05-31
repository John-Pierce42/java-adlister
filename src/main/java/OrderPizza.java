import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Order Pizza", urlPatterns ="/pizza-order")
public class OrderPizza extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      request.getRequestDispatcher("/pizzaForm.jsp").forward(request, response);

  }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String crust = request.getParameter("crust_type");
        String sauce = request.getParameter("sauce_type");
        String toppings = request.getParameter("toppings");
        String size = request.getParameter("size");
        String address = request.getParameter("address");
//
        System.out.println(crust);
        System.out.println(sauce);
        System.out.println(toppings);
        System.out.println(size);
        System.out.println(address);

    }

}
