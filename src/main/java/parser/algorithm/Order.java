package parser.algorithm;

import parser.Command;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Order extends AbstractAlgorithm {
    public Order() {
        super("ORDER");
    }

    @Override
    protected String getAlgorithmOutput(Command command) {
       return Arrays.stream(command.getData().split("\\s+"))
                .sorted()
               .collect(Collectors.joining(" "));
    }
}
