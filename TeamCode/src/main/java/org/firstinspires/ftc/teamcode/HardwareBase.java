package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class HardwareBase {
    HardwareMap hwMap = null;

    Telemetry telemetry = null;

    String hardwareName;

    public HardwareBase(){
        hardwareName = "Unknown";
    }

    public HardwareBase(String n){
        hardwareName = n;
    }

    public void init(HardwareMap ahwMap, Telemetry t){
        hwMap = ahwMap;
        telemetry = t;
    }

    public void start(){}

    public void reset(){}

    public void stop(){}

    public void setTelemetry(Telemetry t) { telemetry = t;}
}
