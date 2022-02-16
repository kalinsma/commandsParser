package parser;

import lombok.Builder;
import lombok.NonNull;
import lombok.Singular;
import lombok.extern.slf4j.Slf4j;
import parser.algorithm.Algorithm;
import parser.input.InputReader;
import parser.output.OutputWriter;

import java.util.List;

@Builder
@Slf4j
public class CommandsProcessor {
    @Singular
    @NonNull
    private final List<Algorithm> algorithms;
    @NonNull
    private final OutputWriter output;
    @NonNull
    private final InputReader input;

    public void process() {

        input.getCommandsStream()
                .forEach(
                        command -> {
                            algorithms.stream()
                                    .forEach(a -> a.process(command, output));
                        }
                );
    }


}
