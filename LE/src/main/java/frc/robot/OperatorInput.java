package frc.robot;

import javax.management.openmbean.OpenMBeanParameterInfoSupport;

import edu.wpi.first.wpilibj.XboxController;

public class OperatorInput {
    XboxController driverController;
    

    public OperatorInput() {
        driverController = new XboxController(1);
    }

    /**
     * Blah blah blH
     * @return
     */
    public double IndexForwardMovementLeftTrigger(){

        return driverController.getLeftTriggerAxis();
    }

    /**
     * jhsdkhfshdfkshdf
     * @return
     */
    public double IndexBackwardMovementRightTrigger(){

        return driverController.getLeftTriggerAxis();
    }

   public boolean intakePower(){
        return driverController.getBButton();
   }
   public boolean piston(){
        return driverController.getAButtonPressed();
   }
}