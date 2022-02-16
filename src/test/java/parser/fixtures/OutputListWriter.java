package parser.fixtures;

import lombok.extern.slf4j.Slf4j;
import parser.output.OutputWriter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
public class OutputListWriter implements OutputWriter {

    public final List<String> outputs;

    public OutputListWriter() {
        outputs = new ArrayList<>();
    }

    @Override
    public void write(String result) {
        log.info(result);
        outputs.add(result);
    }

    public List<String> getOutputs() {
        return outputs;
    }

    public String getResult() {
        if(outputs.size()!=1) {
            throw new IllegalStateException("too many results!");
        }
        return outputs.get(0);
    }
}
