//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
         System.out.printf("Hello and welcome!");
        Scanner sc=new Scanner(System.in);
        DatabaseHandler databaseHandler=new DatabaseHandler();
        Connection connection= databaseHandler.connect();
        try (Statement stmt =connection.createStatement()){
            System.out.println("Enter id");
            Integer id= sc.nextInt();
            System.out.println("Enter name");
            String name=sc.nextLine();
            System.out.println("Enter email");
            String email=sc.nextLine();
            stmt.executeUpdate("INSERT INTO admins (id,name,email) VALUES ('"+id+"','"+name+"','"+email+"')");
        }

        // for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
           // System.out.println("i = " + i);
        }
    }

