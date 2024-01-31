package strctrulDesignPatteren.creational.factory.ex1;

import com.mysql.cj.xdevapi.Client;

public class Tester {
    public static void main(String[] args) {
        LoginManager user = new LoginManager();


        AdminService service = (AdminService) user.login("admin@admin.com","123456",ClientType.ADMIN);
        service.deleteCompany(5);
        ClientService userService = user.login("bla@bla.bla","12345",ClientType.USER);
        ((UserService)userService).puracheCoupont(10);
    }
}
