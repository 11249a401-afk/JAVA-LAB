import java.util.scanner;
class ascending{
	public static void main(string[] args){
		int n,temp;
		scanner s=new Scanner(system.in);
		system.out.println("enter no.of elements");
		n=s.nextint();
		int a[]=new.int[n];
		system.out.println("enter all elements");
		for (int i=0;i<n;i++){
			a[i]=s.nextint();}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		system.out.println("ascending order");
			for(int i=0;i<n-1;i++){
				system.out.print(a[i]+",");
			}
		}

		