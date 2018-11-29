import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String fir1 = request.getParameter("first");
        String sec1 = request.getParameter("second");
        String ope = request.getParameter("operand");
        writer.println("<h1>Result</h1>");
        if (fir1 == "" || sec1 == ""){
            writer.println("Error!");
        } else if ("Addition".equals(ope)){
            float fir = Float.parseFloat(request.getParameter("first"));
            float sec = Float.parseFloat(request.getParameter("second"));
            writer.println(fir + " + " + sec + " = " + (fir+sec));
        } else if ("Subtraction".equals(ope)){
            float fir = Float.parseFloat(request.getParameter("first"));
            float sec = Float.parseFloat(request.getParameter("second"));
            writer.println(fir + " - " + sec + " = " + (fir-sec));
        } else if ("Multiplication".equals(ope)){
            float fir = Float.parseFloat(request.getParameter("first"));
            float sec = Float.parseFloat(request.getParameter("second"));
            writer.println(fir + " x " + sec + " = " + (fir*sec));
        } else if ("Division".equals(ope)){
            float fir = Float.parseFloat(request.getParameter("first"));
            float sec = Float.parseFloat(request.getParameter("second"));
            if (sec == 0){writer.println("Error!");} else {writer.println(fir + " / " + sec + " = " + (fir/sec));}
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
