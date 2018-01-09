package Solution;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    static String twoStrings(String s1, String s2){
        String result = "";
        String abc = "abcdefghijklmnopqrstuvwxyz";
        
        for(int i = 0; i<abc.length(); ++i) {
        		if(s1.indexOf(abc.charAt(i)) > -1 && (s2.indexOf(abc.charAt(i)) > -1)) {
        			result = "YES";
        			break;
        		}
        		else {
        			result = "NO";
        		}
        }
        
        
        
        
//        for(int i = 0; i<s1.length(); ++i){
//            for(int j = 0; j<s2.length();++j){
//                if(s1.charAt(i) == s2.charAt(j)){
//                    result = "YES";
//                    break;
//                }
//                else{
//                    result = "NO";
//                }
//            }
//        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}
