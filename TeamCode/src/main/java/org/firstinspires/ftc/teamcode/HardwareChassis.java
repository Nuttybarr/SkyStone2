package org.firstinspires.ftc.teamcode;
import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.Orientation;
import org.firstinspires.ftc.robotcore.external.navigation.Position;
import org.firstinspires.ftc.robotcore.external.navigation.Velocity;

public class HardwareChassis extends HardwareBase {

    //DC Motors
    public DcMotor motorLeftBackWheel = null;
    public DcMotor motorRightBackWheel = null;
    public DcMotor motorLeftFrontWheel = null;
    public DcMotor motorRightFrontWheel = null;

    DcMotor[] leftMotors;
    DcMotor[] rightMotors;

    //not sure what these variables do yet
    //TODO: figure out what these variables do

    protected int leftBackStamp;
    protected int rightBackStamp;

    protected double wheelDistanceLandMark;

    float currentHeading = 0;
    protected float startHeading =0;

    // Orientation sensor
    BNO055IMU imu = null;
    Orientation angles = null;

    double wheelEncoderCountPerInch = 80.79;
    protected double axleDistance = wheelEncoderCountPerInch * 14; //80.79 * 14;

    boolean bReverse = false;

    int leftWheelLandMark = 0;
    int rightWheelLandMark= 0;

    int turnDistanceRightWheel = 0;

    double axleLength = 300;


}
