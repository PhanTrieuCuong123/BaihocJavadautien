import java.util.Scanner;

public class baitap10_timhieu_scanner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Mời bạn nhập bán kính hình tròn r: ");
        double r = sc.nextDouble();
        double cv = 2 *Math.PI *r;
        double dt = Math.PI * Math.pow(r,2);
        //xuất kết quả
        System.out.println("Chu vi là: "+ cv);
        System.out.println("Diện tích là: "+ dt);
    }
}
