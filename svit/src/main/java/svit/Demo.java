package svit;

import java.sql.SQLException;

public class Demo {181818
	
	public static void main(String[] args)
	{
		String url="jdbc:postgresql://localhost:5432/svit";
		String user="postgres";
		String password="root";
		
		try {
			// STEP:1
			Class.forName("org.postgresql.Driver");


	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
