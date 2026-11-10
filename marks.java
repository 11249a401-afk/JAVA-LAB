import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("How many students do you want to enter? ");
        int totalStudents = scanner.nextInt();
        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("\nEnter name for student " + i + ": ");
            String name = scanner.next();            
            System.out.print("Enter marks for " + name + ": ");
            int mark = scanner.nextInt();
	}   
        for(int   if (mark > 60) {
                System.out.println(">>> " + name + " scored above 60 (" + mark + ")");
            }
        
        scanner.close();
    }
}
