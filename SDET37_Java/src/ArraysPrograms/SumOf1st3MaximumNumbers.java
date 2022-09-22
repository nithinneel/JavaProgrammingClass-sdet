package ArraysPrograms;

public class SumOf1st3MaximumNumbers {
public static void main(String[] args) {
	int[] a= {5,3,7,9,2,1};
	int sum = 0;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if (a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("Array after sorted in Dscending Order");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	
	for (int i = 0; i < 3; i++) {
		sum=sum+a[i];
	}
	System.out.println("The Sum of 1st 3 Mamimum Numbers is "+sum);
}
}
