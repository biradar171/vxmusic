
import java.util.*;

class GFG {
	public static  void main(String args[]) {
		int[] a = {0,10};
		int n= 10 ; 
		int count =1;
        Arrays.sort(a);
		// for(int i=0;i<a.length;i++) {
		// 	System.out.println(a[i]);


		// }
//		System.out.println(a);
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				continue;
			}
			else if(a[i]==n){
				System.out.print(count);
				return;
			}
			if(a[i]<n && n<a[i+1]) {
				count++;
				System.out.print(count);
				return;
			}
			count++;
		}
		System.out.print(count);
		return;
		
	}
}