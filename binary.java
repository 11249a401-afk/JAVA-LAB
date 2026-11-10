import java.util.Scanner; 
class Binary { 
    public static void main(String[] args) { 
        int i, mid, first, last, n, x, flag = 0; 
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter no. of elements:"); 
        n = s.nextInt(); 
        int a[] = new int[n]; 
        System.out.println("Enter elements of array:"); 
        for(i = 0; i < n; i++) { 
            a[i] = s.nextInt(); 
        } 
        System.out.println("Enter element to search:"); 
        x = s.nextInt(); 
        first = 0; 
        last = n - 1; 
        while(first <= last) { 
            mid = (first + last) / 2; 
            if(a[mid] > x) { 
                last = mid - 1; 
            } 
            else if (a[mid] < x) { 
                first = mid + 1; 
            } 
            else { 
                flag = 1; 
                System.out.println("Element found"); 
                break; 
            } 
        } 
        if(flag == 0) { 
            System.out.println("Element not found"); 
        } 
    } 
}
