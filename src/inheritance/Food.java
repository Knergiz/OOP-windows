package inheritance;

public class Food {

    Food food = new Food();

    public String taste;
    protected String name;
    boolean isSpicy;
    private boolean isOrganic(){
        return isOrganic();
    }



    public String color;

    @Override
    public String toString() {
        return "Vegetable{" +
                "taste='" + taste + '\'' +
                ", name='" + name + '\'' +
                ", isSpicy=" + isSpicy +
                ", isOrganic=" + isOrganic() +
                ", color='" + color + '\'' +
                '}';
    }
}
