package org.usfirst.frc.team7272.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team7272.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Mandibles extends Subsystem {

	public TalonSRX UpMotor;

	public void initDefaultCommand() {
		
		UpMotor = new TalonSRX(RobotMap.UP_MOTOR);
	
	}
	public void rotate(double mandibles_distance) {
		UpMotor.set(ControlMode.PercentOutput,mandibles_distance);
	}
}
