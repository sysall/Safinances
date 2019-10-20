
package Metier;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BD.AccessBd;

public class ConsulterRecette {
	
	public static String[][] recettePrincipale(String date1,String date2)
    {
    	
    		String [][] data=null;
    		AccessBd cnx = new AccessBd();
    		cnx.connecter();
    		String s = "SELECT * FROM RecettePrincipale WHERE date BETWEEN '"+date1+"' AND '"+date2+"' ";
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
	
	
	public static String[][] recetteSecondaire(String date1,String date2)
    {
    	
    		String [][] data=null;
    		AccessBd cnx = new AccessBd();
    		cnx.connecter();
    		String s = "SELECT * FROM RecetteSecondaire WHERE date BETWEEN '"+date1+"' AND '"+date2+"' ";
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
	
	public static String[][] RecetteMembre(String nom,String prenom,String date1,String date2)
    {
    	
    		String [][] data=null;
    		AccessBd cnx = new AccessBd();
    		cnx.connecter();
    		String s = "SELECT * FROM RecetteMembre WHERE nom ='"+nom+"' AND prenom = '"+prenom+"' AND date BETWEEN '"+date1+"' AND '"+date2+"' ";
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
