package com.company.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    // TODO -- Fill in your code here
    public static final int IN = 1;
    public static final int OUT = -1;
    public static final int CLOSED = 0;

    private int mSwing;

    public Gate(){
        mSwing = CLOSED;
    }

    public int getSwingDirection() {
        return mSwing;
    }

    public boolean setSwing(int direction) {
        if(direction == IN || direction == OUT || direction == CLOSED) {
            mSwing = direction;
            return true;
        }
        return false;
    }

    public boolean open(int direction) {
        if (direction == IN || direction == OUT) {
            this.setSwing(direction);
            return true;
        }
        return false;
    }

    public void close() {
        mSwing = CLOSED;
    }

    public int thru(int count) {
        if(mSwing == IN)
            return count;
        else if(mSwing == OUT)
            return -count;
        else
            return 0;
    }

    @Override
    public String toString() {
        if(mSwing == 0)
            // ворота, которые закрыты
            return "This gate is closed";
        else if(mSwing == IN)
            // ворота, которые установлены в IN
            return "This gate is open and swings to enter the pen only";
        else if (mSwing == OUT)
            // ворота, которые установлены в OUT
            return "This gate is open and swings to exit the pen only";
        else
            // ворота, у которых положение отлично от IN, OUT или CLOSED
            return "This gate has an invalid swing direction";
    }
}
