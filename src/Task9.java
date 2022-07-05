public class Task9 {
    public static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");

    }
    public static void main(String[] args) {
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);

    }
}// В том задании Имя: Lyapis, Фамилия: Trubetskoy так как создается копия ссылки и она по умалчанию сылается на тот же обьект с которого была сделана копия.
