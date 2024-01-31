package JDBC_17_01_2024.Exceptions;

public class SqlException extends Exception{
    public SqlException() {
    }

    public SqlException(String message) {
        super(message);
    }
}
