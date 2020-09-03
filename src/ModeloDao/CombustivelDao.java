
package ModeloDao;

import Modelos.Combu;
import Conexao.Conexao;
import Modelos.Lancamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;


/**
 *
 * @author Rauan Hiago
 */
public class CombustivelDao {
    public void create(Lancamento p){
         Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            String dia = p.getData().substring(0, 2);
            String mes = p.getData().substring(3, 5);
            String ano = p.getData().substring(6);
            String datamysql = ano+"-"+mes+"-"+dia;
            stmt = con.prepareStatement("INSERT INTO lancamento (nome,qtd,placa,tipo,secretaria,valor,datas) values(?,?,?,?,?,?,?)");
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getQtd());
            stmt.setString(3, p.getPlaca());
            stmt.setString(4, p.getTipo());
            stmt.setString(5, p.getSecretaria());
            stmt.setDouble(6, p.getValor());
            stmt.setString(7, datamysql);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
            
            
        } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR "+ex);
        }finally{
        Conexao.closeConnection(con,stmt);
        }
    }
    public List<Lancamento> readListCombustivel(){
    
    Connection con = Conexao.getConnection();
    PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Lancamento> combu = new ArrayList<>(); 
        
        try {
            stmt = con.prepareStatement("SELECT * FROM combustivel");
            rs = stmt.executeQuery();
           
            while(rs.next()){
             
              
            
            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            
            String dataFormatada = formatador.format(rs.getDate("datas"));
             
            
            
            Lancamento com = new Lancamento();
                
            com.setId(rs.getInt("id"));
            com.setNome(rs.getString("nome"));
            com.setValor(rs.getDouble("preco"));
            com.setData(dataFormatada);
            
            combu.add(com);
            
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " +ex);
        }finally{
        Conexao.closeConnection(con, stmt, rs);
        
        }
        return(combu);
    
    
    
    
    }
    /**
     *
     * @return 
     */
    public Double valor(String combustivel){
         double retorno = 1;
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM combustivel where nome = ?");
            stmt.setString(1, combustivel);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                retorno = rs.getDouble("preco");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CombustivelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
          return(retorno);
    
    }
    public List<Lancamento> read(){
    
    Connection con = Conexao.getConnection();
    PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Lancamento> combu = new ArrayList<>(); 
        
        try {
            stmt = con.prepareStatement("SELECT * FROM lancamento");
            rs = stmt.executeQuery();
           
            while(rs.next()){
             
              
            
               SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            
               String dataFormatada = formatador.format(rs.getDate("datas"));
             
            
            
            Lancamento com = new Lancamento();
                
            com.setId(rs.getInt("id"));
            com.setNome(rs.getString("nome"));
            com.setPlaca(rs.getString("placa"));
            com.setQtd(rs.getInt("qtd"));
            com.setTipo(rs.getString("tipo"));
            com.setSecretaria(rs.getString("secretaria"));
            
            com.setData(dataFormatada);
            
            combu.add(com);
            
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " +ex);
        }finally{
        Conexao.closeConnection(con, stmt, rs);
        
        }
        return(combu);
    
    }
     public void atualizar(Lancamento p){
    
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            String dia = p.getData().substring(0, 2);
            String mes = p.getData().substring(3, 5);
            String ano = p.getData().substring(6);
            String datamysql = ano+"-"+mes+"-"+dia;
            
            stmt = con.prepareStatement("UPDATE lancamento SET nome = ?, qtd = ?, placa = ?, tipo =?, secretaria = ?, datas = ? where id = ?");
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getQtd());
            stmt.setString(3, p.getPlaca());
            stmt.setString(4, p.getTipo());
            stmt.setString(5, p.getSecretaria());
            stmt.setString(6, datamysql);
            stmt.setInt(7, p.getId());
            
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!!");
            
            
            
        } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR!! "+ex);
        }finally{
        Conexao.closeConnection(con,stmt);
        }
    }
     
     public void deletarCombustivel(Combu p){
    
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("delete from combustivel where id =?");
            stmt.setInt(1, p.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!!!!");
            
            
            
        } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null, "ERRO AO Excluir!!! "+ex);
        }finally{
        Conexao.closeConnection(con,stmt);
        }
    }
     
     public void deletar(Lancamento p){
    
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("delete from lancamento where id =?");
            stmt.setInt(1, p.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!!!!");
            
            
            
        } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null, "ERRO AO Excluir!!! "+ex);
        }finally{
        Conexao.closeConnection(con,stmt);
        }
    }
    
     
     
     public void createCombu(Combu com){
    
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            String dia = com.getData().substring(0, 2);
            String mes = com.getData().substring(3, 5);
            String ano = com.getData().substring(6);
            
            String datamysql = ano+"-"+mes+"-"+dia;
            
            stmt = con.prepareStatement("INSERT INTO combustivel (nome,preco,datas) values(?,?,?)");
            
            stmt.setString(1, com.getNome());
            stmt.setDouble(2, com.getPreco());
            stmt.setString(3, datamysql);
            
           
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
            
            
        } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR "+ex);
        }finally{
        Conexao.closeConnection(con,stmt);
        }
    }
     
     public List<Combu> readCom(){
    
    Connection con = Conexao.getConnection();
    PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Combu> combu = new ArrayList<>(); 
        
        try {
            stmt = con.prepareStatement("SELECT * FROM combustivel");
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            
            String dataFormatada = formatador.format(rs.getDate("datas"));
             
            
            
            Combu com = new Combu();
            
            com.setId(rs.getInt("id"));
            com.setNome(rs.getString("nome"));
            com.setPreco(rs.getDouble("preco"));
            com.setData(dataFormatada);
            
            
            combu.add(com);
            
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " +ex);
        }finally{
        Conexao.closeConnection(con, stmt, rs);
        
        }
        return(combu);
    
    }
     public void atualizarCombu(Combu p){
    
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            String dia = p.getData().substring(0, 2);
            String mes = p.getData().substring(3, 5);
            String ano = p.getData().substring(6);
            String datamysql = ano+"-"+mes+"-"+dia;
            
            stmt = con.prepareStatement("UPDATE combustivel SET nome = ?, preco = ?, datas= ? where id = ?");
            stmt.setString(1, p.getNome());
            stmt.setDouble(2, p.getPreco());
            stmt.setString(3, datamysql);
            stmt.setInt(4, p.getId());
            
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!!");
            } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR!! "+ex);
        }finally{
        Conexao.closeConnection(con,stmt);
        }
    }
     
     public List<Lancamento> readbuscaNomeCombustivel(String nome){
    
    Connection con = Conexao.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
        
        List<Lancamento> veic = new ArrayList<>(); 
        
        try {
            stmt = con.prepareStatement("SELECT * FROM combustivel where nome LIKE ?");
            stmt.setString(1, nome+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
               SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            
               String dataFormatada = formatador.format(rs.getDate("datas"));
             
               
            Lancamento combustivel = new Lancamento();
            
            combustivel.setId(rs.getInt("id"));
            
            
            
            combustivel.setNome(rs.getString("nome"));
            combustivel.setValor(rs.getDouble("preco"));
            combustivel.setData(dataFormatada);
           
           
           
            
            veic.add(combustivel);
            
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " +ex);
        }finally{
        Conexao.closeConnection(con, stmt, rs);
        
        }
        return(veic);
    
    }

}
