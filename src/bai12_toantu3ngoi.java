import java.util.Scanner;

public class bai12_toantu3ngoi {
    public static void main(String[] args) {
        //nhập vào bàn phím 1 số, kiểm tra chẳn lẻ
        Scanner sc=new Scanner(System.in);
        System.out.println("mời bạn nhập vào 1 số nguyên n: ");
        int n=sc.nextInt();
        String traloi = (n%2 ==0)?"Chẵn" : "Lẻ";
        System.out.println("Số " + n + " nhập là số: "+traloi);
    }
}
