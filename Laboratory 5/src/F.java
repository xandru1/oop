public class F extends E {
    protected String f;
    public F(String a,String b,String c,String d,String e,String f, X x){
        super(a,b,c,d,e,x);
        this.f = f;
    }

    @Override
    public String toString() {
        return "F{" +
                "f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}