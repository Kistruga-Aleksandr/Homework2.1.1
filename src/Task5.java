public class Task5 {
        public static void changeValue(int value) { // преедает значение
        value = 22;
   }
    public static void main(String[] args) {
        int value = 33;
        changeValue(value);
        System.out.println(value);
    }
}// В этом задании int value = 33 так как копируется само значение потому что int это примитив.
