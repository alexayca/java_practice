package ProgramacionGenerica;

public class Cat extends Animal{

    private String litterPreference;

    public Cat(){       }

    public Cat(String name){
        this.name=name;
    }

    public String getLitterPreference() {
        return litterPreference;
    }

    public void setLitterPreference(String litterPreference) {
        this.litterPreference = litterPreference;
    }
}
