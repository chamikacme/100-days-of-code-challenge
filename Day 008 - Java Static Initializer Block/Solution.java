import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int B = scan.nextInt();
        int H = scan.nextInt();
        scan.close();
        
        if(B > 0 && H > 0){
            System.out.println(B*H);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}