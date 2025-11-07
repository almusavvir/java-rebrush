package foundation;

import org.w3c.dom.ls.LSOutput;


public class Types {
    public static int castInt(float f) {
        return (int)f;
    }
    public static void main(String[] args) {
        byte b = (byte)129;
        float f = 12.456775F;
        int i = castInt(f);
        System.out.println(b + " " + f + " " + i);
    }
}
