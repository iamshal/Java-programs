
public class SumOfElements {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		System.out.println(a.length);
		int sum = sumArray(a);
		System.out.println(sum);
		int result= multiply(5,10);
		System.out.println(result);
	}

	private static int multiply(int i, int j) {
		// TODO Auto-generated method stub
		int k =1;
		int sum=0;
		while(k<=j)
		{
			sum = sum + i;
			k++;
		}
		return sum;
	}

	private static int sumArray(int[] a) {
		// TODO Auto-generated method stub
		int sum =0;
		//extract every value of array and sum each value with other
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			sum = sum+ a[i];
		}
		
		return sum;
	}

}
