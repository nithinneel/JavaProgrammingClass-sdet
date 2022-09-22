package ArraysPrograms;

public class ToGet1stMinNumberWithoutBubbleSort {
public static void main(String[] args) {
	int[] a= {8,5,6,1,3};
	int fmin =a[0];		//fmin=8,5,1
	for (int i = 0; i < a.length; i++) {
		//i=0	0<5t	a[0]=8
		//i=1	1<5t	a[1]=5
		//i=2	2<5t	a[2]=6
		//i=3	3<5t	a[3]=1
		//i=4	4<5t	a[4]=3
		//i=5	5<5f	
		
		if (fmin>a[i]) 	//8>8f, 8>5t, 5>6f, 5>1t, 1>3f
		{
			fmin=a[i];	//fmin=5,1
		}
	}
	System.out.println("The 1st min no is= "+fmin);
}
	
}
