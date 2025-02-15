public class Main {
    public static void main(String[] args) {

        //Compression algorithm
        String input = "aaabb";
        System.out.println("Initial string input: ");
        System.out.println(input);
        String output= "";
        for(int i=0;i<input.length();i++) {

            //saving a character from input
            char c=input.charAt(i);
            int count=1;

            //increasing count value while encountering same character
            while(i+1<input.length() && c==input.charAt(i+1))
            {
                count++;
                i++; //skipping repeating characters in for loop
            }

            //saving compressed characters
            output+=c;
            output+=count;
        }
        System.out.println("Compressed output: ");
        System.out.println(output);


        //Decompression algorithm
        String output2="";

        for(int i=0;i<output.length();i+=2){ //adding 2 to i in order to skip numbers

            //saving character from input
            char c=output.charAt(i);
            //getting character count from next char in string
            int count=output.charAt(i+1) - '0'; //char to int
            for(int j=0;j<count;j++){
                //decompression
                output2+=c;
            }
        }
        System.out.println("Decompressing again: ");
        System.out.println(output2);
    }
}