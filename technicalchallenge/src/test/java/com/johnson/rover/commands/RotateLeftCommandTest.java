package com.johnson.rover.commands;

import com.johnson.rover.MarsRover;
import com.johnson.rover.commands.RotateLeftCommand;
import com.johnson.rover.universe.Coordinates;
import com.johnson.rover.universe.Direction;
import com.johnson.rover.universe.Plateau;
import org.junit.Assert;
import org.junit.Test;

public class RotateLeftCommandTest {

    @Test
    public void testThatRotateLeftCommandRotatesTheNavigableObjectLeft() {
        
        RotateLeftCommand command = new RotateLeftCommand();
        Plateau plateau = new Plateau(5,5);
        Coordinates startingPosition = new Coordinates(1,2);
        MarsRover rover = new MarsRover(plateau, Direction.N, startingPosition);

        
        command.execute(rover);

        
        Assert.assertEquals("1 2 W", rover.currentLocation());
    }

}
