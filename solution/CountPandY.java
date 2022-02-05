public class CountPandY {
	
	 public static void main(String[] args) {
		PYSolution solution = new PYSolution();
        String s = "pPoooyY";
        System.out.println(solution.solution(s));
    }
}

class PYSolution {
	    boolean solution(String s) {
	        boolean answer = true;
	        String[] spltStr = s.split("");
	        int pCnt = 0;
	        int yCnt = 0;
	        
	        for(String i : spltStr) {
	        	if(i.toLowerCase().contains("p")) {
	        		pCnt++;
	        	}
	        	if(i.toLowerCase().contains("y")) {
	        		yCnt++;
	        	}
	        }
	        
	        if(pCnt != yCnt) {
	        	answer = false;
	        }

	        return answer;
	    }
}
	