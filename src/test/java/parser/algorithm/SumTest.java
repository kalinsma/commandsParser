package parser.algorithm.strategy;

import org.junit.jupiter.api.Test;
import parser.algorithm.Command;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    private Sum sum = new Sum();

    @Test
    public void shouldReturnSum() {
        //given
        Command command = Command.of("SUM", "1 2 3");
        //when
        String output = sum.process(command);
        //then
        assertThat(output).isEqualTo("6");
    }

    @Test
    public void shouldReturnZero_whenEmptyInput() {
        //given
        Command command = Command.of("SUM", "");
        //when
        String output = sum.process(command);
        //then
        assertThat(output).isEqualTo("0");
    }

}