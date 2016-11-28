/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ads.entidade.controller;

import br.com.adsfacam.entidade.Cliente;
import br.com.adsfacam.entidade.Funcionario;
import br.com.adsfacam.entidade.Hotel;
import br.com.adsfacam.entidade.Voo;

import br.com.adsfacam.persistencia.ConexaoBanco.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cadastra.do")
public class CadastraController extends HttpServlet {

 

    
    @SuppressWarnings("deprecation")
    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = res.getWriter()) {
            
            boolean cliente = req.getParameter("cliente") != null;
            boolean funcionario = req.getParameter("funcionario") != null;
            boolean voo = req.getParameter("voo") != null;
            boolean hotel = req.getParameter("hotel") != null;
            
            
            
            if(funcionario ){
          String nome = req.getParameter("nome");     
           String sexo = req.getParameter("sexo");
           String rg = req.getParameter("rg");
           String cpf = req.getParameter("cpf");
           String dataNasc = req.getParameter("dataNasc");
           String telRes = req.getParameter("telRes");
           String telCel = req.getParameter("telCel");
           String rua = req.getParameter("rua");
           String numero = req.getParameter("numero");
           String bairro = req.getParameter("bairro");
           String estado = req.getParameter("estado");
           String pais = req.getParameter("pais");
           String cidade = req.getParameter("cidade");
           String cep1 = req.getParameter("cep1");
           String cep2 = req.getParameter("cep2");
           String cep = cep1+cep2;
           String email = req.getParameter("email");
           String login = req.getParameter("login");
           String senha = req.getParameter("senha");
           String cargo  = req.getParameter("cargo");
 
          SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
          Date dataFor = format.parse(dataNasc);
          
               Funcionario f =new Funcionario();
                f.setIdfuncionario(1);
                f.setNome(nome);
                f.setSexo(sexo);
                f.setRg(rg);
                f.setCpf(cpf);  
                f.setDataNasc(dataFor);
                f.setTelRes(telRes);
                f.setTelCel(telCel);
                f.setRua(rua);
                f.setNumero(numero);
                f.setBairro(bairro);
                f.setEstado(estado);
                f.setPais(pais);
                f.setCidade(cidade);
                f.setCep(cep);
                f.setEmail(email);
                f.setLogin(login);
                f.setSenha(senha);
                f.setCargo(cargo);
                UsuarioDAO usuDAO = new UsuarioDAO();
                usuDAO.cadastraFuncionario(f);
                res.getWriter().println("Funcionario Cadastrado com sucesso");
                
           }
            
            if(cliente){
                 String nome = req.getParameter("nome");     
           String sexo = req.getParameter("sexo");
           String rg = req.getParameter("rg");
           String cpf = req.getParameter("cpf");
           String dataNasc = req.getParameter("dataNasc");
           String telRes = req.getParameter("telRes");
           String telCel = req.getParameter("telCel");
           String rua = req.getParameter("rua");
           String numero = req.getParameter("numero");
           String bairro = req.getParameter("bairro");
           String estado = req.getParameter("estado");
           String pais = req.getParameter("pais");
           String cidade = req.getParameter("cidade");
           String cep1 = req.getParameter("cep1");
           String cep2 = req.getParameter("cep2");
           String cep = cep1+cep2;
           String email = req.getParameter("email");
           String login = req.getParameter("login");
           String senha = req.getParameter("senha");
           String cargo  = req.getParameter("cargo");
           
            
          SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
          Date dataFor = format.parse(dataNasc);

                Cliente c = new Cliente();
           
                c.setNome(nome);
                c.setSexo(sexo);
                c.setRg(rg);
                c.setCpf(cpf);  
                c.setDataNasc(dataFor);
                c.setTelRes(telRes);
                c.setTelCel(telCel);
                c.setRua(rua);
                c.setNumero(numero);
                c.setBairro(bairro);
                c.setEstado(estado);
                c.setPais(pais);
                c.setCidade(cidade);
                c.setCep(cep);
                c.setEmail(email);
                c.setLogin(login);
                c.setSenha(senha);
                UsuarioDAO usuDAO = new UsuarioDAO();
                usuDAO.cadastraCliente(c);
                res.getWriter().println("Cadastrado com sucesso");
                
            }
              if (voo){
                  String cidadeOrig = req.getParameter("cidadeOrig");
                  String aeroOrig = req.getParameter("aeroOrig");
                  String cidadeDest = req.getParameter("cidadeDest");
                  String aeroDest = req.getParameter("aeroDest");
                  String horaSaida = req.getParameter("horaSaida");
                  String horaChegada = req.getParameter("horaChegada");
                  String data = req.getParameter("data");
                  String valor = req.getParameter("valor");
                  
                  SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                 Date date =   format.parse(data);
           
                           
                /*  SimpleDateFormat formate = new SimpleDateFormat("yyyy-MM-dd");
          Date dataFo = formate.parse(dataVolta);*/
                  
                 
              Voo v = new Voo();
               v.setCidadeOrig(cidadeOrig);
               v.setCidadeDest(cidadeDest);
               v.setAeroOrig(aeroOrig);
               v.setCidadeDest(cidadeDest);
               v.setAerodest(aeroDest);
               v.setHoraSaida(Time(horaSaida));
               v.setHoraChegada(Time(horaChegada));
               v.setData((java.sql.Date) date);
               v.setValor(Float.parseFloat(valor));
               
               
               UsuarioDAO usuDAO = new UsuarioDAO();
               usuDAO.cadastraVoo(v);
                res.getWriter().println("Cadastrado com sucesso");
                 
              
              }
              
              
            if(hotel){
            String nomeHotel  = req.getParameter("nomeHotel");     
           String pais = req.getParameter("pais");
           String estado = req.getParameter("estado");
           String cidade = req.getParameter("cidade");
           String valorDiaria = req.getParameter("valorDiaria");
         
           Hotel h = new Hotel();
           
           h.setNomeHotel(nomeHotel);
           h.setPais(pais);
           h.setEstado(estado);
           h.setCidade(cidade);
           h.setValorDiaria(Float.parseFloat(valorDiaria));
           
           UsuarioDAO usuDAO = new UsuarioDAO();
           usuDAO.cadastraHotel(h);
           res.getWriter().println("Cadastrado com sucesso");
            }
    
        } catch (ParseException ex) {
            Logger.getLogger(CadastraController.class.getName()).log(Level.SEVERE, null, ex);
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
    protected void doGet(HttpServletRequest req, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param req
     * @param resp
    
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
      
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
