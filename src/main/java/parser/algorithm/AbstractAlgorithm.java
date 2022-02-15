package parser.algorithm;

import parser.Command;
import parser.output.OutputWriter;

abstract class AbstractStrategy implements AlgorithmStrategy {
    private final String commandName;

    protected AbstractStrategy(String commandName) {
        this.commandName = commandName;
    }

    protected abstract String getAlgorithmOutput(Command command);
    @Override
    public final String process(Command command, OutputWriter writer) {
        if(command.getName().equals(commandName)) {
            String output = getAlgorithmOutput(command);
            writer.write(output);
            return output;
        }

        return null;
    }
}
