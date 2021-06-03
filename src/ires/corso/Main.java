package ires.corso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int[] a = new int[3];
	    int j;
	    int maggiore;
            for(int i=0; i<3; i++) {
                j = i+1;
                System.out.println("Inserisci il " + j + "° numero:");
                a[i] = in.nextInt();
            }

        if (a[0] > a[1]) {
                if (a[0]>a[2]) {
                    maggiore = a[0];
                    System.out.println("Il n° maggiore inserito è il primo e vale: " + maggiore);
                }
                else {
                    maggiore = a[2];
                    System.out.println("Il n° maggiore inserito è il terzo e vale: " + maggiore);
                }
        }
        else {
            if (a[1]> a[2]){
                maggiore=a[1];
                System.out.println("Il n° maggiore inserito è il secondo e vale: " + maggiore);
            }
            else{
                maggiore=a[2];
                System.out.println("Il n° maggiore inserito è il terzo e vale: " + maggiore);
        }

    }
}
}
