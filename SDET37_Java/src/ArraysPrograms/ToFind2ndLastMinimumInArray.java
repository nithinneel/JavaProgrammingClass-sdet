package ArraysPrograms;

public class ToFind2ndLastMinimumInArray {
	public static void main(String[] args) {
		int[] a= {6,0,2,8,1};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}

		System.out.println("the last min number is "+a[a.length-2]);
}
}
