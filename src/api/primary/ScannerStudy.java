package api.primary;
import java.util.Scanner;

//Scanner��ѧϰ

public class ScannerStudy {
    public static void usetest(){

        //����������ʵ��������һ�£���׼����ʼ��Scanner������ˡ�
        Scanner sc = new Scanner(System.in);

        //��������
        //����������֮�������ڼ�����������ݾͻᱻ����i��������
        System.out.println("������һ������");
        int i = sc.nextInt();
        System.out.println(i);
    }
}