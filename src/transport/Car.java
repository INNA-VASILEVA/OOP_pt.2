package transport;

import java.time.LocalDate;

public class Car {
   private final String brand;
   private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String gears;
    private final String typeOfBody;
    private String regNumber;
    private final int seatsCount;
    private boolean summerTires;
    private Key key;
    private Insurance insurance;



    public Car(String brand, String model, double engineVolume, String color, int year, String country, String typeOfBody, int seatsCount, String gears, boolean summerTires) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (typeOfBody == null) {
            this.typeOfBody = "default";
        } else {
            this.typeOfBody = typeOfBody;
        }
        if (seatsCount <= 0) {
            this.seatsCount = 1;
        } else {
            this.seatsCount = seatsCount;
        }
        if (gears == null) {
            this.gears = "default";
        } else {
            this.gears = gears;
        }
        if (key==null){
            this.key =new Key();
        }else {
            this.key = key;
        }
        if (insurance==null){
            this.insurance =new Insurance();
        }else {
            this.insurance = insurance;
        }
        this.regNumber = "x000xx000";
        this.summerTires = true;

    }



    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        this.gears = gears;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void changeTires() {
        summerTires = !summerTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public boolean isCorrectRegNumber(){
        if (regNumber.length()!=9){
            return false;
        }
        char[] chars = regNumber.toCharArray();
        if(Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])){
            return false;
        }
        if(!Character.isDigit(chars[1]) || !Character.isDigit(chars[2])|| !Character.isDigit(chars[3])|| !Character.isDigit(chars[6])|| !Character.isDigit(chars[7])|| !Character.isDigit(chars[8])){
            return false;
        }
        return true;



    }
    public static class Key {
        private final boolean remoteStart;
        private final boolean accessWithoutKey;

        public Key(boolean remoteStart, boolean accessWithoutKey) {
            this.remoteStart = remoteStart;
            this.accessWithoutKey = accessWithoutKey;
        }
        public Key () {
            this(false,false);
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isAccessWithoutKey() {
            return accessWithoutKey;
        }
    }

    public static class Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if ( expireDate == null){
                this.expireDate = LocalDate.now().plusDays(365);
            }else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if(number==null){
                this.number ="123456789";
            }else {
                this.number = number;
            }
        }


        public Insurance (){
            this(null, 100_000, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate () {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())){
                System.out.println("Нужно срочно оформлять новую страховку");
            }
        }

        public void checkInsuranceNumber (){
            if (number.length() !=9){
                System.out.println("Номер страховки некорректный");
            }
        }
    }



}
