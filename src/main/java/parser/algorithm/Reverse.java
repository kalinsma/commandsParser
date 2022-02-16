package parser.algorithm;

import parser.Command;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Reverse extends AbstractAlgorithm {

    public Reverse() {
        super("REVERSE");
    }

    @Override
    protected String getAlgorithmOutput(Command command) {
        return Arrays.stream(command.getData().split("\\s+"))
                .map(StringBuffer::new)
                .map(StringBuffer::reverse)
                .map(StringBuffer::toString)
                .collect(Collectors.joining(" "));
    }
}
