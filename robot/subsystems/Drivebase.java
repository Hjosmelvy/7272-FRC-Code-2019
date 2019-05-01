package org.usfirst.frc.team7272.robot.subsystems;

import org.usfirst.frc.team7272.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

import org.usfirst.frc.team7272.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivebase extends Subsystem {

	public Spark LeftMotor;
	public Spark RightMotor;
	public Spark TfelMotor;
	public Spark ThgirMotor;
	public SpeedControllerGroup m_left;
	public SpeedControllerGroup m_right;
	public DifferentialDrive m_drive;
	public Joystick joystick = new Joystick(0);
	//double speedCoe;

	public Drivebase() {
		LeftMotor = new Spark(RobotMap.LEFT_MOTOR);
		RightMotor = new Spark(RobotMap.RIGHT_MOTOR);
		TfelMotor = new Spark(RobotMap.TFEL_MOTOR);
		ThgirMotor = new Spark(RobotMap.THGIR_MOTOR);
		m_left = new SpeedControllerGroup(TfelMotor, LeftMotor);
		m_right = new SpeedControllerGroup(ThgirMotor, RightMotor);
		m_drive = new DifferentialDrive(m_left, m_right);
		//speedCoe = 0.6;

	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TankDrive());
	}
	
	public void drive(double left_speed, double right_speed ) {
		
		m_drive.arcadeDrive(left_speed, right_speed);
		
		
	}
	
	


}
