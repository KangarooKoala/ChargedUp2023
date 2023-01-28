package frc.team2412.robot.commands.autonomous;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team2412.robot.subsystems.DrivebaseSubsystem;

public class AutoBalanceCommand extends CommandBase {

	private DrivebaseSubsystem drivebaseSubsystem;

	public AutoBalanceCommand(DrivebaseSubsystem drivebaseSubsystem) {
		this.drivebaseSubsystem = drivebaseSubsystem;
		addRequirements(drivebaseSubsystem);
	}

	@Override
	public void execute() {
		// Run the auto balancing code until autonomous is finished
		drivebaseSubsystem.drive(0, 0, new Rotation2d(), true, true);
		System.out.println("test");
	}

	@Override
	public boolean isFinished() {
		return false;
	}
}
