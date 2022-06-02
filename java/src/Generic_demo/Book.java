package Generic_demo;

class Book<S, S1, I extends Number> extends Dictionary {
    private Integer num;

    public Book(Object key, Object value) {
        super(key, value);
    }

    public Book(Object key, Object value, Integer num) {
        super(key, value);
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
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
}

