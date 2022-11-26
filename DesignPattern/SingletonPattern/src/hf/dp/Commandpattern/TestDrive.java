package hf.dp.Commandpattern;

public class TestDrive {
    public static void main(String[] args) {
        MyHWInfo.printInfo();
        Lamp lamp=new Lamp();
        Command lampOnCommand=new LampOnCommand(lamp);

        Button button1=new Button(lampOnCommand);
        button1.pressed();

        Alarm alarm =new Alarm();
        Command alarmCommand=new AlarmCommand(alarm);

        Button button2=new Button(alarmCommand);
        button2.pressed();
    }
}
