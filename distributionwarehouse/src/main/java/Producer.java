/**
 * Created by flaviu.lupoian on 13/07/2017.
 */
public class Producer {
    private String name;

    public Producer() {
    }

    public Producer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "; ";
    }
}
