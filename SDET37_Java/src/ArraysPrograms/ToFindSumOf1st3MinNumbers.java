package ArraysPrograms;

public class ToFindSumOf1st3MinNumbers {
public static void main(String[] args) {
	int[] a= {8,6,9,2,1,7};
	int sum=0;
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if (a[i]<a[j]) {
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("Array sorted in ascending order");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	//sum=a[0]+a[1]+a[2];
	for (int i = 0; i < 3; i++) {
		sum=sum+a[i];
	}
	System.out.println("Sum of 1st 3 minmum number in array ="+sum);
}
}
