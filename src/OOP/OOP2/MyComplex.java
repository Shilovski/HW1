package OOP.OOP2;

import java.util.Objects;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    public boolean isReal() {
        double eps = 10E-5;
        return (Math.abs(imag) < eps);
    }

    public boolean isImaginary() {
        double eps = 10E-5;
        return (Math.abs(real) < eps);
    }

    public boolean equals(double real, double imag) {
        double eps = 10E-5;
        return (Math.abs(this.real - real) < eps) && (Math.abs(this.imag - imag) < eps);
    }

    public boolean equals(MyComplex another) {
        double eps = 10E-5;
        return (Math.abs(real - another.getReal()) <= eps && Math.abs(imag - another.getImag()) <= eps);
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public double argument() {
        return Math.atan(imag / real);
    }

    public MyComplex add(MyComplex right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(real + right.getReal(), imag + right.getImag());
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(real - right.getReal(), imag - right.getImag());
    }

    public MyComplex multiply(MyComplex right) {
        this.real = real * right.getReal() - imag * right.getImag();
        this.imag = real * right.getImag() + imag * right.getReal();
        return this;
    }

    public MyComplex divide(MyComplex right) {
        if ((Math.pow(right.getReal(), 2) + Math.pow(right.getImag(), 2)) != 0) {
            this.real = (real * right.getReal() + imag * right.getImag()) / (Math.pow(right.getReal(), 2) +
                    Math.pow(right.getImag(), 2));
            this.imag = (imag * right.getReal() - real * right.getImag()) / (Math.pow(right.getReal(), 2) +
                    Math.pow(right.getImag(), 2));
        }
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex myComplex = (MyComplex) o;
        return Double.compare(myComplex.real, real) == 0 && Double.compare(myComplex.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imag);
    }
}