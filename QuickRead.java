import java.io.File;
import java.util.Scanner;
class QuickRead {
    public static void main(String[] args) throws Exception {
        Scanner r = new Scanner(new File("simple.txt"));
        while (r.hasNextLine()) {
            System.out.println(r.nextLine());
        }
        r.close();
    }
}
