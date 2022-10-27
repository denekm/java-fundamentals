import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lab01 {
    public static String pluralize(String word,int num) {

        if (num == 0 || num > 1) {
            return word + "s";
        } else {
            return word;
        }
    }
    public static void flipNHeads(int n){

        int flipCounter = 0;
        int headCounter = 0;

        while (headCounter != n ) {
            double random = Math.random();
            System.out.println("Random Number is: " + random);
            if (random >= 0.5) {
                System.out.println("heads");
                flipCounter ++ ;
                headCounter ++ ;
            } else {
                System.out.println("tails");
                headCounter = 0;
                flipCounter ++ ;
            }

        }
        System.out.println("It took " + flipCounter +" flips to flip " + n + " heads in a row.");
    }

    public static void clock() {
        LocalDateTime now = LocalDateTime.now();
        while (true) {
            LocalDateTime timeNow = LocalDateTime.now();
            if (now.getSecond() != timeNow.getSecond()) {
                System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
                now = timeNow;
            }
        }
    }
    public static void main(String[] args) {

        // Question One pluralize ()

        int dogCount = 1;

        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");


        // Question two flipHeads()

        flipNHeads(2);

        // Question three clock()

        clock();

    }


}
