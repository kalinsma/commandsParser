package parser.algorithm;

import org.junit.jupiter.api.Test;
import parser.Command;
import parser.fixtures.OutputListWriter;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseTest {
    private Reverse reverse = new Reverse();

    @Test
    public void shouldReturnReversedWords() {
        //given
        Command command = Command.of("REVERSE", "abcd  uu12s");
        OutputListWriter outputWriter = new OutputListWriter();

        //when
        reverse.process(command, outputWriter);
        //then
        assertThat(outputWriter.getResult()).isEqualTo("dcba s21uu");
    }

    @Test
    public void shouldReturnEmptyOutput_whenInputIsEmpty() {
        //given
        Command command = Command.of("REVERSE", "");
        OutputListWriter outputWriter = new OutputListWriter();

        //when
        reverse.process(command, outputWriter);
        //then
        assertThat(outputWriter.getResult()).isEqualTo("");
    }

}