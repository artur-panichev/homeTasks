/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22hometasks;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
class TemperatureConverter {

    private final Scanner scanner;

    TemperatureConverter(Scanner scanner) {
        this.scanner = scanner;
        
    }

    public void doConver() {
      boolean repeat = true;
        do{
            System.out.println("\n+++++++++++++++++++++++++++++++");
            System.out.println("+    Конвертер температуры    +");
            System.out.println("+++++++++++++++++++++++++++++++\n");
            
            System.out.println("Выберите направление конвертирования: ");
            System.out.println("0. Выход из программы");
            System.out.println("1. Цельсий -> Фаренгейт");
            System.out.println("2. Фаренгейт -> Цельсий");
            System.out.println("№ задачи: ");
            int task = this.scanner.nextInt();scanner.nextLine();
            
            switch(task){
                case 0:
                    System.out.println("Выбран выходи из конвертора!");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("Цельсий -> Фаренгейт");
                    System.out.print("Введите температуру в градусах Цельсия: ");
                    int tempC = scanner.nextInt();scanner.nextLine();
                    System.out.println(tempC+"C = " + ((tempC*9/5)+32) + "F");
                    break;
                case 2:
                    System.out.println("Фаренгейт -> Цельсий");
                    System.out.print("Введите температуру в градусах Цельсия: ");
                    int tempF = scanner.nextInt();scanner.nextLine();
                    System.out.println(tempF+"F = " + ((tempF-32)*5/9) + "C");
                    break;    
                default:
                    System.out.println("Выберайте номер из списка задач!");
                    break;
            }
        }while(repeat);  
    }
    
}
