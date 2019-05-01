package org.usfirst.frc.team7272.robot.commands;

import org.usfirst.frc.team7272.robot.Robot;
import org.usfirst.frc.team7272.robot.commands.Reverse;
import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command {

	public TankDrive() {
		requires(Robot.drivebase);

}

	protected void initialize() {

	}

	protected void execute() {
		// requires(Robot.drivebase);
		double throttle = (1.0 - Robot.oi.LEFT_JOY.getThrottle()) / -2.0;
		Robot.drivebase.drive(Robot.oi.LEFT_JOY.getY() * 1 * Reverse.reverse
		, Robot.oi.LEFT_JOY.getZ() *throttle * Reverse.reverse);

	}

	protected boolean isFinished() {

		return false;
	}

	protected void interrupted() {
		end();
	}
}
