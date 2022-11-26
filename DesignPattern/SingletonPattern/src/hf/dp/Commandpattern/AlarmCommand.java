package hf.dp.Commandpattern;

public class AlarmCommand implements Command{
    private Alarm theAlarm;
    public AlarmCommand(Alarm theAlarm){
        this.theAlarm=theAlarm;
    }
    @Override
    public void execute() {
        theAlarm.start();
    }
}
