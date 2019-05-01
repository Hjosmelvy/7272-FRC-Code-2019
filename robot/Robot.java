/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7272.robot;

import org.usfirst.frc.team7272.robot.subsystems.*;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;



public class Robot extends TimedRobot {

	public static OI oi;
	public static Drivebase drivebase;
	public static Mandibles mandibles;
	public static Arm arm;
	public static Intake intake;
	

	@Override
	public void robotInit() {
		oi = new OI();
		drivebase = new Drivebase();
		mandibles = new Mandibles();
		arm = new Arm();
		intake = new Intake();
		 CameraServer.getInstance().startAutomaticCapture();
	}

	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void autonomousInit() {
		CameraServer.getInstance().startAutomaticCapture();
		// Robot.arm.ArmMotor.setSelectedSensorPosition(0);
	}

	@Override
	public void autonomousPeriodic() {
		oi = new OI();
		drivebase = new Drivebase();
		mandibles = new Mandibles();
		arm = new Arm();
		intake = new Intake();
		 CameraServer.getInstance().startAutomaticCapture();

		 CameraServer.getInstance().getVideo();


		
		
		Scheduler.getInstance().run();
		// System.out.println(Robot.arm.ArmMotor.getSelectedSensorPosition());
	}

	@Override
	public void teleopInit() {

	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();

	}

	@Override
	public void testPeriodic() {
	}
}
