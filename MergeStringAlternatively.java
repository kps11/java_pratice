package java_pratice;

import java.util.Scanner;
import java.lang.*;
//https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
public class MergeStringAlternatively {

        public static void main(String[] args) {
            String s1 = "cf";
            String s2 = "eee";
            System.out.println(mergeString(s1,s2));
        }
        public static  String mergeString ( String a , String b){
            StringBuffer result = new StringBuffer();
            int l1 = a.length();
            int l2 = b.length();
            int i = 0;
            while ( i < l1 || i<l2) {
                if( i < l1){
                    result.append(a.charAt(i));
                }
                if( i < l2) {
                    result.append(b.charAt(i));
                }
                i++;
            }
            return result.toString();
        }
}






