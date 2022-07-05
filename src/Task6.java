public class Task6 {

    public static void changeValue(Integer value) {
      value = 22;

   }
    public static void main(String[] args) {
        Integer value = 33;
        changeValue(value);
        System.out.println(value);
    }
}// В этом задании Integer value = 33 так как создается копия ссылки и она по умалчанию сылается на тот же обьект с которого была сделана копия.
