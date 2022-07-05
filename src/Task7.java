import java.util.Arrays;

public class Task7 {
    public static void changeValue(Integer[] value) {
        value = new Integer[2];
        value[0] = 1;
        value[1] = 2;
    }

    public static void main(String[] args) {
        Integer[] value = new Integer[2];
        value[0] = 3;
        value[1] = 4;
        changeValue(value);
        System.out.println(Arrays.toString(value));

    }
}// В том задании value[0] = 3 и value[1] = 4; так как создается копия ссылки и она по умалчанию сылается на тот же обьект с которого была сделана копия.
