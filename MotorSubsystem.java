package frc.robot;

import com.revrobotics.spark.SparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MotorSubsystem extends SubsystemBase {

    private final SparkMax motor1;
    private final SparkMax motor2;

    public MotorSubsystem(SparkMax motor1, SparkMax motor2) {
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    public void run(double speed) {
        motor1.set(-speed);
        motor2.set(-speed);

        
    }
    
    public void stop() {
        motor1.stopMotor();
        motor2.stopMotor();
    }
}
