package JDBC_17_01_2024.cls;

import java.sql.*;
import java.util.Map;

public class DButils {
    public static boolean runQuery(String sql){
        //delete from students
        //use connection from connection sql to send queries to our DB
        Connection connection = null;

        try {
            if (sql.toLowerCase().contains("delete")){
                System.out.println("Roni please stop");
                return false;
            }
            //get a connection from connection pool
            connection = ConnectionPool.getInstance().getConnection();

            //prepare our sql (String) and convert it to a language that mysql will understand
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            //run statment
            preparedStatement.execute();
            return true;
        } catch (InterruptedException | SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            ConnectionPool.getInstance().returnConnection(connection);
        }

    }

    public static boolean runQuery(String sql, Map<Integer, Object> params){
        Connection connection = null;
        try {
            connection = ConnectionPool.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            /*
                for (Map.Entry<Integer,Object) item:params.entrySet()){

                }

             */

            //lambda expression
            params.forEach((key,value)->{
                try {
                    if (value instanceof Integer){
                        preparedStatement.setInt(key,(Integer)value);
                    } else if (value instanceof String){
                        preparedStatement.setString(key,String.valueOf(value));
                    } else if (value instanceof Date){
                        preparedStatement.setDate(key,(Date)value);
                    } else if (value instanceof Double){
                        preparedStatement.setDouble(key, (Double)value);
                    } else if (value instanceof Boolean){
                        preparedStatement.setBoolean(key, (Boolean)value);
                    } else if (value instanceof Float){
                        preparedStatement.setFloat(key, (Float)value);
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            });
            preparedStatement.execute();
            return true;
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            ConnectionPool.getInstance().returnConnection(connection);
        }
    }

    public static ResultSet runQueryFroResult(String sql,Map<Integer,Object> params){
        Connection connection = null;

        try {
            connection = ConnectionPool.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            params.forEach((key,value)->{
                try {
                    if (value instanceof Integer){
                        preparedStatement.setInt(key,(Integer)value);
                    } else if (value instanceof String){
                        preparedStatement.setString(key,String.valueOf(value));
                    } else if (value instanceof Date){
                        preparedStatement.setDate(key,(Date)value);
                    } else if (value instanceof Double){
                        preparedStatement.setDouble(key, (Double)value);
                    } else if (value instanceof Boolean){
                        preparedStatement.setBoolean(key, (Boolean)value);
                    } else if (value instanceof Float){
                        preparedStatement.setFloat(key, (Float)value);
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            });


            System.out.println(preparedStatement);
            return preparedStatement.executeQuery();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
