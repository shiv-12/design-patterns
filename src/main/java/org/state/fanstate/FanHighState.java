package org.state.fanstate;

import org.state.Fan;
import org.state.FanStateType;

public class FanHighState implements FanState {

    @Override
    public void pressButton(Fan fan) {
        fan.setNextState(new FanOffState());
    }

    @Override
    public FanStateType getState() {
        return FanStateType.HIGH;
    }

}
