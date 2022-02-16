package parser.algorithm;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import parser.Command;
import parser.fixtures.OutputListWriter;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class CCTest {

    private final CC cc = new CC();

    @Test
    public void shouldReturnCamelCaseString() {
        //given
        Command command = Command.of("CC","abc def ghi");
        OutputListWriter outputWriter = new OutputListWriter();
        //when
        cc.process(command, outputWriter);
        //then
        log.debug(outputWriter.getResult());
        assertThat(outputWriter.getResult()).isEqualTo("abcDefGhi");
    }

    @Test
    public void shouldReturnCamelCaseString_whenUpperLettersAreGiven() {
        //given
        Command command = Command.of("CC","abc dEf gHi");
        OutputListWriter outputWriter = new OutputListWriter();

        //when
        cc.process(command, outputWriter);
        //then
        log.debug(outputWriter.getResult());
        assertThat(outputWriter.getResult()).isEqualTo("abcDefGhi");
    }


    @Test
    public void shouldReturnCamelCaseString_whenManyWhiteCharsAreGiven() {
        //given
        Command command = Command.of("CC","     abc       dEf    ghi");
        OutputListWriter outputWriter = new OutputListWriter();

        //when
        cc.process(command, outputWriter);
        //then
        log.debug(outputWriter.getResult());
        assertThat(outputWriter.getResult()).isEqualTo("abcDefGhi");
    }

    @Test
    public void shouldReturnEmptyString_whenEmptyStringIsGiven() {
        //given
        Command command = Command.of("CC","");
        OutputListWriter outputWriter = new OutputListWriter();

        //when
        cc.process(command, outputWriter);
        //then
        log.debug(outputWriter.getResult());
        assertThat(outputWriter.getResult()).isEqualTo("");
    }



}