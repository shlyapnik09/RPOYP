package lexer;
import java.util.List;
public interface ILexer {
    List<IToken> tokenize(String input);
}
