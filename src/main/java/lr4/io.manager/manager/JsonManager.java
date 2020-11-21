package lr4.io.manager.manager;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;

public class JsonManager implements Json {
    private JsonManager() { };

    private static JsonManager instance;
    private final Gson gson = new Gson();

    private Object serializable;

    public static JsonManager getInstance() {
        if(instance == null) {
            instance = new JsonManager();
        }
        return instance;
    }

    @Override
    public Object getFromJson(String path, Object castTo) throws IOException {
        return gson.fromJson(new FileReader(path), (Type) castTo);
    }

    @Override
    public void convertToJson(String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        gson.toJson(serializable, fileWriter);
        fileWriter.close();
    }

    @Override
    public void setSerializable(Object obj) {
        this.serializable = obj;
    }
}
