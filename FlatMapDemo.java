
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {

		
		
		/*
		 * String[][] data = new String[][] { {"a", "b"}, {"c", "d"}, {"e", "f"} };
		 * 
		 * Stream<String[]> temp = Arrays.stream(data);
		 * 
		 * Stream<String> streamString = temp.flatMap(x -> Arrays.stream(x));
		 * 
		 * streamString.filter(x
		 * ->"b".equals(x.toString())).forEach(System.out::println);
		 */
		 
		  
		 
		
		
		  List<Integer> list1 = Arrays.asList(1,2,3);
		  
		  List<Integer> list2 = Arrays.asList(4,5,6);
		  
		  List<Integer> list3 =Arrays.asList(7,8,9);
		 
		  
		
		/*
		 * ArrayList al=new ArrayList();
		 * 
		 * al.addAll(list1); al.addAll(list2); al.addAll(list3);
		 * 
		 * System.out.println(al);
		 */
		 
		  
		  
		  
		
		  List  ll=Stream.of(list1,list2,list3).flatMap(x1->x1.stream()).collect(Collectors.toList());
		  
		  System.out.println(ll);
		 
		 
 		 
 
	}

}
