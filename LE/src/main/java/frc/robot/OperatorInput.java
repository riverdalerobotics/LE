package frc.robot;

import javax.management.openmbean.OpenMBeanParameterInfoSupport;

import edu.wpi.first.wpilibj.XboxController;

public class OperatorInput {
    XboxController driverController;
    

    public OperatorInput() {
        driverController = new XboxController(0);
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


