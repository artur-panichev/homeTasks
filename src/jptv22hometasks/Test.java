package jptv22hometasks;

import java.util.Random;
import java.util.Scanner;

public class Test {
    private final Random random;
    private final Scanner scanner;

    Test(Scanner scanner){
        this.random = new Random();
        this.scanner = scanner;
    }

    public void doTest(){

        System.out.println("\n+++++++++++");
        System.out.println("+    Тест    +");
        System.out.println("++++++++++++++\n");

        int userMark = 0;

        for(int i = 0; i < 5; i++){
            int number1 = this.random.nextInt(8)+2;
            int number2 = this.random.nextInt(8)+2;
            System.out.print(number1 + " * " + number2 + " = ");

            int userAnswer = this.scanner.nextInt(); this.scanner.nextLine();

            if(number1*number2 == userAnswer){
                System.out.println("\u001B[32mПравильно\u001B[0m");
                userMark++;
            } else{
                System.out.println("\u001B[31mОшибка\u001B[0m");
            }
        }

        if(userMark == 5){
            System.out.println("Молодец");
        } else if(userMark > 2){
            System.out.println("Надо бы еще поучить");
        } else{
            System.out.println("Срочно нужно учить таблицу умножения");
        }


    }

}
