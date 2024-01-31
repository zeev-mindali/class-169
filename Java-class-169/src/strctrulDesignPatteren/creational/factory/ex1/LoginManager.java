package strctrulDesignPatteren.creational.factory.ex1;

public class LoginManager {
    public ClientService login(String email, String password, ClientType type){
        switch (type){
            case ADMIN :
                return new AdminService();
            case COMPANY:
                return new CompanyService();
            case USER:
                return new UserService();
        }
        return null;
    }
}
