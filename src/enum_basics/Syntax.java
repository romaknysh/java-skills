package enum_basics;

public class Syntax {
    // --- 1. Basic enum ---
    enum Direction{
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    // --- 2. Enum with method ---
    enum Season {
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER;

        public Season getOpposite(){
            switch (this){
                case SPRING -> {
                    return AUTUMN;
                }
                case SUMMER -> {
                    return WINTER;
                }
                case AUTUMN -> {
                    return SPRING;
                }
                case WINTER -> {
                    return SUMMER;
                }
                default -> throw new RuntimeException("unknown");
            }
        }
    }

    // --- 3. enum with field and construct ---
    enum Planet{
        MERCURY(3.303e+23),
        EARTH(5.976e+24),
        MARS(6.421e+23);

        private double mass;

        Planet(double mass){
            this.mass = mass;
        }

        public double getMass(){
            return mass;
        }
    }

    public static void main(String[] args) {

        // --- basic usage ---
        Direction d = Direction.NORTH;
        System.out.println(d); // NORTH

        // --- switch on enum ---
        switch (d) {
            case NORTH: System.out.println("Going north"); break;
            case SOUTH: System.out.println("Going south"); break;
            default: System.out.println("Other direction");
        }

        // --- enum with method ---
        Season s = Season.SUMMER;
        System.out.println(s.getOpposite()); // WINTER

        // --- valueOf - String to enum ---
        Direction dir = Direction.valueOf("EAST");
        System.out.println(dir); // EAST

        // --- values - all enum values ---
        for (Direction direction : Direction.values()) {
            System.out.println(direction);
        }

        // --- enum with field ---
        System.out.println(Planet.EARTH.getMass());
    }
}
