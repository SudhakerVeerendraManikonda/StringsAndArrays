import java.util.Scanner;

public class ReverseBinary {

    /* This function takes an integer number as 
    input and returns the reversed decimal equivalent

    @param number : integer
    */
	public  int reversedBinary(int number){
        String binary =reverseIntegerToBinary(number);
        int result = toDecimal(binary);
        return result;
    }
    
    /* This function takes an integer number as 
    input and returns a string form of the reversed integer

    @param number : integer
    */
    public  String reverseIntegerToBinary(int number) {
        int reverseNumber = number;
        StringBuilder builder = new StringBuilder();

        while (reverseNumber != 0) {
            int remainder = reverseNumber % 2;
            reverseNumber = reverseNumber / 2;
            builder.append(remainder);
        }
        return builder.toString();
    }

     /* This function takes a string parameter as 
    input and returns a integer.

    @param binary : String
    */
    public  int toDecimal(String binary) {
        char[] binaryString = binary.toCharArray();

        int decimalValue = 0;

        for (int i = 0; i < binaryString.length; i++) {
            int temp = decimalValue * 2
                    + Character.getNumericValue(binaryString[i]);
            decimalValue = temp;
        }
        return decimalValue;
    }

    public static void main(String [] args)
    {
    	ReverseBinary rvb = new ReverseBinary();

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(rvb.reversedBinary(number));
    }
}