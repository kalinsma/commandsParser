package parser.algorithm.strategy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import parser.algorithm.Command;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
    private Reverse reverse = new Reverse();

    @Test
    public void shouldReturnReversedWords() {
        //given
        Command command = Command.of("REVERSE", "abcd  uu12s");
        //when
        String output = reverse.process(command);
        //then
        assertThat(output).isEqualTo("dcba s21uu");
    }

    @Test
    public void shouldReturnEmptyOutput_whenInputIsEmpty() {
        //given
        Command command = Command.of("REVERSE", "");
        //when
        String output = reverse.process(command);
        //then
        assertThat(output).isEqualTo("");
    }

}