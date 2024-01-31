package strctrulDesignPatteren.creational.abstract_factory.cls;

import strctrulDesignPatteren.creational.abstract_factory.admins.Admin;
import strctrulDesignPatteren.creational.abstract_factory.admins.Tim;
import strctrulDesignPatteren.creational.abstract_factory.factory.ClassFactory;
import strctrulDesignPatteren.creational.abstract_factory.teachers.Kobi;
import strctrulDesignPatteren.creational.abstract_factory.teachers.Teacher;

public class Class147 extends ClassFactory {
    @Override
    public Teacher getTeacher() {
        return new Kobi();
    }

    @Override
    public Admin getAdmin() {
        return new Tim();
    }
}
