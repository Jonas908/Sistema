
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CADASTRAR VOOS</title>
        <style>
            h3{
                font-family: ariel-black;
                color: blue
            }
            
           </style>
    </head>
    <body>
            <div>
 <h1> DADOS CADASTRAIS</h1> 
  <h2> Preencha o formulário abaixo</h2><br />

<form action="cadastra.do" method="POST">

<!-- DADOS PESSOAIS-->
<fieldset>
 <legend>Dados do Voo</legend>
 <table cellspacing="7">
  <tr>
   <td>
    <label for="cidadeOrig">Cidade de Origem: </label>
   </td>
   <td align="left">
    <input type="text" name="cidadeOrig" value="" size="40"/>
   </td>
   <td>
       <label for="aeroOrig"> Aeroporto: </label> 
       
       <input type="text" name="aeroOrig" value="" size="40"/>
   </td>
   </tr>

   <tr>
    <td>
        <label>Cidade de Destino:</label>
    </td>
    <td>
        <input type="text" name="cidadeDest" value="" size="40"/>
    </td>
    <td>
        Aeroporto:<input type="text" name="aeroDest" value="" size="40"/>
    <td>
   </tr>
  
   <tr>
   <td>
       <label>Hora Saida: </label>
   </td>
   <td>
       <input type="time" name="horaChegada"  value=""/> 
   </td>
  </tr>
  <tr>
   <td>
       <label>Hora Chegada: </label>
   </td>
   <td>
       <input type="time" name="horaChegada"  value=""/> 
   </td>
  </tr>
  <tr>
   <td>
       <label>Data </label>
   </td>
   <td>
       <input type="date" name="data"  value=""/> 
   </td>
  </tr>
  
  <tr>
   <td>
       <label> Valor:</label>
   </td>
   <td>
       <input type="text" name="valor" size="6" value=""/>          
   </td> 
  </tr>
  
 
 </table>

<br />
<input type="submit" value="Enviar" name="voo">
<input type="reset" value="Limpar">
</form>

            </div>
        
    </body>
</html>
