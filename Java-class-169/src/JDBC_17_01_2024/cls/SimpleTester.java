package JDBC_17_01_2024.cls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class SimpleTester {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        //createTable();
        //addNewStudent("Aylon","055-123-4567",100,"Qiryat Ono",false);
        //System.out.println("Please enetr the grade above:");
        //int aboveGrade = scanner.nextInt();
        getStudents(0);

    }

    private static void getStudents(int aboveGrade) throws SQLException {
        List<Students> myList = new ArrayList<>();
        Map<Integer,Object> params = new HashMap<>();
        params.put(2,96);
        params.put(1,94);

        ResultSet results = DButils.runQueryFroResult(SQLcommands.getStudentBetwen,params);
        /*
            params.put(1,name);
            params.put(2,tel);
            params.put(3,avgGrade);
            params.put(4,city);
            params.put(5,married);
         */
        while (results.next()){
            int id = results.getInt(1);
            String name = results.getString(2);
            String tel = results.getString(3);
            int avgGrade = results.getInt(4);
            String city = results.getString(5);
            boolean isMarried = results.getBoolean(6);
            myList.add(new Students(id,name,tel,avgGrade,city,isMarried));
        }

        myList.forEach(System.out::println);
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