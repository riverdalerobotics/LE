// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class ChassisSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  WPI_VictorSPX leftMotorLead;
  WPI_VictorSPX leftMotorFollowOne;
  WPI_VictorSPX leftMotorFollowTwo;

  WPI_VictorSPX rightMotorLead;
  WPI_VictorSPX rightMotorFollowOne;
  WPI_VictorSPX rightMotorFollowTwo;

  public ChassisSubsystem() {

    leftMotorLead = new WPI_VictorSPX(10);
    leftMotorFollowOne = new WPI_VictorSPX(11);
    leftMotorFollowTwo = new WPI_VictorSPX(12);

    rightMotorLead = new WPI_VictorSPX(20);
    rightMotorFollowOne = new WPI_VictorSPX(21);
    rightMotorFollowTwo = new WPI_VictorSPX(22);
    
  }
  public void driveChassis(double turn, double speed){
    double driveRight = turn + speed;
    double driveLeft = turn - speed;
    rightMotorLead.set(driveRight);
    rightMotorFollowOne.set(driveRight);
    rightMotorFollowTwo.set(driveRight);
    leftMotorLead.set(driveLeft);
    leftMotorFollowOne.set(driveLeft);
    leftMotorFollowTwo.set(driveLeft);
  }

  @Override
  public void periodic() {

    // This method will be called once per scheduler run
  }
  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}