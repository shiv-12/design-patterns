package org.state.fanstate;

import org.state.Fan;
import org.state.FanStateType;

public interface FanState {

    void pressButton(Fan fan);

    FanStateType getState();

}
