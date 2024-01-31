package JDBC_17_01_2024.db_dao;

import JDBC_17_01_2024.cls.Company;
import JDBC_17_01_2024.dao.CompanyDao;

import java.util.List;

public class CompanyDbDao implements CompanyDao {
    @Override
    public List<Company> getAllCompanies() {
        //sql -> resultSet
        //List<Company> result = new ArrayList<>();
        /*
            while(resultSet.next()){


               result.add(company)
            }
         */
        //return result
        return null;
    }

    @Override
    public Company getOneCompany(int id) {
        /*
            //sql -> resultSet (1)
            //Company company = new Company();
            while (result.next()){
                company.setName(result.getString(2));
            }

            company = new Company(result.getInt(1),result.getString(2)

         */
        Company company = new Company();
        company.setName("bla bla");
        return null;
    }
}
