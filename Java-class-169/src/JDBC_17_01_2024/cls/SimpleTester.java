package JDBC_17_01_2024.cls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class SimpleTester {
    public static void main(String[] args) throws SQLException {
        //createTable();
        addNewStudent("Aylon","055-123-4567",100,"Qiryat Ono",false);
    }

    private static void addNewStudentOld(String name, String tel, int avgGrade, String city, boolean married) throws SQLException {
        //create a connection
        Connection connection = null;

        //get connection
        try {
            connection = ConnectionPool.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQLcommands.addStudent);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, tel);
            preparedStatement.setInt(3, avgGrade);
            preparedStatement.setString(4, city);
            preparedStatement.setBoolean(5, married);

            preparedStatement.execute();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionPool.getInstance().returnConnection(connection);
        }
    }

    private static void createTableOld() throws SQLException {
        Connection connection = null;

        try {
            connection = ConnectionPool.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQLcommands.CREATE_TABLE);
            preparedStatement.execute();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionPool.getInstance().returnConnection(connection);
        }
    }

    private static void createTable() {
        if (DButils.runQuery(SQLcommands.CREATE_TABLE)) {
            System.out.println("Worked");
        } else {
            System.out.println("Error");
        }
    }

    private static void addNewStudent(String name, String tel, int avgGrade, String city, boolean married) {
        Map<Integer,Object> params = new HashMap();
        //name,tel,avgGrade,city,married
        params.put(1,name);
        params.put(2,tel);
        params.put(3,avgGrade);
        params.put(4,city);
        params.put(5,married);

        DButils.runQuery(SQLcommands.addStudent,params);
    }
}