// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.PowerDistribution.ModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {

  WPI_VictorSPX intakeMotor;
  DoubleSolenoid piston;
  Value pistonState;
  /** Creates a new IntakeSubsystem. */
  public IntakeSubsystem() {
    intakeMotor = new WPI_VictorSPX(0);
    pistonState = Value.kForward;
    piston = new DoubleSolenoid(PneumaticsModuleType.REVPH, 0, 1);

  }
  
  public void intakeMovement(double speed){

   intakeMotor.set(speed);
  
  }

  public void invertPiston(){

    if(pistonState == Value.kForward) {
      pistonState = Value.kReverse;
    }
    else{
      pistonState = Value.kForward;
    }
    piston.set(pistonState);

  }

  public void pistonMovement(double speed){

    pistonState = Value.kForward;
    piston.set(pistonState);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

 
}
