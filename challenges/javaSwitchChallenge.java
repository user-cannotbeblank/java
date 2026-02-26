package challenges;

public class javaSwitchChallenge {
    public static void main(String[] args) {
        int choice = 2;
        // 1 - Coffee, 2 - Tea

        switch(choice) {
            case 1:
                System.out.println("You ordered coffee!");
                break;
            case 2:
                System.out.println("You ordered tea!");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}