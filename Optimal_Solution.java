import java.util.*;
class PythTheorem {
  public static void main(String []ar){ 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to find valid pairs :");
        int n=in.nextInt();
        int count = 0,pairCount=1;
        System.out.println("All the Pairs in (x,y,z) Format : "); 
        for(int i=1 ; i<=n ; i++){
            for(int j=i+1 ; j<=n ; j++){
                int sum = ( i * i) + ( j * j);
                int z = (int) Math.sqrt(sum);
                if( z*z == sum && z<= n ){
                   System.out.println(pairCount+"."+" "+"("+i+","+j+","+z+")");
                   pairCount++; 
                   count+= 2;
                }
            }
        }
   }
}
