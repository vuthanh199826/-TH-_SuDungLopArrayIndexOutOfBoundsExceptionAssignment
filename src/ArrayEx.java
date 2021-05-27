import java.util.Random;

public class ArrayEx {
    public int[] create(){
        Random rd = new Random();
        int [] arr =new int[100];
        System.out.println("danh sach phan tu mang");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }
}
