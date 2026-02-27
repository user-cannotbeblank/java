package personal_projects;

enum Level {
    EASY,
    MEDIUM,
    HARD,
    INSANE,
    EXTREME
}

public class enumSwitch {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        switch(myVar) {
            case EASY:
                System.out.println("Shiver");
                break;
            case MEDIUM:
                System.out.println("Reanimation");
                break;
            case HARD:
                System.out.println("Nine Circles");
                break;
            case INSANE:
                System.out.println("Windy Landscape");
                break;
            case EXTREME:
                System.out.println("SUPERHATEMEWORLD");
                break;
            default:
                System.out.println("Stereo Madness");
                break;
        }
    }
}