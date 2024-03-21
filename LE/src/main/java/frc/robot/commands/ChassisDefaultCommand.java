package frc.robot.commands;

import frc.robot.subsystems.ChassisSubsystem;
import frc.robot.OperatorInput;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class ChassisDefaultCommand extends Command {

  OperatorInput oi;
  ChassisSubsystem chassis;
  

  public ChassisDefaultCommand(ChassisSubsystem chassisSubsystem, OperatorInput OI) {
    this.chassis = chassisSubsystem;
    this.oi = OI;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(this.chassis);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    chassis.driveChassis(oi.ChassisSpeedThingy(), oi.ChassisTurnThingy());
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}