package org.firstinspires.ftc.teamcode.commands.actions;

import org.firstinspires.ftc.teamcode.commands.basecommands.Command;
import org.firstinspires.ftc.teamcode.mechanisms.Storage;
import org.firstinspires.ftc.teamcode.mechanisms.mechanismhandlers.MechanismEngine;

import static org.firstinspires.ftc.teamcode.framework.Constants.*;

public class SpinStorage extends Command {

    private Storage localStorage = MechanismEngine.getInstance().getMechanism(Storage.class);


    public void initialize() {}

    public void execute(){
        localStorage.spin(STORAGE_WHEEL_SPEED);
    }

    public boolean isFinished() {
        return false;
    }

    public void end() {
        localStorage.spin(0);
    }

}