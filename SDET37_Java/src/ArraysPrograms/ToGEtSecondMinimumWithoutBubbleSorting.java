package ArraysPrograms;

public class ToGEtSecondMinimumWithoutBubbleSorting {
//public static void main(String[] args) {
//	int[] a= {5,8,2,6};
//	int fmin=a[0];	//8,5,2
//	int smin=a[0];	//8,5
//	for (int i = 0; i < a.length; i++) {
//		//i=0	i<4t	a[0]=5
//		//i=1	i<4t	a[1]=8
//		//i=2	i<4t	a[2]=2
//		//i=3	i<4t	a[3]=6
//		//i=4	i<4f terminate
//		
//		if (fmin>a[i])	//8>5t, 5>8f, 5>2t, 2>6f
//		{	
//			smin=fmin;	//smin=8,5
//			fmin=a[i];	//fmin=5,2
//		}
//		else if (smin>a[i])	//8>8f, 5>6f
//		{
//			smin=a[i];	//smin=
//		}
//	}
//	System.out.println("1st min = "+fmin+" 2nd min = "+smin);
//}
//}
	
public static void main(String[] args) {
	int[] a= {6,7,1,1};
	int fmin = a[0];
	int smin = a[0];
	for (int i = 0; i < a.length; i++) {
		if (fmin>=a[i]) {
			if (fmin!=a[i]) {
				smin = fmin;
			}
			fmin =a[i];
		}
		else if (fmin==smin || smin>=a[i]) {
			smin=a[i];
		}
	}
	System.out.println("1st min = "+fmin+" 2nd min = "+smin);
}
}	
