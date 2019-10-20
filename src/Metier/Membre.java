
package Metier;

import java.sql.SQLException;

import javax.swing.JOptionPane;
import BD.AccessBd;
import GUI.CreerMembre;
import GUI.DesactiverMembre;

public class Membre {
    
	public static void creerMembre (String nom, String prenom, String date_naissance, String dateEntree, String adresse) throws SQLException {
		AccessBd cnx = new AccessBd();
		cnx.connecter();
		String query = "INSERT INTO Membres (nom,prenom,date_naissance,dateEntrée,Adresse) VALUES('"+ nom +"','"+ prenom +"','"+ date_naissance +"','"+ dateEntree+"','"+ adresse +"')";
        cnx.executeUpdate(query);
        JOptionPane.showMessageDialog(null, "Ajout Membre Reussie");
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreerMembre().setVisible(true);
            }
        });
	}
	
	public static void desactiverMembre (Object id) {
		AccessBd cnx = new AccessBd();
		cnx.connecter();
		String s = "UPDATE  Membres SET état='Désactivé' WHERE idMembre='"+id+"'";
		cnx.executeUpdate(s);
        JOptionPane.showMessageDialog(null, "Désactivation Membre effectué!!! ");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesactiverMembre().setVisible(true);
            }
        });
	}
	
	public static void reactiverMembre (Object id) {
		AccessBd cnx = new AccessBd();
		cnx.connecter();
		String s = "UPDATE  Membres SET état='Activé' WHERE idMembre='"+id+"'";
		cnx.executeUpdate(s);
        JOptionPane.showMessageDialog(null, "Réactivation Membre effectué!!! ");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesactiverMembre().setVisible(true);
            }
        });
		
		
	}

		

    
}
