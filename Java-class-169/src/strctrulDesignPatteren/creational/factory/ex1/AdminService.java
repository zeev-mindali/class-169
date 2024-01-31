package strctrulDesignPatteren.creational.factory.ex1;

public class AdminService extends ClientService {

    @Override
    public boolean login(String email, String password) {
        return false;
    }

    public boolean deleteCompany(int companyID){
        //bla bla
        return false;
    }
}
