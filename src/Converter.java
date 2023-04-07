public class Converter {

    int convertToKm(int steps){
        int sm = steps * 75;
        int m = (int)(sm / 100);
        int km = (int)(m / 1000);
        return km;
    }
    int convertStepsToKilocalories(int steps){
        int calories = steps * 50;
        int kilocalories = (int)(calories / 1000);
        return kilocalories;
    }
}
