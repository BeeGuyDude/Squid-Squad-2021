package org.firstinspires.ftc.teamcode.opmodes.opmodesteleop;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.commands.actions.AxisShoot;
import org.firstinspires.ftc.teamcode.commands.actions.Drive;
import org.firstinspires.ftc.teamcode.commands.actions.DropIntake;
import org.firstinspires.ftc.teamcode.commands.actions.Shoot;
import org.firstinspires.ftc.teamcode.commands.actions.SpinIntake;
import org.firstinspires.ftc.teamcode.commands.actions.SpinStorage;
import org.firstinspires.ftc.teamcode.commands.actions.ToggleWobbleGoalClaw;

@TeleOp
public class TestTeleop extends TeleOpModeWrapper {

    @Override
    public void teleOpInit() {
        telemetry.addData("Test", "Success");
         scheduler.add(new DropIntake());
    }

    @Override
    public void teleOpLoop() {
        scheduler.add(new Drive(DriverLeftYAxis, DriverLeftXAxis, DriverRightXAxis));
        scheduler.add(new SpinIntake(DriverRightTrigger));
        //scheduler.add(new AxisShoot(DriverLeftTrigger));
        DriverAButton.toggleWhenPressed(new Shoot());
        //DriverBButton.whileHeld(new SpinStorage());
    }
}

