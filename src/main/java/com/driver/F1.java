package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name,4,2,4,isManual,"racing",2);

    }

    public void accelerate(int rate) {
        if (rate > 0) {
            changeSpeed(rate, getCurrentDirection());
        }
        //set the value of new speed by using currentSpeed and rate
        /*
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if (rate <= 0) {
            //Stop the car, set gear as 1
            stop();
            changeGear(1);
        } else if (rate <= 50) {
            //set gear as 1
            changeGear(1);
        } else if (rate <= 100) {
            //set gear as 2
            changeGear(2);
        } else if (rate <= 150) {
            //set gear as 3
            changeGear(3);
        } else if (rate <= 200) {
            //set gear as 4
            changeGear(4);
        } else if (rate <= 250) {
            //set gear as 5
            changeGear(5);
        } else if (rate > 250) {
            //set gear as 6
            changeGear(6);
        }
        //for all other cases, change the gear accordingly
    }
}
