package OOP.OOP2;

public class MyPolynomial {

    public double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        String str = new String();
        for(int i = coeffs.length - 1; i >= 0; i--){
            if (i == 0)
                str += coeffs[i];
            else if (i == 1)
                str += coeffs[i] + "x" + " + ";
            else
                str += coeffs[i] + "x^" + i + " + ";
        }
        return str;
    }

    public double evaluate(double x) {
        double res  = 0.0;
        double tmp = 1.0;
        for (int i = 0; i < coeffs.length; i++) {
            tmp *= (i == 0 ? 1.0 : x);
            res  += tmp * coeffs[i] ;
        }
        return res;
    }

    public MyPolynomial add(MyPolynomial right) {
        MyPolynomial res = this;

        if (res.getDegree() < right.getDegree()) {
            res  = right;
            right = this;
        }

        double[] thisCoeffs  = res.coeffs;
        double[] rightCoeffs = right.coeffs;

        for (int i = 0; i < thisCoeffs.length; i++) {
            if (i > rightCoeffs.length-1) {
                continue;
            }
            thisCoeffs[i] += rightCoeffs[i];
        }

        return new MyPolynomial(thisCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] thisCoeffs  = new double[this.getDegree() + right.getDegree() + 1];
        double[] rightCoeffs = right.coeffs;

        for (int i = 0; i < thisCoeffs.length; i++) {
            double tmp = 0.0;
            for (int j = 0; j <= i; j++) {
                if (j > coeffs.length - 1) {
                    continue;
                }
                if (i - j > rightCoeffs.length - 1) {
                    continue;
                }
                tmp += coeffs[j] * rightCoeffs[i-j];
            }
            thisCoeffs[i] = tmp;
        }
        return new MyPolynomial(thisCoeffs);
    }
}
