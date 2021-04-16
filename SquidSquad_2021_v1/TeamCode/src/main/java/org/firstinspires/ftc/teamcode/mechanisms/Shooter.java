package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.HardwareMap;
import static org.firstinspires.ftc.teamcode.framework.Constants.*;

import org.firstinspires.ftc.teamcode.mechanisms.devicehandlers.DCMotorHandler;
import org.firstinspires.ftc.teamcode.mechanisms.mechanismhandlers.Mechanism;

public class Shooter extends Mechanism {

    private DCMotorHandler shooterMotor = new DCMotorHandler("shooter", false, false);

    @Override
    public void init(HardwareMap hwmap) {
        shooterMotor.init(hwmap);
    }

    public void spin(double spinny_speed) {
        shooterMotor.setPower(spinny_speed);
    }

}
