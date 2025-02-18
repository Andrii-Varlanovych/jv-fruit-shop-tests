package core.basesyntax.serviceimpl;

import core.basesyntax.service.WriterService;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileWriterServiceImpl implements WriterService {
    @Override
    public void writeToFile(String dataToWtite, String pathToOutputFile) {
        File file = new File(pathToOutputFile);
        try {
            Files.writeString(file.toPath(), dataToWtite);
        } catch (IOException e) {
            throw new RuntimeException("Can not read data from file: " + pathToOutputFile);
        }
    }
}
