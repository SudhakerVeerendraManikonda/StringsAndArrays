public class StringCompress{
	public void compress(String str)
	{
        char [] compressChar = str.toCharArray();
        char [] compressed = new char[];
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
        	char first = compressChar[i];
        	for(int j = 0 ;j < str.length(); j++)
        	if(compressChar[j] == first)
        	{
        		count++;
        	}
        	compressed[i] = compressChar[j];
        	compressed[i+1] = count;
        	i = i+2;
        }

    }
}