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


public class SoftEStop extends Command {

    public SoftEStop() {
    	requires(Robot.driveTrain);
    	requires(Robot.shooter);
    	requires(Robot.forklift);
    }

    protected void initialize() {
    	end();
    }

    protected void execute() {
    	end();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    	Robot.driveTrain.stop();
    	Robot.shooter.stopFly();
    	Robot.shooter.stopIntake();
    	Robot.forklift.stop();
    }

    protected void interrupted() {
    	end();
    }
}
