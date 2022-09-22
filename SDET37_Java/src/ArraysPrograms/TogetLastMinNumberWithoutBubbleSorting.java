package ArraysPrograms;

public class TogetLastMinNumberWithoutBubbleSorting {
public static void main(String[] args) {
	int[] a= {5,2,6,8};
	int lmin=0;
	for (int i = 0; i < a.length; i++) {
		
		if (lmin<a[i]) {
			lmin=a[i];
		}
	}
	System.out.println("The last min mun is " +lmin);
}
}
