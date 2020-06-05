package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //To Do Later, include a to the first power
        int modulus = 9;
        for(int a = 0; a < modulus; a++ ) {
            if(a!=modulus-1) {
                tableRow(a, modulus, false);
            } else{
                tableRow(a,modulus,true);
            }
        }
    }

    public static void tableRow(int a, int modulus,boolean showIndexing){
        ArrayList<Integer> indexing = new ArrayList<>();
        int n=2;
        //int modulus = 3;
        System.out.print("       ");
        for(int i = 0;i<modulus;i++){
            double power = Math.pow(a,n);
            int remainder = (int) (power % modulus);
            System.out.print(remainder+", ");
            indexing.add(n);
            n++;
            //indexing.add(i);
            //System.out.println((Math.pow((double) a,(double) i)) % i );
        }
        System.out.println();
        if(showIndexing) {
            System.out.println("_______");
            System.out.print("a^(n): ");
            for (Integer i : indexing) {
                System.out.print(i + ", ");
            }
        }
    }

}
