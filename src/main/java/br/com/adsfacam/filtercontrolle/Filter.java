/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.adsfacam.filtercontrolle;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jonas
 */
@WebFilter(dispatcherTypes = {DispatcherType.REQUEST},urlPatterns ={"/*"} )
public class Filter implements javax.servlet.Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        throw new UnsupportedOperationException("Not supported yet.");
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
            throws IOException, ServletException {
        
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        
        
        String uri = httpRequest.getRequestURI();   
        HttpSession sessao = httpRequest.getSession(false);
        if(sessao != null || uri.lastIndexOf("login.jsp") != -1 || uri.lastIndexOf("cadastro.do")!= -1 ){
        chain.doFilter(request, response);
        }else{
            httpResponse.sendRedirect("login.jsp");
        }
    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet.");
        
    }
    
}
