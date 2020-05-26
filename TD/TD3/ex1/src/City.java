package city;

import country;
import static java.util.Objects.requireNonNull;

public class City {
    private final String name;

    public City(String name) {
        this.name = requireNonNull(name);
    }

    public String name() {
        return this.name;
    }

    @Override
    public String toString() {
        return String.format("%s", this.name());
    }

}
