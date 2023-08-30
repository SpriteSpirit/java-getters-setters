public class Person_ {
    private String name;
    private int age;

    public Person_(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < this.age) {
            throw new IllegalArgumentException("The new age is less than the current one");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }
        this.age = age;
    }

    // instead of a setter, a new method was created to increase the age
    public void increaseAge(int increment) {

        if (increment < 0) {
            throw new IllegalArgumentException("Increment cannot be negative!");
        }
        this.age = age + increment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("Name: %s%nAge: %d%n", this.name, this.age);
    }
}
