/**
 * @author Zejun_Huang
 * @date 2020/11/28 - 20:19
 */
public class Number_Test {
    public static void main(String[] args) {

        /******Byte*****/
        byte by1 = 2;
        Byte by2 = new Byte(by1);
        byte by3 = by2.byteValue();      // Byte封装类型转化为基本类型
        byte by4 = by2; //Byte自动拆箱
        Byte by5 = by1;//Byte,自动装箱
        /****short***/
        short s1 = 3;
        Short s2 = new Short(s1);
        short s3 = s2.shortValue();   //Short封装类型转化为基本类型
        short s4 = s2;   //short自动拆箱
        Short s5 = s1;   //short自动装箱
        /*****float***/
        float f1 = 3;
        Float f2 = new Float(f1);
        float f3 = f2.floatValue();   //Float封装类型转化为基本类型
        float f4 = f2;   //float 自动拆箱
        Float f5 = f1;   //float 自动装箱
        /****double****/
        double d1 = 5;
        Double d2 = new Double(d1);
        double d3 = d2.doubleValue();  //Double封装类型转为基本类型
        double d4 = d2;  //double自动拆箱
        Double d5 = d1;  //double自动装箱

        int a = 5;
//        Byte by6 = a;   //int不能自动装箱byte
//        Integer b = by1;  //byte也不能自动装箱int
        System.out.println(Byte.MAX_VALUE);
//        System.out.println(byte.MAX_VALUE);   byte不能像Byte一样打出最大值

    }
}
