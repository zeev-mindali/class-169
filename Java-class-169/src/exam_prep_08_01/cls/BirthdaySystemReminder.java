package exam_prep_08_01.cls;

import java.util.*;

public class BirthdaySystemReminder {
    private Set<Person> people;
    private BirthdayTask task;
    private static Scanner scanner = new Scanner(System.in);

    public BirthdaySystemReminder(){
        this.people = new HashSet<>();
        task = new BirthdayTask(this.people);
        Thread thread = new Thread(task);
        thread.start();
        //thread will be terminated pon program closing....
        //thread.setDaemon(true);
        startSystem();
    }

    private void startSystem() {
        System.out.println("System was started !!!!!\n");
        while(true){
            showMenu();
            System.out.print("> ");
            String input = scanner.nextLine();
            System.out.println();
            switch(input){
                case "1":
                    addPerson(new Person());
                    break;
                case "2":
                    deletePerson();
                    break;
                case "3":
                    printAllPepole();
                    break;
                case "4":
                    System.out.println("Total fines:"+this.people.size());
                    break;
                case "5":

                    break;
                case "6":

                    break;
                case "7":

                    break;
                case "0":
                    endSystem();
                    break;
                default:
                    System.out.println("Not an option!!!!");
            }
        }
    }

    private void endSystem() {
        scanner.close();
        System.out.println("Birthday reminder ended !!!!!!");
        //exit the system :)
        System.exit(0);
    }

    private void printAllPepole() {
        if (this.people.size()==0){
            System.out.println("No people in the system");
            return;
        }
        //convert set to list.....
        List<Person> people = new ArrayList<>(this.people);
        Collections.sort(people);
        System.out.println(people);

        //this.people.forEach(System.out::println);
    }

    private void deletePerson() {
        System.out.println("Please insert id of person to delete");
        System.out.print("> ");
        int id = scanner.nextInt();
        for (Person person:people){
            if (person.getId()==id){
                people.remove(person);
                System.out.println("Person was erased !!!!!");
                break;
            }
        }
    }

    private void addPerson(Person person) {
        if (people.add(person)){
            System.out.println("Person was add!!!!!\n");
        } else {
            System.out.println("Person Already exists!!!!!\n");
        }
    }


    private void showMenu() {
        System.out.println("\n\n\nBrithday System Menu\n" +
         "================================"+
                "1. Add person\n"+
                "2. Delete Person\n"+
                "3. Print All Pepole\n"+
                "4. Print Pepole Count\n"+
                "5. Print Happy Month\n"+
                "6. Print Sad Month\n"+
                "7. Print Events\n"+
                "\n"+
                "0. Exit System"
                );
    }
}


 /*

        case "sunday":
            "dikaon"
            case "monday"
            "atzbani"

            case "friday":
            case "saturday":
              "shabat shalom"
              break;


     */