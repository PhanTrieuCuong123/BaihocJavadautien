public class bai6_epkieudulieutrong_Java {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        double kq = (double)  a/b; // đang ép từ kiểu dữ liệu bé sang dữ liệu lớn int => double
        System.out.println(kq);

        //ép kiểu hẹp
        int c = 128;
        byte d=(byte) c;
        System.out.println(c);   // thất thoát tài nguyên
        System.out.println(d);

        int e =15;
        byte f = (byte) e; //ép kiểu từ int sang byte
        System.out.println(e);
        System.out.println(f);
    }
}
