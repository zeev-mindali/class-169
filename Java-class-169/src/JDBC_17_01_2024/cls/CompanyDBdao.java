package JDBC_17_01_2024.cls;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class CompanyDBdao implements companyDao{
    @Override
    public boolean companyExists(String name, String email) {
        Map<Integer,Object> params = new HashMap<>();
        params.put(1,name);
        params.put(2,email);
        ResultSet result = DButils.runQueryFroResult(SQLcommands.companyExists, params);
    return true;
    }

    @Override
    public boolean createCompany(String name, String email, String password) {
        return false;
    }

    @Override
    public boolean companyLogin(String email, String password) {
        return false;
    }
}
