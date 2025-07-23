public class bai7_cacpheptoancoban {
    public static void main(String[] args) {
        int a=11;
        int b=5;
        System.out.println("a= " +a);
        System.out.println("b= " +b);

        //phép cộng
        System.out.println("a+b= " +(a+b));
        //gắn biến
        int kq =a+b;
        System.out.println("a+b= " +kq);
        //phép trừ
        System.out.println("a-b= " +(a-b));
        //phép nhân
        System.out.println("a*b= " +(a*b));
        //chia lấy dư
        System.out.println("a%b= " +(a%b));
        //phép chia phải ép kiểu ( dễ mất dữ liệu )
        System.out.println("a/b= " +((double)a/b));
    }
}
