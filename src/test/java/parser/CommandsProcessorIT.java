package parser;

import org.junit.jupiter.api.Test;
import parser.algorithm.CC;
import parser.algorithm.Order;
import parser.algorithm.Reverse;
import parser.algorithm.Sum;
import parser.fixtures.OutputListWriter;
import parser.input.FileInputReader;

import static org.assertj.core.api.Assertions.assertThat;

class CommandsProcessorIT {

    @Test
    public void shouldProcessFile() {
        //given
        OutputListWriter writer = new OutputListWriter();

        CommandsProcessor processor = CommandsProcessor.builder()
                .input(FileInputReader.of("src/test/resources/test1.input"))
                .output(writer)
                .algorithm(new CC())
                .algorithm(new Order())
                .algorithm(new Sum())
                .algorithm(new Reverse())
                .build();
        //when

        processor.process();
        //then

        assertThat(writer.getOutputs()).hasSize(4);
        assertThat(writer.getOutputs().get(0)).isEqualTo("47");
        assertThat(writer.getOutputs().get(1)).isEqualTo("adsawertGhrtfyKhjhk");
        assertThat(writer.getOutputs().get(2)).isEqualTo("gteeggfdsa");
        assertThat(writer.getOutputs().get(3)).isEqualTo("assdaad jjghd kkllikji");



    }

}