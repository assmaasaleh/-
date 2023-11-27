import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int num[]={10,20,30,40,70};
        print(num);
        input(num);
        print(num);

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void input(int arr[] ) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();


        }
    }




}
