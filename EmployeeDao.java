import java.sql.*;
public class EmployeeDao{

    public static String[][]getAll(){
        String [][] employee = null;

        try {
    
            Connection dbCon = DriverManager.getConnection("jdbc:mysql://localhost/earth", "root", "1234");
            Statement stm = dbCon.createStatement(1004,1007);

            ResultSet result = stm.executeQuery("select * from employee ");
            result.last();
            int lastRowNumber = result.getRow();
            // System.out.println("Last Row Numbers "+ lastRowNumber);
            result.first();
            employee = new String[lastRowNumber][3];
           
            do {
                int empId =result.getRow()-1;
                employee[empId][0] = result.getString("name");
                employee[empId][1] = result.getString("age");
                employee[empId][2] = result.getString("gender");
                empId++;
                
            } while (result.next());
            
        } catch (SQLException e) {
            System.out.println("Can't get Results as:" + e.getMessage());
        }
        return employee;
    }
    
}