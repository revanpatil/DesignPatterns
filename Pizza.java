public abstract class Pizza implements Item{

    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
