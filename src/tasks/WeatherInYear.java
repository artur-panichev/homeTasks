/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class WeatherInYear {
    
    private enum MONTH {
        Январь, Февраль, Март, Апрель, Май, Июнь, Июль, Август, Сентябрь, Октябрь, Ноябрь, Декабрь
    }
    
    public void run() {
        System.out.println("-------------------------------------------------------------Погода в году-------------------------------------------------------------");
        int[][] weatherInYear = new int[12][];
        weatherInYear[0] = new int[31];
        weatherInYear[1] = new int[28];
        weatherInYear[2] = new int[31];
        weatherInYear[3] = new int[30];
        weatherInYear[4] = new int[31];
        weatherInYear[5] = new int[30];
        weatherInYear[6] = new int[31];
        weatherInYear[7] = new int[31];
        weatherInYear[8] = new int[30];
        weatherInYear[9] = new int[31];
        weatherInYear[10] = new int[30];
        weatherInYear[11] = new int[31];
        int min = -35;
        int max = 35;
        Random random = new Random();
        for(int i = 0; i < weatherInYear.length; i++){
            for(int j = 0; j < weatherInYear[i].length; j++){
                weatherInYear[i][j] = random.nextInt(max-min+1)+min;
            }
        }
        for(int i = 0; i < weatherInYear.length; i++){
            System.out.printf("%10s: ", MONTH.values()[i]);
            for(int j = 0; j < weatherInYear[i].length; j++){
                System.out.printf("%4d", weatherInYear[i][j]);
            }
            System.out.println("");
        }
    }
    
}
