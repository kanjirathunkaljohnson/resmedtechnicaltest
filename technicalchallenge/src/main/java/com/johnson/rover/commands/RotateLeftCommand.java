package com.johnson.rover.commands;

import com.johnson.rover.MarsRover;

public class RotateLeftCommand implements ICommand {

    @Override
    public void execute(final MarsRover rover) {
        rover.turnLeft();
    }

}
