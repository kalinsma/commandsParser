package parser.algorithm;

import lombok.Builder;
import lombok.NonNull;
import lombok.Singular;
import lombok.extern.slf4j.Slf4j;
import parser.algorithm.input.InputReader;
import parser.algorithm.output.OutputWriter;
import parser.algorithm.strategy.CommandProcessorStrategy;

import java.util.List;

@Builder
@Slf4j
public class CommandsProcessor {
    @Singular
    @NonNull
    private final List<CommandProcessorStrategy> commandsProcessors;
    @NonNull
    private final OutputWriter output;
    @NonNull
    private final InputReader input;

    public void process() {

        input.getCommandsStream()
                .forEach();

    }

}
