package parser.input;

import parser.Command;

import java.util.stream.Stream;

public interface InputReader {

    Stream<Command> getCommandsStream();
}
