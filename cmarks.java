import java.util.Scanner;

class marks {
    public static void main(String args[]) {
        int marks[] = new int[6];
        int i;
        String name[] = new String[6];
        
        Scanner s = new Scanner(System.in);
        
        for (i = 0; i < 6; i++) {
            System.out.println("enter details of " + (i + 1));
            System.out.print("Name: ");
            name[i] = s.next();
            
            System.out.print("Mark: ");
            marks[i] = s.nextInt();
        }
        
        System.out.println("\n--- Students with Marks >= 60 ---");
        for (i = 0; i < 6; i++) {
            if (marks[i] >= 60) {
                System.out.println(name[i] + "  " + marks[i]);
            }
        }
        
        s.close();
    }
}
