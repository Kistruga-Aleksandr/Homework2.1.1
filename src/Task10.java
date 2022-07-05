public class Task10 {
    public static void changePerson(Person person) {
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }
    public static void main(String[] args) {
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);

    }
}// В том задании Имя: Ilya, Фамилия: Lagutenko так как создается копия ссылки но дает доступ к сомому обьекту.

