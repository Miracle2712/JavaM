package LopVaHuongDoiTuong;

public class Ptb2 {
    private double a,b,c;

    public Ptb2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    public double delta(){
        return this.b*this.b-4*this.a*this.c;
    }
    public double Nghiem1(){
        return (-this.b+Math.pow(this.delta(),0.5))/(2*this.a);
    }
    public double Nghiem2(){
        return (-this.b-Math.pow(this.delta(),0.5))/(2*this.a);
    }

}
