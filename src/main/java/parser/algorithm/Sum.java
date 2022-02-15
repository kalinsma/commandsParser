package parser.algorithm.strategy;

import parser.algorithm.Command;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Sum implements CommandProcessorStrategy{
    @Override
    public String getCommandName() {
        return "SUM";
    }

    @Override
    public String process(Command command) {
        if(command.getData().isBlank()) {
            return "0";
        }
        return Arrays.stream(command.getData().split("\\s+"))
                .map(Long::valueOf)
                .reduce(0l, (a,b)->a+b)
                .toString();
    }
}
