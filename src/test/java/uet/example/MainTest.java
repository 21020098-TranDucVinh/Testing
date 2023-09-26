package uet.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/testcase.csv")
    public void test1(String s1, int s2, String expected) {
        assertEquals(expected, Main.decide(s1, s2));
    }
}
