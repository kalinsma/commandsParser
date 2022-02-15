package parser.algorithm.strategy;

import parser.algorithm.Command;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Reverse implements CommandProcessorStrategy {
    @Override
    public String getCommandName() {
        return "REVERSE";
    }

    @Override
    public String process(Command command) {
        return Arrays.stream(command.getData().split("\\s+"))
                .map(StringBuffer::new)
                .map(StringBuffer::reverse)
                .map(StringBuffer::toString)
                .collect(Collectors.joining(" "));
    }
}
