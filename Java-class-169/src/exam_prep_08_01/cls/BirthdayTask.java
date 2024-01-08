package exam_prep_08_01.cls;

import exam_prep_08_01.DateCls.DateFactory;

import java.time.LocalDate;
import java.util.Set;

public class BirthdayTask implements Runnable{
    //create set of person
    private final Set<Person> people;
    private final Integer TIME = 1000*60*60*24;
    private Boolean isRunning = true;
    public BirthdayTask(Set<Person> people){
        this.people=people;
    }

    public void setRunning(Boolean running) {
        isRunning = running;
    }

    private boolean isBirthMonth(Person person){
        return person.getBirthday().getMonth() == LocalDate.now().getMonth();
    }

    private boolean isBirthDay(Person person){
        return person.getBirthday().getDayOfMonth() == LocalDate.now().getDayOfMonth();
    }

    private void printHappy(Person person){
        System.out.println(person.getName()+" have a birthday ["+
                DateFactory.beautifyDate(person.getBirthday()) +"] "+
                "Going to eat a cake !!!!!!!");
    }

    @Override
    public void run() {
        while (isRunning){
            boolean found=false;
            for(Person person:people){
                if (isBirthDay(person) && isBirthMonth(person)){
                    found=true;
                    printHappy(person);
                }
            }
            if (!found){
                System.out.println("No Soap for you !!!!!");
            }
            try {
                Thread.sleep(TIME);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


/*

    if (condition){
        //do something
    }

    if (condition)
    {
        //do something
    }
 */