package MiniJava.scanner.token;
import MiniJava.scanner.type.Type;

public class FacadeToken {

    public Token createToken(Type type, String value) {
        return new Token(type, value);
    }

    public Type getTypeFromString(String value) {
        return Token.getTyepFormString(value);
    }

    public boolean equals(Token token1, Token token2) {
        return token1.equals(token2);
    }

    public int hashCode(Token token) {
        return token.hashCode();
    }
}