public class second {
    public static void main(String[] args) {
        Studentt student = new Studentt(11122233,1970,5,3);
        BirthDate date= student.getbirthday();
        System.out.println(student.getbirthday());
        date.setyear(2000);
        System.out.println(date);
    }
}

class Studentt{
    private int id;
    private BirthDate birthdate;
    public Studentt(int i,int year,int month,int day){
        id=i;
        birthdate=new BirthDate(year, month, day);
    }
    public int getid(){
        return id;
    }
    public BirthDate getbirthday(){
        return birthdate;
    }
}
class BirthDate {
    int year;
    int month;
    int day;
    public BirthDate(int newyear,int newmonth,int newday){
        year=newyear;
        month=newmonth;
        day=newday;
    }
    public void setyear(int newyear){
        year=newyear;
    }
}