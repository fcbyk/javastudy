package grammar.basics;

public class method {

    //����1
    //�������һ���������Ի�ȡ�������Ľϴ�ֵ�����������ڲ���
    public static int getMax(int a, int b) {
        //ʹ�÷�֧��������������������ֵĴ�С��ϵ���д���
        //��������ֱ�������������¶�Ӧ�ķ��ؽ��
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    //����2
    //���󣺶���һ����������һ���̳�ÿ�����ȵ�Ӫҵ����ݷ�������ټ����ȫ��Ӫҵ�
    public static int getSum(int month1,int month2,int month3){
        int sum = month1 + month2 + month3;
        return sum;
    }

    //����3
    //���󣺼���¼������Բ�İ뾶�����������Ƚ�����Բ�������
    public static double getArea(int radii) {
        double area = 3.14 * radii * radii;
        return area;
    }

    //����4���޲������������ط���1
    //���һ���������ڴ�ӡ�������еĽϴ���
    public static void getMax() {
        //�����ж����������������ڱ�����������
        int a = 10;
        int b = 20;
        //ʹ�÷�֧��������������������ֵĴ�С��ϵ���д���
        if(a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    //����5��������������ϰ
    //�������һ���������ڴ�ӡ�������еĽϴ��������������ڷ�������
    //����һ�����������ڴ�ӡ���������еĽϴ���������getMax()
    //Ϊ���������������������ڽ�����������
    public static void printfMax(int a, int b) {
        //ʹ�÷�֧��������������������ֵĴ�С��ϵ���д���
        if(a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    //����6789 ����������ϰ
    //����ʹ�÷������ص�˼�룬��ƱȽ����������Ƿ���ͬ�ķ���������ȫ�������ͣ�byte,short,int,long��
    //int
    public static boolean compare(int a, int b) {
        System.out.println("int");
        return a == b;
    }

    //byte
    public static boolean compare(byte a, byte b) {
        System.out.println("byte");
        return a == b;
    }

    //short
    public static boolean compare(short a, short b) {
        System.out.println("short");
        return a == b;
    }

    //long
    public static boolean compare(long a, long b) {
        System.out.println("long");
        return a == b;
    }

    //����10���������
    //�������һ�������������������Ҫ������Ľ������һ���ϵġ����磺[11, 22, 33, 44, 55]
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                System.out.println(arr[i] + "]");
            }else{
                System.out.print(arr[i] + ", ");
            }
        }
    }

    //����11���������ֵ ���������أ�
    //�������һ���������ڻ�ȡ������Ԫ�ص����ֵ
    public static int getMax(int[] arr) {
        int max = arr[0];

        for(int x=1; x<arr.length; x++) {
            if(arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }

    //����12����ȡ����
    //���󣺶���һ��������ȡ���֣��������е�����λ�ã���������ظ����ô���������ظ��ģ�ֻҪ��ȡ��һ�����ɡ�
    public static int contains(int[] arr, int number) {
        //����arr�õ�ÿһ��Ԫ��
        for (int i = 0; i < arr.length; i++) {
            //����ÿһ��Ԫ�ظ�number�Ƚ�
            if(arr[i] == number){
                //�����ȣ���ʾ�ҵ���
                return i;
            }
        }
        //��ѭ������֮����������ܷ�����������ʾ�����в����ڸ�����
        //���Է���-1
        return -1;
    }
}
