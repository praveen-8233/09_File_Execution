package com.example.pairsOfElementsInArray;

public class PairsOfElementsInArray {
    public static void main(String[] args)
    {
        int num = 7;
        int[] array1 = {1,8,6,7,12,6,7};
        findThePairs(array1,num);

            }
    static void findThePairs(int array1[], int inputNumber)
    {
        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = i+1; j < array1.length; j++)
            {
                if(array1[i]+array1[j] == inputNumber)
                {
                    System.out.println(array1[i]+" + "+array1[j]+" = "+inputNumber);
                }
            }
        }
    }


}
