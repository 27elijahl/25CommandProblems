package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * This simplified version of an EndEffector is a subsystem which is 
 * capable of holding a coral (a cylinder which is a game piece in 2025). 
 * It can intake it from the front and the back end and has sensors for 
 * detecting whether the coral is in the front of the EndEffector, the 
 * back, or both. You will write this subsystem in a later project, but
 * you don't have to touch it yet.
 */
public class EndEffector extends SubsystemBase
{
    private static EndEffector instance;

    private EndEffector ()
    {
        // instantiates and configures motors

    }

    // ejects the coral by running the motors at a certain speed
    // (negative input will cause the coral to be taken in)
    public void setOutput (double voltsOutput) {}

    // returns whether the front sensor (away from the robot)
    // detects a coral
    public boolean frontSensorHit () {return false;}
    
    // returns whether the back sensor (away from the robot)
    // detects a coral
    public boolean backSensorHit () {return false;}

    public static EndEffector getInstance ()
    {
        if (instance == null) instance = new EndEffector();
        return instance;
    }
}
