package ArraysPrograms;

public class SortingInBothAscendingAndDscendingOrder {
public static void main(String[] args) {
	int[] a= {5,2,7,9,3};
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if (a[i]<a[j]) {
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("array sorted in Ascending Order");
	for (int j = 0; j < a.length; j++) {
		System.out.println(a[j]);
	}
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if (a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("array sorted in Dscending Order");
	for (int j = 0; j < a.length; j++) {
		System.out.println(a[j]);
	}
}
}
