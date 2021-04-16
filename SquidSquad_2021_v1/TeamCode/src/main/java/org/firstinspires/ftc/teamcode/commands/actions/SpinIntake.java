package org.firstinspires.ftc.teamcode.commands.actions;

import org.firstinspires.ftc.teamcode.commands.basecommands.Command;
import org.firstinspires.ftc.teamcode.framework.controllers.Axis;
import org.firstinspires.ftc.teamcode.mechanisms.Intake;
import org.firstinspires.ftc.teamcode.mechanisms.mechanismhandlers.MechanismEngine;

public class SpinIntake extends Command {

    private Intake localIntake = MechanismEngine.getInstance().getMechanism(Intake.class);

    private Axis spinniethmitherien;

    public SpinIntake(Axis Spinnith) {
        this.spinniethmitherien = Spinnith;
    }


    public void initialize() {}

    public void execute(){
        localIntake.spin(spinniethmitherien.get());
    }

    public boolean isFinished() {
        return false;
    }

    public void end() {
        localIntake.spin(0);
    }

}