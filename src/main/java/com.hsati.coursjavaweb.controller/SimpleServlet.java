package  com.hsati.coursjavaweb.controller;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SimpleServlet extends HttpServlet {

    private static final String MESSAGE = "une simple servlet";

    public int calcule(){
        int result = 0, a , b;
        a = 10;
        b = 13;
        result = a + b ;
        return result;
    }



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("MESSAGE",MESSAGE);
        req.setAttribute("attribut", calcule());
        this.getServletContext().getRequestDispatcher("/index.jsp").forward(req,resp); // faire le ien entre la servlet et la jsp

    }
}