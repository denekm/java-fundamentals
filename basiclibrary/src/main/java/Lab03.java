import java.util.*;

public class Lab03 {
    //Tallying Election
    //Write a function called tally that accepts a List of Strings representing votes
    //and returns one string to show what got the most votes.
    public static String tally(List<String> votes) {
        Map<String, Integer> tally = new HashMap<>();

        for (int i = 0; i < votes.size(); i++) {
            if (!tally.containsKey(votes.get(i))) {
                tally.put(votes.get(i), 1);
            } else {
                tally.put(votes.get(i), tally.get(votes.get(i)) + 1);
            }
        }
        System.out.println(tally.entrySet());

        // work in progress
        String winner = votes.get(0);
        return winner;
    }

    public static void main(String[] args) {

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");


        // Daily average temperatures for Seattle, October 1-28 2017
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        // Iterate through all of the data to find the min and max values.

        int min = weeklyMonthTemperatures[0][0];
        int max = weeklyMonthTemperatures[0][0];

        for (int i = 0; i < weeklyMonthTemperatures.length; i++) {
            for (int j = 1; j < weeklyMonthTemperatures[i].length; j++) {
                if (weeklyMonthTemperatures[i][j] < min) {
                    min = weeklyMonthTemperatures[i][j];
                }
                if (weeklyMonthTemperatures[i][j] > max) {
                    max = weeklyMonthTemperatures[i][j];
                }
            }
        }
        System.out.println("High : " + max);
        System.out.println("Low : " + min);

        // Use a HashSet of type Integer to keep track of all the unique temperatures seen.

        HashSet<Integer> allTemp = new HashSet<>();

        for (int i = 0; i < weeklyMonthTemperatures.length; i++) {
            for (int j = 0; j < weeklyMonthTemperatures[i].length; j++) {
                allTemp.add(weeklyMonthTemperatures[i][j]);
            }
        }

        // System.out.println(allTemp);

        //Finally, iterate from the min temp to the max temp and create a String containing
        // any temperature not seen during the month. Return that String.

        for (int i = min; i < max; i++) {
            if (!allTemp.contains(i)) {
                String nst = "Never saw temperature: " + i;
                System.out.println(nst);
            }
        }
    }
}
