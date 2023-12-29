package Breakout;

public class ThrowingCheckedException {
    public static void main(String[] args) {
         try {   
        	 method1();
         } 
         
         //Will handle a ‘checked’ exception
         catch (Exception e) {   
        	 System.out.println("OK, handled!"); 
        	 }  
    }
    
    public static void method1() throws Exception {  
    	method2(); 
    	} 
    //calls method2
    //Note that method2 throws a 'checked' exception
    //TO DO: Add ‘throw declaration’
    
    public static void method2() throws Exception {    
    	throw new Exception(); 
    	}
}