package athlete;

public class ConstructorAthlete {

    private String number;
    private String AthleteName, CountryCode,FirstShootingRange,SecondShooting,ThirShootingeRane;
    private String SkiTimeResult;


    public ConstructorAthlete(String number, String athleteName, String countryCode, String firstShootingRange, String secondShooting, String thirShootingeRane, String skiTimeResult) {
        this.number = number;
        this.AthleteName = athleteName;
        this.CountryCode = countryCode;
        this.FirstShootingRange = firstShootingRange;
        this.SecondShooting = secondShooting;
        this.ThirShootingeRane = thirShootingeRane;
        this.SkiTimeResult = skiTimeResult;
    }


    public void getTime(){

        String time = FirstShootingRange + SecondShooting + ThirShootingeRane;

        for (int i=0; i < time.length();i++){
            if(time[i] == 'o' ){


                time +=10;



            }
        }


    }
}
