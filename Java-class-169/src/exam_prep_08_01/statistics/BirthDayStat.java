package exam_prep_08_01.statistics;

import exam_prep_08_01.cls.Person;

import java.util.Set;

public class BirthDayStat {
    //happy month, sad month, print events :)
    public static int getHappyMonth(Set<Person> people){
        return 0;
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
}
