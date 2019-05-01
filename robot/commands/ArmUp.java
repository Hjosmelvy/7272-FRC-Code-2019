/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7272.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Timer;
import org.usfirst.frc.team7272.robot.Robot;

public class ArmUp extends Command {
  Timer timer;

  public ArmUp() {
  
  }

 
  @Override
  protected void initialize() {
  }

 
  @Override
  protected void execute() {
    Robot.arm.rotate(1); // start turning
  }

 
  @Override
  protected boolean isFinished() {
    return false;
  }

  
  @Override
  protected void end() {
    Robot.arm.rotate(0); // start turning
  }

  
  @Override
  protected void interrupted() {
    end();
  }
}
