package parser.algorithm;

import parser.Command;
import parser.output.OutputWriter;

import java.util.Optional;

abstract class AbstractAlgorithm implements Algorithm {
    private final String commandName;

    protected AbstractAlgorithm(String commandName) {
        this.commandName = commandName;
    }

    protected abstract String getAlgorithmOutput(Command command);
    @Override
    public final Optional<String> process(Command command, OutputWriter writer) {
        if(command.getName().equals(commandName)) {
            String output = getAlgorithmOutput(command);
            writer.write(output);
            return Optional.of(output);
        }

        return Optional.empty();
    }
}
