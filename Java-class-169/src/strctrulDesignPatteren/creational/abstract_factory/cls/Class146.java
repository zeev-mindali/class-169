package strctrulDesignPatteren.creational.abstract_factory.cls;

import strctrulDesignPatteren.creational.abstract_factory.admins.Admin;
import strctrulDesignPatteren.creational.abstract_factory.admins.Shani;
import strctrulDesignPatteren.creational.abstract_factory.factory.ClassFactory;
import strctrulDesignPatteren.creational.abstract_factory.teachers.Teacher;
import strctrulDesignPatteren.creational.abstract_factory.teachers.Zeev;

public class Class146 extends ClassFactory {


    @Override
    public Teacher getTeacher() {
        return new Zeev();
    }

    @Override
    public Admin getAdmin() {
        return new Shani();
    }
}
