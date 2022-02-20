import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        n = scanner.nextInt();
        int[] tab = new int[n];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100);
        }
        for (int element: tab
             ) {
            System.out.println(element);
        }

        System.out.println("dddddd        "+znajdzNajwiekszaLiczbe(tab));
    }

    private static int znajdzNajwiekszaLiczbe(int[] tab) {
        int najwiekszaLiczba = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] % 2 != 0) {
                if (tab[i - 1] % 2 == 0) {
                    najwiekszaLiczba = tab[i];
                } else {
                    if (tab[i] < tab[i - 1])
                        najwiekszaLiczba = tab[i];
                }
            }else {
                if (tab[i-1]%2 == 0){
                    if (tab[i] > tab[i-1]){
                        najwiekszaLiczba = tab[i];
                    }
                }
            }
        }
        return najwiekszaLiczba;
    }
}
