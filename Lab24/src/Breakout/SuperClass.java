package Breakout;

public class SuperClass {

	public static void main(String[] args) {
		 
		selectTheRightMethod(new SubclassA());
		selectTheRightMethod(new SubclassB());

	}
	
	//Do not change the parameter type, it should remain as SuperClass
	public static void selectTheRightMethod (SuperClass obj) {
		
		//TO DO:
		//I.     Use the 'instanceOf' operator to decide what subclass object is
		//	     'obj' referencing
		//II.	Then use downcasting before calling:
		//	1. method X if it references an object subclassA
		//	2. method Y if it references an object subclassB
		if(obj instanceof SubclassA) {
		((SubclassA) obj).X ();
		}
		else if (obj instanceof SubclassB) {
			((SubclassB) obj).Y ();
		}

	}
}

class SubclassA extends SuperClass {
	public void X() {
		System.out.println("Method X in subclassA executed!");
	}
}


class SubclassB extends SuperClass {
	public void Y() {
		System.out.println("Method Y in subclassB executed!");
	}
}