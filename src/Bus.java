public class Bus extends Transport{

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    @Override
    public String refill() {
        return "Заправка транспортного средства происходит дизельным топливом или бензином.";
    }
}
