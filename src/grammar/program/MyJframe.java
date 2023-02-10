package grammar.program;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyJframe extends JFrame implements ActionListener {

    JButton yesBut = new JButton("˧����");
    JButton midBut = new JButton("һ����");
    JButton noBut = new JButton("��˧���е����");
    JButton dadBut = new JButton("�����Ұɣ�");


    //�������Ϸ��İ�ť�Ƿ�չʾ
    boolean flag = false;


    public MyJframe() {
        initJFrame();

        initView();

        //��ʾ
        this.setVisible(true);
    }

    private void initView() {

        this.getContentPane().removeAll();

        if (flag) {
            //չʾ��ť
            dadBut.setBounds(50, 20, 100, 30);
            dadBut.addActionListener(this);
            this.getContentPane().add(dadBut);
        }


        JLabel text = new JLabel("������Լ�˧��");
        text.setFont(new Font("΢���ź�", 0, 30));
        text.setBounds(120, 150, 300, 50);


        yesBut.setBounds(200, 250, 100, 30);
        midBut.setBounds(200, 325, 100, 30);
        noBut.setBounds(160, 400, 180, 30);

        yesBut.addActionListener(this);
        midBut.addActionListener(this);
        noBut.addActionListener(this);

        this.getContentPane().add(text);
        this.getContentPane().add(yesBut);
        this.getContentPane().add(midBut);
        this.getContentPane().add(noBut);

        this.getContentPane().repaint();
    }

    private void initJFrame() {
        //���ÿ��
        this.setSize(500, 600);
        //���ñ���
        this.setTitle("���û���");
        //���ùر�ģʽ
        this.setDefaultCloseOperation(3);
        //�ö�
        this.setAlwaysOnTop(true);
        //����
        this.setLocationRelativeTo(null);
        //ȡ���ڲ�Ĭ�ϲ���
        this.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == yesBut) {
            //���û���һ������
            showJDialog("xxx����̫�����ˣ�����һ��С�ͷ�");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 3600");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            flag = true;
            initView();

        } else if (obj == midBut) {
            System.out.println("��ĺû��ѵ����һ����");

            //���û���һ������
            showJDialog("xxx���㻹��̫�����ˣ�ҲҪ����һ��С�ͷ�");

            try {
                Runtime.getRuntime().exec("shutdown -s -t 7200");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            flag = true;
            initView();


        } else if (obj == noBut) {
            System.out.println("��ĺû��ѵ���˲�˧");

            //���û���һ������
            showJDialog("xxx���㻹����һ����֪֮���ģ�ҲҪ����һ��С�ͷ�");

            try {
                Runtime.getRuntime().exec("shutdown -s -t 1800");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            flag = true;
            initView();
        } else if (obj == dadBut) {
            //���û���һ������
            showJDialog("xxx����ξ�������~");

            try {
                Runtime.getRuntime().exec("shutdown -a");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        }
    }

    public void showJDialog(String content) {
        //����һ���������
        JDialog jDialog = new JDialog();
        //���������ô�С
        jDialog.setSize(200, 150);
        //�õ����ö�
        jDialog.setAlwaysOnTop(true);
        //�õ������
        jDialog.setLocationRelativeTo(null);
        //���򲻹ر���Զ�޷���������Ľ���
        jDialog.setModal(true);

        //����Jlabel����������ֲ���ӵ�������
        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);

        //�õ���չʾ����
        jDialog.setVisible(true);
    }
}