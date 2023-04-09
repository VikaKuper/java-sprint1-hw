public class Converter {

    int convertToKm(int steps) {
        int smInStep = 75;
        int sm = steps * smInStep;
        int m = sm / 100;
        int km = m / 1000;
        return km;
    }

    int convertStepsToKilocalories(int steps) {
        int calories = steps * 50;
        int kilocalories = (int) (calories / 1000);
        return kilocalories;
    }
}
