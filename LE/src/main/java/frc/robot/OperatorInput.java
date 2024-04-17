package frc.robot;

import javax.management.openmbean.OpenMBeanParameterInfoSupport;

import edu.wpi.first.wpilibj.XboxController;

public class OperatorInput {
    XboxController driverController;
    XboxController intakeController;
    

    public OperatorInput() {
        driverController = new XboxController(0);
        intakeController = new XboxController(1);
    }

    /**
     * Moves Index Forwards
     * @return
     */
    public double indexForwardMovementLeftTrigger(){

        return driverController.getLeftTriggerAxis();
    }

    /**
     * Moves Index Backwards
     * @return
     */
    public double indexBackwardMovementRightTrigger(){

        return -driverController.getRightTriggerAxis();
    }

   public boolean intakePower(){
        return driverController.getBButton();
   }

   //LIAM COMMENT: Method names should start lowercase
    public double ChassisSpeedThingy(){
        return driverController.getLeftY();
    }
    public double ChassisTurnThingy(){
        return driverController.getRightX();
    }
   public boolean piston(){
        return driverController.getAButtonPressed();
   }

public double moveShooter() {
    // TODO Auto-generated method stub
    return intakeController.getRightY();
}
}

