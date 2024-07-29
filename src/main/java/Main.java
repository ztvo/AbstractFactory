import factory.ILearningMaterialFactory;
import factory.MathematicsCourseFactory;
import factory.ProgrammingCourseFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int selection;
        boolean exit;
        System.out.println("Выберите online курс:");
        System.out.println("-------------------------\n");
        System.out.println("1 - Математический");
        System.out.println("2 - Программирования");
        System.out.println("3 - Выход");
        exit = false;
        while (!exit) {
            Scanner input = new Scanner(System.in);
            selection = input.nextInt();
            ILearningMaterialFactory factory;
            OnlineCourse onlineCourse;

            switch (selection) {
                case 1:
                    factory = new MathematicsCourseFactory();
                    onlineCourse = new OnlineCourse(factory);
                    break;
                case 2:
                    factory = new ProgrammingCourseFactory();
                    onlineCourse = new OnlineCourse(factory);
                    break;
                case 3:
                    exit = true;
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Если хотите выйти из приложения - нажмите 3!");

            }
        }
    }
}
