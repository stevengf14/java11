package ec.com.learning.java11.optional;

import java.util.Optional;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Demo {

    public void isEmpty(Person person) {
        // Optional<Person> op = Optional.empty();
        Optional<Person> op = Optional.ofNullable(person);
        if (op.isEmpty()) {
            System.out.println("[11] is empty");
        } else {
            System.out.println("[11] is not empty " + op.get());
        }
    }

    public void isPresent(Person person) {
        // Optional<Person> op = Optional.empty();
        // Optional<Person> op = Optional.of(person);
        Optional<Person> op = Optional.ofNullable(person);
        if (!op.isPresent()) {
            System.out.println("[8] is empty");
        } else {
            System.out.println("[8] is not empty " + op.get());
        }
    }
}
