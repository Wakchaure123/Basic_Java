package Array;

public class Array1 {
			
	
	public static void main(String[] args) {
		int a = 5 ;
		
		
		int [] arr1;  // declaration
		arr1 = new int[10] ;
		
		for(int i=0;i<arr1.length;i++) {
			
			arr1[i]=i+1;
			System.err.println("At index on "+i+" and value is assign is :- "+arr1[i]);
			System.out.println(arr1);
		}
		
		System.out.println(System.identityHashCode(arr1));
		
	}
}
