package api.primary;

//Mathѧϰ

public class StudyMath {

    //Math�ĳ�������
    public static void MathMethod(){
        // public static int abs(int a)         ���ز����ľ���ֵ
        System.out.println("-2�ľ���ֵΪ��" + Math.abs(-2));
        System.out.println("2�ľ���ֵΪ��" + Math.abs(2));

        // public static double ceil(double a)  ���ش��ڻ���ڲ�������С����
        System.out.println("���ڻ����23.45����С����λ��" + Math.ceil(23.45));
        System.out.println("���ڻ����-23.45����С����λ��" + Math.ceil(-23.45));

        // public static double floor(double a) ����С�ڻ���ڲ������������
        System.out.println("С�ڻ����23.45���������λ��" + Math.floor(23.45));
        System.out.println("С�ڻ����-23.45���������λ��" + Math.floor(-23.45));

        // public static int round(float a)     �����������뷵����ӽ�������int
        System.out.println("23.45��������Ľ��Ϊ��" + Math.round(23.45));
        System.out.println("23.55��������Ľ��Ϊ��" + Math.round(23.55));

        // public static int max(int a,int b)   ��������intֵ�еĽϴ�ֵ
        System.out.println("23��45�����ֵΪ: " + Math.max(23, 45));

        // public static int min(int a,int b)   ��������intֵ�еĽ�Сֵ
        System.out.println("12��34����СֵΪ: " + Math.min(12 , 34));

        // public static double pow (double a,double b)����a��b���ݵ�ֵ
        System.out.println("2��3���ݼ�����Ϊ: " + Math.pow(2,3));

        // public static double random()����ֵΪdouble����ֵ��[0.0,1.0)
        System.out.println("��ȡ����0-1֮��������Ϊ: " + Math.random());
    }

    //�ж�һ�����Ƿ�Ϊһ������
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

    //������
    //ͳ��һ���ж��ٸ�ˮ�ɻ���
    //��������һ��nλ��Ȼ���������������λ�����ֵ�n����֮��
    //	����1����λ��  1^3 + 5^3 + 3^3 = 153
    //	����2����λ��  1^4 + 6^4 + 3^4 + 4^3 = 1634
    //����������ǣ�
    //һλ��������Ҳ������������
    //��λ��������ˮ�ɻ���  ��λ����������Ҷõ����
    //��λ���������������  ��λ��������������
    //��λ������������������  ��λ��������������
    //��λ���������ž�������  ʮλ��������ʮȫʮ����
    public static void Narcissistic(){
        //ˮ�ɻ���:100 ~ 999
        int count = 0;
        //�õ�ÿһ����λ��
        for (int i = 100; i <= 999; i++) {
            //��λ ʮλ ��λ
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            //�ж�:
            //ÿһλ�����η�֮�� ������ ���бȽϡ�
            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if (sum == i) {
                count++;
                //System.out.println(i);

                System.out.println(count);
            }
        }
    }


}
