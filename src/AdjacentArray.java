
public class AdjacentArray {
	
	public static void main(String[] args) {
		//max difference between any adjacent index in array
		
		int[] a = {2,4,8,15,90};  //3,4,7,2
		System.out.println(a.length);
		int diff =0;
		for(int i =0;i<a.length-1;i++)
		{
			if(a[i+1] -a[i]>diff)
			{
				diff=a[i+1] - a[i];
				
			}
		
		System.out.println(diff);
		//System.out.println(a[0]);
		//System.out.println(a.length);
		
	}

}
}






