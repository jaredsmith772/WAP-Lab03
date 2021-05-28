/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 470778
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            int num1 = Integer.parseInt(request.getParameter("firstNum"));
            int num2 = Integer.parseInt(request.getParameter("secondNum"));
            if (request.getParameter("add") != null) {
                request.setAttribute("result", (num1 + num2));
            }
            if (request.getParameter("sub") != null) {
                request.setAttribute("result", (num1 - num2));
            }
            if (request.getParameter("mul") != null) {
                request.setAttribute("result", (num1 * num2));
            }
            if (request.getParameter("mod") != null && num2 != 0) {
                request.setAttribute("result", (num1 % num2));
            } else if (request.getParameter("mod") != null && num2 == 0) {
                request.setAttribute("result", "CAN'T DIVIDE BY 0");
            }
        request.setAttribute("firstNumber", num1);
        request.setAttribute("secondNumber", num2);
        } catch (NumberFormatException e) {
            request.setAttribute("result", "invalid");
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
