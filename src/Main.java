import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Meet meet1=new Meet(2023,2,25,2,
                "Встреча с партнером","ресторан","партнер");
        Meet meet2=new Meet(2023,2,26,1,
                "Встреча заказчиком","офис заказчика","заказчик");
        Meet meet3=new Meet(2023,2,27,3,
                "Встреча с другом","бар","друг");

        WorkTask workTask1=new WorkTask(2,2023,2,10,
                1,"Проект альфа","Петроав",true);
        WorkTask workTask2=new WorkTask(2,2023,2,26,
                1,"Проект бетта","Иванов",true);
        WorkTask workTask3=new WorkTask(2,2023,2,27,
                1,"Проект гамма","Сидоров",false);

        PrivateTask privateTask1=new PrivateTask(2,2023,2,25,0,
                "Позвонить маме");
        PrivateTask privateTask2=new PrivateTask(2,2023,2,28,0,
                "Назначить встречу другу");
        PrivateTask privateTask3=new PrivateTask(2,2023,3,1,0,
                "Оплатить счета");

        TaskCalendar taskCalendar = new TaskCalendar();
        taskCalendar.add(meet1);
        taskCalendar.add(meet2);
        taskCalendar.add(meet3);
        taskCalendar.add(workTask1);
        taskCalendar.add(workTask2);
        taskCalendar.add(workTask3);
        taskCalendar.add(privateTask1);
        taskCalendar.add(privateTask2);
        taskCalendar.add(privateTask3);
        taskCalendar.sort();
        System.out.println(taskCalendar);

    }
}