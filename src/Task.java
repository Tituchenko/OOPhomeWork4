import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task implements Comparable<Task>{
    private static int count;
    private int id;
    private int duration;

    public Calendar getDedlain() {
        return dedlain;
    }

    private Calendar dedlain;
    private int priority;
    private String subject;
    private String ResponsiblyPerson;
   private String status;

    public Task(int duration, int year,int month,int day, int priority, String subject, String ResponsiblyPerson) {
        this.duration = duration;
        this.dedlain = new GregorianCalendar(year, month-1 , day-1);
        this.priority = priority;
        this.subject = subject;
        this.ResponsiblyPerson = ResponsiblyPerson;
        this.status="новая";
        this.id=Task.count;
        Task.count+=1;
    }
    @Override
    public String toString(){
        DateFormat df = new SimpleDateFormat("dd MMMM yyyy");
        return "Продолжительность:"+this.duration+"\n"+
                "Дэдлайн:"+df.format(this.dedlain.getTime())+"\n"+
                "Приоритет:"+ this.priority+"\n"+
                "Тема:"+this.subject+"\n"+
                "Ответственный:"+this.ResponsiblyPerson+"\n"+
                "Статус:"+this.status+"\n";
    }
    public void inWork(){
        this.status="В работе";
    }
    public void finish(){
        this.status="Закончено";
    }

    @Override
    public int compareTo(Task t) {
        return this.dedlain.compareTo(t.dedlain);
    }
    public boolean isNotification() {
        return false;
    }

}
