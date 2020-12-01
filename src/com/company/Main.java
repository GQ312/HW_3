package com.company;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        double array[] = {11.6, 22.7, 33.3, -4.9, 3.4, -4.7, 5.9, 6.7, -7.5, 77.7, -7.4, 5.6, -8.7, 9.6, 1.3 };
        for (double value : array) {
            num++;
            if (value >= 0) continue;
            int del = 0;
            double sum = 0;
            for (int i = num; i < array.length; i++) {
                if (array[i] > 0) {
                    del++;
                    sum = sum + array[i];
                }
            }
            System.out.println(sum/del);
            break;
        }
//        int position = 0;
//        double minValue = array[0];
//        for(int i=1;i < array.length;i++){
//            if(array[i] < minValue){
//                minValue = array[i];
//                array[i - 2] = minValue;
//                System.out.println(array);
//                break;
//            }
////        }   array[ - 1] = minValue;
    }
}