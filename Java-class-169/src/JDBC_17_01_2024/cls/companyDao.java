package JDBC_17_01_2024.cls;

public interface companyDao {
    boolean companyExists(String name,String email);
    boolean createCompany(String name,String email, String password);
    boolean companyLogin(String email,String password);
}
