/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class NumberParser {

    private final Scanner scanner;

    public NumberParser(Scanner scanner) {
         this.scanner = scanner;
    }
    public void doParser(){
        System.out.println("\n++++++++++++++++++++++");
        System.out.println("+    Парсер числа    +");
        System.out.println("++++++++++++++++++++++\n");

        System.out.print("Введите трехзначное число: ");
        int number = this.scanner.nextInt();scanner.nextLine();

        int edCount = number%10;
        int decCount = ((number-edCount)%100)/10;
        int sumNumbers = edCount+decCount+((number-edCount-decCount)%1000)/100;
        
        System.out.printf("В введенном числе: %n");
        System.out.printf("  - единиц: %d%n", edCount);
        System.out.printf("  - десятков: %d%n", decCount);
        System.out.printf("  - сумма цифр: %d%n", sumNumbers);
        
        
    }
    
}
