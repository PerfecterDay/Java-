package com.chinaums.baicy;

import java.io.*;

/**
 * Created by BaIcy on 2017/7/26.
 */
public class AlgorithmDemo {






    int[] arr = new int[1000];

    public static void main(String[] args){
        try {
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(new StringBufferInputStream("abc")));
        }catch (Exception e){

        }
        String string = "ABC";
        String string2 = string+"D";
        String s3 = string.toLowerCase();
        System.out.println(string);
        System.out.println(string2);


        AlgorithmDemo algorithmDemo = new AlgorithmDemo();
        int x = algorithmDemo.fun(5);
        algorithmDemo.fun();
        System.out.println(x);
        System.out.println(algorithmDemo.arr[4]);

        for(int i=0; i<10;++i){
            System.out.println((Integer)i);
        }

    }


    private int fun(int m) {
        if(1 == m){
            return 1;
        }
        if (2 == m){
            return 2;
        }

        return fun(m-1) + fun(m-2);

    }

    private void fun(){
        arr[0] = 1;
        arr[1] = 2;
        for (int i=2; i< arr.length; ++i){
            arr[i] = arr[i-1] + arr[i-2];
        }
    }
}
