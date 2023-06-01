package com.example.calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateServlet", urlPatterns = {"/calculate", ""})
public class CalculateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        show(request, response);
    }

    protected void show(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/index.jsp");
    }

    protected void calculate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float num1 = Float.parseFloat(request.getParameter("n1"));
        float num2 = Float.parseFloat(request.getParameter("n2"));
        char operator = request.getParameter("option").charAt(0);

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h2> Result :  </h2>");
        try{
            float result = result(num1,num2,operator);
            printWriter.println(num1 +" "+operator+" "+num2 +" = " +result);
        }catch (Exception e){
            printWriter.println("Error : "+e.getMessage());
        }
        printWriter.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        calculate(request,response);
    }
    private float result(float n1, float n2, char operator) {
        switch (operator) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '*':
                return n1 * n2;
            case '/':
                if (n2 != 0) {
                    return n1 / n2;
                } else {
                    throw new RuntimeException("Can't Divide by Zero");
                }
            default:
                throw new RuntimeException("Invalid operation");
        }
    }

}

