package parser.algorithm;

import org.junit.jupiter.api.Test;
import parser.Command;
import parser.fixtures.OutputListWriter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class SumTest {
    private Sum sum = new Sum();

    @Test
    public void shouldReturnSum() {
        //given
        Command command = Command.of("SUM", "1 2 3");
        OutputListWriter outputWriter = new OutputListWriter();

        //when
        sum.process(command, outputWriter);
        //then
        assertThat(outputWriter.getResult()).isEqualTo("6");
    }

    @Test
    public void shouldReturnZero_whenEmptyInput() {
        //given
        Command command = Command.of("SUM", "");
        OutputListWriter outputWriter = new OutputListWriter();

        //when
        sum.process(command, outputWriter);
        //then
        assertThat(outputWriter.getResult()).isEqualTo("0");
    }

}