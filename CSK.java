
public class CSK {

    int a;
    int b;
    static int e;
    static int f;
    static int g;

    public void Show(int c, int d, int k, int l, int m) {
        a = c;
        b = d;
        e = k;
        f = l;
        g = m;

    }

    public static void main(String[] args) {
        CSK c1 = new CSK();
        CSK c6 = new CSK();
        CSK c5 = new CSK();
        CSK c4 = new CSK();
        CSK c3 = new CSK();
        CSK c2 = new CSK();
        CSK c7 = new CSK();
        c1.Show(1, 2, 4, 5, 6);

        System.out.println(c2.a);
        System.out.println(c2.b);
        c1.Show(1, 2, 4, 5, 6);

        System.out.println(c1.a);
        System.out.println(c1.b);
        c2.Show(2, 4, 6, 8, 9);

        System.out.println(c2.a);
        System.out.println(c3.b);
        System.out.println(c7.g);
        c3.Show(9, 1, 2, 3, 4);

        System.out.println(c4.b);
        System.out.println(c1.f);
        System.out.println(c5.b);
        System.out.println(c3.a);
        c4.Show(3, 4, 5, 6, 7);

        System.out.println(c6.b);
        c6.Show(1, 2, 4, 5, 6);

        System.out.println(c3.b);
        System.out.println(c7.b);
        System.out.println(c6.e);
        c7.Show(7, 8, 9, 9, 8);

        System.out.println(c2.e);
        System.out.println(c7.f);
        c5.Show(1, 2, 4, 5, 6);

        System.out.println(c2.f);
        System.out.println(c5.g);
        System.out.println(c2.g);

    }

}
