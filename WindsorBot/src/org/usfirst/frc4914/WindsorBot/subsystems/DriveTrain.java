// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4914.WindsorBot.subsystems;

import javax.management.timer.Timer;
import org.usfirst.frc4914.WindsorBot.RobotMap;
import org.usfirst.frc4914.WindsorBot.commands.*;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {

    private final ADXRS450_Gyro gyro = RobotMap.gyro;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController rightDrive = RobotMap.driveTrainRightDrive;
    private final SpeedController leftDrive = RobotMap.driveTrainLeftDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public void initDefaultCommand() {
        setDefaultCommand(new OperateDrive());
    }

    /******* CONSTANTS *******/
    
    /** true if drive controls are inverted, false otherwise */
 	public boolean isInvertedDrive = true;
 	/** speed limit multiplier; 0 - 1 */
 	public final double speedMultiplier = 1;
 	/** allowed variance from gyrometer readings in degrees */
 	public final double ANGLE_EPSILON = 3;

 	/******* METHODS *******/
 	
     public void setLeftVictor(double speed) {
     	leftDrive.set(speed * speedMultiplier);
     }
     
     public void setRightVictor(double speed) {
     	rightDrive.set(-speed * speedMultiplier);
     }

     public void driveStraight(double speed) {
     	setLeftVictor(speed);
     	setRightVictor(speed);
     }

     public void stop() {
     	driveStraight(0);
     }

     public double getGyroBearing() {
    	 return gyro.getAngle();
     }
     
     public void resetGyro() {
    	 gyro.reset();
     }
    // END CUSTOM CODE
}
