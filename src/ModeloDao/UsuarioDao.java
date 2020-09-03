/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Conexao.Conexao;
import Modelos.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDao {

    public void deletar(Usuario p) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("delete from usuario where id =?");
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!!!!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "ERRO AO Excluir!!! " + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }

    public void create(Usuario p) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        try {

            String dia = p.getData().substring(0, 2);
            String mes = p.getData().substring(3, 5);
            String ano = p.getData().substring(6);

            String datamysql = ano + "-" + mes + "-" + dia;
            stmt = con.prepareStatement("INSERT INTO usuario (nome,cpf,email,cargo,datas) values(?,?,?,?,?)");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCpf());
            stmt.setString(3, p.getEmail());
            stmt.setString(4, p.getCargo());
            stmt.setString(5, datamysql);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }

    public boolean chekarUser(String nome) {
        boolean chek = false;

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario where nome = ?");
            stmt.setString(1, nome);

            rs = stmt.executeQuery();

            if (rs.next()) {
                chek = true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);

        }
        return chek;

    }

    public boolean chekar(String login, String senha) {

        boolean chek = false;
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario where nome = ? and cpf = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            if (rs.next()) {
                chek = true;

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);

        }
        return chek;

    }

    public void atualizar(Usuario p) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        try {
            String dia = p.getData().substring(0, 2);
            String mes = p.getData().substring(3, 5);
            String ano = p.getData().substring(6);

            String datamysql = ano + "-" + mes + "-" + dia;
            stmt = con.prepareStatement("UPDATE usuario SET nome = ?, cargo = ?, email = ?, cpf =?, datas=? where id = ?");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCargo());
            stmt.setString(3, p.getEmail());
            stmt.setString(4, p.getCpf());
            stmt.setString(5, datamysql);
            stmt.setInt(6, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR!! " + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }

    public List<Usuario> read() {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> combu = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();

            while (rs.next()) {
                SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

                String dataFormatada = formatador.format(rs.getDate("datas"));

                

                Usuario com = new Usuario();

                com.setId(rs.getInt("id"));
                com.setNome(rs.getString("nome"));
                com.setCargo(rs.getString("cargo"));
                com.setEmail(rs.getString("email"));
                com.setCpf(rs.getString("cpf"));
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
}
