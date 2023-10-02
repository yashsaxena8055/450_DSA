/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class Main
{
    
    private static int[] union(int arr[],int str[]){
        Set<Integer> set =  new HashSet();
        
        for(int i=0;i<arr.length ;i++){
            set.add(arr[i]);
        }
        
        for(int i=0;i<str.length ;i++){
            set.add(str[i]);
        }
        
        int resultArr[] = new int [set.size()];
        int i=0;
        Iterator iter = set.iterator();
            while (iter.hasNext()) {
        resultArr[i] =(int) iter.next();
        i++;
    }
        return resultArr;
    }
    
    private static int[] intersection(int arr[], int str[]){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i< arr.length ;i++){
            for(int j=0;j<str.length;j++){
                if(arr[i] == str[j]){
                    list.add(arr[i]);
                }
            }
        }
        int resultArr[] = new int[list.size()];
        for(int i=0;i<resultArr.length ;i++){
            resultArr[i]= list.get(i);
        }
        return resultArr;
    }
    
    private static void display(int[] arr){
        
    for(int i = 0; i < arr.length ; ++i)
        System.out.print(arr[i] + " ");
          
         System.out.println();
    }
    
	public static void main(String[] args) {
		int arr []= {1, 3, 4, 5, 7};
		int str []= {2, 3, 5, 6};
		int result[] =union(arr,str);
		display(result);
		result = intersection(arr,str);
		display(result);
		
        
	}
}
