package country;

public class State {
    public String name;
    public String population;
    public String language;
    public Country country;

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", population='" + population + '\'' +
                ", language='" + language + '\'' +
                ", country=" + country +
                '}';
    }
}





