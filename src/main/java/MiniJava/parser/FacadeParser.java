package MiniJava.parser;

import java.util.Scanner;

public class FacadeParser {
    private Parser parser;

    public FacadeParser() {
        this.parser = new Parser();
    }

    public void startParse(Scanner scanner) {
        parser.startParse(scanner);
    }
}
