package fr.example;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {
    private StringCalculator stringCalculator = new StringCalculator();
    @Test
    public void add_empty_string() throws Exception {
        assertThat(stringCalculator.Add("")).isEqualTo(0);
    }

    @Test
    public void add_with_one_number() throws Exception {
        assertThat(stringCalculator.Add("1")).isEqualTo(1);
    }

    @Test
    public void add_with_two_numbers() throws Exception {
        assertThat(stringCalculator.Add("1,2")).isEqualTo(3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void add_with_three_numbers() throws Exception {
        stringCalculator.Add("1,2,3");
    }


}
