package Metier;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BD.AccessBd;

public class MessageSend {
	public static void sendMemberToCreate (int id ,String nom, String prenom, String date_naissance, String dateEntree, String adresse) {
		AccessBd cnx = new AccessBd();
		cnx.connecter();
		String z = "INSERT INTO Membre (id,nom,prenom,date_naissance,dateEntrée,Adresse,etat) VALUES('"+id+"','"+nom+"','"+prenom+"','"+date_naissance+"','"+dateEntree+"','"+adresse+"','à traiter')";
		cnx.executeUpdate(z);
		String m = "INSERT INTO messages ( ) VALUES('"+id+"','à traiter')";
		cnx.executeUpdate(m);
	}
	
	public static void ajoutMembreEnvoyer (int idMembre,int idMessage) {
		AccessBd cnx = new AccessBd();
		cnx.connecter();
		String s = "UPDATE  Membre SET status='enabled' WHERE idMembre='"+idMembre+"'";
		cnx.executeUpdate(s);
		String m = "UPDATE  messages SET status='traité' WHERE idMmessage='"+idMessage+"'";
		cnx.executeUpdate(m);
		
	}
	
	public static  String[][] consulterMessage () {
		String [][] data=null;
		AccessBd cnx = new AccessBd();
		cnx.connecter();
		String s = " Select id_message,login,datee,status from messages ";
		try {
			ResultSet myRs =cnx.executeQuery(s);  
			final int COLUMN_COUNT = myRs.getMetaData().getColumnCount();
			ArrayList<String[]> result = new ArrayList<> ();
			while (myRs.next()) {
				String [] row = new String [COLUMN_COUNT];
				
				for (int i = 0; i < row.length; i++) {
					row[i] = myRs.getString(i+1);
				}
				
				result.add(row);
			}
			final int ROW_COUNT = result.size();
		    data = new String[ROW_COUNT][COLUMN_COUNT];
			
			for (int i = 0; i < ROW_COUNT; i++) {
				data[i] = result.get(i);
			}
	    		}catch(SQLException e) {
	    			System.out.println(e.getMessage());
	    		}
		
		 return data;
	}

	public static  String[][] consulterMessageTraiter () {
		String [][] data=null;
		AccessBd cnx = new AccessBd();
		cnx.connecter();
		String s = " Select id_message,datee,status from messages  where status = 'traité'";
		try {
			ResultSet myRs =cnx.executeQuery(s);  
			final int COLUMN_COUNT = myRs.getMetaData().getColumnCount();
			ArrayList<String[]> result = new ArrayList<> ();
			while (myRs.next()) {
				String [] row = new String [COLUMN_COUNT];
				
				for (int i = 0; i < row.length; i++) {
					row[i] = myRs.getString(i+1);
				}
				
				result.add(row);
			}
			final int ROW_COUNT = result.size();
		    data = new String[ROW_COUNT][COLUMN_COUNT];
			
			for (int i = 0; i < ROW_COUNT; i++) {
				data[i] = result.get(i);
			}
	    		}catch(SQLException e) {
	    			System.out.println(e.getMessage());
	    		}
		
		 return data;
	}


}
