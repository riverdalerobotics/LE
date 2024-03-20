package frc.robot.commands;

import frc.robot.subsystems.ChassisSubsystem;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class ChassisCommand extends ChassisSubsystem {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final ChassisSubsystem thingy;
  OperatorInput oi;
  ChassisSubsystem chassis;

  public ChassisDefaultCommand(ChassisSubsystem turn, ChassisSubsystem speed, OperatorInput OI) {
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    chassis.driveChassis(oi.);
    chassis.driveChassis(oi.);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}