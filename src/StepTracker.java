import java.util.Scanner;
public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepPerDay = 10000;
    Converter converter = new Converter();

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++){
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay(){
        System.out.println("Введите месяц:");
        int month = scanner.nextInt();
        if(month < 1 || month > 12) {
            System.out.println("Вы ввели неверное число");
            return;}

        System.out.println("Введите день: ");
        int day = scanner.nextInt();
        if(day < 1 || day > 30){
            System.out.println("Вы ввели неверное число");
            return;}

        System.out.println("Введите количество шагов:");
        int steps = scanner.nextInt();
        if (steps < 0){
            System.out.println("Вы ввели неверное число");
            return;}

        MonthData monthData = monthToData[month]; /*Я предполагая, что неправильно объявила эти переменные,
                                                       поэтому данные неверно сохраняются*/
        monthData.days[day - 1] = steps;
    }

    void changeStepGoal(){
        System.out.println("Введите цель шагов на день:");
        goalByStepPerDay = scanner.nextInt();
    }
    void printStatistics(){
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();
        if(month < 1 || month > 12) {
            System.out.println("Вы ввели неверное число");
            return;}
        MonthData monthData = monthToData[month];
        int sumSteps = monthData.sumStepsFromMonth();
        System.out.println("Количество пройденных шагов по дням: ");
        monthToData[month].printDaysAndStepsFromMonth();
        System.out.println("Общее количество шагов за месяц: " + sumSteps);
        System.out.println("Максимальное пройденное количество шагов в месяце: " +
                monthToData[month].maxSteps());
        System.out.println("Среднее количество шагов: " + (sumSteps / 30));
        System.out.println("Пройденная дистанция (в км): " +
                converter.convertToKm(sumSteps));
        System.out.println("Количество соженных килокалорий: " +
                converter.convertStepsToKilocalories(sumSteps));
        System.out.println("Лучшая серия: " + monthData.bestSeries(goalByStepPerDay));


    }
}
