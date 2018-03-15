import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            outer:{
            long n = in.nextLong();
            long k=0,p=0;
            for(long i=(long)n/2;i>=2;i--){
                k=0;
             //   System.out.println(i);
                if(n%i==0){
                  for(long j=2;j<=(long)Math.sqrt(i);j++){
                     if(i%j==0){
                         k++;
                         break;
                     }
                  }
                      p++;
                  
                
            if(k==0&&p!=0){
                System.out.println(i);
                break outer;
            }
                
                }}
                     if(p==0 ){
                        System.out.println(n);
                         break outer;
                    }
                
                
    
            }
}
    }
}
