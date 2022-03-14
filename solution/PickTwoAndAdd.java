import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class PickTwoAndAdd {

		public static void main(String[] args) {
			int[] numbers = {5,0,2,7};
			
			Solution solution = new Solution();
			
			System.out.println(solution.solution(numbers));
		} 

}

class Solution{
	  public List<Integer> solution(int[] numbers) {
	      int[] numbers2 = numbers.clone();
	      int sum = 0;
	      HashSet<Integer> set = new HashSet<Integer>();
	      for(int i =0; i<numbers.length; i++) {
	    	  for(int j = 1; j < numbers2.length; j++) {
	    		  if(i != j) {
	    			  sum = numbers[i] + numbers[j];
	    			  set.add(sum);
	    		  }
	    	  }
	      }
	      List<Integer> list = new ArrayList<Integer>(set);
	      Collections.sort(list);
	      
		  return list;
	    }
}