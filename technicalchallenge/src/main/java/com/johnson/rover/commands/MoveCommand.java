package com.johnson.rover.commands;

import com.johnson.rover.MarsRover;

public class MoveCommand implements ICommand {

    @Override
    public void execute(final MarsRover rover) {
        rover.move();
    }

}
