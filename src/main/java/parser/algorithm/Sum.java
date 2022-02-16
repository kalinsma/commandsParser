package parser.algorithm;

import parser.Command;

import java.util.Arrays;

public class Sum extends AbstractAlgorithm {

    public Sum() {
        super("SUM");
    }

    @Override
    protected String getAlgorithmOutput(Command command) {
        if(command.getData().isBlank()) {
            return "0";
        }
        return Arrays.stream(command.getData().split("\\s+"))
                .map(Long::valueOf)
                .reduce(0l, (a,b)->a+b)
                .toString();
    }
}
