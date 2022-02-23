public class Author {
    private String name;
    private String sex;
    private String email;

    Author(String name, String sex, String email) {
        this.name = name;
        this.sex = sex;
        this.email = email;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() { return sex; }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return String.format("Информация об авторе: имя %s, пол %s, email %s",
                name, sex, email);
    }

}
