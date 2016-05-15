// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4914.WindsorBot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4914.WindsorBot.Robot;


public class OperateDrive extends Command {

    public OperateDrive() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    protected void initialize() {
    }

    protected void execute() {
    	if (Robot.driveTrain.isInvertedDrive) { invertedTankDrive(); }
    	else if (!Robot.driveTrain.isInvertedDrive) { normalTankDrive(); }
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.driveTrain.stop();
    }

    protected void interrupted() {
    	end();
    }
    
    /******* CUSTOM METHODS *******/
    
    public void normalTankDrive() {
    	if (Robot.oi.driverRT() > 0) {
    		Robot.driveTrain.setLeftVictor(Robot.oi.driverRT() * Robot.driveTrain.speedMultiplier - Robot.oi.driverLJleft());
    		Robot.driveTrain.setRightVictor(Robot.oi.driverRT() * Robot.driveTrain.speedMultiplier - Robot.oi.driverLJright());
    	}
    	else {
    		Robot.driveTrain.setLeftVictor(-Robot.oi.driverLT() * Robot.driveTrain.speedMultiplier + Robot.oi.driverLJleft());
    		Robot.driveTrain.setRightVictor(-Robot.oi.driverLT() * Robot.driveTrain.speedMultiplier + Robot.oi.driverLJright());
    	}
    }
    
    public void invertedTankDrive() {
    	Robot.driveTrain.setLeftVictor(-Robot.oi.driverLJ() * Robot.driveTrain.speedMultiplier);
		Robot.driveTrain.setRightVictor(-Robot.oi.driverRJ() * Robot.driveTrain.speedMultiplier);
    }
    
    public void normalStraightDrive() {
    	Robot.driveTrain.driveStraight(Robot.oi.driverLJ() * Robot.driveTrain.speedMultiplier);
    }
    
    public void invertedStraightDrive() {
    	Robot.driveTrain.driveStraight(-Robot.oi.driverLJ() * Robot.driveTrain.speedMultiplier);
    }
}
