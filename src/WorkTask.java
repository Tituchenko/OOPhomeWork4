public class WorkTask extends Task{
    @Override
    public boolean isNotification() {
        return notification;
    }

    private boolean notification;

    public WorkTask(int duration, int year, int month, int day, int priority,
                    String subject, String ResponsiblyPerson, boolean notification) {
        super(duration, year, month, day, priority, subject, ResponsiblyPerson);
        this.notification = notification;
    }
    @Override
    public String toString(){
        return "-".repeat(100)+"\nТип: Рабочая задача\n"+
                super.toString()+"*".repeat(100)+"\n";
    }
}
