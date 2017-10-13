public class Question2 {
    public static void main(String[] args) {
    	
    	Question2 q2 = new Question2();
    	StringRepeater sr = new StringRepeater();
    	
    	//Single Tests
    	q2.singleTest("hello", 1, sr);
    	q2.singleTest("hello", 100, sr);
    	q2.singleTest("hello", 1000, sr);
    	q2.singleTest("hello", 10000, sr);
    	    	
    	System.out.println();
    	
    	//Precise tests
    	q2.preciseTest("hello", 1, sr);
    	q2.preciseTest("hello", 100, sr);
    	q2.preciseTest("hello", 1000, sr);
    	q2.preciseTest("hello", 10000, sr);
    }
    
    private void singleTest(String s, int repeats, StringRepeater sr){
    	
    	long start;
    	long end;
    	
    	start = System.currentTimeMillis();
    	sr.repeatString("hello", repeats);
    	end = System.currentTimeMillis();
    	
    	double singleTime = ((double)end-(double)start)/(double)(1000);
    	
    	System.out.println("T(" + repeats + ") = " + singleTime + " seconds");
    }
    
    private void preciseTest(String s, int repeats, StringRepeater sr){
    	long start;
    	long end;
    	
    	start = System.currentTimeMillis();
    	for(int i = 0; i<100; i++){
    		sr.repeatString(s, repeats);
    	}
    	end = System.currentTimeMillis();
    	
    	double singleTime = ((double)end-(double)start)/(double)(100000);
    	
    	System.out.println("T(" + repeats + ") = " + singleTime + " seconds");
    }
}
