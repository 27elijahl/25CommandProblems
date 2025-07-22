package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * Represents the subsystem which vertically positions the end effector 
 * between 0 and 2 meters above the chassis. You will write this subsystem
 * in a later project, but you don't have to touch it yet.
 */
public class Elevator extends SubsystemBase 
{
    private static Elevator instance;

    private Elevator ()
    {
        // initializes and configures motors
    }

    // tells main motor to run at provided voltage; follower motor follows suit
    public void setOutput (double voltsOutput) {}

    // returns how far the elevator is extended in meters, according to the motors
    public double location () {return 0;}


    public static Elevator getInstance ()
    {
        if (instance == null) instance = new Elevator();
        return instance;
    }
    
}
