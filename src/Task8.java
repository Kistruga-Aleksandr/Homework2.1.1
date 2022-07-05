import java.util.Arrays;

public class Task8 {
    public static void changeValue(Integer[] value) {
        value[0] = 99;
    }
    public static void main(String[] args) {
        Integer[] value = new Integer[2];
        value[0] = 3;
        value[1] = 4;
        changeValue(value);
        System.out.println(Arrays.toString(value));
    }
}// В том задании value[0] = 99 и value[1] = 4; так как создается копия ссылки но дает доступ к сомому обьекту.
