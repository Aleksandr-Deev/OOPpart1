public class Human {

    int yearOfBirth;
    String name;
    String town;
    String job;


    public Human(String name) {
        this(name, null, 0, null);
    }

    public Human(String name, String town) {
        this(name, town, 0, null);
    }

    public Human(String name, String town, int yearOfBirth) {
        this(name, town, yearOfBirth, null);
    }


    public Human(String name, String town, int yearOfBirth, String job){
        if (name == null || name.equals("")) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

        if (town == null || town.equals("")) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }

        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }

        if (job == null || job.equals("")) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
    }
    public void printingData() {
        System.out.println("Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". Я родился в "
                 + this.yearOfBirth + " году. Я работаю на должности " + this.job + ". Будем знакомы!");
     }
}

