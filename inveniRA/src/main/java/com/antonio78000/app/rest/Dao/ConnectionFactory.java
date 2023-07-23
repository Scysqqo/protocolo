package com.antonio78000.app.rest.Dao;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public ConnectionFactory() {
        super();
   }
   
     public Connection criaConexao() {
   String url = "jdbc:mysql://localhost:3306/cruduser?characterEncoding=utf8";
       String user = "root";
       String password = "cobertura";

       Connection conetar = null;
       try {
           conetar = (Connection) DriverManager.getConnection(url, user, password);
           //Clients.showNotification("Conectado com sucesso!");
       } catch (SQLException ex) {
           //Logger.getLogger(FabricaDeConexao.class.getName()).log(Level.SEVERE, null, ex);
       }


       return conetar;

   }
    
}
