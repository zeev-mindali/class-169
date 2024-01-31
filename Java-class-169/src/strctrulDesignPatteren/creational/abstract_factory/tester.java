package strctrulDesignPatteren.creational.abstract_factory;

import strctrulDesignPatteren.creational.abstract_factory.cls.Class146;
import strctrulDesignPatteren.creational.abstract_factory.factory.ClassFactory;

public class tester {
    public static void main(String[] args) {
        ClassFactory myClass = new Class146();
        myClass.getAdmin().name();
        myClass.getTeacher().name();
    }
}
