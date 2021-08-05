
import java.util.Arrays;
import java.util.List;

public class ReduceMethodDemo {

	public static void main(String[] args) {
		
		
		  List<Integer> list = Arrays.asList(12,20,35,48,55,66,75);
		
		  
		/*
		 * int result=0; for(int i : list) { if(i%5==0) { result += i; }
		 * 
		 * } System.out.println(result);
		 * 
		 * 
		 */
		 
		 
		
		//  System.out.println(list.stream().filter(s -> s%5==0).reduce(0,(x,y) -> x+y));
		  
		  
		  
		  
		  
		
	 System.out.println(list.stream().filter(s -> s%5==0).reduce(0,(x, y) -> x + y,(x,y) -> x+y));
		  
		 	 
		 
 
	}

}
