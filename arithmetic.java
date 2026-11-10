import java.util.Scanner;
class Calculator {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = s.nextInt();
        System.out.print("Enter second number: ");
        int n2 = s.nextInt();
	while(true){
        	System.out.println("Select operation:");
        	System.out.println("1. Add (+)");
        	System.out.println("2. Subtract (-)");
        	System.out.println("3. Multiply (*)");
        	System.out.println("4. Divide (/)");
		System.out.println("5. Modules (%)");
		System.out.println("6. Exit");
        	System.out.print("Enter choice (1-6): ");
        	int choice = s.nextInt();
        	switch (choice) {
            	case 1:
                	System.out.println("Result: " + (n1 + n2));
                	break;
            	case 2:
                	System.out.println("Result: " + (n1 - n2));
                	break;
            	case 3:
                	System.out.println("Result: " + (n1 * n2));
                	break;
            	case 4:
			System.out.println("Result:"+ (n1/n2));
                	break;
	    	case 5:
			System.out.print("Result:"+(n1%n2));
			break;
	    	case 6:
			System.exit(0);
        	}
	}
        
    }
}
