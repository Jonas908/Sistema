<%-- 
    Document   : buscaClientes
    Created on : 19/11/2016, 22:20:46
    Author     : Joao
--%>

<%@page import="java.util.List"%>
<%@page import="br.com.adsfacam.entidade.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Clientes</title>
    </head>
    <body>
        <% List<Cliente> lista = (List<Cliente>) request.getAttribute("lista"); %>
        <table border="1">
            <tr>
                <th>Id</th><th>Nome</th><th>Sexo</th><th>Rg</th><th>Cpf</th><th>Data Nascimento</th><th>Tel Residencial</th>
                <th>Tel Celular</th><th>Rua</th><th>Numero</th><th>Bairro</th><th>Cidade</th><th>Estado</th>
                <th>Pais</th><th>Cep</th><th>Email</th><th>Login</th><th>Senha</th>
            </tr>
            <% for (Cliente c : lista) { %>
            <tr>
                <td><% out.print(c.getIdcliente());%></td> <td><%=c.getNome()%></td><td><%=c.getSexo()%></td><td><%=c.getRg()%>
                <th><%=c.getCpf()%></th><th><%=c.getDataNasc()%></th><th><%=c.getTelRes()%></th><th><%=c.getTelCel()%></th>
                <th><%=c.getRua()%></th><th><%=c.getNumero()%></th><th><%=c.getBairro()%></th><th><%=c.getCidade()%></th>
        <th><%=c.getEstado()%></th><th><%=c.getPais()%></th><th><%=c.getCep()%></th><th><%=c.getEmail()%></th>
        <th><%=c.getLogin()%></th><th><%=c.getSenha()%></th>
    </tr>
    <%}%>
</table>
</body>
</html>
