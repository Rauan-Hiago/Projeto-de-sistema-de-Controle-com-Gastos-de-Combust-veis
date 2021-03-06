/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Conexao.Conexao;
import Modelos.Combustivel;
import Modelos.Motorista;
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
public class MotoristaDao {

    public void create(Motorista p) {
        
        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        try {
            String dia = p.getData().substring(0, 2);
            String mes = p.getData().substring(3, 5);
            String ano = p.getData().substring(6);
            String datamysql = ano + "-" + mes + "-" + dia;
            stmt = con.prepareStatement("INSERT INTO motoristas (nome,cpf,datas,telefone) values(?,?,?,?)");
            
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCpf());
            stmt.setString(4, p.getTelefone());
            stmt.setString(3, datamysql);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }

    public List<Motorista> readMotoristas() {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Motorista> combu = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM motoristas");
            rs = stmt.executeQuery();

            while (rs.next()) {
                SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

                String dataFormatada = formatador.format(rs.getDate("datas"));

                Motorista com = new Motorista();

                com.setId(rs.getInt("id"));
                com.setNome(rs.getString("nome"));
                com.setCpf(rs.getString("cpf"));
                com.setTelefone(rs.getString("telefone"));
                com.setData(dataFormatada);

                combu.add(com);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return (combu);
    }

    public List<Motorista> readListMotoristas() {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Motorista> combu = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM motoristas");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Motorista com = new Motorista();

                com.setId(rs.getInt("id"));
                com.setNome(rs.getString("nome"));
                com.setCpf(rs.getString("cpf"));

                combu.add(com);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return (combu);
    }

    public void atualizar(Motorista p) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        try {
            String dia = p.getData().substring(0, 2);
            String mes = p.getData().substring(3, 5);
            String ano = p.getData().substring(6);
            String datamysql = ano + "-" + mes + "-" + dia;

            stmt = con.prepareStatement("UPDATE motoristas SET nome = ?, cpf = ?, telefone = ?, datas =? where id = ?");
            
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCpf());
            stmt.setString(3, p.getTelefone());
            stmt.setString(4, datamysql);
            stmt.setInt(5, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR!! " + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }

    public void deletarCombustivel(Combustivel p) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("delete from combustivel where id =?");
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!!!!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO Excluir!!! " + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }

    public void deletar(Motorista p) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("delete from motoristas where id =?");
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!!!!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO Excluir!!! " + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }

    public List<Motorista> readbuscaNomeMotorista(String nome) {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Motorista> veic = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM motoristas where nome LIKE ?");
            stmt.setString(1, nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Motorista motorista = new Motorista();

                motorista.setId(rs.getInt("id"));
                motorista.setNome(rs.getString("nome"));
                motorista.setCpf(rs.getString("cpf"));

                veic.add(motorista);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return (veic);
    }
}
