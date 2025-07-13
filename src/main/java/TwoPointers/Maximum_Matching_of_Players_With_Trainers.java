package TwoPointers;

import java.util.Arrays;

public class Maximum_Matching_of_Players_With_Trainers {
    public static void main(String[] args) {
        Maximum_Matching_of_Players_With_Trainers twoPointers = new Maximum_Matching_of_Players_With_Trainers();
        int count = twoPointers.matchPlayersAndTrainers(new int[]{1,1000000000},new int[]{1000000000,1});
        System.out.println(count);
    }
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int count =0;

        Arrays.sort(players);
        Arrays.sort(trainers);
        System.out.println(Arrays.toString(players));
        System.out.println(Arrays.toString(trainers));


        int startPlayer =0;
        int endPlayer = players.length-1;
        int startTrainer =0;
        int endTrainer = trainers.length-1;

        while(startPlayer <=endPlayer && startTrainer <= endTrainer){
            System.out.println(players[startPlayer]);
            System.out.println(trainers[startTrainer]);
            if(players[startPlayer] <= trainers[startTrainer]){
                count++;
                startTrainer++;
                startPlayer++;
            }else {
                startTrainer++;
            }



        }

        return count;

    }

}
