// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RobotContainer 
{
	CommandXboxController controller = new CommandXboxController(0);
	public RobotContainer() 
	{
		configureBindings();
	}

	private void configureBindings() 
	{
		// TODO: edit this method
	}

	public Command getAutonomousCommand() 
	{
		// TODO: edit this method
		return Commands.print("No autonomous command configured");
	}
}
