public class X {
    private String x;

    public X(String x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "X{" +
                "x='" + x + '\'' +
                '}';
    }

    public X(){
        x = "default";
    }
}