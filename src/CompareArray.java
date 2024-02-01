import java.util.ArrayList;

public class CompareArray {
	public static void main(String[] args) {
		int a[] = {1,4,5,7};
		int b[] = {6,4,3,7};
	//	int[] ab = new int[4];
		ArrayList<Integer>al =new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				al.add(a[i]);
				
			}
		}
		Object[] c =al.toArray();
		//System.out.println(c);
		for(Object ob : c)
		{
		System.out.println(ob);
	}

}
}





