
import java.util.Scanner;

public class Bai11_If_Else {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.println("Mời bạn nhập vào điểm trung bình: ");
        double diemtrungbinh =sc.nextDouble();
        //Kiểm tra điều kiện
        if (diemtrungbinh>=8.0 && diemtrungbinh<=10) {
            System.out.println("Bạn xếp loại giỏi");
        }
        else if (diemtrungbinh>=7.0 && diemtrungbinh<8) {
            System.out.println("Bạn xếp loại khá");
        }
        else if (diemtrungbinh>=5.0 && diemtrungbinh<7){
            System.out.println("Bạn xếp loại trung bình");
        }
        else {
            System.out.println("Bạn xếp loại kém");
        }
    }
}
