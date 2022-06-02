package Generic_demo;

public class Generic1<T> {
    T obj;
    void add(T obj){
        this.obj = obj;
    }
    T getObj(){
        return obj;
    }
}
