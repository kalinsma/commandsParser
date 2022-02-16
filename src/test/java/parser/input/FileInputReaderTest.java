package parser.input;

import org.junit.jupiter.api.Test;
import parser.Command;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class FileInputReaderTest {
    
    @Test
    public void shouldReadFile() {
        //given
        FileInputReader reader = FileInputReader.of("src/test/resources/test1.input");
        //when
        List<Command> commands = reader.getCommandsStream()
                .collect(Collectors.toList());
        //then
        assertThat(commands).hasSize(4);
        assertThat(commands.get(0)).isEqualTo(Command.of("SUM","3 12 21 11"));
        assertThat(commands.get(3)).isEqualTo(Command.of("ORDER","jjghd assdaad kkllikji"));

    }
    

}