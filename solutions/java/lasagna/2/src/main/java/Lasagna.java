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
        Lasagna las = new Lasagna();
        las.expectedMinutesInOven();
        las.remainingMinutesInOven(30);
        las.preparationTimeInMinutes(2);
        las.totalTimeInMinutes(3,20);
    }
}
