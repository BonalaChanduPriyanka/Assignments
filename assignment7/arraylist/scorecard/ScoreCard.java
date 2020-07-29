package scorecard;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ScoreCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> cricket=new HashMap<>();
		System.out.println("Enter runs scored");
		int[] array=new int[5];
		Scanner sc =new Scanner(System.in);
		for(int i=0;i < array.length;i++) {
			     array[i]=sc.nextInt();
		}		
		cricket.put("Rahane" ,array[0]);
		cricket.put("Rahul" ,array[1]);
		cricket.put("Kohli" ,array[2]);
		cricket.put("Dhoni" ,array[3]);
		cricket.put("Lokesh",array[4]);
		
		
		  Set<String> keys = cricket.keySet();
	      for(String key : keys) {
	         System.out.println(key); 
	      }
	      
	      int maximimScore = 0, sum = 0;
	      int maxValue=(Collections.max(cricket.values()));
	      for (Map.Entry<String, Integer> map  : cricket.entrySet()) {
	    	  System.out.print(map.getKey() + ":"+map.getValue()+"\n");
				
	      if (maximimScore < map.getValue()) {
				maximimScore = map.getValue();
			}
			sum = sum + map.getValue();
			 
			
		}
		System.out.println("\nThe total Score is: "+sum); 
		
        for (Entry<String, Integer> entry : cricket.entrySet()) {  
            if (entry.getValue()==maxValue) {
               System.out.println("Name of the highest scorer :"+entry.getKey());     
            }
        }
        System.out.println("Runs scored by Dhoni:"+array[3]);
        
	}
}

