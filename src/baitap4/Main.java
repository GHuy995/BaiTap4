/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap4;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Nhap phan tu thu" + (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }
    public static void printData(float[] arrays) {
        System.out.print("Mang: ");
        for (float element : arrays) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static float findMax2(float[] arrays) {
        float max1 = Float.MIN_VALUE, max2 = Float.MIN_VALUE;
        for (float num : arrays) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }
        return max2;
    }
    public static float[] deleteOddNumber(float[] arrays) {
        ArrayList<Float> evenNumbers = new ArrayList<>();
        for (float num : arrays) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        float[] result = new float[evenNumbers.size()];
        for (int i = 0; i < evenNumbers.size(); i++) {
            result[i] = evenNumbers.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        float[] arrays = new float[5];
        arrays = importData(arrays);
        printData(arrays);
        float max2 = findMax2(arrays);
        System.out.println("Phan tu lon thu 2 trong mang: " + max2);

        
        arrays = deleteOddNumber(arrays);
        System.out.println("Mang sau khi xoa phan tu le: ");
        printData(arrays);
    }
}
