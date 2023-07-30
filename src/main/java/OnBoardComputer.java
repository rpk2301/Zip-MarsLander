public class OnBoardComputer implements BurnStream {

         @Override
        public int getNextBurn(DescentEvent status) {

             int Altitude = status.Altitude;
             int Velocity = status.Velocity;
             double HowManyToGround = Altitude/Velocity;
             while(Altitude>1000) {
                 if (HowManyToGround >= 10 && Altitude > 1000) {
                     return 0;
                 } else return 200;
             }
             return 45;
    }

}
