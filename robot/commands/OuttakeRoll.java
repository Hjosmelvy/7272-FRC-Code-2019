package org.usfirst.frc.team7272.robot.commands;

import org.usfirst.frc.team7272.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class OuttakeRoll extends Command {
	Timer timer;

	public OuttakeRoll() {
	}

	protected void initialize() {
	}

	protected void execute() {
		//Double throttle = (1.0 - Robot.oi.LEFT_JOY.getThrottle()) / -2.0;
		Robot.intake.rotate(1); // start turning
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.intake.rotate(0); // start turning
	}

	protected void interrupted() {
		end();
	}
}
