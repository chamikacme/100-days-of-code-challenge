import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s = Integer.toString(n);
        if(n == Integer.parseInt(s)){
            System.out.println("Good job");
        }else{
            System.out.println("Wrong answer.");
        }
    }
}