package seminar1hw.ModelElements;

import java.lang.reflect.Type;
import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.id = id;
        Models = models;
        Flashes = flashes;
        Cameras = cameras;

        Models.add(new PoligonalModel(null));
        Cameras.add(new Camera());
    }

    public Type method1(Type type) {
//        TODO
        return type;
    }

    public Type method2(Type type1, Type type2) {
//        TODO
        return type1;
    }
}
