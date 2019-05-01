/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7272.robot;

import org.usfirst.frc.team7272.robot.commands.ArmDown;
import org.usfirst.frc.team7272.robot.commands.ArmUp;
import org.usfirst.frc.team7272.robot.commands.GearClockwise;
import org.usfirst.frc.team7272.robot.commands.GearCounterClockwise;
import org.usfirst.frc.team7272.robot.commands.IntakeRoll;
import org.usfirst.frc.team7272.robot.commands.OuttakeRoll;
import org.usfirst.frc.team7272.robot.commands.Reverse;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	public static final double JOY_DEADZONE = 0.5;
	
	public final Joystick LEFT_JOY = new Joystick(RobotMap.LEFT_JOYSTICK);

	public double getLeftJoyY() {
		double raw = LEFT_JOY.getY();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}

	public double getLeftJoyZ() {
		double raw = LEFT_JOY.getZ();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	Button button2 = new JoystickButton(LEFT_JOY, 2);
	Button button3 = new JoystickButton(LEFT_JOY, 3);		
	Button button4 = new JoystickButton(LEFT_JOY, 4);	
	Button button9 = new JoystickButton(LEFT_JOY, 9);		
	Button button10 = new JoystickButton(LEFT_JOY, 10);	
	Button button11 = new JoystickButton(LEFT_JOY, 11);		
	Button button12 = new JoystickButton(LEFT_JOY, 12);	
	


	

	public OI() {
		button2.whenPressed(new Reverse());
		button3.whenPressed(new GearClockwise());
		 button4.whenPressed(new GearCounterClockwise());
		 button10.whileHeld(new ArmUp());
		 button9.whileHeld(new ArmDown());
		 button12.whileHeld(new IntakeRoll());
		 button11.whileHeld(new OuttakeRoll());
		
		

	}
	

}
