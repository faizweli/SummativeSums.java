/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author faizaweli
 */
public class SummativeSums {
    public static void main(String[] args) {
        int [][] numbers = new int [4][];
        int totalValue = 0;
        numbers[0] = new int [] { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        numbers[1] = new int [] { 999, -60, -77, 14, 160, 301 };
        numbers[2] = new int [] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
140, 150, 160, 170, 180, 190, 200, -99 };
        numbers[3] = new int [] {0,0,0};
        int i=0;
        for (int a=0; a < 3; a++){
        //    for (int i=0; i < numbers[a].length; i++) {
        // totalValue = totalValue + numbers[a][i];  
        calculateNumbers(a, numbers);
        System.out.println("#" + (a+1) +" Array Sum: " +numbers[3][a]);}
    }
    public static int calculateNumbers(int a, int [][] numbers) { 
        for (int i=0; i < numbers[a].length; i++) {
         numbers[3][a] = numbers[3][a] + numbers[a][i];}  
        return numbers[3][a];}
    }