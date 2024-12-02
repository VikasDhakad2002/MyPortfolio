package com.useservlet;

/**
 *
 * @author Neet
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String yourName = "Vikas";
        System.out.println("dynamic val"+ yourName);

        request.setAttribute("name", yourName);

        request.getRequestDispatcher("/home.jsp").forward(request, response);
//        response.sendRedirect("/home.jsp");
    }

//    private String getDynamicValue() {
//       
//        return "Prishi";
//    }
}
