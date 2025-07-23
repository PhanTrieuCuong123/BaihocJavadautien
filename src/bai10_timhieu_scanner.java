import java.util.Scanner;

public class bai10_timhieu_scanner {
    public static void main(String[] args) {
 /*       //khởi tạo 1 đối tượng scanner
        Scanner sc = new Scanner(System.in);

        //cho phép nhập chuỗi
        System.out.println("Mời nhập vào mk cấp 1: ");
        String mk1 =sc.nextLine();
        System.out.println("mk cấp 1 là :"+mk1);
        //nhập số nguyên
        System.out.println("Mời nhập vào 1 số nguyên a ");
        int a = sc.nextInt();
        System.out.println("a= "+a);
        //nhập số float
        System.out.println("Mời nhập vào 1 số thực x: ");
        float x = sc.nextFloat();
        System.out.println("x= "+x);

        //nhập chuỗi
        System.out.println("Mời nhập vào mk cấp 2: ");
        String mk2 =sc.nextLine();
        System.out.println("mk cấp 2 là :"+mk2);*/

        //nhập chuỗi
        System.out.println("Mời bạn nhập tên: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("tên bạn là: " +ten);

        //nhập chuỗi
        System.out.println("Mời bạn nhập giới tính: ");
        String gioitinh = new Scanner(System.in).nextLine();
        System.out.println("giới tính bạn là: " +gioitinh);

        //nhập float
        System.out.println("Mời bạn nhập chiều cao: ");
        float chieucao = new Scanner(System.in).nextFloat();
        System.out.println("chiều cao bạn là: " +chieucao);

        //nhập chuỗi
        System.out.println("Mời bạn nhập cân nặng: ");
        String cannang = new Scanner(System.in).nextLine();
        System.out.println("cân năng bạn là: " +cannang);
    }
}
