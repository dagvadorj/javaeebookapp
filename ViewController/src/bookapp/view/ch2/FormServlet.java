package bookapp.view.ch2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FormServlet", urlPatterns = { "/process", "/FormServlet" })
public class FormServlet extends HttpServlet {

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>FormServlet</title></head>");
        out.println("<body>"); 
        out.println("<form method='post' action='FormServlet'>");  
        out.println("Operator #1: <input name='op1' value='" + request.getParameter("a") + "' /><br />");  
        out.println("Operator #2: <input name='op2' /><br />");   
        out.println("<button type='submit'>Calculate</button>");    
        out.println("</form>");     
        out.println("</body>");
        out.println("</html>");

        out.close();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int a, b; 

        try { 
            a = Integer.parseInt(request.getParameter("op1")); 
            b = Integer.parseInt(request.getParameter("op2"));
        } catch (Exception e) { 
            response.sendError(400); 
            return; 
        } 

        PrintWriter out = response.getWriter(); 

        out.println(a + b); 
        out.close();
    }
}
