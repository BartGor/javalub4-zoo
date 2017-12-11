package pl.sdacademy.animals.bear;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.Condition;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;

public class AssertionsExample {

    Condition<Integer> nonNegative = new Condition<Integer>() {
        @Override
        public boolean matches(Integer value) {
            return value >= 0;
        }
    };

    @Test
    public void exampleListTest() {
        List<Integer> numbers = Arrays.asList(-1, 0, 2);
        numbers = numbers.stream().map(n -> n + 1).collect(Collectors.toList());
        assertThat(numbers)
                .contains(0, 1, 3)
                .are(nonNegative)
                .isSubsetOf(-1, 0, 1, 3, 4);

    }

    @Test
    public void exampleBearTest() {
        Bear bear = new BlackBear(1);
        assertThat(bear).hasNoNullFieldsOrProperties();
    }


}
