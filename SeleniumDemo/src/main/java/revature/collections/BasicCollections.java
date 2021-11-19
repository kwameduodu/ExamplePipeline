package revature.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BasicCollections {

	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<>();
		Set<String> stringSet = new HashSet<>();
		Queue<String> stringQueue = new LinkedBlockingQueue<>();
		
		
		/* retains the order in which the elements are added
		 * also support duplicate
		 * allow us to access elements by their index
		 */
		
		stringList.add("element 1");
		stringList.add("element 2");
		stringList.add("element 3");
		stringList.add("element 1");
		
		System.out.println(stringList);
		System.out.println("========================================");
		
		/*Does not  retain the order in the elements
		 * Does not support duplicate
		 * Does not allow access to element by their index
		 */
		stringSet.add("element 1");
		stringSet.add("element 2");
		stringSet.add("element 3");
		stringSet.add("element 1");
		
		System.out.println(stringSet);
		System.out.println("========================================");
		//enhance loop
		for(String s : stringSet) {
			System.out.println(s);
		}
		System.out.println("========================================");
		
		Iterator<String> it = stringSet.iterator();
	   while (it.hasNext()){
		   System.out.println(it.next());
		}
		
		System.out.println("========================================");
		
		/* it follows a First in First out policy FiFO
		 * Support duplicates
		 */
		stringQueue.offer("elemenet 1");
		stringQueue.offer("element 2");
		stringQueue.offer("element 3");
		stringQueue.offer("elemenet 1");
		
		stringQueue.poll();
		
		System.out.println(stringQueue);
		
		//Collections is a utility class with  static helper methods
		
		Collections.reverse(stringList);
		
		System.out.println(stringList);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
