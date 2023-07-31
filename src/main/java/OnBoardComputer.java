public class OnBoardComputer implements BurnStream {

         @Override
        public int getNextBurn(DescentEvent status) {

             int Altitude = status.Altitude;
             int Velocity = status.Velocity;
             double HowManyToGround = Altitude/Velocity;
             while(Altitude>1000)
             {
                 if(Altitude<5000 && Velocity > 700)
                 {
                     return 350;
                 }
                 if (HowManyToGround >= 10 && Altitude > 1000 && Velocity>=50 )
                 {
                     return 0;
                 }
                 else return 200;
             }
             while(Altitude<=1000 && Altitude>=200)
             {
                 if(Velocity>300)
                 {
                     return 350;
                 }
                if(Velocity>=180)
                {
                    return 200;
                }

                if(Velocity>=150 && Altitude>900)
                {
                    return 175;
                }
                else if(Velocity >40)
                {
                    return 110;
                }
                else if(Velocity == 40)
                {
                    return 100;
                }
                else if(Velocity<40)
                {
                    return 99;
                }
             }
             while (Altitude<=199 && Altitude >= 60)
             {
                 if(Velocity > 75)
                 {
                     return 150;
                 }
                 if (Velocity > 20)
                 {
                     return 105;
                 }
                 else return 100;
             }

            while(Altitude <60)
            {
                if(Velocity>15)
                {
                return 110;
                }
                else if(Velocity>3 && Velocity <15 && (Velocity + 100 - 105) > 0)
                {
                    return 105;
                }
                else if(Velocity >14)
                {
                    return 110;
                }
                else if(Velocity > 3 )
                {
                    return 101;
                }
                else return 100;


            }
        return 0;
            }



    }


