package com.google.hackerRank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     * 
     * Sample Input
     * STDIN           Function
     * -----           --------
     * 6               arr[] size n = 6
     * -4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]
     * 
     * Sample Output
     * 
     * 0.500000
     * 0.333333
     * 0.166667
     * 
     * 
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        double pos = 0;
        double neg = 0;
        double ntr = 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) < 0){
                neg++;
            }else if(arr.get(i) > 0){
                pos++;
            }else{
                ntr++;
            }
        }
        System.out.println(String.format("%.6f", pos/arr.size()));
        System.out.println(String.format("%.6f", neg/arr.size()));
        System.out.println(String.format("%.6f", ntr/arr.size()));
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

