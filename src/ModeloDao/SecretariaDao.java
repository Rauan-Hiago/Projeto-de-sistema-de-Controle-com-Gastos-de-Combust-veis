/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Conexao.Conexao;
import Modelos.CombustivelModelo;
import Modelos.Secretaria;
import Modelos.Usuario;
import Modelos.Veiculos;
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
public class SecretariaDao {

    public void atualizar(Secretaria sec) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        try {
            String dia = sec.getData().substring(0, 2);
            String mes = sec.getData().substring(3, 5);
            String ano = sec.getData().substring(6);
            String datamysql = ano + "-" + mes + "-" + dia;

            stmt = con.prepareStatement("UPDATE secretaria SET abreviacao = ?, nome = ?, datas = ? where id = ?");
            stmt.setString(1, sec.getAbreviacao());
            stmt.setString(2, sec.getNome());
            stmt.setString(3, datamysql);
            stmt.setInt(4, sec.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR!! " + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }

    public void deletar(Secretaria sec) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("delete from secretaria where id =?");
            stmt.setInt(1, sec.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!!!!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "ERRO AO Excluir!!! " + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }

    public List<Secretaria> read() {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Secretaria> sec = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM secretaria");
            rs = stmt.executeQuery();

            while (rs.next()) {
                SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

                String dataFormatada = formatador.format(rs.getDate("datas"));

               

                Secretaria secre = new Secretaria();

                secre.setId(rs.getInt("id"));
                secre.setNome(rs.getString("nome"));
                secre.setAbreviacao(rs.getString("abreviacao"));
                secre.setData(dataFormatada);

                sec.add(secre);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);

        }
        return (sec);

    }

    public boolean checarSecretaria(String sec) {
        boolean retorno = false;

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM secretaria where nome = ?");
            stmt.setString(1, sec);
            rs = stmt.executeQuery();

            if (rs.next()) {
                retorno = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CombustivelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (retorno);
    }

    public List<Secretaria> ListarSecretarias() {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Secretaria> sec = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM secretaria");
            rs = stmt.executeQuery();

            while (rs.next()) {
                SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

                String dataFormatada = formatador.format(rs.getDate("datas"));

                
                Secretaria secre = new Secretaria();

                secre.setId(rs.getInt("id"));
                secre.setNome(rs.getString("nome"));
                secre.setAbreviacao(rs.getString("abreviacao"));
                secre.setData(dataFormatada);

                sec.add(secre);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);

        }
        return (sec);

    }

    public void create(Secretaria sec) {
        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        try {

            String dia = sec.getData().substring(0, 2);
            String mes = sec.getData().substring(3, 5);
            String ano = sec.getData().substring(6);

            String datamysql = ano + "-" + mes + "-" + dia;

            stmt = con.prepareStatement("INSERT INTO secretaria (nome,abreviacao,datas) values(?,?,?)");
            stmt.setString(1, sec.getNome());
            stmt.setString(2, sec.getAbreviacao());
            stmt.setString(3, datamysql);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Secretaria salva com sucesso!!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }
}
