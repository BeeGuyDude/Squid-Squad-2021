package org.firstinspires.ftc.teamcode.commands.actions;

import org.firstinspires.ftc.teamcode.commands.basecommands.Command;
import org.firstinspires.ftc.teamcode.mechanisms.Shooter;
import org.firstinspires.ftc.teamcode.framework.controllers.Axis;

import org.firstinspires.ftc.teamcode.mechanisms.mechanismhandlers.MechanismEngine;

import static org.firstinspires.ftc.teamcode.framework.Constants.*;

public class AxisShoot extends Command {

    private Shooter localShooter = MechanismEngine.getInstance().getMechanism(Shooter.class);

    private Axis input_axis;

    public AxisShoot(Axis trigger){
        this.input_axis = trigger;
    }

    public void initialize() {}

    public void execute(){
        localShooter.spin(input_axis.get());
    }

    public boolean isFinished() {
        return false;
    }

    public void end() {
        localShooter.spin(0);
    }

}