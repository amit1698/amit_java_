import java.util.*;
class Anagram

{
public static void main(String args[])

{
String s = args[0];
String s1 = args[1];

if(s.length()!=s1.length())
{
	System.out.println("given string are not  anagram");

}

char [] a = s.toCharArray();
char [] b = s1.toCharArray();

Arrays.sort(a);
Arrays.sort(b);

boolean flag = Arrays.equals(a,b);
if(flag)
{
 System.out.println("anagrams");
}
else
{
 System.out.println("not anagrams");
}

}
}

//amit is java developer
