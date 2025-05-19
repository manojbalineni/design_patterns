package Builder_Design_Pattern;

public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person.Builder()
                .setAge(23)
                .setEmail("manoj@gmail.com")
                .setName("Manoj Babu")
                .build();
        System.out.println("Person : " + person);
    }
}
