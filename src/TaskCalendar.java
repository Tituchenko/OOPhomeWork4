import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class TaskCalendar<T extends Task>{
    private ArrayList<T> task;


    public TaskCalendar(){
        this.task=new ArrayList<>();
    }
    public void add(T t){
        Calendar nowDate = new GregorianCalendar();
        if (t.isNotification()){
            long diff=getDateDiff(nowDate.getTime(),t.getDedlain().getTime(),TimeUnit.DAYS);
            if (diff<0) {
                System.out.println("Задача просрочена!:\n"+t);
            } else if (diff<=3) {
                System.out.println("До дедлайна осталось!:"+diff+" дней!\n");

            }
        }
        checkCalendar(t);
        this.task.add(t);
    }
    public void checkCalendar(T t1){
        for (T t2:this.task) {
            if (t1.getDedlain().getTime().equals(t2.getDedlain().getTime())){
                System.out.println("В один день две задачи!\n");
                System.out.println("Задача 1:\n");
                System.out.println(t2);
                System.out.println("Задача 2:\n");
                System.out.println(t1);
            }
        }
    }
    public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInMillies = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
    }
    public void remove(T t){
        this.task.remove(t);
    }
    @Override
    public String toString() {
        String result="Ваш календарь:\n";
        for (Task t:this.task) {
            result+=t.toString();
        }
        return result;
    }

    public void sort(){
        Collections.sort(this.task);
    }



}
