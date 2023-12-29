package codingPart2;

public class myCode {
	
	final static int ARRAY_SIZE = 15;
	public static void main(String[] args) {
		 
		int [] myArray = new int [ARRAY_SIZE];
        
		System.out.print("Content of the array: ");	
		populateArr(myArray, 10, 20);
		
     
		displayArr(myArray, 0, 14);
        
		System.out.print("\nNumber of even integers: " + countEvens(myArray));
			
  }

  static void populateArr(int pArr [], int lowValue, int highValue) {
	  

	  for (int i = 0; i < pArr.length; i++) {
		  pArr[i] = (int) (Math.random() * (highValue - lowValue + 1)) + lowValue;
	  }
	  
  }
  static void displayArr(int pArr[], int lowIndex, int highIndex) {

	 for (int i = lowIndex; i < highIndex + 1; i++) {
		 System.out.print(pArr[i] + " "); 
	 }
  }

  static int countEvens(int pArr[]) {
	  int counterEven = 0;
	  for(int i = 0; i < pArr.length; i++) {
		  if (pArr[i] % 2 == 0) {
			  counterEven++;
		  }
	  }
	  
        return counterEven; 
  }   

}
	


