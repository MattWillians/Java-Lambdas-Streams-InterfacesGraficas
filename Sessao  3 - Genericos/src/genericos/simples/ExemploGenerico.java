package genericos.simples;

public class ExemploGenerico<T> {

    T obj;

    public ExemploGenerico(T obj) {
        super();
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void showType(){
        System.out.println(obj.getClass().getName());
    }
}