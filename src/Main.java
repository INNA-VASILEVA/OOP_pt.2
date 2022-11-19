import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Human max = new Human(1988, "Максим", "Минск", "Бренд менеджер");
        Human anya = new Human(1993, "Аня", "Москва", "Методист образовательных программ");
        Human katya = new Human(1992, "Катя", "Калининград", "Продакт менеджер");
        Human artem = new Human(1995, "Артем", "Москва", "Директор по развитию бизнеса");
        Human vladimir = new Human(2001, "Владимир", "Казань", "Безработный");

        printInfo(max);
        printInfo(anya);
        printInfo(katya);
        printInfo(artem);
        printInfo(vladimir);

        Flower rose = new Flower("Роза", "Розовый", "Голландия", 35.59, 7);
        Flower chrysanthemum = new Flower("Хризантема", "Бело-розовый", "Япония", 15.00, 5);
        Flower peony = new Flower("Пион", "Ярко-розовый", "Англия", 68.90, 1);
        Flower gypsophila = new Flower("Гипсофила", "Голубой", "Турция", 19.5, 10);

        printFlowerInfo(rose);
        printFlowerInfo(chrysanthemum);
        printFlowerInfo(peony);
        printFlowerInfo(gypsophila);

        calculateCostOfBouquet(rose, rose, rose,
                chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum,
                gypsophila);


        Car lada = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия","Седан", 4, "Автомат", true);

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия","Седан", 4, "Автомат", true);

        Car bmw = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия","Седан", 4, "Автомат", true);
        bmw.setRegNumber("в855ст799");
        bmw.setInsurance(new Car.Insurance(LocalDate.now(), 300_000, "454568881546"));
        bmw.getInsurance().checkExpireDate();
        bmw.getInsurance().checkInsuranceNumber();

        Car kia = new Car("Kia", "Sportage 4", 2.4, "Красный", 2018, "Южная Корея","Седан", 4, "Автомат", true);

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея","Седан", 4, "Автомат", true);
        hyundai.setRegNumber("т076ае799");
        hyundai.setKey(new Car.Key(true, true));

        printCarInfo(lada);
        printCarInfo(audi);
        printCarInfo(bmw);
        printCarInfo(kia);
        printCarInfo(hyundai);
    }


    private static void printInfo(Human human) { System.out.println("Привет! Меня зовут " + human.name + ". Я из города " + human.getTown() + ". Я родился в " + human.getYearOfBirth() + " году. Я работаю на должности " + human.jobTitle + ". Будем знакомы!");
    }
    private static void printCarInfo(Car car) {
        System.out.println("Марка машины " + car.getBrand() + ". Модель " + car.getModel() + ". Объем двигателя " + car.getEngineVolume() + ". Цвет кузова " + car.getColor() + ". Год выпуска " + car.getYear() + ". Сборка " + car.getCountry() +
                ". Тип кузова " + car.getTypeOfBody() + ". Количество мест " + car.getSeatsCount() + ". Тип коробки передач " + car.getGears() + " . Рег. номер : " + car.getRegNumber() + ". Тип резины - " + (car.isSummerTires() ? "летняя " : "зимняя") + " резина" +
        ". Доступ " + (car.getKey().isAccessWithoutKey()? "безключевой доступ" : "ключевой доступ") + " Тип запуска " +((car.getKey().isRemoteStart())? " обычный запуск ": "удаленный запуск") + ". Номер страховки " + (car.getInsurance().getNumber()) +
                ". Стоимость страховки " + (car.getInsurance().getCost() + ". Срок действия страховки " + (car.getInsurance().getExpireDate())));
    }
    private static void printFlowerInfo (Flower flower) {System.out.println("Наименование цветка: " + flower.getKind() + ". Цвет: " + flower.getFlowerColor() +  ". Страна происхождения: " + flower.getCountry() + ". Стоимость: " + flower.getCost() + ". Срок стояния: " + flower.getLifeSpan());
    }
    private static void calculateCostOfBouquet(Flower...flowers) {
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.getLifeSpan() < minimumLifeSpan) {
                minimumLifeSpan = flower.getLifeSpan();
            }
            totalCost += flower.getCost();
            printFlowerInfo(flower);
        }
        totalCost=totalCost*1.1;
        System.out.println("Стоимость букета " + totalCost);
        System.out.println("Стоимость букета " + minimumLifeSpan);
    }
}