public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Instructor(35, "Engin", "Demirog"),
                new Student(32, "Elkhan", "Ismayilov")};

        PersonManager manager = new PersonManager();
        manager.add(new StudentManager());
    }
}
