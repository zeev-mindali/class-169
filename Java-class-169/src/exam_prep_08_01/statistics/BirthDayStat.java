package exam_prep_08_01.statistics;

import exam_prep_08_01.cls.Person;

import java.util.*;

public class BirthDayStat {
    //happy month, sad month, print events :)
    private static int MONTHS=12;
    public static int getHappyMonth(Set<Person> people){
        int[] months = getMonthCounter(people);
        int maxIndex = 0;
        for (int index=1;index<months.length;index++){
            if (months[index]>months[maxIndex]){
                maxIndex=index;
            }
        }
        return maxIndex+1;
    }

    public static int getSadMonth(Set<Person> people){
        int[] months = getMonthCounter(people); //[9,5,4,7,4,8,5,2,6,8,5,4]
        int minValue = months[0];
        int minIndex = 0;

        //iterate on array
        for(int index=1;index<months.length;index++){
            if (minValue>months[index]){
                minValue=months[index];
                minIndex=index;
            }
        }
        return minIndex+1;
    }

    private static int[] getMonthCounter(Set<Person> people){
        int[] months = new int[12]; //[0,0,0,0,0,0,0,0,0,0,0,0]

        //מערך מונים
        for(Person person:people){
            months[person.getBirthday().getMonthValue()-1]++;
        }
        return months;
    }

    //on each month all the birthdays in that month
    public static Map<Integer,List<Person>> getEvents(Set<Person> people){
        Map<Integer, List<Person>> events = new HashMap<>();

        for (int counter=1;counter<=MONTHS;counter++){
            events.put(counter,new ArrayList<>());
        }

        //08/07/1974
        for (Person person:people){
            int month = person.getBirthday().getMonthValue(); //7
            List<Person> monthEvents = events.get(month);
            monthEvents.add(person);
            //events.put(month,monthEvents);
        }

        return events;
    }


    //7
    // zeev 8/7
    // michael 1/7

    public static int[] getBirthdaysInMonth(Set<Person> people){
        return getMonthCounter(people);
    }
}
