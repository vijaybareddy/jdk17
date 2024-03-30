package country;

public class Test {
    public static void main(String[] args) {
        Country country=new Country();
        country.name="india";
        country.numberCode="+91";
        country.currency="rupee";
        country.state= country.state;
        System.out.println(country);

        State state=new State();
        state.name="tg";
        state.language="telugu";
        state.population="2000000";
        state.country=country;
        System.out.println(state);

        District district=new District();
        district.name="suryapet";
        district.pinCode="508213";
        System.out.println(district);

    }
}
