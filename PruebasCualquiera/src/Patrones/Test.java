package Patrones;

import java.sql.*;
public class Test {
public static void main(String[] args) throws Exception {
Class.forName("org.sqlite.JDBC");
Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db");
Statement stat = conn.createStatement();
stat.executeUpdate("CREATE TABLE gente (name, occupation);");
stat.executeUpdate("insert into gente values ('holaaaaaaaaaaaaaaa', 'politics');");
stat.executeUpdate("insert into gente values ('Turing', 'computers');");
stat.executeUpdate("insert into gente values ('Wittgenstein', 'smartypants');");
ResultSet rs = stat.executeQuery("select * from gente;");
while (rs.next()) {
System.out.println("name = " + rs.getString("name"));
System.out.println("occupation = " + rs.getString("occupation"));
}
rs.close();
conn.close();
}
}

