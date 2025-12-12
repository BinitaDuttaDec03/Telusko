import java.sql.*;

public class JDBCDemo {
    static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "root";

//        String query="SELECT sname FROM students WHERE sid = 1"; // READ
//        String query = "SELECT * FROM students"; // READ
//        String query = "INSERT INTO students(sname, marks) VALUES('Gauri', 85)"; // CREATE
//        String query = "UPDATE students SET sname='Mouli' WHERE sid=4"; // UPDATE
        String query = "DELETE FROM students WHERE sid=4";

        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("Connection established");

        Statement st = conn.createStatement();

//        ResultSet rs = st.executeQuery(query);

////        System.out.println(rs.next());
//        rs.next();
//        String name=rs.getString("sname");
//        System.out.println(name);


//        while (rs.next()) {
//            System.out.print(rs.getInt(1));
//            System.out.print(" - " + rs.getString(2));
//            System.out.println(" - " + rs.getInt(3));
//        }

//        boolean status = st.execute(query);
//        System.out.println(status);

        st.execute(query);

        conn.close();
        System.out.println("Connection closed");
    }
}
