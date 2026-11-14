package bank.management.system;

import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;
    public Connn(){
        try{
            String url = System.getenv().getOrDefault("BANK_DB_URL", "jdbc:mysql://localhost:3306/bankSystem");
            String user = System.getenv().getOrDefault("BANK_DB_USER", "root");
            String password = System.getenv("BANK_DB_PASSWORD");
            if (password == null) {
                throw new IllegalStateException("Set the BANK_DB_PASSWORD environment variable before starting the application.");
            }
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
