package org.state;

import org.state.fanstate.FanOffState;
import org.state.fanstate.FanState;

public class Fan {

    private FanState fanState;

    public Fan() {
        this.fanState = new FanOffState();
    }

    public void setNextState(FanState fanState) {
        this.fanState = fanState;
    }

    public void pressButton() {
        fanState.pressButton(this);
        System.out.println("Current Fan State : " + fanState.getState());
    }
}
