public class SingleString
{
	public static boolean checkUnique(String str)
	{

		if(str.length() > 256)
			return false;

		boolean setCh[]= new boolean[256];
		for(int i = 0; i< str.length(); i++)
		{
	        int val = str.charAt(i);
		    if(setCh[val])
			   return false;
		    setCh[val] = true;
		}
		return true;
	}

	public static void main(String [] args)
	{
		String s = "ABS";
		System.out.println(checkUnique(s));
	}
}