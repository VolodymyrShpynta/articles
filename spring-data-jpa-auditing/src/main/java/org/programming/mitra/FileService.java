package org.programming.mitra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FileService {

    @Autowired
    private FileRepository fileRepository;

    @Transactional
    public File save(final File file) {
        return fileRepository.save(file);
    }
}
