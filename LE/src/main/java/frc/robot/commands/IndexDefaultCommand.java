// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.OperatorInput;
import frc.robot.subsystems.IndexSubsystem;

public class IndexDefaultCommand extends Command {

  OperatorInput oi;
  IndexSubsystem index;
  /** Creates a new IndexDefaultCommand. */
  public IndexDefaultCommand(IndexSubsystem indexMovement, OperatorInput OI) {
    this.oi = OI;
    this.index = indexMovement;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    //moves index Forwards
    index.setIndexSpeed(oi.indexForwardMovementLeftTrigger());

    //moves index Backwards
    index.setIndexSpeed(oi.indexBackwardMovementRightTrigger());
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
