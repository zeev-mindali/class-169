package JDBC_17_01_2024.cls;

import java.util.Map;

public class MultiData {
    String sql;
    Map<String,Object> params;

    public MultiData(String sql, Map<String, Object> params) {
        this.sql = sql;
        this.params = params;
    }
}
