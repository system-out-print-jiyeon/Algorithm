package kr.co.study.algorithm;

public class Plusminus {

		public static void main(String[] args) {
			int[] absolutes = {4,7,12};
			boolean[] signs = {true,false,true};
			
			PMSolution solution = new PMSolution();
			
			System.out.println(solution.solution(absolutes, signs));
		} 

}

class PMSolution{
	  public int solution(int[] absolutes, boolean[] signs) {
	        int answer = 0;
	        
	        for(int i = 0; i < absolutes.length; i++){
	        	answer += absolutes[i] * (signs[i] ? 1 : -1);
	        }
	        return answer;
	    }
}