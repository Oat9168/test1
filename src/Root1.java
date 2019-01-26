import java.util.Scanner;

public class Root1 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int a = 1;


        while(a<=3){
            y++;
            if(a%2 == 0){
                int b = 1;
                while(b<=3){
                    x--;
                    System.out.println("("+x+","+y+")");
                    b++;
                }
                x--;
            }
            else{
                int c = 1;
                while(c<=3){
                    x++;
                    System.out.println("("+x+","+y+")");
                    c++;

                }
                x++;
            }

            a++;



        }

    }


}
