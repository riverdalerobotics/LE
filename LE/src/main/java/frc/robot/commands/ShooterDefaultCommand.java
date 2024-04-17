// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.OperatorInput;
import frc.robot.subsystems.ChassisSubsystem;
import frc.robot.subsystems.ShooterSubsystem;



public class ShooterDefaultCommand extends Command {
  /** Creates a new ShooterDefaultCommand. */
  OperatorInput oi;
  ShooterSubsystem shooter;

  
  public ShooterDefaultCommand(ShooterSubsystem ShooterSubsystem, OperatorInput OI) {;
    // Use addRequirements() here to declare subsystem dependencies.
    this.oi = OI;
    this.shooter = ShooterSubsystem;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    shooter.spinShooter(oi.moveShooter());
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