public class DescentEvent {
    int Seconds = 0;
    int Velocity = 0;
    int Fuel = 0;
    int Altitude = 0;
    int Status = 0;

    public DescentEvent(int seconds, int velocity, int fuel, int altitude, int st) {
        this.Seconds = seconds * 10;
        this.Velocity = velocity;
        this.Fuel = fuel;
        this.Altitude = altitude;
        this.Status=st;
    }

    public int getVelocity() {
        return this.Velocity;
    }

    public int getAltitude() {
        return this.Altitude;
    }
    public int getStatus() { return this.Status; }
    @Override
    public String toString() {
        String s = this.Seconds +"\t\t" + this.Velocity + " \t\t" + this.Fuel + " \t\t" + this.Altitude;
        return s;
    }
}
