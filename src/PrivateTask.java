public class PrivateTask extends Task{
    public PrivateTask(int duration, int year, int month, int day,
                       int priority, String subject) {
        super(duration, year, month, day, priority, subject, "Я");
    }
    @Override
    public String toString(){
        return "-".repeat(100)+"\nТип: Личная задача\n"+
                super.toString()+"*".repeat(100)+"\n";
    }
}
