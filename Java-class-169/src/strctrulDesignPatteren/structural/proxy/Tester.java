package strctrulDesignPatteren.structural.proxy;

public class Tester {
    public static void main(String[] args) {
        Service service = new Service();

        service.toUpper("Zeev");
        service.toUpper("Zeev");
        service.toUpper("Zeev");
        service.toUpper("Tamir");
        service.toUpper("Tamir");
        service.toUpper("Shani");
        service.toUpper("Shani");
        service.toUpper("Shani");
        service.toUpper("Shani");
        service.toUpper("Shani");
        service.toUpper("Shani");
        service.toUpper("Tim");
        service.toUpper("Tim");
        service.toUpper("Tim");
        service.toUpper("Tim");

        service.billing();
    }
}
