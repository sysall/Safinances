package Metier;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import BD.AccessBd;
import GUI.RecetteMembre;
import GUI.RecetteMembre1;
import GUI.RecetteMembre2;

public class ChercherMembre {
	
	public static void rechercher(String nom, String prenom) {
		 AccessBd cnx = new AccessBd();
		 cnx.connecter();
		 try {  
    	     
             String s = "SELECT idMembre FROM Membres WHERE nom = '"+nom+"' AND prenom = '"+prenom+"'";
             ResultSet myRs = cnx.executeQuery(s);
             if(myRs.next()) {
            	 JOptionPane.showMessageDialog(null, "le Membre existe!!!"); 
            	 java.awt.EventQueue.invokeLater(new Runnable() {
                     public void run() {
                         new RecetteMembre(nom,prenom).setVisible(true);
                     }
                 });
            	 
             }else {
            	 JOptionPane.showMessageDialog(null, "Membre inexistant. Veuillez notifier l'administrateur!!! "); 
             }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
	}
	

	public static void rechercher1(String nom, String prenom) {
		AccessBd cnx = new AccessBd();
		cnx.connecter();
		try {  
   	     
            String s = "SELECT idMembre FROM Membres WHERE nom = '"+nom+"' AND prenom = '"+prenom+"'";
            ResultSet myRs = cnx.executeQuery(s);
            if(myRs.next()) {
           	 JOptionPane.showMessageDialog(null, "le Membre existe!!!" );
           	 
           	 java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new RecetteMembre1(nom,prenom).setVisible(true);
                    }
                });
           	 
            }else {
           	 JOptionPane.showMessageDialog(null, "Membre inexistant. Veuillez notifier l'administrateur!!! "); 
            }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void rechercher2(String nom, String prenom) {
		AccessBd cnx = new AccessBd();
		cnx.connecter();
		try {  
   	     
            String s = "SELECT idMembre FROM Membres WHERE nom = '"+nom+"' AND prenom = '"+prenom+"'";
            ResultSet myRs = cnx.executeQuery(s);
            if(myRs.next()) {
           	 
           	 JOptionPane.showMessageDialog(null, "le Membre existe!!! ");
           	 
           	 java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new RecetteMembre2(nom,prenom).setVisible(true);
                    }
                });
           	 
            }else {
           	 JOptionPane.showMessageDialog(null, "Membre inexistant. Veuillez notifier l'administrateur!!! "); 
            }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
