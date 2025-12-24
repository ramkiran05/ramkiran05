public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int n){
        return expectedMinutesInOven() - n;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int l){
        return 2 * l;
    }
    // TODO: define the 'totalTimeInMinutes()' method
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
