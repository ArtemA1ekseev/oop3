import Animals.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada", null, 1.7, "желтый", 2015, "России");
        ladaGranta.setGears("автомат");
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 0, "черный", 2020, "Германии");
        audiA8.setSummerTyres(true);
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, null, 2021, "Германии");
        bmwZ8.setRegNumber("x412zc413");
        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 0, null);
        kiaSportage.setColor("титановый");
        Car hyundaiAvante = new Car(null, "Avante", 1.6, "оранжевый", 2016, "Южной Корее");
        hyundaiAvante.setEngineVolume(3.1);

        printInfoCar(ladaGranta);
        printInfoCar(audiA8);
        printInfoCar(bmwZ8);
        printInfoCar(kiaSportage);
        printInfoCar(hyundaiAvante);

        System.out.println();

        Train lastochka = new Train("Ласточка", "B-901", 2011, "России", 301, 3500, "Белорусского вокзала", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "России", 270, 1700, "Ленинградского вокзала", "Ленинград-Пассажирский",8);

        printInfoTrain(lastochka);
        printInfoTrain(leningrad);

        System.out.println();

        Bus tourismo = new Bus("MERCEDES", "Tourismo", 2013, "Германии", "красного", 150);
        Bus granbird = new Bus("KIA", "Granbird", 2005, "Южной Кореи", "белого", 110);
        Bus bj = new Bus("Foton", "BJ 6126", 2003, "Китае", "белого", 140);

        printInfoBus(tourismo);
        printInfoBus(granbird);
        printInfoBus(bj);

        System.out.println();

        Herbivores gazel = new Herbivores("Газель", 3, "Естественная среда обитания", 97, "Растительноядные или травоядные");
        Herbivores jiraph = new Herbivores("Жираф", 13, "Естественная среда обитания", 60, "Растительноядные или травоядные");
        Herbivores jiraph1 = new Herbivores("Жираф", 13, "Естественная среда обитания", 60, "Растительноядные или травоядные");
        Herbivores loshad = new Herbivores("Лошадь", 7, "Среда обитания для диких лошадей — это степи, полупустыни, лесостепи.", 88, "Питание Лошадь причисляется к травоядным животным. На пастбище она съедает от 25 до 100 кг травы в сутки.");

        Predators giena = new Predators("Гиена", 9, "Современные гиены обитают на территории Африки и юго-западной Азии.", 64, "Можно сказать, что за вычетом питания падалью гиена практически всеядна");
        Predators tiger = new Predators("Тигр", 3, "В настоящее время тигры сохранились на территории 14 стран — Бангладеш, Бутан, Вьетнам, Индия, Индонезия, Камбоджа, Китай, КНДР (не подтверждено), Лаос, Малайзия, Мьянма, Непал, Россия, Таиланд.", 65, "Основной рацион — это кабаны, пятнистые олени, изюбри и косули. Если этих животных не хватает, тигры питаются барсуками, енотами, зайцами, рыбой, а иногда заваливают медведей. В сильный голод амурские тигры нападают на домашний скот и собак.");
        Predators medved = new Predators("Медведь", 15, "Бурый медведь – лесное животное.", 40, "По характеру питания всеядные, однако некоторые виды предпочитают растительную пищу, другие — животную.");

        Amphibians lagyshka = new Amphibians("Лягушка", 3, "Лягушки и жабы – это холоднокровные животные, размножающиеся в воде.");
        Amphibians yj = new Amphibians("Уж пресноводный", 12, "Большинство ужей обитает во влажных биотопах и в той или иной мере связаны с водоёмами.");

        Flightless pavlin = new Flightless("Павлин", 7, "Распространение Широко распространён в Бангладеш, Непале, Пакистане, Индии и Шри-Ланке, а также в Иране на высоте до 2000 м над уровнем моря, обитает в джунглях и лесистых местностях, на культивируемых землях и вблизи деревень, предпочитая заросли кустарников, лесные вырубки и берега рек.", "Птицы довольно шустро передвигается бегом по земле и веду наземные образ жизни.");
        Flightless pingvin = new Flightless("Пингвин", 10, "Пингвины обитают в открытом море Южного полушария.", "Из-за их относительно коротких ног на суше пингвины передвигаются, переваливаясь с боку на бок.");
        Flightless dodo = new Flightless("Додо", 10, "Основной средой обитания додо, вероятно, были леса в более сухих, прибрежных районах острова.", "Им не нужно было передвигаться на большие расстояния или спасаться от хищников.");

        Flying chaika = new Flying("Чайка", 10, "Наиболее многочисленный род птиц семейства чайковых, обитающих как на морских просторах, так и на внутренних водоёмах.", "Морские чайки обладают плавательными перепонками, за счет которых птица такого типа прекрасно передвигается в воде, но к океанскому виду таких пернатых не отнесли.");
        Flying albatros = new Flying("Альбатрос", 21,"Обитают альбатросы в Южном океане (недавнее образование — воды, окружающие Антарктиду) и в основном гнездятся на отдалённых островах.", "Для передвижения в воздухе они используют восходящие потоки воздуха, отраженные от поверхности океана. Сначала альбатрос набирает высоту, а затем на расправленных крыльях планирует, плавно снижаясь к поверхности воды и осматривая попутно водную гладь.");
        Flying sokol = new Flying("Сокол", 12,"Сегодня соколы встречаются в большинстве наземных местообитаний по всему миру, но наибольшее их разнообразие наблюдается в Южной Америке и Африке.", "Пернатые часами планируют в небе в поисках добычи.");

        System.out.println(jiraph1.equals(jiraph));

        System.out.println();
        System.out.println(chaika);
        System.out.println(albatros);
        System.out.println(sokol);
        System.out.println();
        System.out.println(pavlin);
        System.out.println(pingvin);
        System.out.println(dodo);
        System.out.println();
        System.out.println(giena);
        System.out.println(tiger);
        System.out.println(medved);
        System.out.println();
        System.out.println(gazel);
        System.out.println(jiraph);
        System.out.println(loshad);
        System.out.println();
        System.out.println(lagyshka);
        System.out.println(yj);
        System.out.println();

        ArrayList<Herbivores> listMP = new ArrayList<>();
        listMP.add(gazel);
        listMP.add(jiraph);
        listMP.add(loshad);
        listMP.add(jiraph1);

        for (Herbivores herbivores: listMP) {
            if (jiraph.equals(herbivores)) {
                System.out.println("Обнаружено совпадение с текущим объектом класса!");
            } else {
                System.out.println("Совпадение с текущим объектом класса не обнаружено!");
            }
        }
    }

    private static void printInfoCar(Car car) {
        System.out.println("Бренд автомобиля — " + car.getBrand()
                + ", модель — " + car.getModel() + ", сборка в "
                + car.getProductionCountry() + ", цвет кузова — " + car.getColor()
                + ", объем двигателя — " + car.getEngineVolume() + " л, год выпуска — "
                + car.getProductionYear() +
                ", коробка передач: " + car.getGears() +
                ", тип кузова: " + car.getTypeOfBody() +
                ", рег. номер: " + car.getRegNumber() +
                ", кол-во мест: " + car.getCountSeats() +
                ", " + (car.isSummerTyres() ? "летняя" : "зимняя") + " резина" +
                ", " + (car.getKey().isWithoutKeyAccess() ? "безключевой доступ" : "ключевой доступ") +
                ", " + (car.getKey().isRemoteRunEngine() ? "удаленный запуск" : "обычный запуск") +
                ", номер страховки: " + car.getInsuranse().getNumber() +
                ", стоимость страховки: " + car.getInsuranse().getCost() +
                ", срок действия страховки: " + car.getInsuranse().getExpireDate() + car.refill()
        );
    }

    private static void printInfoTrain(Train train) {
        System.out.println("Поезд " + train.getBrand()
                + ", модель " + train.getModel() + ", "
                + train.getProductionYear() + " год выпуска в " + train.getProductionCountry()
                + ", скорость передвижения – " + train.getMaxSpeed() + " км/ч, отходит от "
                + train.getStationNameDepartures() + " и следует до станции " + train.getFinalStop() +
                ". Цена поездки – " + train.getPriceTrips() +
                " рублей, в поезде " + train.getQuantityWagons() +
                " вагонов." + train.refill()
        );
    }

    private static void printInfoBus(Bus bus) {
        System.out.println("Автобус " + bus.getBrand()
                + ", модель " + bus.getModel() + ", "
                + bus.getProductionYear() + " год выпуска в " + bus.getProductionCountry()
                + ", скорость передвижения – " + bus.getMaxSpeed() + " км/ч, "
                + bus.getColor() + " цвета." + bus.refill()
        );
    }
}