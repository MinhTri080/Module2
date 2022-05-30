package thayDoiKichThuoc;

public class Shape {
    private String color = "red";
    private boolean test = true;
    public Shape(){

    }
    public Shape (String color,boolean test){
        this.color = color;
        this.test = test;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean getTest(){
        return test;
    }
    public void setTest(boolean test){
        this.test = test;
    }
    @Override
    public String toString(){
        return " Shape with color :"
                + getColor()
                + "  and  "
                + (getTest()? true : false);
    }
}
