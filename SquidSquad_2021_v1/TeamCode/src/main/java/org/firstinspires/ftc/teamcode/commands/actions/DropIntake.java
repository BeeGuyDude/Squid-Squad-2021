package org.firstinspires.ftc.teamcode.commands.actions;

import org.firstinspires.ftc.teamcode.commands.basecommands.Command;
import org.firstinspires.ftc.teamcode.mechanisms.Intake;
import org.firstinspires.ftc.teamcode.mechanisms.mechanismhandlers.MechanismEngine;

public class DropIntake extends Command {
    private Intake localIntake = MechanismEngine.getInstance().getMechanism(Intake.class);

    public void initialize() {}

    public void execute(){
        localIntake.drop();
    }

    public boolean isFinished() {
        return true;
    }

    public void end() {}
}
