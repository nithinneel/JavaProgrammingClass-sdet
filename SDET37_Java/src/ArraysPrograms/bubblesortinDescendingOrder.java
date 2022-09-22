package ArraysPrograms;

public class bubblesortinDescendingOrder {
public static void main(String[] args) {
	int[] a= {2,6,1,8,0};
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if (a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	
	System.out.println("the elements of array after the sorting");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
}
}
}