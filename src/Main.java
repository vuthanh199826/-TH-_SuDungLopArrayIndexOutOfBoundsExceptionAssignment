import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayEx arrayEx = new ArrayEx();
        int[] arr = arrayEx.create();
        System.out.println("Nhap vao chi so bat ky");
        int index = sc.nextInt();
        sc.nextLine();
        try {
            System.out.println("Gia tri phan tu co chi so " + index + " la " +arr[index]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Out range");
        }
    }
}
