package parser.algorithm;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import parser.Command;
import parser.fixtures.OutputListWriter;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class OrderTest {

    private Order order = new Order();

    @Test
    public void shouldReturnOrderedStrings() {
        //given
        Command command = Command.of("ORDER", "bd cb ac");
        OutputListWriter outputWriter = new OutputListWriter();

        //when
        order.process(command, outputWriter);
        //then
        log.debug(outputWriter.getResult());
        assertThat(outputWriter.getResult()).isEqualTo("ac bd cb");
    }

    @Test
    public void shouldReturnEmptyOutput_whenEmptyInputIsGiven() {
        //given
        Command command = Command.of("ORDER", "");
        OutputListWriter outputWriter = new OutputListWriter();

        //when
        order.process(command, outputWriter);
        //then
        log.debug(outputWriter.getResult());
        assertThat(outputWriter.getResult()).isEqualTo("");
    }

}