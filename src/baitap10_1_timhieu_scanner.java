import java.util.Scanner;

public class baitap10_1_timhieu_scanner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Mời bạn nhập chiều dài hình chữ nhật a: ");
        Scanner dc= new Scanner(System.in);
        System.out.println("Mơi bạn nhập chiều rộng hình chữ nhật b; ");
        double a =sc.nextDouble();
        double b =dc.nextDouble();
        double dientich =a*b;
        double chuvi =(a+b)*2;
        System.out.println("diện tích hình chữ nhật s=" +dientich);
        System.out.println("chu vi hình chữ nhật p=" +chuvi);
    }
}
