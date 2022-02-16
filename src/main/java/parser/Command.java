package parser;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.Value;

@Value(staticConstructor = "of")
public class Command {
    @NonNull
    private String name;
    @NonNull
    private String data;
}
