package MiniJava.scanner.token;
import MiniJava.scanner.type.Type;

public abstract class AbstractToken {
    protected Type type;
    protected String value;

    public AbstractToken(Type type, String value) {
        this.type = type;
        this.value = value;
    }

    public abstract boolean equals(Object o);
    public abstract int hashCode();

    @Override
    public String toString() {
        return String.format("(%s,%s)", type.name(), value);
    }
}
