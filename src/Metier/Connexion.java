
package Metier;
import BD.AccessBd;
import GUI.LoginAdmin;
import GUI.LoginFinancier;
import GUI.PageAdmin;
import GUI.PageFinancer;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Connexion {

	
	public static void connexionAdmin (String login, String password) {
		try{
			AccessBd cnx = new AccessBd();
			cnx.connecter();
            String query = "SELECT * FROM Admin WHERE  loginAdmin='" + login + "' AND mdpAdmin='"+password+"'";
            ResultSet myRs= cnx.executeQuery(query);
            if(myRs.next()){
                JOptionPane.showMessageDialog(null, "Connexion Reussie");
                java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                new PageAdmin().setVisible(true);
               }
               });
                
            }
            else {
                JOptionPane.showMessageDialog(null, "Login ou mot de passe incorrect");
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                    new LoginAdmin().setVisible(true);
                   }
                   });
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    	
		
	}
	
	
	public static void connexionFinancier (String login1, String password1) {
		AccessBd cnx = new AccessBd();
		cnx.connecter();
		try{
            String requete = "SELECT * FROM Financier WHERE  loginFinancier='" +login1+ "' AND mdpFinancier='"+password1+"'";
            ResultSet myRs = cnx.executeQuery(requete);
            if(myRs.next()){
                 JOptionPane.showMessageDialog(null, "Connexion Reussie");
                
                  java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                new PageFinancer().setVisible(true);
               }
               });
                  
                }    
            else{
                JOptionPane.showMessageDialog(null, "Login ou mot de passe incorrect");
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                    new LoginFinancier().setVisible(true);
                   }
                   });
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
		
}
}
