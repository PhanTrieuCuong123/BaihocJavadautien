import java.util.Scanner;

public class baitap12_toantu3ngoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời bạn nhập điểm: ");
        double n=sc.nextDouble();
        String traloi =(n >= 8)?"Giỏi"
                :(n < 8 && n >=6.5)?"Khá"
                :(n <6.5 && n >= 5)?"Trung bình":"Yếu";
        System.out.println("xếp loại của học sinh là "+traloi);
    }
}
