package org.usfirst.frc.team7272.robot.commands;

import org.usfirst.frc.team7272.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearClockwise extends Command {
	Timer timer;

	public GearClockwise() {

		timer = new Timer();

	}

	protected void initialize() {
		timer.start();
	}

	protected void execute() {
		Robot.mandibles.rotate(0.35); // start turning
	}

	protected boolean isFinished() {
		return timer.get() >= 1;
	}

	protected void end() {
		Robot.mandibles.rotate(0); // start turning
	}

	protected void interrupted() {
		end();
	}
}
