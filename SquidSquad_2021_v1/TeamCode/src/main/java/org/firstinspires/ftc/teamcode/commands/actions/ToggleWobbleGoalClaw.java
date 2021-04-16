package org.firstinspires.ftc.teamcode.commands.actions;

import org.firstinspires.ftc.teamcode.commands.basecommands.Command;
import org.firstinspires.ftc.teamcode.mechanisms.WobbleGoalClaw;
import org.firstinspires.ftc.teamcode.mechanisms.mechanismhandlers.MechanismEngine;

public class ToggleWobbleGoalClaw extends Command {

    private WobbleGoalClaw localClaw = MechanismEngine.getInstance().getMechanism(WobbleGoalClaw.class);

    public void initialize() {}

    public void execute(){
        localClaw.togglePosition();
    }

    public boolean isFinished() {
      return true;
    }

    public void end() {}

}