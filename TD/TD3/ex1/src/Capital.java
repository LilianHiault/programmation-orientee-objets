package city;

import country;

public class Capital extends City {
    public Capital(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Capital %s", this.name());
    }
}
