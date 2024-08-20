package MiniJava.scanner.token;

import MiniJava.scanner.type.Type;

public class KeywordToken extends AbstractToken {

    public KeywordToken(Type type, String value) {
        super(type, value);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof KeywordToken) {
            KeywordToken temp = (KeywordToken) o;
            return this.value.equals(temp.value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = type.hashCode();
        result = prime * result + (value == null ? 0 : value.hashCode());
        return result;
    }
}


