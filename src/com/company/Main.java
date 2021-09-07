package com.company;

public class Main {

    public static void main(String[] args) {

        int f = 10; //value type

        int[] a = {10, 2, 13, 51, 123}; // ref type

        int[] b = a;

        b[3] = 12;

        for(int i = 0; i < a.length; i++) {
            b[i]++;
            System.out.print(b[i]+ "\t");
        }
        System.out.println();

        for(int var : a){
            var++;
            System.out.print(var + "\t");
        }

        String[] str = {"dwan", "dwadwa", "kkkk", "dadwdte"};

        for(String var : str){
            var= var + "sssssss";
            System.out.print(var + "\t");
        }

        System.out.println();

        for(int i = 0; i< str.length; i++){
            str[i] = str[i] + "s1";
            System.out.print(str[i] + "\t");
        }


    }
}
