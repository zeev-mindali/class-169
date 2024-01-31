package strctrulDesignPatteren.creational.abstract_factory.factory;

import strctrulDesignPatteren.creational.abstract_factory.admins.Admin;
import strctrulDesignPatteren.creational.abstract_factory.teachers.Teacher;

public abstract class ClassFactory {
    public abstract Teacher getTeacher();
    public abstract Admin getAdmin();
}
