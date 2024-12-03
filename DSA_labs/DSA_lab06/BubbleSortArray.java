/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EURO COMPUTERS
 */
public class BubbleSortArray {
   

            
    int nums[]={5,1,3,4,6,2};   
    public static void  bubbleSort(int[]nums){
    for(int i=0; i<nums.length-1; i++ ){
    for(int j=0; j<nums.length-1; j++){
   if(nums[j]>nums[j+1]){
   int temp= nums[j];
   nums[j]=nums[j+1];
   nums[j+1]=temp;
   }
   
    }
    }
    }
 public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
 public static void main (String[]args){
       int[] nums = {5, 1, 3, 4, 6, 2};
        bubbleSort(nums);
        printArray(nums);
    }

}       




      
      
  
   
    
  

    