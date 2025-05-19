package Builder_Design_Pattern;

public class Person {

    private String name;
    private String email;
    private int age;


    public Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;

    }


    public static class Builder{

        private String name;
        private String email;
        private int age;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}
