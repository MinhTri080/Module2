package Generic_demo;

public class ClassStudent<I,I1> extends Dictionary{
    private I number;
    public ClassStudent(Integer key, Integer value) {
        super(key, value);
        this.number = number;
    }

    public I getNumber() {
        return number;
    }

    public void setNumber(I number) {
        this.number = number;
    }

    @Override
    public Object getKey() {
        return super.getKey();
    }

    @Override
    public void setKey(Object key) {
        super.setKey(key);
    }

    @Override
    public Object getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(Object value) {
        super.setValue(value);
    }

    @Override
    public String toString() {
        return "ClassStudent{" +
                "number=" + number +
                '}';
    }
}
