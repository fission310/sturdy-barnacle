package org.firstinspires.ftc.teamcode.opmode.auton.far;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.hardware.HardwareMain;
import org.firstinspires.ftc.teamcode.hardware.mecanum.Drivetrain;

/**
 * AutonBlueGlyph is a class containing the following autonomous routine for the BLUE alliance:
 * <ol>
 *   <li>Score glyph into cryptobox</li>
 *   <li>Park in safe zone</li>
 * </ol>
 */
@Autonomous(name="Auton: Blue Glyph Far", group="Auton")
public class AutonBlueGlyph extends LinearOpMode {

    /* Robot hardware */
    private HardwareMain robot = new HardwareMain(this);

    /**
     * Runs the autonomous routine.
     */
    @Override
    public void runOpMode() {

        // Initialize robot
        robot.init(hardwareMap);
        robot.drivetrain.encoderInit();

        // Wait until we're told to go
        waitForStart();

        robot.arm.armUp();
        robot.scoreGlyphFar(1, false);

        telemetry.addData("Path", "Complete");
        telemetry.update();
    }

}
