import java.util.Scanner;

class wordcounter
{
    public static void main(String args[])
    {
        System.out.println("Enter the String");
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        int count = 1;
    
        for(int i = 0;i<s.length()-1;i++)
        {
          if((s.charAt(i)  == ' ') && (s.charAt(i+1) != ' '))
          {
            count++;
          }
        }
        System.out.println("Number of words in a string:"+ count);  
    }
}