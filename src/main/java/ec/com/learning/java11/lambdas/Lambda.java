package ec.com.learning.java11.lambdas;

import java.util.stream.IntStream;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Lambda {

    public void test(String selection) {
        // Even // Odd
        switch (selection) {
            case "EVEN":
                IntStream.of(1, 2, 3, 4, 5, 6, 7).filter((var i) -> i % 2 == 0).forEach(System.out::println);
                break;

            case "ODD":
                IntStream.of(1, 2, 3, 4, 5, 6, 7).filter((var i) -> i % 2 != 0).forEach(System.out::println);
        }
    }

    public void add() {
        IOperation operation = (var x, var y) -> (x + y);
        double result = operation.calculate(2, 2.0);
        System.out.println(result);
    }

}
