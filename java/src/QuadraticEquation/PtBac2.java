package QuadraticEquation;

public class PtBac2 {
    //ax2 + bx + x = 0


    //khởi tạo thuộc tính a,b,c
    private double a, b, c;

    //khởi tạo constructor
    public PtBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //khởi tạo phương thức geta,b,c và set a,b,c
    public double getA() {
        return a;
    }

    // kiểu dữ liệu thì phải có return
    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // có từ khóa void là ko có return và phải truyền tham số thay đổi
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double delta() {
        return b * b - 4 * a * c;
    }

    public double nghiem1() {
        double r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
        return r1;
    }

    public double nghiem2() {
        double r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
        return r2;
    }

    public double deltabang0() {
        return -b / (2 * a);
    }

    public static void main(String[] args) {
        PtBac2 pt = new PtBac2(8, 25, 2);
        if (pt.delta() > 0) {
            System.out.println("pt có 2 nghiệm là :" + pt.nghiem1() + " và " + pt.nghiem2());
        } else if (pt.delta() == 0) {
            System.out.println("pt có 1 nghiệm là :" + pt.deltabang0());

        } else
            System.out.println("pt vô nghiệm");
    }
}
