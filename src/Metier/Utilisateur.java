
package Metier;

import javax.swing.JOptionPane;

import BD.AccessBd;
import GUI.CreerAdmin;

public class Utilisateur {
   
    public static void creerAdmin(String nom, String prenom, String login, String mdp)
    {
    	AccessBd cnx = new AccessBd();
		cnx.connecter();
		//int newMdp = mdp.hashCode();
    	String s ="INSERT INTO Admin ( nom_admin,prenom_admin,loginAdmin,mdpAdmin) VALUES('"+ nom +"','"+ prenom +"','"+ login +"','"+ mdp+"')";
        cnx.executeUpdate(s);
        JOptionPane.showMessageDialog(null, "Creation administrateur effectué!!! ");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreerAdmin().setVisible(true);
            }
        });

       
    }
    
    public static void creerFinancier(String nom, String prenom, String login, String mdp)
    {
    	AccessBd cnx = new AccessBd();
		cnx.connecter();
		String s ="INSERT INTO Financier ( nom_financier,prenom_financier,loginFinancier,mdpFinancier) VALUES('"+ nom +"','"+ prenom +"','"+ login +"','"+ mdp+"')";
        cnx.executeUpdate(s);
        JOptionPane.showMessageDialog(null, "Creation Financier effectué!!! ");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreerAdmin().setVisible(true);
            }
        });

    }
    
    public static void modifierAdmin(Object nom ,Object prenom,Object login,Object mdp, Object id ) {
    	AccessBd cnx = new AccessBd();
		cnx.connecter();
		String s = "UPDATE  Admin SET nom_admin='"+nom+"',prenom_admin='"+prenom+"', loginAdmin='"+login+"', mdpAdmin='"+mdp+"' WHERE idAdmin='"+id+"'";
		cnx.executeUpdate(s);
		JOptionPane.showMessageDialog(null, "Modification Administrateur effectué!!! ");
    }
    
    public static void modifierFinancier(Object nom ,Object prenom,Object login,Object mdp, Object id ) {
    	AccessBd cnx = new AccessBd();
		cnx.connecter();
		String s = "UPDATE  Financier SET nom_financier='"+nom+"',prenom_financier='"+prenom+"', loginFinancier='"+login+"', mdpFinancier='"+mdp+"' WHERE idFinancier='"+id+"'";
		cnx.executeUpdate(s);
		JOptionPane.showMessageDialog(null, "Modification Financier effectué!!! ");
    }
}
