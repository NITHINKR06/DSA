public class Lasagna {

    int actualMinutesInOven=30;
    int numberLayer=3;
    public int expectedMinutesInOven(){
        return 40;
    } 
    public int remainingMinutesInOven(int actualMinutesInOven){
        return expectedMinutesInOven() - actualMinutesInOven;
    }
    public int preparationTimeInMinutes(int numberLayer){
        return numberLayer * 2;
    }
    public int totalTimeInMinutes(int numberLayer, int actualMinutesInOven){
        return preparationTimeInMinutes(numberLayer) + actualMinutesInOven ;
    }
}
