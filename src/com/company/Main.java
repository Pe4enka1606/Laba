package com.company;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
	    System.out.println ("Имеется n итоговых оценок студента. Определить  является ли студент неуспевающим (имеются оценки ниже 4).");
        int N = 0;
        boolean PosMarks;
        boolean isIncorrect;
        final int MinNum = 0;
        final int MaxInt = 2147483647;
        final int MinMark = 4;
        final int MaxMark = 10;
        System.out.println ("Введите количество итоговых оценок студента.");
        do {
            isIncorrect = false;
            try {
                N = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Ошибка. Введите натуральное число до 2147483647.");
                isIncorrect = true;
            }
            if ((!isIncorrect && N < MinNum) | (!isIncorrect && N > MaxInt)) {
                System.err.println ("Ошибка. Введите натуральное число до 2147483647.");
                isIncorrect = true;
            }
        } while (isIncorrect);
        int Marks [] = new int [N];
        System.out.println("Введите итоговые оценки студента.");
        PosMarks = true;
        for (int i = 0; i < N; i ++) {
            do {
                isIncorrect = false;
                try {
                    Marks[i] = Integer.parseInt (scan.nextLine());
                } catch (NumberFormatException e) {
                    System.err.println("Ошибка. Введите натуральные числа до 10");
                    isIncorrect = true;
                }
                if ((!isIncorrect && Marks[i] < MinNum) | (!isIncorrect && Marks[i] > MaxMark))  {
                    System.err.println("Ошибка. Введите натуральные числа до 10");
                    isIncorrect = true;
                }
            } while (isIncorrect);
            if (Marks[i] < MinMark) {
                PosMarks = false;
            }
        }
        if (PosMarks) {
            System.out.println ("Студент является успевающим.");
        } else {
            System.out.println ("Студент является неуспевающим.");
        }
    }
}
