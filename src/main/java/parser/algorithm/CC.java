package parser.algorithm.strategy;

import lombok.NoArgsConstructor;
import parser.algorithm.Command;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class CC implements CommandProcessorStrategy{

    @Override
    public String getCommandName() {
        return "CC";
    }

    @Override
    public String process(Command command) {
        if(Objects.isNull(command.getData())) {
            return "";
        }

        StringBuilder reduce = Arrays.stream(command.getData().split("\\s+"))
                .map(String::toLowerCase)
                .reduce(new StringBuilder(), add(), merge());

        return reduce.toString();
    }

    private BinaryOperator<StringBuilder> merge() {
        return (builder1, builder2) -> builder1.append(builder2);
    }

    private BiFunction<StringBuilder, String, StringBuilder> add() {
        return (builder, chunk) -> {
            if(builder.length()==0) {
                return builder.append(chunk);
            }
            return builder.append(capitalize(chunk));
        };
    }

    //we may use StringUtils capitalize method from apache-commons lang3 lib
    private String capitalize(String input) {
        if(input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}
