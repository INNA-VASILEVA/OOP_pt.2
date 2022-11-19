public class Human {
    private int yearOfBirth;
    public String name;
    private String town;
    public String jobTitle;

    public Human (int yearOfBirth, String name, String town, String jobTitle) {

        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name == null) {
            this.name = "Информации нет";
        } else {
            this.name = name;
        }
        if (town == null || town.isBlank() || town.isEmpty()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == null) {
            this.jobTitle = "Информации нет";
        } else {
            this.jobTitle=jobTitle;
        }
    }


    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }


    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        if (town == null || town.isBlank() || town.isEmpty()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }
}
