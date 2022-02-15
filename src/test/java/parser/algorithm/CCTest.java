package parser.algorithm.strategy;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import parser.algorithm.Command;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class CCTest {

    private final CC cc = new CC();

    @Test
    public void shouldReturnCamelCaseString() {
        //given
        Command command = Command.of("CC","abc def ghi");
        //when
        String output = cc.process(command);
        //then
        log.debug(output);
        assertThat(output).isEqualTo("abcDefGhi");
    }

    @Test
    public void shouldReturnCamelCaseString_whenUpperLettersAreGiven() {
        //given
        Command command = Command.of("CC","abc dEf gHi");
        //when
        String output = cc.process(command);
        //then
        log.debug(output);
        assertThat(output).isEqualTo("abcDefGhi");
    }


    @Test
    public void shouldReturnCamelCaseString_whenManyWhiteCharsAreGiven() {
        //given
        Command command = Command.of("CC","     abc       dEf    ghi");
        //when
        String output = cc.process(command);
        //then
        log.debug(output);
        assertThat(output).isEqualTo("abcDefGhi");
    }

    @Test
    public void shouldReturnEmptyString_whenEmptyStringIsGiven() {
        //given
        Command command = Command.of("CC","");
        //when
        String output = cc.process(command);
        //then
        log.debug(output);
        assertThat(output).isEqualTo("");
    }



}