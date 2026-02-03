public class WaterBottleTracker {
    static int dailyGoal;
    String userName;
    int totalConsumed;

    public static void showWelcomeMessage(){
        System.out.println("Welcome to Smart Water Bottle Tracker");
        System.out.println("Daily Water Goal: 2000 ml");
        System.out.println("--------------------------------------");

    }
    public static boolean isGoalReached(int totalConsumed){
        dailyGoal=2000;
        if (totalConsumed >= dailyGoal) {
            return true;
        } else{
            return false;
        }
    }
    public int addWater ( int amount){
        totalConsumed=amount+totalConsumed;
        return totalConsumed;
    }
    public void displayStatus (){
        System.out.println("username: "+userName);
        System.out.println("total water consumed: "+ totalConsumed);
    }
}
