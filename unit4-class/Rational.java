public class Rational {
    long numerator;     //分子
    long denominator;  //分母
    Rational(){}

    Rational(long a,long b){    //有参构造函数
        if (a == 0){
            numerator = 0;
            denominator = 1;
        } else {
            setNumeratorAndDenominator(a, b);
        }
    }

    void setNumeratorAndDenominator(long a, long b){    //设置分子和分母
        long c = f(Math.abs(a), Math.abs(b));            //计算最大公约数
        numerator = a / c;
        denominator = b / c;
        if (numerator < 0 && denominator < 0) {
            numerator =- numerator;
            denominator =- denominator;
        }
    }

    long getNumerator(){
        return numerator;
    }
    long getDenominator(){
        return denominator;
    }

    long f(long a,long b){              //计算最大公约数
        if (a < b){
            long c = a;
            a = b;
            b = c;
        }
        long r = a % b;
        while (r != 0){
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    Rational adds(Rational r){       //加法运算
        long a = r.getNumerator();
        long b = r.getDenominator();
        long newNumerator = numerator * b + denominator * a;
        long newDenominator = denominator * b;
        Rational result = new Rational(newNumerator, newDenominator);
        return result;
    }
    Rational sub(Rational r){      //减法运算
        long a = r.getNumerator();
        long b = r.getDenominator();
        long newNumerator = numerator * b - denominator * a;
        long newDenominator = denominator * b;
        Rational result = new Rational(newNumerator, newDenominator);
        return result;
    }
    Rational muti(Rational r){         //乘法运算
        long a = r.getNumerator();
        long b = r.getDenominator();
        long newNumerator = numerator * a;
        long newDenominator = denominator * b;
        Rational result = new Rational(newNumerator, newDenominator);
        return result;
    }
    Rational div(Rational r){        //除法运算
        long a = r.getNumerator();
        long b = r.getDenominator();
        long newNumerator = numerator * b;
        long newDenominator = denominator * a;
        Rational result = new Rational(newNumerator, newDenominator);
        return result;
    }



    void getSqrt(){
        long first = 0;
        long second = 0;

        if (numerator * denominator > 0) {
            for (long i = 0; i <= Math.abs(numerator); i++) {
                if (i * i == Math.abs(numerator)) {
                    for (long j = 0; j <= Math.abs(denominator); j++) {
                        if (j * j == Math.abs(denominator)) {
                            first = i;
                            second = j;
                            System.out.println("sqrt of " + numerator + "/" + denominator + " is " + i + "/" + j);
                        }
                    }
                }
            }
        } else {
            for (long i = 0; i <= Math.abs(numerator); i++) {
                if (i * i == Math.abs(numerator)) {
                    for (long j = 0; j <= Math.abs(denominator); j++) {
                        if (j * j == Math.abs(denominator)) {
                            first = i;
                            second = j;
                            System.out.println("sqrt of " + numerator + "/" + denominator + " is " + i + "/" + j + "i");
                        }
                    }
                }
            }
        }

        if (first == 0 && second == 0) {
            System.out.println("无法精确求值！");
            return;
        }


    }


    Rational power() {
        long newNumerator = numerator * numerator;
        long newDenominator = denominator * denominator;
        Rational result = new Rational(newNumerator, newDenominator);
        return result;
    }

    void mixedNum() {
        long first = 0;
        long second = 0;
        if (numerator > denominator) {
            first = numerator / denominator;
            second = numerator % denominator;
            System.out.println(first + "x" + second + "/" + denominator);
        }

    }



}


