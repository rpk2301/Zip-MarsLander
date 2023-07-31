import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimulationTest {

    @Test
    public void runSimulationLanding() {
        int[] burns = {200, 200, 200, 200, 200, 200, 200, 200, 200,
                100, 100, 100, 100,
                150, 125, 120, 100, 100, 100, 103,
                100, 100, 100, 100};
        BurnStream burnSource = new BurnDataStream(burns);
        Simulation game = new Simulation(new Vehicle(5000));
        int okay = game.runSimulation(burnSource);
        Assert.assertEquals(okay, Vehicle.SUCCESS);
    }

    @Test
    public void runSimulationCrash() {
        int[] burns = {0,0,0,0,0};
        BurnStream burnSource = new BurnDataStream(burns);
        Simulation game = new Simulation(new Vehicle(5000));
        int okay = game.runSimulation(burnSource);
        Assert.assertEquals(Vehicle.DEAD, okay);
    }

    @Test
    public void runSimulationComputer() {
        BurnStream burnSource = new OnBoardComputer();
        Simulation game = new Simulation(new Vehicle(10000));
        int okay = game.runSimulation(burnSource);
        Assert.assertEquals(okay, Vehicle.SUCCESS);
    }

    @Test
    public void testRandom()
    {

        BurnStream burnSource = new OnBoardComputer();
        Simulation game = new Simulation(new Vehicle(Simulation.randomaltitude()));
        int okay = game.runSimulation(burnSource);
        Assert.assertEquals(okay,Vehicle.SUCCESS);
    }


    @Test
    public void runSimulationTooManyTimes() {
        int totalTests=1000;
        int successCount =0;
        for(int i =0; i<totalTests; i++) {
            BurnStream burnSource = new OnBoardComputer();
            Simulation game = new Simulation(new Vehicle(Simulation.randomaltitude()));
            //Simulation game = new Simulation(new Vehicle(15000));
            int okay = game.runSimulation(burnSource);
            if (okay == 0) {
                successCount++;
            }
        }

        System.out.println("Number of successful tests: " + successCount);
        System.out.println("Number of failed tests: " + (totalTests - successCount));
    }

}



