package ires.corso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int a[]= new int[3];
	    int j;
            for(int i=0; i<3; i++) {
                j = i+1;
                System.out.println("Inserisci il " + j + "° numero:");
                a[i] = in.nextInt();
            }

        if (a[0] > a[1]) {
                if (a[0]>a[2]) {
                    System.out.println("Il n° più grande è: " + a[0]);
                }
                else {
                    System.out.println("Il n° più grande è: " + a[2]);
                }
        }
        else {
            if (a[1]> a[2]){
                System.out.println("Il n° più grande è: " + a[1]);
            }
            else{
                System.out.println("Il n° più grande è: " + a[2]);
        }

    }
}
}
