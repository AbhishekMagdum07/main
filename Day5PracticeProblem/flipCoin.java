package Day5PracticeProblem;

public class flipCoin {
	 int heads=0;
	 int tails=0;
	 public static void main(String[] args) {
		 for(byte i=0;i<10;i++) {
			 double val = Math.random();
			 System.out.println((int)val*10);
			 
			 if(val > 0.5) {
				 System.out.println("Heads");
			 }else {
				 System.out.println("Tails");
			 }
		 }
	 }
}

	  
	  
	  

