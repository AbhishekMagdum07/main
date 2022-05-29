package Day5PracticeProblem;

public class largestAmongThreeNum {

	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 20;
	        byte c = 30;
		
		if(a > b && a > c){
			System.out.println("a is greater");
			
		}else if(b > a && b > c){
			System.out.println("b is greater");
			
		}else
			System.out.println("c is greater");
	}
}

