package string;
import java.util.*;
class Prb6

{

        public static void main(String args[])

        {

            Scanner sc=new Scanner(System.in);

            System.out.print("Enter String: ");

            

            String s=sc.nextLine();

            char arr[]=s.toCharArray();

            

            int count=0;

            int y=s.indexOf(arr[0],1);

            

            if(3*y==arr.length)

            {

                for(int i=0;i<2*y;i++)

                {

                    if(arr[i]==arr[i+y])

                        count++;

                }

            }

            if(count==(2*y))

                System.out.println("true");

            else

                System.out.println("false");

        }

}






