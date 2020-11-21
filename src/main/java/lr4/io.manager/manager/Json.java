package lr4.io.manager.manager;

import java.io.IOException;

interface Json {
    Object getFromJson(String path, Object castTo) throws IOException;
    void convertToJson(String path) throws IOException;
    void setSerializable(Object serializable);
}
