package ArraysPrograms;

public class AddTwoArrays {
	public static void main(String[] args) {
		int[] a= {2,3,1,4,2};
		int[] b= {1,2,3,1};      //o/p: 35452
		int length=a.length;	//5

		if (a.length<b.length) 	//5<4f
		{
			length=b.length;
		}
		for (int i = 0; i < length; i++) {
				//i=0	i<5t	a[0]=2
				//i=1	i<5t	a[1]=3
				//i=2	i<5t	a[2]=1
				//i=3	i<5t	a[3]=4
				//i=4	i<5t	a[4]=2
		
			try {
				System.out.println(a[i]+b[i]);
				//					2	+	1	=3			
				//					3	+	2	=5
				//					1	+	3	=4
				//					4	+	1	=5
				//					2	+ catch	=2
				
			} catch (Exception e) {
				if (a.length<b.length) {
					System.out.println(b[i]);
				}
				else {
					System.out.println(a[i]);	//2
				}
			}
		}
	}
}	

