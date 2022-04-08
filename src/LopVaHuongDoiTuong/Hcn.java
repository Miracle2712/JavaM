package LopVaHuongDoiTuong;

public class Hcn {
    double width;
    double height;

    public Hcn() {
    }

    public Hcn(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getdienTich() {
        return this.width * this.height;
    }

    public double getchuVi() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Hcn{" + "Cr=" + width + ", Cd=" + height + "}";
    }
}