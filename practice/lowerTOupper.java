import java.util.Scanner;
public class lowerTOupper{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        String result= "";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                ch=(char)(ch-32);
            }
            result=result+ch;
        }
        System.out.println("uppercase string: " + result);
    }   
 }