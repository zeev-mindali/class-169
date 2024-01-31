package strctrulDesignPatteren.creational.factory.ex1;

public abstract class ClientService {
    private WhatEverRepository whatEverRepository = new WhatEverRepository();
    public abstract boolean login(String email, String password);
}
