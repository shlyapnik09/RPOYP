package lexer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class LexerTest {
    public static void main(String[] args) {
        ILexer lexer = new LexerImplementation();
        String inputText = readInputFromFile("input.txt");
        List<IToken> tokens = lexer.tokenize(inputText);
        for(IToken token : tokens){
            System.out.println(token.getType() + ", " + token.getValue());
        }
    }

    private static String readInputFromFile(String filename) {
        StringBuilder contentBuilder = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }
}