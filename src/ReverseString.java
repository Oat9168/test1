import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String str = sc.next();

        System.out.print("Output : ");
        for(int i = str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
