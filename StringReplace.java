public class StringReplace
{
	public String replace(String str)
	{
		char [] charArray = str.toCharArray();

		for(int i=0; i< str.length(); i++)
		{
			if(charArray[i] == ' ')
			{
				charArray[i] = '*';
			}
		}
		return new String(charArray).replace("*","%20");
	}

	public static void main(String [] args)
	{
		StringReplace sr = new StringReplace();
		System.out.println(sr.replace("A   B D"));
	}
}