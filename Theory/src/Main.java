public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person_ sarah = new Person_("Sarah", 30);

        if (personService.isAdult(sarah)) {
            System.out.printf("You are already an adult, you are %d. You can go to a bar.\uD83E\uDD42%n%n", sarah.getAge());
        }
        else {
            System.out.printf("You are underage. You're %d, you can't go to a bar.\uD83D\uDED1%n%n", sarah.getAge());
        }

        System.out.printf("Sarah info:%n%s%n%n", sarah);
        sarah.increaseAge(20);
    }
}