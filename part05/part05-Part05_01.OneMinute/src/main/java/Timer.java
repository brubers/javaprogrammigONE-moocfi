public class Timer {
    private ClockHand centiseconds;
    private ClockHand seconds;

    public Timer(){
        this.centiseconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance(){
        this.centiseconds.advance(); // the value of centiseconds get +1. and it is reseted when it reaches 100.

        if (this.centiseconds.value() == 0)  { //after its value is set 0 by de advance function (achieves 100), this condition is true
            this.seconds.advance(); // 100 centiseconds = 1 second
        }
    }

    public String toString(){
        return seconds+":"+centiseconds;
    }



}
