// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IndexSubsystem extends SubsystemBase {

    WPI_VictorSPX indexMotor;

    /**sets indexMotor to speed parameter
   * Takes a Double
   */
  public void setIndexSpeed(double speed){

    indexMotor.set(speed);
  }

  public IndexSubsystem() {
    indexMotor = new WPI_VictorSPX(40);
  }

  public void IndexMovementForwards(){

    setIndexSpeed(0.1);

  }

  public void IndexMovementBackwards(){

    setIndexSpeed(-0.1);
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }


}
