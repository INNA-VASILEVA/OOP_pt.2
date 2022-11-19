public class Flower {
    private String kind;
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan = 3;

    public Flower(String kind, String flowerColor, String country, double cost, int lifeSpan) {
        if (kind == null) {
            this.kind = "Отсутствует вид цветка";
        }else {
            this.kind = kind;
        }
        if (flowerColor == null) {
            this.flowerColor = "Белый";
        }else {
            this.flowerColor = flowerColor;
        }
        if (country == null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1.0;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <=0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null) {
            this.flowerColor = "Белый";
        }else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1.0;
        } else {
            this.cost = cost;
        }
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
}
