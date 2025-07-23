import java.util.Scanner;

public class baitap11_If_Else {
    public static void main(String[] args) {
/*//Bài tập 01
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời bạn nhập tổng 2 số: ");
        double tonghaiso=sc.nextDouble();
        System.out.println("Mời bạn nhập hiệu 2 số: ");
        double hieuhaiso=sc.nextDouble();
        double x=(tonghaiso+hieuhaiso)/2;
        double y=(tonghaiso-hieuhaiso)/2;
        System.out.println("vậy x= "+x);
        System.out.println("vậy y= "+y);*/

//Bài tập 02
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập chiều cao (m): ");
        double chieucao = sc.nextDouble();
        System.out.println("Mời bạn nhập cân năng (kg): ");
        double cannang = sc.nextDouble();
        double BMI = (cannang / (chieucao * chieucao));
        if (BMI < 15)
            System.out.println("Thân hình quá gầy:");
        else if (BMI>=15 && BMI<16)
            System.out.println("Thân hình gầy:");
        else if (BMI>=16 && BMI<18.5)
            System.out.println("Thân hình hơi gầy:");
        else if (BMI>=18.5 && BMI<25)
            System.out.println("Thân hình bình thường:");
        else if (BMI>=25 && BMI<30)
            System.out.println("Thân hình hơi béo:");
        else if (BMI>=30 && BMI<35)
            System.out.println("Thân hình béo:");
        else
            System.out.println("Thân hình quá béo");*/

//Bài tập 03
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 1 năm dương lịch: ");
        int namduonglich =sc.nextInt();
        if((namduonglich % 4 ==0 && namduonglich%100!=0) || namduonglich %400 ==0)
            System.out.println("Năm đó là năm nhuận: "+namduonglich);
        else
            System.out.println("Năm đó không phải năm nhuận: ");

//Bài tập 04
        /*Scanner sc=new Scanner(System.in);
        System.out.println("nhập tháng bất kì mà bạn mong muốn: ");
        int thang =sc.nextInt();
        if(thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang ==8 || thang == 10 || thang == 12) {
            System.out.println("tháng đó có 31 ngày:");
        }
        else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            System.out.println("tháng đó có 30 ngày: ");
        }
        else if(thang == 2) {
            System.out.println("vui lòng nhập số năm:");
            int nam = sc.nextInt();
            if (nam % 4 == 0 && nam % 100!= 0)
                System.out.println("tháng đó có 29 ngày");
            else
                    System.out.println("tháng đó có 28 ngày");
        }*/

//Bài tập 05
 /*       Scanner sc = new Scanner(System.in);
        System.out.println("nhập a:");
        double Ana = sc.nextDouble();
        System.out.println("nhập b:");
        double Anb = sc.nextDouble();
        System.out.println("nhập c:");
        double Anc = sc.nextDouble();
        double Delta = Anb * Anb - 4 * Ana * Anc;
        double tinhnghiemkep = -Anb / (2 * Ana);
        double ptconghiemx1 = (-Anb + Math.sqrt(Delta)) / (2 * Ana);
        double ptconghiemx2 = (-Anb - Math.sqrt(Delta)) / (2 * Ana);
        System.out.println("delta = " + Delta);
        if (Delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (Delta == 0) {
            System.out.println("Phương trình có nghiệm kép: x = " + tinhnghiemkep);
        } else {
            System.out.println("Phương trình có 2 nghiệm phân biệt:");
            System.out.println("x1 = " + ptconghiemx1);
            System.out.println("x2 = " + ptconghiemx2);
        }*/

//Bài tập 06
       /* Scanner sc =new Scanner(System.in);
        System.out.println("Vui lòng nhập số quý trong năm");
        int Quy =sc.nextInt();
        if(Quy ==1){
            System.out.println("tháng 1, 2, 3: ");
        }
        else if (Quy ==2) {
            System.out.println("tháng 4, 5, 6");
        }
        else if (Quy == 3) {
            System.out.println("tháng 7, 8, 9");
        }
        else if (Quy ==4){
            System.out.println("tháng 10, 11, 12");
        }*/
    }
}
