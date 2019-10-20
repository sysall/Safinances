
package Metier;

import BD.AccessBd;
import GUI.PageAdmin;
import GUI.RecettePrincipale;
import GUI.RecetteSecondaire;

import javax.swing.JOptionPane;


public class EnregistrerRecette {
    public static void recettePrincipale(String montant,String date)
    {
    	AccessBd cnx = new AccessBd();
		cnx.connecter();
		 String s = "INSERT INTO RecettePrincipale(montant,date) VALUES('"+montant+"','"+date+"')";
         cnx.executeUpdate(s);
         JOptionPane.showMessageDialog(null, "Ajout Recette catégorie 4 Reussie");
         
         java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new RecettePrincipale().setVisible(true);
           }
       });
    }
    
    
    public static void recetteMembre(String montant,String date,String nom, String prenom ,int categorie)
    {
    	AccessBd cnx = new AccessBd();
		cnx.connecter();
		String s ="INSERT INTO RecetteMembre ( montant,date,nom,prenom,categorie) VALUES('"+montant+"','"+date+"','"+nom+"','"+prenom+"','"+categorie+"')";
        cnx.executeUpdate(s);
        JOptionPane.showMessageDialog(null, "Enregistrement Recette du membre effectué!!! ");
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageAdmin().setVisible(true);
            }
        });
    }
    
    public static void recetteSecondaire(String montant,String date,String libelle,String nom, String prenom)
    {
    	AccessBd cnx = new AccessBd();
		cnx.connecter();
		String s ="INSERT INTO RecetteSecondaire(montant,date,libellé,nom,prenom) VALUES('"+montant+"','"+date+"','"+libelle+"','"+nom+"','"+prenom+"')";
        cnx.executeUpdate(s);
    	JOptionPane.showMessageDialog(null, "Ajout Recette secondaire Reussie");
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecetteSecondaire().setVisible(true);
            }
        }); 
    }
}
