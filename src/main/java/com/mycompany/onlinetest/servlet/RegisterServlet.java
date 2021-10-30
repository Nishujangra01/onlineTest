/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlinetest.servlet;

import com.mycompany.onlinetest.FactoryProvider;
import com.mycompany.onlinetest.entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author a
 */
public class RegisterServlet extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
            try {
                
               String name= request.getParameter("user_name");
               String email= request.getParameter("user_email");
              String pass= request.getParameter("user_password");
              
                /*System.out.println("*******************"+name);
                 System.out.println(email); System.out.println(pass);*/
                 
              //validations
                if (name.isEmpty()) {
                    out.println("Name is blank");
                    return;
                }
             User user= new User(name, email, pass, "normal");
                Session  session= FactoryProvider.getFactory().openSession();
                Transaction tx = session.beginTransaction();
                        
                int userId=(int)session.save(user);
                
                
                tx.commit();
                session.close();
                HttpSession hs = request.getSession();
                hs.setAttribute("message", "registration successful!!"+ userId  );
                response.sendRedirect("register.jsp");
                return;
                      
              
                
            } catch (Exception e) {e.printStackTrace();
            }
        }
    }
    
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
        processRequest(request, response);
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
        processRequest(request, response);
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
