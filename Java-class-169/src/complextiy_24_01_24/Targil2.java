package complextiy_24_01_24;

public class Targil2 {
    public static void main(String[] args) {
        final int maxValue = 10;
        int[] myNumbers = new int[maxValue];

        //create a dummy array for us (shani idea)
        for (int counter=0;counter<myNumbers.length;counter++){
            myNumbers[counter] = (int)(Math.random()*11);
        }

        int middlePoint = (int)(Math.random()*maxValue);

        int sumBeforeMiddle = 0;
        int sumAfterMiddle = 0;

        for (int counter=0;counter<middlePoint;counter++){
            sumBeforeMiddle+=myNumbers[counter];
        }

        for (int counter=middlePoint+1;counter< myNumbers.length;counter++){
            sumAfterMiddle+=myNumbers[counter];
        }

        if (sumBeforeMiddle==sumAfterMiddle){
            System.out.println("balanced");
        } else {
            System.out.println("not balanced");
        }
    }
}
