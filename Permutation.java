import java.util.*;

public class Permutation
{
	public String sort(String s)
	{
		char [] a = s.toCharArray();
	    Arrays.sort(a);
		return new String(a);
	}

	public boolean stringEqual(String s, String t)
	{
		if(s.length() != t.length())
			return false;
		return sort(s).equals(sort(t));
	}

	public static void main(String [] args)
	{
		String s = "bacd";
		String t = "ertysefkjsd";

		Permutation p = new Permutation();
		System.out.println(p.stringEqual(s,t));
	}
}