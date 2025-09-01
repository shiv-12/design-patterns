package org.state.fanstate;

import org.state.Fan;
import org.state.FanStateType;

public class FanLowState implements FanState {
    @Override
    public void pressButton(Fan fan) {
        fan.setNextState(new FanHighState());
    }
    @Override
    public FanStateType getState() {
        return FanStateType.LOW;
    }

}
