package lyThuyet;

public class MyDate {
    int day;
    int monht;
    int year;

    public MyDate(int day, int monht, int year) {
        this.day = day;
        this.monht = monht;
        this.year = year;
    }

    public void printDay() {
        System.out.println("Day :" + this.day);}
    public void printMonht () {
        System.out.println("Monht :" + this.monht);}
    public void printYear () {
                System.out.println("Year :" + this.year);
            }
    public void printMyDate (){
        System.out.println("MyDate :"+this.day+"-"+this.monht+"-"+this.year);
    };
}



