/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Conexao.Conexao;
import Modelos.CombustivelModelo;
import Modelos.Usuario;

import Modelos.Veiculos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rauan Hiago
 */
public class VeiculosDao {
    
    public void deletar(Veiculos veic){
    
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("delete from veiculo where id =?");
            stmt.setInt(1, veic.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!!!!");
            
            
            
        } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null, "ERRO AO Excluir!!! "+ex);
        }finally{
        Conexao.closeConnection(con,stmt);
        }
    }
    
    public void atualizar(Veiculos veiculo){
    
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            String dia = veiculo.getData().substring(0, 2);
            String mes = veiculo.getData().substring(3, 5);
            String ano = veiculo.getData().substring(6);
            String datamysql = ano+"-"+mes+"-"+dia;
            
            stmt = con.prepareStatement("UPDATE veiculo SET placa = ?, modelo = ?, ano = ?, cor = ?, dono = ?, datas = ? where id = ?");
            stmt.setString(1, veiculo.getPlaca());
            stmt.setString(2, veiculo.getModelo());
            stmt.setInt(3, veiculo.getAno());
            stmt.setString(4, veiculo.getCor());
            stmt.setString(5, veiculo.getDono());
            stmt.setString(6, datamysql);
            stmt.setInt(7, veiculo.getId());
            
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!!");
            
            
            
        } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR!! "+ex);
        }finally{
        Conexao.closeConnection(con,stmt);
        }
    }
    public List<Veiculos> read(){
    
    Connection con = Conexao.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
        
        List<Veiculos> veic = new ArrayList<>(); 
        
        try {
            stmt = con.prepareStatement("SELECT * FROM veiculo");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
               SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            
               String dataFormatada = formatador.format(rs.getDate("datas"));
             
              
               
            Veiculos veiculo = new Veiculos();
            
            veiculo.setId(rs.getInt("id"));
            veiculo.setCor(rs.getString("cor"));
            veiculo.setData(dataFormatada);
            veiculo.setDono(rs.getString("dono"));
            veiculo.setModelo(rs.getString("modelo"));
           veiculo.setPlaca(rs.getString("placa"));
           veiculo.setAno(rs.getInt("ano"));
           
           
            
            veic.add(veiculo);
            
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " +ex);
        }finally{
        Conexao.closeConnection(con, stmt, rs);
        
        }
        return(veic);
    
    }
    public List<Veiculos> readListaVeiculos(){
    
    Connection con = Conexao.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
        
        List<Veiculos> veic = new ArrayList<>(); 
        
        try {
            stmt = con.prepareStatement("SELECT * FROM veiculo");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
               SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            
               String dataFormatada = formatador.format(rs.getDate("datas"));
             
              
               
            Veiculos veiculo = new Veiculos();
            
            veiculo.setId(rs.getInt("id"));
            
            
            
            veiculo.setModelo(rs.getString("modelo"));
           veiculo.setPlaca(rs.getString("placa"));
           
           
           
            
            veic.add(veiculo);
            
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " +ex);
        }finally{
        Conexao.closeConnection(con, stmt, rs);
        
        }
        return(veic);
    
    }
    public List<Veiculos> readbuscaPlacas(String nome){
    
    Connection con = Conexao.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
        
        List<Veiculos> veic = new ArrayList<>(); 
        
        try {
            stmt = con.prepareStatement("SELECT * FROM veiculo where modelo LIKE ?");
            stmt.setString(1, nome+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
               SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            
               String dataFormatada = formatador.format(rs.getDate("datas"));
             
              
               
            Veiculos veiculo = new Veiculos();
            
            veiculo.setId(rs.getInt("id"));
            
            
            
            veiculo.setModelo(rs.getString("modelo"));
           veiculo.setPlaca(rs.getString("placa"));
           
           
           
            
            veic.add(veiculo);
            
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " +ex);
        }finally{
        Conexao.closeConnection(con, stmt, rs);
        
        }
        return(veic);
    
    }
    
    
    
    public void create(Veiculos p){
    
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            
            String dia = p.getData().substring(0, 2);
            String mes = p.getData().substring(3, 5);
            String ano = p.getData().substring(6);
            
            String datamysql = ano+"-"+mes+"-"+dia;
            
            stmt = con.prepareStatement("INSERT INTO veiculo (placa,cor,modelo,ano,dono,datas) values(?,?,?,?,?,?)");
            stmt.setString(1, p.getPlaca());
            stmt.setString(2, p.getCor());
            stmt.setString(3, p.getModelo());
            stmt.setInt(4, p.getAno());
            stmt.setString(5, p.getDono());
            stmt.setString(6, datamysql);
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Veículo salvo com sucesso!!");
            
            
            
        } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR "+ex);
        }finally{
        Conexao.closeConnection(con,stmt);
        }
    }
}
