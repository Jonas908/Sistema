
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CADASTRAR HOTEIS</title>
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
 <legend>Dados do Hotel</legend>
 <table cellspacing="7">
  <tr>
   <td>
    <label for="nome"><h3>Nome:</h3> </label>
   </td>
   <td align="left">
       <input type="text" name="nomeHotel" size="60" value=""/>
   </td>
   </tr>
  
   <tr>
    <td>
        <label><h3>Pais:</h3></label>
    </td>
    <td>
        <select  name="pais" >
            <option>BRASIL</option>
        </select>
    </td>
   </tr>
  
   <tr>
   <td>
       <label><h3>Estado:</h3> </label>
   </td>
   <td>
        <select name="estado">
       <option>UF</option>
      <option>AC</option> 
      <option>AL</option> 
      <option>AP</option> 
      <option>AM</option>
      <option>BA</option> 
      <option>CE</option> 
      <option> DF</option> 
      <option>ES</option> 
      <option>GO</option> 
      <option>MA</option> 
      <option>MT  </option> 
      <option>MS</option> 
      <option>MG</option> 
      <option>PA</option> 
      <option>PB</option> 
      <option>PR</option> 
      <option>PE</option>   
      <option>PI</option>   
      <option>RJ</option>   
      <option>RN</option>   
      <option>RS</option>   
      <option>RO</option>   
      <option>RR</option>   
      <option>SC</option>   
      <option>SP</option>   
      <option>SE</option>   
      <option>TO</option> 
       </select>
   </td>
  </tr>
  
  <tr>
   <td>
       <label for="cidade"> <h3>Cidade:</h3> </label>
   </td>
   <td align="left">
    <input type="text" name="cidade" size="30" value=""/> 
   </td>
  </tr>
  
  <tr>
   <td>
       <label for="valorDiaria"><h3>Valor da Diaria:</h3></label>
   </td>
   <td align="left">
       <input type="text" name="valorDiaria" size="30" value=""/>          
   </td> 
  </tr>
  
 
 </table>

<br />
<input type="submit" value="Enviar" name="hotel">
<input type="reset" value="Limpar">
</form>

            </div>
        
    </body>
</html>
