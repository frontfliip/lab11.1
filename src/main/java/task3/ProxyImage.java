package task3;

import java.util.HashMap;
import java.util.Map;

public class ProxyImage implements MyImage {

    private String filename;

    private Map<String, MyImage> cache = new HashMap<>();

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        MyImage image;
        if (cache.containsKey(filename)) {
            image = cache.get(filename);
        } else {
            image = new RealImage(filename);
            cache.put(filename, image);
        }
        image.display();
    }
}
