package string;
class Prb3
{
        public static void main(String[] args)
        {
            String s="abccddde";
           
            char arr[]=s.toCharArray();
            int x=arr.length, count;
            
            for(int i=0;i<x-1;i++)
            {
                count=0;
                for(int j=0;j<x;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                        if(count>1)
                        {
                            arr[j]=1;
                            break;
                        }
                    }
                }
            }
            for(int i=0;i<x;i++)
            {
                if(arr[i]!=1)
                {
                    System.out.print(arr[i]);
                }
            }
           // System.out.println();
        }
}


