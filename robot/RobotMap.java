/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7272.robot;

public class RobotMap {
	// PWM Motor Mappings
	public static final int LEFT_MOTOR = 2, TFEL_MOTOR = 3, RIGHT_MOTOR = 0, THGIR_MOTOR = 1, 	UP_MOTOR = 4;
	public static final int ARM_MOTOR = 0, INTAKE_MOTOR = 1;
	// Control Mappings
	public static final int LEFT_JOYSTICK = 0;

	public final int value;

	RobotMap(int value) {
		this.value = value;

	}

}
