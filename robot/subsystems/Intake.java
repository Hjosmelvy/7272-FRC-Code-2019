/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7272.robot.subsystems;

import org.usfirst.frc.team7272.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Intake extends Subsystem {

  public TalonSRX IntakeMotor;
  
  @Override
  public void initDefaultCommand() {

     IntakeMotor = new TalonSRX(RobotMap.INTAKE_MOTOR); 
   
  }
  public void rotate(double arm_distance) {
     IntakeMotor.set(ControlMode.PercentOutput,arm_distance);
  }
}

