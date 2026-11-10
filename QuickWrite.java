import java.io.FileWriter;
import java.io.PrintWriter;
class QuickWrite {
    public static void main(String[] args) throws Exception {      
        PrintWriter w = new PrintWriter(new FileWriter("simple.txt", true));
        w.println("HELLO");
        w.println("THIS IS JAVA LAB");
	System.out.println("writting done!!");
        w.close();
        
    }
}