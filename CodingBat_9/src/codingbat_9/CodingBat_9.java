
package codingbat_9;

import java.util.Arrays;
import java.util.Random;


public class CodingBat_9 {

public static int [] nums(){
    Random rn = new Random();
    int []nums = new int[rn.nextInt(10)+1];
    
    for(int i=0;i<nums.length;i++){
        nums[i] = rn.nextInt(10)+1;
        
    }
     System.out.println(Arrays.toString(nums));
    return nums;
} 

public static boolean more14(int []nums){
 int num1 = 0,num4 = 0;
 
 for(int i=0;i<nums.length;i++){
     if(nums[i]==1){
         num1++;
     }
     if(nums[i]==4){
         num4++;
     }
 }
    if(num1>num4){
        return true;
        
    }else{
        
        return false;
    }
    
   
 
}

    public static void main(String[] args) {
        System.out.println("değer: "+more14(nums()));
    }
    
}
