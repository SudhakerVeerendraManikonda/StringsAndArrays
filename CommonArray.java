public class CommonArray{
	public int[] findCommon(int a[], int b[])
	{
		int i = a.length-1;
		int j = b.length-1;
		int c[] = new int[a.length];
        int k = 0;
		
		while(i>=0 && j>=0)
		{
			if(a[i]==b[j])
			{
				c[k] = a[i];
			    i--;
			    j--;
			    k++;
			}
			else if(a[i] > b[j])
				i--;
			else
				j--;
		}
		return c;
	}

	public static void main(String [] args)
	{
		CommonArray ca = new CommonArray();
		int a[] = {2, 5, 5, 5};
		int b[] = {2, 2, 3, 5, 5, 7};
		int c[] = new int [a.length];
		c = ca.findCommon(a,b);

		for(int i =0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}

	}
}