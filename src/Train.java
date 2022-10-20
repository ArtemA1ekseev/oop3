public class Train extends Transport{

    private int priceTrips;
    private String stationNameDepartures;
    private String finalStop;
    private int quantityWagons;

    public Train(int priceTrips, String stationNameDepartures, String finalStop, int quantityWagons) {
        this("default", "default", 2001, "default", 100, priceTrips, stationNameDepartures, finalStop, quantityWagons);
    }

    public Train(String brand, String model, int productionYear, String productionCountry, int maxSpeed, int priceTrips, String stationNameDepartures, String finalStop, int quantityWagons) {
        super(brand, model, productionYear, productionCountry, maxSpeed);
        if (priceTrips < 0) {
            this.priceTrips = 1000;
        } else {
            this.priceTrips = priceTrips;
        }
        if (stationNameDepartures != null && !stationNameDepartures.isEmpty() && !stationNameDepartures.isBlank()) {
            this.stationNameDepartures = stationNameDepartures;
        }
        if (finalStop != null && !finalStop.isEmpty() && !finalStop.isBlank()) {
            this.finalStop = finalStop;
        }
        if (quantityWagons < 0) {
            this.quantityWagons = 5;
        } else {
            this.quantityWagons = quantityWagons;
        }
    }

    public int getPriceTrips() {
        return priceTrips;
    }

    public void setPriceTrips(int priceTrips) {
        if (priceTrips < 0) {
            this.priceTrips = 1000;
        } else {
            this.priceTrips = priceTrips;
        }
    }

    public String getStationNameDepartures() {
        return stationNameDepartures;
    }

    public void setStationNameDepartures(String stationNameDepartures) {
        if (stationNameDepartures != null && !stationNameDepartures.isEmpty() && !stationNameDepartures.isBlank()) {
            this.stationNameDepartures = stationNameDepartures;
        }
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        if (finalStop != null && !finalStop.isEmpty() && !finalStop.isBlank()) {
            this.finalStop = finalStop;
        }
    }

    public int getQuantityWagons() {
        return quantityWagons;
    }

    public void setQuantityWagons(int quantityWagons) {
        if (quantityWagons < 0) {
            this.quantityWagons = 5;
        } else {
            this.quantityWagons = quantityWagons;
        }
    }

    @Override
    public String refill() {
        return "Заправка транспортного средства происходит дизельным топливом.";
    }
}
