package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.HardwareMap;
import static org.firstinspires.ftc.teamcode.framework.Constants.*;


import org.firstinspires.ftc.teamcode.mechanisms.devicehandlers.ServoHandler;
import org.firstinspires.ftc.teamcode.mechanisms.mechanismhandlers.Mechanism;

public class WobbleGoalClaw extends Mechanism {

    private ServoHandler wobbleGoalServo = new ServoHandler("wobble_goal");
    private boolean open = false;

    @Override
    public void init(HardwareMap hwmap) {
        wobbleGoalServo.init(hwmap);
    }

    public void open(){
        wobbleGoalServo.setPosition(WOBBLE_GOAL_OPEN);
        open = true;
    }
    public void close(){
       wobbleGoalServo.setPosition(WOBBLE_GOAL_CLOSE);
        open = false;
    }

    public void togglePosition() {
        if (open) {
            close();
        } else {
            open();
        }
    }
}
