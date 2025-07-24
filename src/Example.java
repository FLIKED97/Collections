public class Example<T, V>{
    private String string = "";

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
    public void addToString(T t, V v){
        if (this.string.isEmpty()){
            this.string += t.toString() + v.toString();

        } else
            this.string += "\n" + t.toString() + v.toString();
    }
}
