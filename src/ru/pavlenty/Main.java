package ru.pavlenty;

public class Main {

    public static void main(String[] args) {

        int j =0;
        for(int i=0;i < 10;i++,j++) {
            // прерывание итерации
            if(i == 3) continue;
            // выход из цикла
            if(i==6) break;
            System.out.println(i);
        }
        for(int i=10;i>0;i--) {

        }
        int[] a = {23,5,6,7};
        int b[] = {4,5,6,7};
        int[] d,c;
        c = new int[4];
        // foreach
        for (int v: b) System.out.print(v+" ");
        System.out.println(c[5]);



    }
}
