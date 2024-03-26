package lexer;

public interface IToken {
    TokenType getType();
    String getValue();
}
