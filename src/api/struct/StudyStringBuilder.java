package api.struct;
//StringBuilder��ѧϰ

import java.util.Scanner;

public class StudyStringBuilder {

    //�Գ��ַ���
    //���󣺼��̽���һ���ַ����������жϳ����ַ����Ƿ��ǶԳ��ַ��������ڿ���̨��ӡ�ǻ���
    //�Գ��ַ�����123321��111
    //�ǶԳ��ַ�����123123
    public static void case01(){
        //1.����¼��һ���ַ���
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ���");
        String str = sc.next();

        //2.��ת����¼����ַ���
        String result = new StringBuilder().append(str).reverse().toString();

        //3.�Ƚ�
        if(str.equals(result)){
            System.out.println("��ǰ�ַ����ǶԳ��ַ���");
        }else{
            System.out.println("��ǰ�ַ������ǶԳ��ַ���");
        }
    }

    //ƴ���ַ���
    //���󣺶���һ���������� int �����е����ݰ���ָ���ĸ�ʽƴ�ӳ�һ���ַ������ء�
    //���ø÷��������ڿ���̨��������
    //���磺����Ϊint[] arr = {1,2,3};
    //ִ�з������������Ϊ��[1, 2, 3]
    public static String arrToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }

}
