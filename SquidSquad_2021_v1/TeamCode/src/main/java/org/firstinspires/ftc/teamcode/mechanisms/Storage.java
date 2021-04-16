package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.HardwareMap;
import static org.firstinspires.ftc.teamcode.framework.Constants.*;

import org.firstinspires.ftc.teamcode.mechanisms.devicehandlers.DCMotorHandler;
import org.firstinspires.ftc.teamcode.mechanisms.mechanismhandlers.Mechanism;

public class Storage extends Mechanism {

    private DCMotorHandler storageMotor = new DCMotorHandler("storage", false, false);

    @Override
    public void init(HardwareMap hwmap) {
        storageMotor.init(hwmap);
    }

    public void spin(double spinny_speed) {
        storageMotor.setPower(spinny_speed);
    }

}
