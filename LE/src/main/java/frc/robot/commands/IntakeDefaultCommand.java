// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.OperatorInput;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeDefaultCommand extends Command {
  OperatorInput OI;
  IntakeSubsystem intake;
  /** Creates a new IntakeDefaultCommand. */
  public IntakeDefaultCommand(OperatorInput OI, IntakeSubsystem intake) {
    this.intake = intake;
    this.OI = OI;
    // Use addRequirements() here to declare subsystem  dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    OI.intakePower();
    if(OI.intakePower()) {
      intake.intakeMovement(1);
    }
    else{
      intake.intakeMovement(0);
    }
    if(OI.piston()){
      intake.invertPiston();
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
