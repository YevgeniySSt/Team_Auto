package task_6;

public class ColorLightBulb extends SimpleLightBulb {
    public Color color;

    public ColorLightBulb(Color color) {
        this.color = color;
        this.isOn = false;
    }
}
