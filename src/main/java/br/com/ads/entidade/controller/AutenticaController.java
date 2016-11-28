/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ads.entidade.controller;

import br.com.adsfacam.entidade.Cliente;
import br.com.adsfacam.persistencia.ConexaoBanco.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jonas
 */
@WebServlet( "/autentica.do")
public class AutenticaController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
        
    }

   
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
        
         HttpSession sessao  = request.getSession(false);
        if(sessao!= null){
           sessao.invalidate();
           
            }
        response.sendRedirect("login.jsp");
    }
    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param req
     * @param resp
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
           String login = req.getParameter("login");
          String senha = req.getParameter("senha");
        
        Cliente cliente = new Cliente();
        cliente.setLogin(login);
        cliente.setSenha(senha);
        
        UsuarioDAO usuDAO = new UsuarioDAO();
        Cliente cliAutenticado = usuDAO.autentica(cliente);
        
        
        if(cliAutenticado != null){
            
            HttpSession sessao = req.getSession();
            sessao.setAttribute("cliente", cliAutenticado);
            
            sessao.setMaxInactiveInterval(50*5);
            
            req.getRequestDispatcher("/index.html").forward(req,resp);
        
        }else{
            resp.getWriter().print("/login.jsp");
              
        }
        
  
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
