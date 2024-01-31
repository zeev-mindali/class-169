package strctrulDesignPatteren.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class Service {
    private Machine machine = new Machine();
    private Map<String,String> cache = new HashMap<>();

    public String toUpper(String input){
        if (cache.get(input)==null){
            cache.put(input, machine.toUpper(input));
        }
        return cache.get(input);
    }

    public void billing(){
        System.out.println("total money to bill:"+machine.getCost());
    }
}
