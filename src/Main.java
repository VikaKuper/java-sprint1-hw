import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if(command == 1){
                System.out.println("Выполняется команда 1");
                stepTracker.addNewNumberStepsPerDay();
            }else if(command == 2){
                System.out.println("Выполняется команда 2");
                stepTracker.changeStepGoal();
            }else if(command == 3){
                System.out.println("Выполняется команда 3");
                stepTracker.printStatistics();
            }else if(command == 4){
                System.out.println("Выполняется команда 4. Выход");
                break;
            }else{
                System.out.println("Извините, такой комманды пока нет");
            }
        }
    }
    static void printMenu(){
        System.out.println("Введите команду: ");
        System.out.println("1 - Ввести количество шагов за определенный день");
        System.out.println("2 - Изменить цель по количеству шагов в день");
        System.out.println("3 - Печать статистики за месяц");
        System.out.println("4 - Выход");
    }
}
