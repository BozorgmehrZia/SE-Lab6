package MiniJava.scanner.token;

import MiniJava.scanner.type.Type;

public class GeneralToken extends AbstractToken {

    public GeneralToken(Type type, String value) {
        super(type, value);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof GeneralToken) {
            GeneralToken temp = (GeneralToken) o;
            return this.type == temp.type;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }
}
