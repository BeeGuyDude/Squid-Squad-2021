package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.HardwareMap;
import static org.firstinspires.ftc.teamcode.framework.Constants.*;


import org.firstinspires.ftc.teamcode.mechanisms.devicehandlers.DCMotorHandler;
import org.firstinspires.ftc.teamcode.mechanisms.devicehandlers.ServoHandler;
import org.firstinspires.ftc.teamcode.mechanisms.mechanismhandlers.Mechanism;


public class Intake extends Mechanism {

    private DCMotorHandler intakeMotor = new DCMotorHandler("intake", true, false);
    private ServoHandler uselesspieceoshit = new ServoHandler("drop_servo");

    @Override
    public void init(HardwareMap hwmap) {
        intakeMotor.init(hwmap);
        uselesspieceoshit.init(hwmap);
    }

    public void spin(double spinny_speed) {
      intakeMotor.setPower(spinny_speed);
    }

    public void drop() {
        uselesspieceoshit.setPosition(-1);
    }

}
