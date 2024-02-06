package seminar1hw.InMemoryModel;

import seminar1hw.ModelElements.Camera;
import seminar1hw.ModelElements.Flash;
import seminar1hw.ModelElements.PoligonalModel;
import seminar1hw.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangeObserver> changeObservers;

    public ModelStore(List<IModelChangeObserver> changeObservers) throws Exception {
        this.changeObservers = changeObservers;
        Models = new ArrayList<>();
        Scenes = new ArrayList<>();
        Flashes = new ArrayList<>();
        Cameras = new ArrayList<>();

        Models.add(new PoligonalModel(null));
        Flashes.add(new Flash());
        Cameras.add(new Camera());
        Scenes.add(new Scene(0, Models, Flashes, Cameras));
    }

    public Scene GetScenes(int id) {
        for (int i = 0; i < Scenes.size(); i++) {
            if (Scenes.get(i).id == id) {
                return Scenes.get(i);
            }
        }
        return null;
    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }
}
