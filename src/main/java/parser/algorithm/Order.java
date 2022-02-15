package parser.algorithm.strategy;

import parser.algorithm.Command;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Order implements CommandProcessorStrategy{
    @Override
    public String getCommandName() {
        return "ORDER";
    }

    @Override
    public String process(Command command) {
       return Arrays.stream(command.getData().split("\\s+"))
                .sorted()
               .collect(Collectors.joining(" "));
    }
}
