<%-- 
    Document   : login
    Created on : 16/11/2016, 19:29:10
    Author     : Jonas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Pagina de Acesso</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h2>ENTRE COM LOGIN E SENHA</h2>
        <form method="post" action="cadastra.do" > 
            <div>
                <label>
                    nome
                    <input type="text" name="nome" size="25"/>
                </label>
            </div> 
            <div>
                <label>
                    senha
                    <input type="password" name="senha" size="20"/>
                </label>
            </div>
        <div>
            <input type="submit" name="autentica" value="ENTRAR"/>
            <input type="reset" value="LIMPAR"/> </div>
            <br>
        <br>
            <a href="index.html">Voltar</a>
       </form>
    </body>
</html>

