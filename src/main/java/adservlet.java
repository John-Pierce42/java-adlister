import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;



@WebServlet(name = "ad ser", urlPatterns = "/ads")
public class adservlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            Ads adsDao = DaoFactory.getAdsDao();
            List<Ad> ads = adsDao.all();
        System.out.println(ads.size());
            request.setAttribute("ads", ads);
            request.getRequestDispatcher("ads/index.jsp").forward(request, response);
        }
    }

