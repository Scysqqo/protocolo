package com.antonio78000.app.rest.Dao;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.antonio78000.app.rest.Dao.ConnectionFactory;
import com.antonio78000.app.rest.Models.User;

public class UserDao {
   
    public UserDao() {
        super();
   }

   

   Connection con = new ConnectionFactory().criaConexao();
   
   
   
   public String insertUser(User u) {
       
       int a=0;
     
       try {
           CallableStatement p = (CallableStatement) con.prepareCall("{CALL insertCrudUser(?,?,?,?,?)}");
           p.setString(1, u.getNome());
           p.setString(2, u.getUtilizador());
           p.setString(3, u.getSenha());
           p.setString(4, u.getDataN());
           p.setString(5, u.getOcupacao());
           
           ResultSet res = p.executeQuery();
           if (res.next()){
               
               return "inserido com sucesso";
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
           //JOptionPane.showMessageDialog(null, "ocorreu erro no acto da pesquisa!");
       }
       return "Erro";
   }
}
