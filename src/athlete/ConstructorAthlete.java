package athlete;

public class ConstructorAthlete {

    private String number;
    private String athleteName;
    private String countryCode;
    private String skiTimeResult;
    private String firstShooting;
    private String secondShooting;
    private String thirdShooting;
    private int totalTime;
    private int penalty;


    public ConstructorAthlete(String number, String athleteName, String countryCode, String skiTimeResult, String firstShooting, String secondShooting, String thirdShooting) {
        this.number = number;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTimeResult = skiTimeResult;
        this.firstShooting = firstShooting;
        this.secondShooting = secondShooting;
        this.thirdShooting = thirdShooting;
        getTime();
    }

    public void getTime( ) {


        String[] time = skiTimeResult.split(":");
        int min = Integer.parseInt(time[0]);
        int sec = Integer.parseInt(time[1]);

        String shoot = firstShooting + secondShooting + thirdShooting;

        for (int i = 0; i < shoot.length(); i++) {
            if (shoot.charAt(i) == 'o') {
                 penalty += 10;
            }
        }

        totalTime = min * 60 + sec + penalty;
    }

    public int getTotalTime() {
        return totalTime;
    }

    @Override
    public String toString() {
        return "ConstructorAthlete{" +
                "number='" + number + '\'' +
                ", athleteName='" + athleteName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", skiTimeResult='" + skiTimeResult + '\'' +
                ", totalTime=" + (totalTime / 60) + ":" + (totalTime % 60) + " penalty=" + penalty +
                '}';
    }
}

