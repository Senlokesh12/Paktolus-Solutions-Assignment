import java.util.*;
class PythTherom {
   public static void main(String []ar){ 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to find valid pairs :");
        int n=in.nextInt();
        int count =0, pairCount=1;
         System.out.println("All the Pairs in (x,y,z) Format : ");
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                for(int k=j+1;k<=n;k++){
                    if((i*i + j*j)==k*k){
                         System.out.println(pairCount+"."+" "+"("+i+","+j+","+k+")");
                         pairCount++;
                          count+=2;
                    }
                }
            }
        }
    }
}
