
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        //3 apple, 2 banana, others 1
        List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
		
		
		
		  List<Object> uniqueNames = items.stream().collect(Collectors.toList());
		  System.out.println(uniqueNames);
		  
		  
		  
		  
		  Set<Object> uniqueNames1 = items.stream().collect(Collectors.toSet());
		  System.out.println(uniqueNames1);
		 
        
		  	System.out.println(items.stream().count());
		  
		  System.out.println(items.stream().sorted().collect(Collectors.toList()));
		 
		 
        
    }
}