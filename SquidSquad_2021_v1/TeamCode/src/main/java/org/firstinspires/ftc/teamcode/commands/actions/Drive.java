package org.firstinspires.ftc.teamcode.commands.actions;

import org.firstinspires.ftc.teamcode.commands.basecommands.Command;
import org.firstinspires.ftc.teamcode.framework.controllers.Axis;
import org.firstinspires.ftc.teamcode.mechanisms.DriveTrain;
import org.firstinspires.ftc.teamcode.mechanisms.mechanismhandlers.MechanismEngine;

public class Drive extends Command {
    private Axis forwardInput;
    private Axis strafeInput;
    private Axis rotateInput;

    private DriveTrain localDriveTrain = MechanismEngine.getInstance().getMechanism(DriveTrain.class);

    public Drive(Axis FowardInput, Axis StrafeInput, Axis RotateInput) {
        this.forwardInput = FowardInput;
        this.strafeInput = StrafeInput;
        this.rotateInput = RotateInput;
    }

    public void initialize() {

    }

    public void execute() {
        localDriveTrain.move(forwardInput.get(), strafeInput.get(), rotateInput.get());
    }

    public boolean isFinished() {
        return false;
    }

    public void end() {
        localDriveTrain.move(0,0,0);
    }

}
