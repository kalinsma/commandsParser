package parser.algorithm.strategy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import parser.algorithm.Command;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class OrderTest {

    private Order order = new Order();

    @Test
    public void shouldReturnOrderedStrings() {
        //given
        Command command = Command.of("ORDER", "bd cb ac");
        //when
        String output = order.process(command);
        //then
        log.debug(output);
        assertThat(output).isEqualTo("ac bd cb");
    }

    @Test
    public void shouldReturnEmptyOutput_whenEmptyInputIsGiven() {
        //given
        Command command = Command.of("ORDER", "");
        //when
        String output = order.process(command);
        //then
        log.debug(output);
        assertThat(output).isEqualTo("");
    }

}