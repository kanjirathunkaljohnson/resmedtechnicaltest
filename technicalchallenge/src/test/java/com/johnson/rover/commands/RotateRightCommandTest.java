package com.johnson.rover.commands;

import com.johnson.rover.MarsRover;
import com.johnson.rover.commands.RotateRightCommand;
import com.johnson.rover.universe.Coordinates;
import com.johnson.rover.universe.Direction;
import com.johnson.rover.universe.Plateau;
import org.junit.Assert;
import org.junit.Test;

public class RotateRightCommandTest {

    @Test
    public void testThatRotateRightCommandRotatesTheNavigableObjectRight() {
        
        RotateRightCommand command = new RotateRightCommand();
        Plateau plateau = new Plateau(5,5);
        Coordinates startingPosition = new Coordinates(1,2);
        MarsRover rover = new MarsRover(plateau, Direction.N, startingPosition);

        
        command.execute(rover);

        
        Assert.assertEquals("1 2 E", rover.currentLocation());
    }

}
