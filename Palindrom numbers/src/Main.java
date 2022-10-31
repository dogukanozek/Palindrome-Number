
public class Main {

	public static void main(String[] args) {
		
	  System.out.println(isPalindrome(100));
	}
    public static boolean isPalindrome(int x) {
    	boolean a=true;
    	int reverse=0,y=0,b=0;
    	y=x;
    
 
        for(;x != 0; x  /= 10) {
            b = x % 10;
            reverse = reverse * 10 + b;
        }
       
      
    	if(y==reverse) {
    		a=true;
    		System.out.println("This is palindrome number");
    		
    	}
    	else {
    		a=false;
    		System.out.println("This is not palindrome number");
    	}
    	if(y<0){
            a=false;
            System.out.println("This is  not palindrome number");
        }
    	return a;
    	
        
    }

}
