import java.util.Scanner;
class EvenOddSwitch {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        switch (num%2) {
            case 0:
                System.out.println(num + " is an Even number.");
                break;       
            case 1:
                System.out.println(num + " is an Odd number.");
                break;
        }        
        s.close();
    }
}
 