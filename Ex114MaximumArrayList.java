package be.vdab;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex114MaximumArrayList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arraylist = new ArrayList<>();
        System.out.println("Geef een getal");
        int getal = scan.nextInt();
        while (getal != 0) {
            arraylist.add(getal);
            getal = scan.nextInt();
        }
        System.out.println("Het maximum is " + max(arraylist));
    }

    public static Integer max(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i<list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

}
