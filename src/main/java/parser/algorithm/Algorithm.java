package parser.algorithm;

import parser.Command;
import parser.output.OutputWriter;

public interface AlgorithmStrategy {
    String process(Command command, OutputWriter outputWriter);
}
