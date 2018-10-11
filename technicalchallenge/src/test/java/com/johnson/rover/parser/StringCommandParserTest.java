package com.johnson.rover.parser;

import com.johnson.rover.commands.ICommand;
import com.johnson.rover.commands.MoveCommand;
import com.johnson.rover.commands.RotateLeftCommand;
import com.johnson.rover.commands.RotateRightCommand;
import com.johnson.rover.parser.StringCommandParser;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class StringCommandParserTest {

    @Test
    public void stringLMapsToRotateLeftCommand() {
       
        StringCommandParser parser = new StringCommandParser("L");

        
        List<ICommand> commands = parser.toCommands();

        
        Assert.assertTrue(commands.get(0) instanceof RotateLeftCommand);
        Assert.assertEquals(1, commands.size());
    }

    @Test
    public void stringRMapsToRotateRightCommand() {
        
        StringCommandParser parser = new StringCommandParser("R");

        
        List<ICommand> commands = parser.toCommands();

        
        Assert.assertTrue(commands.get(0) instanceof RotateRightCommand);
    }

    @Test
    public void stringMMapsToMoveCommand() {
        
        StringCommandParser parser = new StringCommandParser("M");

        
        List<ICommand> commands = parser.toCommands();

        
        Assert.assertTrue(commands.get(0) instanceof MoveCommand);
    }


    @Test
    public void emptyStringResultsInEmptyCommandList() {
        
        StringCommandParser parser = new StringCommandParser("");

        
        List<ICommand> commands = parser.toCommands();

        
        Assert.assertEquals(0, commands.size());
    }


    @Test
    public void nullStringResultsInEmptyCommandList() {
        
        StringCommandParser parser = new StringCommandParser(null);

       
        List<ICommand> commands = parser.toCommands();

        
        Assert.assertEquals(0, commands.size());
    }

    @Test
    public void stringToCommandMappingIsCaseInsensitive() {
        
        StringCommandParser parser = new StringCommandParser("mM");

        
        List<ICommand> commands = parser.toCommands();

        
        Assert.assertTrue(commands.get(0) instanceof MoveCommand);
        Assert.assertTrue(commands.get(1) instanceof MoveCommand);
    }

    @Test
    public void multiCommandStringIsMappedToCommandsInSameOrder() {
        
        StringCommandParser parser = new StringCommandParser("MRL");

        
        List<ICommand> commands = parser.toCommands();

        
        Assert.assertTrue(commands.get(0) instanceof MoveCommand);
        Assert.assertTrue(commands.get(1) instanceof RotateRightCommand);
        Assert.assertTrue(commands.get(2) instanceof RotateLeftCommand);
    }

}
