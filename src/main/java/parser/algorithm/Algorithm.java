package parser.algorithm;

import parser.Command;
import parser.output.OutputWriter;

import java.util.Optional;

public interface Algorithm {
    Optional<String> process(Command command, OutputWriter outputWriter);
}
