public class B extends A {
    protected String b;

    public B(String a,String b, X x){
        super(a,x);
        this.b = b;
    }

    @Override
    public String toString() {
        return "B{" +
                "b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}