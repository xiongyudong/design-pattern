package version5.event;

public class DinnerEvent {

    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public DinnerEvent(int type) {
        this.type = type;
    }
}
