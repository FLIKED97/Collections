public class Example<T>{
    private String string = "";

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
    public void addToString(T t){
        if (this.string.isEmpty()){
            this.string += t.toString();

        } else
            this.string += "\n" + t.toString();
    }
}
