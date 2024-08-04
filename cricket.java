import java.util.Random;
import java.util.Scanner;

public class cricket {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of first team:");
        String team1  = sc.nextLine();
        System.out.println("Enter the name of second team:");
        String team2 = sc.nextLine();

        String bowlingTeam, battingTeam;
        System.out.println("Toss");
        if(random.nextBoolean()){
            battingTeam = team1;
            bowlingTeam = team2;
        }
        else{
            battingTeam = team2;
            bowlingTeam = team1;
        }
        System.out.println("\n"+bowlingTeam + " won the toss and will bowl first\n");

        String[] teamPlayers1 = new String[11];
        String[] teamPlayers2 = new String[11];

        for(int i = 0; i < 11; i++){
            System.out.println("Enter the name of player" + (i+1) + " of " + team1);
            teamPlayers1[i] = sc.nextLine();
        }

        for(int i = 0 ; i < 11 ; i++){
            System.out.println("Enter the name of player" + (i+1) + " of " + team2);
            teamPlayers2[i] = sc.nextLine();
        }

        int totalBalls1 = 120;
        int totalBalls2 = 120;
        int i = 0;
        int totalRuns2 = 0;
        int totalRuns1 = 0;
        System.out.println(" Score Card Of " + team1 );
        System.out.println("Player name " + "\t\t\t\t\t" + "Runs" + "\t\t" + " BallsFaced" + "\t\t\t" + "StrikeRate ");

        while (totalBalls1 > 0) {


            int runs1 = random.nextInt(70);
            int balls1 = random.nextInt(1, 50);
            totalBalls1 -= balls1;
            double strikeRate1 = (runs1 / balls1) * 100;
            System.out.println(teamPlayers1[i] + "\t\t\t\t\t\t" + runs1 + "\t\t\t\t" + balls1 + "\t\t\t\t" + strikeRate1);
            totalRuns1 += runs1;
            i++;
        }
        System.out.println("Total " + totalRuns1 );
        System.out.println("Score Card Of " + team2 );
        System.out.println("Player name " + "\t\t\t\t\t" + "Runs" + "\t\t" + " BallsFaced" + "\t\t\t" + "StrikeRate ");
        int j=0;
        while (totalBalls2 > 0) {


            int runs2 = random.nextInt(70);
            int balls2 = random.nextInt(1, 50);
            totalBalls2 -= balls2;
            double strikeRate2 = (runs2 / balls2) * 100;
            System.out.println(teamPlayers2[j] + "\t\t\t\t\t\t" + runs2 + "\t\t\t\t" + balls2 + "\t\t\t\t" + strikeRate2);
            totalRuns2 += runs2;
            j++;
        }
        System.out.println("Total " + totalRuns2 );

        if(totalRuns1 > totalRuns2){
            System.out.println(team1 + "wins");
        }
        else {
            System.out.println(team2 + "wins");
        }

    }
}
