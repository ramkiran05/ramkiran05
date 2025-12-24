public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int n){
        return expectedMinutesInOven() - n;
    }
    public int preparationTimeInMinutes(int l){
        return 2 * l;
    }
    public int totalTimeInMinutes(int l, int n){
        return preparationTimeInMinutes(l) + n;
    }
    public static void main(String[] args){
        Lasagna lasagna = new Lasagna();
        lasagna.expectedMinutesInOven();
        lasagna.remainingMinutesInOven(30);
        lasagna.preparationTimeInMinutes(2);
        lasagna.totalTimeInMinutes(3,20);
    }
}
