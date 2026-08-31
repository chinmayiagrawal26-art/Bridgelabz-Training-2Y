import java.util.Scanner;
public class pangram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
        String str=sc.nextLine();
        boolean pangram=true;
        for(char ch='a';ch<='z';ch++){
            boolean found=false;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==ch){
                    found=true;
                    break;
                }
            }
            if(!found){
                pangram=false;
                break;
            }
        }    
        if(pangram){
            System.out.println("it is a pangram");
        }else{
            System.out.println("its not a pangram");
        }
    }
}