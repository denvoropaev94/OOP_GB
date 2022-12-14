public class milk extends product{
    public milk(String name, double price,String fatContent,double volume) {
        super(name, price);
        this.fatContent = fatContent;
        this.setVolume(volume);
    }
    private double volume;
    private String fatContent;

    public double getVolume() {
        return volume;
    }

    private void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("%s-%s-%.2f",super.toString(),fatContent,volume) ;
    }

    public String getFatContent() {
        return fatContent;
    }

    private void setFatContent(String fatContent) {
        this.fatContent = fatContent;
    }
}
