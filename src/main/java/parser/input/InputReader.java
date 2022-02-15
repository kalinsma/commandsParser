package parser.algorithm.input;

import parser.algorithm.Command;

import java.util.stream.Stream;

public interface InputReader {

    Stream<Command> getCommandsStream();
}
