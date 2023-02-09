package api.struct;
//StringBuilder类学习

import java.util.Scanner;

public class StringBuilderStudy {

    //对称字符串
    //需求：键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
    //对称字符串：123321、111
    //非对称字符串：123123
    public static void case01(){
        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //2.反转键盘录入的字符串
        String result = new StringBuilder().append(str).reverse().toString();

        //3.比较
        if(str.equals(result)){
            System.out.println("当前字符串是对称字符串");
        }else{
            System.out.println("当前字符串不是对称字符串");
        }
    }

    //拼接字符串
    //需求：定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回。
    //调用该方法，并在控制台输出结果。
    //例如：数组为int[] arr = {1,2,3};
    //执行方法后的输出结果为：[1, 2, 3]
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
