

import java.util.*;
import java.lang.*;

public class Main
{
    
    private static int getMaxSubArraySum(int arr[]){
        //int arr []= {-2, -3, 4, -1, -2, 1, 5, -3};
        int sum =0;
        int max  = Integer.MIN_VALUE;
        for(int i=0;i<arr.length ;i++){
            sum += arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum =0;
            }
            
        }
        return max;
    }
    
    private static void display(int[] arr){
        
    for(int i = 0; i < arr.length ; ++i)
        System.out.print(arr[i] + " ");
          
         System.out.println();
    }
    
	public static void main(String[] args) {
		int arr []= {-2, -3, 4, -1, -2, 1, 5, -3};
	    System.out.println("Max sub array sum : "+getMaxSubArraySum(arr));
		
        
	}
}
