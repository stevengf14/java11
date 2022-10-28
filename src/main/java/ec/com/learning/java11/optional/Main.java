package ec.com.learning.java11.optional;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Main {

    public static void main(String[] args) {
        Demo demo = new Demo();
        Person person = new Person(1, "Steven");
        Person person2 = new Person();
        Person person3 = null;

        System.out.println("*******Person 1*******");
        demo.isEmpty(person);
        demo.isPresent(person);

        System.out.println("*******Person 2*******");
        demo.isEmpty(person2);
        demo.isPresent(person2);

        System.out.println("*******Person 3*******");
        demo.isEmpty(person3);
        demo.isPresent(person3);
    }

}
