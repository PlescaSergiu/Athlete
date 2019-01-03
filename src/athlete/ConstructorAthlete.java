package athlete;

public class ConstructorAthlete {

    private String number;
    private String AthleteName, CountryCode, FirstShootingRange, SecondShooting, ThirShootingeRane;
    private String SkiTimeResult;
    private int totalTime, penalty;


    public ConstructorAthlete(String number, String athleteName, String countryCode, String firstShootingRange, String secondShooting, String thirShootingeRane, String skiTimeResult) {
        this.number = number;
        this.AthleteName = athleteName;
        this.CountryCode = countryCode;
        this.FirstShootingRange = firstShootingRange;
        this.SecondShooting = secondShooting;
        this.ThirShootingeRane = thirShootingeRane;
        this.SkiTimeResult = skiTimeResult;
        getTime();
    }


    public void getTime( ) {

        String[] time = SkiTimeResult.split(":");
        int min = Integer.parseInt(time[0]);
        int sec = Integer.parseInt(time[1]);

        String shoot = FirstShootingRange + SecondShooting + ThirShootingeRane;

        for (int j = 0; j < shoot.length(); j++) {
            if (shoot.charAt(j) == 'o') {
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
                ", AthleteName='" + AthleteName + '\'' +
                ", CountryCode='" + CountryCode + '\'' +
                ", SkiTimeResult='" + SkiTimeResult + '\'' +
                ", totalTime=" + totalTime +
                '}';
    }
}

