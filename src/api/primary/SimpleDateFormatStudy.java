package api.primary;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatStudy {

    public static void test01() throws Exception{
        /*
             ���裬������ĳ���������Ϊ:2000-11-11
             �����ַ�����ʾ������ݣ�������ת��Ϊ:2000��11��11��

             ����һ��Date�����ʾ2000��11��11��
             ����һ��SimpleDateFormat���󣬲������ʽΪ�����հ�ʱ����:2000��11��11��
        */

        //1.����ͨ��2000-11-11���н�����������һ��Date����
        String str = "2000-11-11";
        //2.����
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(str);
        //3.��ʽ��
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy��MM��dd��");
        String result = sdf2.format(date);
        System.out.println(result);
    }

    //��ɱ�
    public static void test02() throws Exception{
        /* ����:
            ��ɱ���ʼʱ��:2023��11��11�� 0:0:0(����ֵ)
            ��ɱ�����ʱ��:2023��11��11�� 0:10:0(����ֵ)

            С���µ��������ʱ��Ϊ:2023��11��11�� 0:01:0
            СƤ�µ��������ʱ��Ϊ:2023��11��11�� 0:11:0
            �ô���˵������λͬѧ��û�вμ�����ɱ�?
         */

        //1.�����ַ�����ʾ����ʱ��
        String startstr = "2023��11��11�� 0:0:0";
        String endstr = "2023��11��11�� 0:10:0";
        String orderstr = "2023��11��11�� 0:01:00";
        //2.�������������ʱ�䣬�õ�Date����
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��HH:mm:ss");
        Date startDate = sdf.parse(startstr);
        Date endDate = sdf.parse(endstr);
        Date orderDate = sdf.parse(orderstr);

        //3.�õ�����ʱ��ĺ���ֵ
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime = orderDate.getTime();

        //4.�ж�
        if (orderTime >= startTime && orderTime <= endTime) {
            System.out.println("�μ���ɱ��ɹ�");
        } else {
            System.out.println("�μ���ɱ�ʧ��");
        }
    }
}
