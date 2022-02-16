package parser.output;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConsoleOutputWriter implements OutputWriter {
    @Override
    public void write(String result) {
        log.info(result);
    }
}
