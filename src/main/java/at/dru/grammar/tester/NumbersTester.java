package at.dru.grammar.tester;

import at.dru.grammar.gen.numbers.NumbersLexer;
import at.dru.grammar.gen.numbers.NumbersParser;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumbersTester {

    private static final Logger logger = LoggerFactory.getLogger(NumbersTester.class);

    public static void main(String[] args) {
        new NumbersTester();
    }

    public NumbersTester() {
        testGrammar("");
        testGrammar("abc");
        testGrammar("577");
        testGrammar("577a");
        testGrammar("577.44");
        testGrammar("577.44.444");
    }

    private void testGrammar(String input) {
        logger.info("Testing input {}", input);
        logger.info("\tdecimal -> {}", parseDecimal(input));
        logger.info("\tinteger -> {}", parseInteger(input));
    }

    private boolean parseDecimal(String input) {
        NumbersLexer numbersLexer = new NumbersLexer(CharStreams.fromString(input));
        numbersLexer.removeErrorListeners();
        NumbersParser numbersParser = new NumbersParser(new CommonTokenStream(numbersLexer));
        numbersParser.removeErrorListeners();
        numbersParser.setErrorHandler(new BailErrorStrategy());
        try {
            return numbersParser.decimal().getText().equals(input);
        } catch (ParseCancellationException e) {
            return false;
        }
    }

    private boolean parseInteger(String input) {
        NumbersLexer numbersLexer = new NumbersLexer(CharStreams.fromString(input));
        numbersLexer.removeErrorListeners();
        NumbersParser numbersParser = new NumbersParser(new CommonTokenStream(numbersLexer));
        numbersParser.removeErrorListeners();
        numbersParser.setErrorHandler(new BailErrorStrategy());
        try {
            return numbersParser.integer().getText().equals(input);
        } catch (ParseCancellationException e) {
            return false;
        }
    }

}
