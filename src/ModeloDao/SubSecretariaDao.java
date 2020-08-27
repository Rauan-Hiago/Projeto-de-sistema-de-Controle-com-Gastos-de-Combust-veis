/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Conexao.Conexao;
import Modelos.Secretaria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rauan Hiago
 */
public class SubSecretariaDao {
    
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
      
     
      
   public void create(Secretaria sec) {
        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        try {

            String dia = sec.getData().substring(0, 2);
            String mes = sec.getData().substring(3, 5);
            String ano = sec.getData().substring(6);

            String datamysql = ano + "-" + mes + "-" + dia;

            stmt = con.prepareStatement("INSERT INTO secretaria (nome,datas) values(?,?,?)");
            stmt.setString(1, sec.getNome());
            stmt.setString(2, datamysql);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Secretaria salva com sucesso!!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }
     
    
}
