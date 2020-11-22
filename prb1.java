package string;
import java.util.*;
class vowels
{
    public static void main(String args[])
    {
        Scanner fc = new Scanner (System.in);
        String s = fc.next();
        int vowels=0,consonants=0,digits=0,others=0;
        
        for(int i =0;i<s.length();i++)
        {
            char ch = s.charAt(i);    //here we can take the perticular index of character
        
            
            if((ch >= 'a' && ch<= 'z') ||
                    (ch >= 'A' && ch <= 'Z'))
            {
                
             ch = Character.toLowerCase(ch);;     //we convert uppercase letter into lower case
                        
             if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
               {
               vowels++;
               }
               else
               {
               consonants++;
               }
            }
            else if (ch>= '0' && ch<= '9') 
            {
                digits++;
            }
            else if(ch =='@' || ch =='!' || ch =='#' || ch =='"' || ch =='"' || ch ==' ')
            {
               others++;
            }
        } 
        System.out.println("vowels =" +vowels);
        System.out.println("consonants =" +consonants);
        System.out.println("digits =" +digits);
        System.out.println("others =" +others);
    }
}