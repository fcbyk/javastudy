package api.primary;

//Math学习

public class StudyMath {

    //Math的常见方法
    public static void MathMethod(){
        // public static int abs(int a)         返回参数的绝对值
        System.out.println("-2的绝对值为：" + Math.abs(-2));
        System.out.println("2的绝对值为：" + Math.abs(2));

        // public static double ceil(double a)  返回大于或等于参数的最小整数
        System.out.println("大于或等于23.45的最小整数位：" + Math.ceil(23.45));
        System.out.println("大于或等于-23.45的最小整数位：" + Math.ceil(-23.45));

        // public static double floor(double a) 返回小于或等于参数的最大整数
        System.out.println("小于或等于23.45的最大整数位：" + Math.floor(23.45));
        System.out.println("小于或等于-23.45的最大整数位：" + Math.floor(-23.45));

        // public static int round(float a)     按照四舍五入返回最接近参数的int
        System.out.println("23.45四舍五入的结果为：" + Math.round(23.45));
        System.out.println("23.55四舍五入的结果为：" + Math.round(23.55));

        // public static int max(int a,int b)   返回两个int值中的较大值
        System.out.println("23和45的最大值为: " + Math.max(23, 45));

        // public static int min(int a,int b)   返回两个int值中的较小值
        System.out.println("12和34的最小值为: " + Math.min(12 , 34));

        // public static double pow (double a,double b)返回a的b次幂的值
        System.out.println("2的3次幂计算结果为: " + Math.pow(2,3));

        // public static double random()返回值为double的正值，[0.0,1.0)
        System.out.println("获取到的0-1之间的随机数为: " + Math.random());
    }

    //判断一个数是否为一个质数
    public static boolean isPrime(int number) {
        int count = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            count++;
            if (number % i == 0) {
                return false;
            }
        }
        System.out.println(count);
        return true;
    }

    //自幂数
    //统计一共有多少个水仙花数
    //自幂数，一个n位自然数等于自身各个数位上数字的n次幂之和
    //	举例1：三位数  1^3 + 5^3 + 3^3 = 153
    //	举例2：四位数  1^4 + 6^4 + 3^4 + 4^3 = 1634
    //如果自幂数是：
    //一位自幂数，也叫做：独身数
    //三位自幂数：水仙花数  四位自幂数：四叶玫瑰数
    //五位自幂数：五角星数  六位自幂数：六合数
    //七位自幂数：北斗七星数  八位自幂数：八仙数
    //九位自幂数：九九重阳数  十位自幂数：十全十美数
    public static void Narcissistic(){
        //水仙花数:100 ~ 999
        int count = 0;
        //得到每一个三位数
        for (int i = 100; i <= 999; i++) {
            //个位 十位 百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            //判断:
            //每一位的三次方之和 跟本身 进行比较。
            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if (sum == i) {
                count++;
                //System.out.println(i);

                System.out.println(count);
            }
        }
    }


}
