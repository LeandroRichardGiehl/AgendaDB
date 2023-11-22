package DAO;

import Model.ContatoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastrarContatoDAO {
    
    public void cadastrarContatoBD(ContatoModel novoContato){
    String sql = "insert into contatos(nome, telefone, email) values (?,?,?)";
    PreparedStatement stmt = null;
    Connection connection = null;
    
    try {
            connection = new ConexaoDB().getConnection();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, novoContato.getNome());
            stmt.setString(2, novoContato.getTelefone());
            stmt.setString(3, novoContato.getEmail());
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar steatment!");
                e.printStackTrace();
            }

            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar conexÃ£o!");
                e.printStackTrace();
            }
        }
   }
}
