public class Meet extends Task{
    private String place;
    private String person;

    public Meet( int year, int month, int day, int priority,
                String subject, String place, String person) {

        super(1, year, month, day, priority, subject, "Я");
        this.place = place;
        this.person = person;
    }

    @Override
    public String toString(){
        return "-".repeat(100)+"\nТип: Встреча\n"+
                "Место:"+this.place+"\n"+
                "С кем:"+this.person+"\n"+
                super.toString()+
                "*".repeat(100)+"\n";
    }
}
