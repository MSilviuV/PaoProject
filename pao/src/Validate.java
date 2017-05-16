import java.sql.*;
import java.util.ArrayList;

public class Validate {
	public static String checkUser(String email, String pass) {
		/*
		 * try{
		 * 
		 * //loading drivers for mysql Class.forName("com.mysql.jdbc.Driver");
		 * 
		 * //creating connection with the database Connection
		 * con=DriverManager.getConnection
		 * ("jdbc:mysql://127.0.0.1:3306/reports","root","root");
		 * PreparedStatement ps =con.prepareStatement
		 * ("select * from student where email=? and pass=?"); ps.setString(1,
		 * email); ps.setString(2, pass); ResultSet rs =ps.executeQuery(); st =
		 * rs.next();
		 * 
		 * }catch(Exception e) { e.printStackTrace(); } return st;
		 */
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Gabriel", "gabe@yahoo.com", "pass", 10, 7, 8, 9, 7));
		students.add(new Student("Andrei", "andrew@gmail.com", "gurza", 5, 5, 5, 5, 5));
		students.add(new Student("ion", "ionut99@outlook.com", "masina", 10, 9, 8, 7, 5));
		students.add(new Student("Silviu", "silvester@yahoo.com", "dungeon", 6, 6, 6, 6, 6));
		students.add(new Student("admin", "admin", "admin", 10, 10, 10, 10, 10));
		String em,pw;
		for (Student s : students) {
			em=s.getEmail();
			pw=s.getPass();
			if (email.equals(em) && pass.equals(pw))
				return s.toString();
		}
		return null;
	}
}