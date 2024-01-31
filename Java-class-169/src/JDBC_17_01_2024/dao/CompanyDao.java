package JDBC_17_01_2024.dao;

import JDBC_17_01_2024.cls.Company;

import java.util.List;

public interface CompanyDao {
    List<Company> getAllCompanies();
    Company getOneCompany(int id);
}
