package cz.spsmb.a3;

import java.util.Scanner;

public class Application {

    public static final int THO_5000 = 5000;
    public static final int HUD_100 = 100;
    public static final int TWE_20 = 20;
    public static final int FIV_5 = 5;
    public static final int TWO_2 = 2;

    public static void main(String[] args) {
        int[] MONEY = {THO_5000, HUD_100, TWE_20, FIV_5, TWO_2};

        Scanner scan = new Scanner(System.in);
        int enter = scan.nextInt();

        for (int i = 0; i < MONEY.length; i++) {
            System.out.println(enter/MONEY[i] + "x " + MONEY[i]);
            enter %= MONEY[i];
        }
    }
}
