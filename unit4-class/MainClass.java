public class MainClass {

    public static void main(String[] args) {
        Rational firstRational = new Rational(1,5);       //第一个分数
        Rational secondRational = new Rational(3,2);       //第二个分数

        //加法运算
        Rational resultRational = firstRational.adds(secondRational); //进行加法运算
        long resultNumerator = resultRational.getNumerator(); //进行加法运算后的分子
        long resultDenominator = resultRational.getDenominator();//进行加法运算后的分母
        System.out.println("1/5+3/2= " + resultNumerator + "/" + resultDenominator);

        //减法运算
        resultRational = firstRational.sub(secondRational);
        resultNumerator = resultRational.getNumerator();
        resultDenominator = resultRational.getDenominator();
        System.out.println("1/5-3/2= " + resultNumerator + "/" + resultDenominator);

        //乘法运算
        resultRational = firstRational.muti(secondRational);
        resultNumerator = resultRational.getNumerator();
        resultDenominator = resultRational.getDenominator();
        System.out.println("1/5*3/25= " + resultNumerator + "/" + resultDenominator);

        //除法运算
        resultRational = firstRational.div(secondRational);
        resultNumerator = resultRational.getNumerator();
        resultDenominator = resultRational.getDenominator();
        System.out.println("1/5÷3/2= " + resultNumerator + "/" + resultDenominator);



        //2/1+3/2+5/3+...的前10项的和
        int n = 10, k = 1;
        System.out.println("计算2/1+3/2+5/3+8/5+13/8+...的前" + n + "项和。");
        Rational sum = new Rational(0, 1);
        Rational item = new Rational(2, 1);
        while (k <= n){
            sum = sum.adds(item);
            k++;
            long fenzi = item.getNumerator();
            long fenmu = item.getDenominator();
            item.setNumeratorAndDenominator(fenmu + fenzi, fenzi);
        }
        long a = sum.getNumerator();
        long b = sum.getDenominator();
        System.out.println("用分数表示为：");
        System.out.println(a + "/" + b);
        double doubleResult = (a * 1.0) / b;
        System.out.println("用小数表示为：");
        System.out.println(doubleResult);



        Rational thirdRational = new Rational(1,-1);       //第3个分数
        thirdRational.getSqrt();

        Rational fourthRational = new Rational(-25,50);       //第4个分数
        fourthRational.getSqrt();

        Rational fifthRational = new Rational(16, 36);       //第5个分数
        fifthRational.getSqrt();



        Rational sixthRational = new Rational(5, 3);       //第6个分数
        Rational sixthPower = sixthRational.power();
        long sixNumerator = sixthPower.getNumerator(); //进行加法运算后的分子
        long sixDenominator = sixthPower.getDenominator();//进行加法运算后的分母
        System.out.println("5/3 * 5/3 = " + sixNumerator+ "/" + sixDenominator);

        Rational seventhRational = new Rational(100, 99);       //第7个假分数
        seventhRational.mixedNum();


    }
}