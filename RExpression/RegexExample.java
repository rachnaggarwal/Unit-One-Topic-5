package RExpression;

import java.util.regex.*;  
public class RegexExample{  
public static void main(String args[]){  
System.out.println(Pattern.matches("[am]", "abcd"));//false (not a or m or n)  
System.out.println(Pattern.matches("[am]", "a"));//true (among a or m or n)  
System.out.println(Pattern.matches("[am]", "ammmna"));//false (m and a comes more than once)  
}
}  
