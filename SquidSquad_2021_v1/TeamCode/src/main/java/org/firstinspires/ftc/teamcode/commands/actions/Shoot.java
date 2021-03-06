package org.firstinspires.ftc.teamcode.commands.actions;

import org.firstinspires.ftc.teamcode.commands.basecommands.Command;
import org.firstinspires.ftc.teamcode.mechanisms.Shooter;
import org.firstinspires.ftc.teamcode.mechanisms.mechanismhandlers.MechanismEngine;

import static org.firstinspires.ftc.teamcode.framework.Constants.*;

public class Shoot extends Command {

    private Shooter localShooter = MechanismEngine.getInstance().getMechanism(Shooter.class);

    
    public void initialize() {}

    public void execute(){
        localShooter.spin(SHOODER_PWEASE_SPIN);
    }

    public boolean isFinished() {
        return false;
    }

    public void end() {
      localShooter.spin(0);
    }

}