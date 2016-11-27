
package br.com.adsfacam.persistencia.ConexaoBanco;


import br.com.adsfacam.entidade.Cliente;
import br.com.adsfacam.entidade.Cliente_;
import br.com.adsfacam.entidade.Funcionario;
import br.com.adsfacam.entidade.Hotel;
import br.com.adsfacam.entidade.Voo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {
    
    private Connection con = ConexaoMySQL.getConnection();
    
    public void cadastraFuncionario(Funcionario func){
        java.sql.Date dataSql = new java.sql.Date(func.getDataNasc().getTime());
        String sql = " INSERT INTO  sistema.funcionario (nome, cpf, rg, sexo, dataNasc, telRes, telCel, rua, numero, bairro, estado,"
                + "pais, cidade, cep, email, login, senha, cargo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement pre = con.prepareStatement(sql)){
         //   pre.setInt(1, func.getIdfuncionario());
            pre.setString(1, func.getNome());
            pre.setString(2, func.getCpf());
            pre.setString(3, func.getRg());
            pre.setString(4, func.getSexo());
            pre.setDate(5, dataSql);
            pre.setString(6, func.getTelRes());
            pre.setString(7, func.getTelCel());
            pre.setString(8, func.getRua());
            pre.setString(9, func.getNumero());
            pre.setString(10, func.getBairro());
            pre.setString(11, func.getEstado());
            pre.setString(12, func.getPais());
            pre.setString(13, func.getCidade());
            pre.setString(14, func.getCep());
            pre.setString(15, func.getEmail());
            pre.setString(16, func.getLogin());
            pre.setString(17, func.getSenha());
            pre.setString(18, func.getCargo());
            
            pre.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cadastraCliente(Cliente c) {
        java.sql.Date dataSql = new java.sql.Date(c.getDataNasc().getTime());
        String sql = "INSERT INTO cliente (nome, sexo, rg, cpf, dataNasc, telRes, telCel, rua, numero, bairro, estado,"
                + "pais, cidade, cep, email, login, senha) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement pre = con.prepareStatement(sql)){
           
            pre.setString(1, c.getNome());
            pre.setString(2, c.getSexo());
            pre.setString(3, c.getRg());
            pre.setString(4, c.getCpf());
            pre.setDate(5, dataSql);
            pre.setString(6, c.getTelRes());
            pre.setString(7, c.getTelCel());
            pre.setString(8, c.getRua());
            pre.setString(9, c.getNumero());
            pre.setString(10, c.getBairro());
            pre.setString(11, c.getEstado());
            pre.setString(12, c.getPais());
            pre.setString(13, c.getCidade());
            pre.setString(14, c.getCep());
            pre.setString(15, c.getEmail());
            pre.setString(16, c.getLogin());
            pre.setString(17, c.getSenha());
            
            
            pre.execute();
            
    }   catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public void cadastraVoo(Voo v){
       java.sql.Date data = new java.sql.Date(v.getData().getTime()); 
       java.sql.Time horaSaida = new java.sql.Time(v.getHoraSaida().getTime());
        java.sql.Time horaChegada = new java.sql.Time(v.getHoraChegada().getTime());

      // java.sql.Date dataVolta = new  java.sql.Date(v.getDataVolta().getTime());
      String sql ="INSERT INTO voo (cidadeOrig, aeroOrig, cidadeDest, aeroDest, horaSaida, horaChegada, data, valor)"
              + "VALUES (?,?,?,?,?,?,?,?)";
        try(PreparedStatement pre = con.prepareStatement(sql)){
            pre.setString(1,v.getCidadeOrig());
            pre.setString(2, v.getAeroOrig());
            pre.setString(3, v.getCidadeDest());
            pre.setString(4, v.getAerodest());
            pre.setTime(5, horaSaida );
            pre.setTime(6, horaChegada);
            pre.setDate(7, data);
            pre.setFloat(8, v.getValor());
            
            pre.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void cadastraHotel(Hotel h){
        String sql = " insert into hotel (nomeHotel, pais, estado, cidade, valorDiaria) values (?,?,?,?,?)";
        
        try(PreparedStatement pre = con.prepareStatement(sql)) {
            pre.setString(1, h.getNomeHotel());
            pre.setString(2, h.getPais());
            pre.setString(3, h.getEstado());
            pre.setString(4, h.getCidade());
            pre.setFloat(5, h.getValorDiaria());
            
            pre.execute();
            
        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    
    public List<Cliente> buscaCliente() {
        String sql = ("select * from cliente");
        List<Cliente> lista = new ArrayList<Cliente>();
        try (PreparedStatement pre = con.prepareStatement(sql)) {
            ResultSet res = pre.executeQuery();
            while (res.next()) {
                Cliente nCliente = new Cliente();
                nCliente.setIdcliente(res.getInt("idcliente"));
                nCliente.setNome(res.getString("nome"));
                nCliente.setSexo(res.getString("sexo"));
                nCliente.setRg(res.getString("rg"));
                nCliente.setCpf(res.getString("cpf"));
                nCliente.setDataNasc(res.getDate("dataNasc"));
                nCliente.setTelRes(res.getString("TelRes"));
                nCliente.setTelCel(res.getString("TelCel"));
                nCliente.setRua(res.getString("rua"));
                nCliente.setNumero(res.getString("numero"));
                nCliente.setBairro(res.getString("bairro"));
                nCliente.setCidade(res.getString("cidade"));
                nCliente.setCep(res.getString("cep"));
                nCliente.setEstado(res.getString("estado"));
                nCliente.setPais(res.getString("pais"));
                nCliente.setEmail(res.getString("email"));
                nCliente.setLogin(res.getString("login"));
                nCliente.setSenha(res.getString("senha"));
                lista.add(nCliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
     public List<Funcionario> buscaFuncionario() {
        String sql = ("SELECT * FROM funcionario");
        List<Funcionario> lista = new ArrayList<Funcionario>();
        try (PreparedStatement pre = con.prepareStatement(sql)) {
            ResultSet res = pre.executeQuery();
            if (res.next()) {
                Funcionario nFunc = new Funcionario();
                nFunc.setIdfuncionario(res.getInt("setIdfuncionario"));
                nFunc.setNome(res.getString("nome"));
                nFunc.setSexo(res.getString("sexo"));
                nFunc.setRg(res.getString("rg"));
                nFunc.setCpf(res.getString("cpf"));
                nFunc.setDataNasc(res.getDate("dataNasc"));
                nFunc.setTelRes(res.getString("TelRes"));
                nFunc.setTelCel(res.getString("TelCel"));
                nFunc.setRua(res.getString("rua"));
                nFunc.setNumero(res.getString("numero"));
                nFunc.setBairro(res.getString("bairro"));
                nFunc.setCidade(res.getString("cidade"));
                nFunc.setCep(res.getString("cep"));
                nFunc.setEstado(res.getString("estado"));
                nFunc.setPais(res.getString("pais"));
                nFunc.setEmail(res.getString("email"));
                nFunc.setLogin(res.getString("login"));
                nFunc.setSenha(res.getString("senha"));
                lista.add(nFunc);

            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
      public List<Hotel> buscaHotel(String cidade, String estado) {
        String sql = ("SELECT * FROM hotel WHERE cidade=? AND estado=?");
        List<Hotel> lista = new ArrayList<Hotel>();
        try (PreparedStatement pre = con.prepareStatement(sql)) {
            pre.setString(1, cidade);
            pre.setString(2, estado);

            ResultSet res = pre.executeQuery();
            if (res.next()) {
                Hotel hotel = new Hotel();
                hotel.setNomeHotel(res.getString("nomeHotel"));
                hotel.setCidade(res.getString("cidade"));
                hotel.setEstado(res.getString("estado"));
                hotel.setPais(res.getString("pais"));
                hotel.setValorDiaria(res.getFloat("valorDiaria"));
                lista.add(hotel);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
     
      public List<Voo> buscaVoo(String cOrig, String cDest, Date data){
       String sql = ("SELECT * FROM voo WHERE cidadeOrig=? AND cidadeDest=? AND data=?");
       
       List<Voo> lista =  new ArrayList<Voo>();
       
       try(PreparedStatement pre = con.prepareStatement(sql)){
            pre.setString(1, cOrig);
            pre.setString(2, cDest);
            pre.setDate(3, data);
            
            ResultSet res = pre.executeQuery();
            
            if(res.next()){
                Voo voo = new Voo();
                voo.setCidadeDest(res.getString("cidadeOrig"));
                voo.setCidadeDest(res.getString("cidadeDest"));
                voo.setData(res.getDate("data"));
                voo.setHoraSaida(res.getTime("horaSaida"));
                voo.setHoraChegada(res.getTime("horaChegada"));
                voo.setValor(res.getFloat("valor"));
                lista.add(voo);
            }
           
       } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return lista;
    }

    public Cliente autentica(Cliente clienteConsulta) {
       
         String sql ="select * from cliente where login=? and senha=?";
        
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            
            pre.setString(1,clienteConsulta.getLogin());
            pre.setString(2, clienteConsulta.getSenha());
            
            
             ResultSet res = pre.executeQuery();
             
             res.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        
        return clienteConsulta;
         
    }
    
    
}