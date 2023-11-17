package com.xyzcorp.javapatterns.state.classic;

public class SwitchStateFactory {
    private final SwitchStateContext switchStateContext;
    private SwitchState onState;
    private SwitchState offState;

    public SwitchStateFactory(SwitchStateContext switchStateContext) {
        this.switchStateContext = switchStateContext;
    }

    protected SwitchState getOnState() {
        if (this.onState == null) {
            this.onState = new SwitchState() {
                @Override
                public void execute() {
                    switchStateContext.setState(getOffState());
                }

                @Override
                public String toString() {
                    return "on";
                }
            };
        }
        return onState;
    }

    protected SwitchState getOffState() {
        if (this.offState == null) {
            this.offState = new SwitchState() {
                @Override
                public void execute() {
                    switchStateContext.setState(getOnState());
                }

                @Override
                public String toString() {
                    return "off";
                }
            };
        }
        return offState;
    }

    public static void main(String[] args) {
        SwitchStateContext context = new SwitchStateContext();
        SwitchStateFactory factory = new SwitchStateFactory(context);
        var onState = factory.getOnState();
        onState.execute();
        System.out.println(context.getSwitchState());
    }
}
