package SHA1;// Java program to calculate SHA-1 hash value

import java.security.NoSuchAlgorithmException;
import java.util.*;

public class SHA1_Algorithm extends SHA1_beg
{
     public static void main(String[] args) throws NoSuchAlgorithmException
     {
         Scanner sc = new Scanner(System.in);
         String s1;
         System.out.println("Enter a string without any whitespaces");
         s1 = sc.next();

         System.out.println("\n HashCode Generated by SHA-1 for: ");
         System.out.println("\n" + s1 + " : " + SHA1_beg.encryptThisString(s1));
    }
}