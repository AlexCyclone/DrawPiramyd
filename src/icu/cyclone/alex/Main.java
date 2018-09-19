package icu.cyclone.alex;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type size: ");
        drawPiramyd(sc.nextInt());
    }

    public static void drawPiramyd(int size) {
        int inc = 1;
        for (int i = 1; i > 0; i += inc) {
            char[] str = new char[i];
            Arrays.fill(str, '*');
            System.out.println(str);
            if (i == size) {
                inc = -1;
            }
        }
    }
}
