package mega.trace;

import java.util.ServiceLoader;

public interface MEGATraceService {
    MEGATraceService INSTANCE = find();

    static MEGATraceService find() {
        for (MEGATraceService service : ServiceLoader.load(MEGATraceService.class))
            return service;
        return null;
    }

    void message(byte[] msg);

    void messageColor(byte[] msg, int color);
}
