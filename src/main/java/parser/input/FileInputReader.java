package parser.algorithm.input;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import parser.algorithm.Command;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Function;
import java.util.stream.Stream;

@Slf4j
@AllArgsConstructor(staticName = "of")
public class FileInputReader implements InputReader{
    private final String path;


    @Override
    public Stream<Command> getCommandsStream() {
        try {
            return Files.lines(Path.of(path))
                    .sequential()
                    .flatMap(new PairCollater());
        } catch (IOException e) {
            log.error("cannot read from file {}",path, e);
            return Stream.empty();
        }
    }

    private class PairCollater implements Function<String, Stream<Command>> {
        String commandName;

        @Override
        public Stream<Command> apply(String curr) {
            if (commandName == null) {
                commandName = curr;
                return Stream.empty();
            }
            try {
                return Stream.of(Command.of(commandName, curr));
            } finally {
                commandName = null;
            }
        }
    }

}
