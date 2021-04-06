package com.hackerrank.challenges;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Exercise10 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int arCount = Integer.parseInt(scanner.nextLine().trim());
        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        exercise10(ar);
    }

    static void exercise10(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            int toPrint = -1;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] > ar[i]) {
                    toPrint = ar[j];
                    break;
                }
            }
            System.out.println(toPrint);
        }
    }
}