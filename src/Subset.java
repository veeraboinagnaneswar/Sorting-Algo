import java.util.Scanner;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[]arr1=new int[n];
		int[]arr2=new int[m];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;i<m;j++) {
				if(arr1[j]==arr2[i]) {
					System.out.println(true);
					break;
				}
				if(j==m) {
					System.out.println(false);
					break;
				}
			}
			
		}
	}

}
