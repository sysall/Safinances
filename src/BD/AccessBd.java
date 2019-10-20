package BD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;



public class AccessBd {
    private  Connection connexion = null;

	public  void connecter() {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			connexion = DriverManager.getConnection("jdbc:mysql://localhost/test");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "classe introuvable" + e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "classe introuvable" + e.getMessage());
		}
		
	}

	public  Connection connecter(String db_name, String user_name, String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connexion = DriverManager.getConnection(
					"jdbc:mysql://localhost/" + db_name + "?user=" + user_name + "&password=" + password);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "classe introuvable" + e.getMessage());
		}

		return connexion;
	}

	public  void commit() {

		try {
			connexion.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "classe introuvable" + e.getMessage());
		}
	}

	public  void setAutoCommit(boolean b) {
		try {
			connexion.setAutoCommit(b);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "classe introuvable" + e.getMessage());
		}
	}

	public  void rollback() {
		try {
			connexion.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "classe introuvable" + e.getMessage());
		}
	}

	public void executeUpdate(String s) {

		try {

			connexion.createStatement().executeUpdate(s);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "classe introuvable" + e.getMessage());
		}
	}

	public ResultSet executeQuery(String s) throws SQLException {

		return connexion.createStatement().executeQuery(s);
	}
	
	
	public void close() {
		try {
			if (connexion != null) {
				connexion.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "classe introuvable" + e.getMessage());
		}
	}



}
