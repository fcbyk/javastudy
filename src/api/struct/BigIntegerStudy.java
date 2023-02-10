package api.struct;
import java.math.BigInteger;

public class BigIntegerStudy {
    public static void test01(){
        /*
            public BigInteger(int num, Random rnd) ��ȡ�������������Χ:[0~ 2��num�η�-11
            public BigInteger(String val) ��ȡָ���Ĵ�����
            public BigInteger(String val, int radix) ��ȡָ�����ƵĴ�����

            public static BigInteger valueOf(long val) ��̬������ȡBigInteger�Ķ����ڲ����Ż�

            ϸ��:
            ����һ��������������ݲ��ܷ����ı䡣
        */


        //1.��ȡһ������Ĵ�����
        /* Random r=new Random();
            for (int i = e; i < 100; i++) {
            BigInteger bd1 = new BigInteger(4,r);
            System.out.println(bd1);//[@ ~ 15]}
            }
        */

        //2.��ȡһ��ָ���Ĵ����������Գ���long��ȡֵ��Χ
        //ϸ��:�ַ����б���������������ᱨ��
        /* BigInteger bd2 = new BigInteger("1.1");
            System.out.println(bd2);
        */

        /*
            BigInteger bd3 = new BigInteger("abc");
            System.out.println(bd3);
         */

        //3.��ȡָ�����ƵĴ�����
        //ϸ��:
        //1.�ַ����е����ֱ���������
        //2.�ַ����е����ֱ���Ҫ�������Ǻϡ�
        //����������У���ôֻ��д�պ�1��д�����ľͱ���
        BigInteger bd4 = new BigInteger("123", 2);
        System.out.println(bd4);

        //4.��̬������ȡBigInteger�Ķ����ڲ����Ż�
        //ϸ��:
        //1.�ܱ�ʾ��Χ�Ƚ�С��ֻ����long��ȡֵ��Χ֮�ڣ��������long�ķ�Χ�Ͳ����ˡ�
        //2.���ڲ��Գ��õ�����: -16 ~ 16 �������Ż���
        //  ��ǰ��-16~16 �ȴ�����BigInteger�Ķ��������λ�ȡ�������´����µġ�
        BigInteger bd5 = BigInteger.valueOf(16);
        BigInteger bd6 = BigInteger.valueOf(16);
        System.out.println(bd5 == bd6);//true


        BigInteger bd7 = BigInteger.valueOf(17);
        BigInteger bd8 = BigInteger.valueOf(17);
        System.out.println(bd7 == bd8);//false


        //5.����һ�������ڲ������ݲ��ܷ����ı�
        BigInteger bd9 =BigInteger.valueOf(1);
        BigInteger bd10 =BigInteger.valueOf(2);
        //��ʱ�������޸Ĳ�������BigInteger�����еĽ裬���ǲ�����һ���µ�BigInteger�����¼
        BigInteger result=bd9.add(bd10);
        System.out.println(result);//3
    }

    public static void test02(){
        /*
            public BigInteger add(BigInteger val) �ӷ�
            public BigInteger subtract(BigInteger val) ����
            public BigInteger multiply(BigInteger val) �˷�
            public BigInteger divide(BigInteger val) ��������ȡ��
            public BigInteger[] divideAndRemainder(BigInteger val) ��������ȡ�̺�����
            public boolean equals(Object x) �Ƚ��Ƿ���ͬ
            public BigInteger pow(int exponent) ����
            public BigInteger max/min(BigInteger val) ���ؽϴ�ֵ/��Сֵ
            public int intValue(BigInteger val) תΪint����������������Χ��������
        */

        //1.��������BigInteger����
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(5);

        //2.�ӷ�
        BigInteger bd3 = bd1.add(bd2);
        System.out.println(bd3);

        //3.��������ȡ�̺�����
        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        //4.�Ƚ��Ƿ���ͬ
        boolean result = bd1.equals(bd2);
        System.out.println(result);

        //5.����
        BigInteger bd4 = bd1.pow(2);
        System.out.println(bd4);

        //6.max
        BigInteger bd5 = bd1.max(bd2);


        //7.תΪint����������������Χ��������
        /* BigInteger bd6 = BigInteger.valueOf(2147483647L);
         int i = bd6.intValue();
         System.out.println(i);
         */

        BigInteger bd6 = BigInteger.valueOf(200);
        double v = bd6.doubleValue();
        System.out.println(v);//200.0
    }
}
