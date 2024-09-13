import java.util.Objects;

public class Person {
    protected String name;
    protected int age;
    protected String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }

    public void work() {
        System.out.println("Person is working");
    }
    @Override
public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", gender='" + gender + '\'' +
            '}';
}

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return age == person.age && Objects.equals(name, person.name) && Objects.equals(gender, person.gender);
}

@Override
public int hashCode() {
    return Objects.hash(name, age, gender);
}
}