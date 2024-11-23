package enumTask;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(getPopulationPercent(Continent.ASIA));
        System.out.println(getPopulationPercent(Continent.EUROPE));
    }
    public static String getPopulationPercent(Continent continent) {
        String result = null;
        switch (continent){
            case ASIA -> result = "59.5%";
            case AFRICA -> result = "16.9%";
            case NORTH_AMERICA -> result = "7.7%";
            case SOUTH_AMERICA -> result = "5.6%";
            case ANTARCTICA -> result = "0.1%";
            case EUROPE -> result = "9.7%";
            case AUSTRALIA -> result = "0.5%";
        }

//        if (continent == Continent.ASIA) {
//            result = "59.5%";
//        } else if (continent == Continent.AFRICA) {
//            result = "16.9%";
//        } else if (continent == Continent.NORTH_AMERICA) {
//            result = "7.7%";
//        } else if (continent == Continent.SOUTH_AMERICA) {
//            result = "5.6%";
//        } else if (continent == Continent.ANTARCTICA) {
//            result = "<0.1%";
//        } else if (continent == Continent.EUROPE) {
//            result = "9.7%";
//        } else if (continent == Continent.AUSTRALIA) {
//            result = "0.5%";
//        } else {
//            result = "Такого материка не существует.";
//        }
//
        return result;
    }
    enum Continent {
        ASIA,
        AFRICA,
        NORTH_AMERICA,
        SOUTH_AMERICA,
        ANTARCTICA,
        EUROPE,
        AUSTRALIA
    }
}
