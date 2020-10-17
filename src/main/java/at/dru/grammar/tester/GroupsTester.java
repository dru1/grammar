package at.dru.grammar.tester;

import at.dru.grammar.GroupsLexer;
import at.dru.grammar.GroupsParser;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GroupsTester {

    private static final Logger logger = LoggerFactory.getLogger(GroupsTester.class);

    public static void main(String[] args) {
        new GroupsTester();
    }

    public GroupsTester() {
        testGrammar("");
        testGrammar("(577 -44 45 +555 45 45 45 45 45 )");
        testGrammar("(10 -34444.33 45 [ 4 TO * ] [4 TO *] [* TO *] [ * TO * ] [ * TO 4 ])");
        testGrammar("()");
        testGrammar("(-10)");
        testGrammar("( -20.4)");
    }

    private void testGrammar(String input) {
        logger.info("Testing input {}", input);
        logger.info("\tdecimal group -> {}", parseDecimalGroup(input));
        logger.info("\tinteger group -> {}", parseIntegerGroup(input));
    }

    private boolean parseDecimalGroup(String input) {
        GroupsLexer groupsLexer = new GroupsLexer(CharStreams.fromString(input));
        groupsLexer.removeErrorListeners();
        GroupsParser groupsParser = new GroupsParser(new CommonTokenStream(groupsLexer));
        groupsParser.removeErrorListeners();
        groupsParser.setErrorHandler(new BailErrorStrategy());
        try {
            return groupsParser.decimalGroup().getText().equals(input);
        } catch (ParseCancellationException e) {
            return false;
        }
    }

    private boolean parseIntegerGroup(String input) {
        GroupsLexer groupsLexer = new GroupsLexer(CharStreams.fromString(input));
        groupsLexer.removeErrorListeners();
        GroupsParser groupsParser = new GroupsParser(new CommonTokenStream(groupsLexer));
        groupsParser.removeErrorListeners();
        groupsParser.setErrorHandler(new BailErrorStrategy());
        try {
            return groupsParser.integerGroup().getText().equals(input);
        } catch (ParseCancellationException e) {
            return false;
        }
    }

}
