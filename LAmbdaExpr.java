import java.util.*;
 
 
public class LAmbdaExpr {

	public static void main(String[] args) {
		 
		List<String> pointList = new ArrayList();
		pointList.add("1");
		pointList.add("2");
		 
		
		
		  for (String str : pointList)
		   { 
			  System.out.println(str);
		   
		   }
		 
		  
		 
		
		  pointList.forEach((p) -> { System.out.println(p); } );
		  
		  
		  
		 
		
	}
	
	
	
}
