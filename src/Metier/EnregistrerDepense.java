
package Metier;

import BD.AccessBd;
import GUI.DepenseCheque;
import GUI.DepenseEspece;

import javax.swing.JOptionPane;


public class EnregistrerDepense {
   
    public static void depenseCheque(String motif,String montant,String date,String numC,String benefC)
    {
    	AccessBd cnx = new AccessBd();
		cnx.connecter();
		String s ="INSERT INTO DepenseCheque ( motif,montant,date,numCheque,nomBeneficiaire) VALUES('"+motif+"','"+montant+"','"+date+"','"+numC+"','"+benefC+"')";
        cnx.executeUpdate(s);
        JOptionPane.showMessageDialog(null, "Enregistrement dépense Espéces effectué!!! ");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepenseCheque().setVisible(true);
            }
        });
    }
    
    public static void depenseEspece(String motif,String montant,String date)
    {
    	AccessBd cnx = new AccessBd();
		cnx.connecter();
		String s ="INSERT INTO DepenseEspece ( motif,montant,date) VALUES('"+motif+"','"+montant+"','"+date+"')";
        cnx.executeUpdate(s);
        JOptionPane.showMessageDialog(null, "Enregistrement dépense Espéces effectué!!! ");
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepenseEspece().setVisible(true);
            }
        });
    }
    
}
