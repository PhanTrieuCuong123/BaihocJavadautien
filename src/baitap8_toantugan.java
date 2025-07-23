public class baitap8_toantugan {
    public static void main(String[] args) {
        int a = 6;
        a += 3;
        System.out.println("(A) a=" + a);
        a -= 5;
        System.out.println("(B) a=" + a);
        a *= 2;
        System.out.println("(C) a=" + a);
        a %= 5;
        System.out.println("(D) a=" + a);
        int b = 2;
        a = a - (b + 7);
        System.out.println("(E) a=" + a);
    }
}
