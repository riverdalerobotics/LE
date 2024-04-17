package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class ShooterSubsystem extends SubsystemBase {
  /** Creates a new ShooterSubsystem. */
  WPI_VictorSPX leftShoot;
  WPI_VictorSPX rightShoot;

  public ShooterSubsystem() {
    leftShoot = new WPI_VictorSPX(21);
    rightShoot = new WPI_VictorSPX(22);
    
    }
  public void spinShooter (double speed){
    leftShoot.set(speed);
    rightShoot.set(-speed);
  }
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}