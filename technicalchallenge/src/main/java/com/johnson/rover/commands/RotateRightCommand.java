package com.johnson.rover.commands;

import com.johnson.rover.MarsRover;

public class RotateRightCommand implements ICommand {

    @Override
    public void execute(final MarsRover rover) {
        rover.turnRight();
    }

}
