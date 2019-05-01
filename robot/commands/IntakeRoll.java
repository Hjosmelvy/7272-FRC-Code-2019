package org.usfirst.frc.team7272.robot.commands;

import org.usfirst.frc.team7272.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IntakeRoll extends Command {
	Timer timer;

	public IntakeRoll() {
	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.intake.rotate(-1); // start turning
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
