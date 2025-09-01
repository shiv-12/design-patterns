package org.state.fanstate;

import org.state.Fan;
import org.state.FanStateType;

public class FanOffState implements FanState {


    @Override
    public void pressButton(Fan fan) {
        fan.setNextState(new FanLowState());
    }

    @Override
    public FanStateType getState() {
        return FanStateType.OFF;
    }


}
