/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EURO COMPUTERS
 */

 import java.util.Arrays;
public class Array_Elements_Length {
    public static void stringSort(String[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j].compareTo(arr[j+1])>0) {
                    String temp=arr[j];
                    arr[j]=arr[j + 1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] arr={"apple", "pie", "banana", "cat"};
        System.out.println("Original Array: "+ Arrays.toString(arr));
        stringSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
    
    
    
    
    
    
    
    
    
    
    
}
