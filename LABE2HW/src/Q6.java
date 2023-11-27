import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int num[]={10,20,30,70};

        input(num);

    }
    public static void input(int arr[] ) {
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();

        }

    }
}
