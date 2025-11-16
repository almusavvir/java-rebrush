package oop;

public class CalyxSystem extends BaseSystem {
    private int rx4number;
    private char rideclass;

    public int getRx4number() {
        return rx4number;
    }

    public void setRx4number(int rx4number) {
        this.rx4number = rx4number;
    }

    public char getRideclass() {
        return rideclass;
    }

    public void setRideclass(char rideclass) {
        this.rideclass = rideclass;
    }

    @Override
    public void setMake(String make) {
        super.setMake(make);
    }
}