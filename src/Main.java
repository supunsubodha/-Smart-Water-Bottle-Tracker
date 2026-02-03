import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        WaterBottleTracker wbt = new WaterBottleTracker();
        WaterBottleTracker.showWelcomeMessage();
        Scanner sc = new Scanner(System.in);
        System.out.print("User Name: ");
        wbt.userName = sc.nextLine();
        System.out.println();
        int waterConsumed;
        while(true){
            System.out.print("Enter water consumed (ml) (0 to stop): ");
            waterConsumed = sc.nextInt();
            if(waterConsumed == 0){
                break;
            }else{
                wbt.addWater(waterConsumed);
            }

        }
        wbt.displayStatus();
        boolean isGoalReached = WaterBottleTracker.isGoalReached(wbt.totalConsumed);
        if(isGoalReached == true){
            System.out.println("Daily goal reached. Good job!");
        }else{
            System.out.println("Daily goal not reached. Keep drinking water!");
        }
    }
}