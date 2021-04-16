package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.mechanisms.devicehandlers.DCMotorHandler;
import org.firstinspires.ftc.teamcode.mechanisms.mechanismhandlers.Mechanism;

public class DriveTrain extends Mechanism {

    private DCMotorHandler frontLeft = new DCMotorHandler("front_left", true,true);
    private DCMotorHandler backLeft = new DCMotorHandler("back_left", true,true);
    private DCMotorHandler frontRight = new DCMotorHandler("front_right", true,true);
    private DCMotorHandler backRight = new DCMotorHandler("back_right", false,true);

    @Override
    public void init(HardwareMap hwmap) {
        frontLeft.init(hwmap);
        backLeft.init(hwmap);
        frontRight.init(hwmap);
        backRight.init(hwmap);
    }

    public void move(double forward_input, double strafe_input, double rotate_input) {
        setSpeeds((forward_input - strafe_input + rotate_input), (forward_input + strafe_input - rotate_input), (forward_input + strafe_input + rotate_input), (forward_input - strafe_input - rotate_input));
    }

    void setSpeeds(double flSpeed, double frSpeed, double blSpeed, double brSpeed) {
        double largest = 1.0;
        largest = Math.max(largest, Math.abs(flSpeed));
        largest = Math.max(largest, Math.abs(frSpeed));
        largest = Math.max(largest, Math.abs(blSpeed));
        largest = Math.max(largest, Math.abs(brSpeed));

        frontLeft.setPower(flSpeed / largest);
        frontRight.setPower(frSpeed / largest);
        backLeft.setPower(blSpeed / largest);
        backRight.setPower(brSpeed / largest);
    }
}
