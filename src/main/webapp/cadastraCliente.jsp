
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CADASTRAR DADOS</title>
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
 <legend>Dados Pessoais</legend>
 <table cellspacing="7">
  <tr>
   <td>
       <label for="nome"><h3>Nome:</h3> </label>
   </td>
  <td align="left">
    <input type="text" name="nome" size="60"/>
   </td>
  </tr>
  <tr>
   <td>
       <label>Sexo</label>
   </td>
   <td>
   <select name="sexo">
      <option>Escolha o sexo</option>
      <option>Masculino</option>
      <option>Femenino</option>
  </select>
 </td>
  
 
   <td>
    <label>Data Nascimento: </label>
   </td>
   <td>
       <input type="date" name="dataNasc" size="12" value=""/> 
   </td>
  </tr>
  
  
  <tr>
   <td>
    <label for="rg">RG: </label>
   </td>
   <td align="left">
    <input type="text" name="rg" size="15" maxlength="13"/> 
   </td>
   <td>
       <label for="telRes">Tel Residencial:</label>
   </td>
   <td align="left">
       <input type="text" name="telRes" size="11" maxlength="10"/>          
   </td> 
  </tr>
  
  <tr>
   <td>
    <label>CPF:</label>
   </td>
   <td align="left">
    <input type="text" name="cpf" size="13" maxlength="12"/> 
   </td>
    <td>
       <label for="telCel">Tel Celular:</label>
   </td>
   <td align="left">
       <input type="text" name="telCel" size="13" maxlength="12"/>          
   </td> 
  </tr>
  </tr>
 </table>
</fieldset>

<br />
<!-- ENDEREÇO -->
<fieldset>
 <legend>Dados de Endereço</legend>
 <table cellspacing="10">

  <tr>
   <td>
    <label for="rua">Rua:</label>
   </td>
   <td align="left">
       <input type="text" name="rua" size="48">
   </td>
   
   <td>
       Numero: &emsp;<input type="text" name="numero" size="4">
   </td>
  </tr>
  <tr>
   <td>
    <label for="bairro">Bairro: </label>
   </td>
   <td align="left">
       <input type="text" name="bairro" size="45">
   </td>
  </tr>
  <tr>
        
   <td>
    <label for="estado">Estado:</label>
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
   <!-- <td align="left">
       <input type="text" name="estado" value="" size="35"/>
   
</td>-->
   &emsp;<td>
       Pais:&emsp; <select name="pais">
       <option>BRASIL</option>
       </select>
   </td>
  </tr>
  <tr>
   <td>
       <label for="cidade">Cidade:</label>
   </td>
   <td align="left">
       <input type="text" name="cidade" size="35"/>
   </td>
  </tr>
  <tr>
   <td>
    <label for="cep">CEP: </label>
   </td>
   <td align="left">
    <input type="text" name="cep1" size="5" maxlength="5"> - <input type="text" name="cep2" size="3" maxlength="3">
   </td>
  </tr>
 </table>
</fieldset>
<br />

<!-- DADOS DE LOGIN -->
<fieldset>
 <legend>Dados de login</legend>
 <table cellspacing="10">
  <tr>
   <td>
    <label for="email">E-mail: </label>
   </td>
   <td align="left">
       <input type="text" name="email" size="30">
   </td>
  </tr>
 
  
     <!--<label for="imagem">Imagem de perfil:</label>
   </td>
   <td>
   <input type="file" name="imagem" >-->

   </td>
  </tr>
  <tr>
   <td>
    <label for="login">Login de usuário: </label>
   </td>
   <td align="left">
    <input type="text" name="login">
   </td>
  </tr>
  <tr>
   <td>
    <label for="pass">Senha: </label>
   </td>
   <td align="left">
    <input type="password" name="senha">
   </td>
  </tr>
  <tr>
   <td>
    <label for="passconfirm">Confirme a senha: </label>
   </td>
   <td align="left">
    <input type="password" name="confirmaSenha">
   </td>
  </tr>
 </table>
</fieldset>
<br />
<input type="submit" value="Enviar" name="cliente">
<input type="reset" value="Limpar">
</form>

            </div>
        
    </body>
</html>
