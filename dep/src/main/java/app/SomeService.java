package app;

import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

public class SomeService {

    @Transactional
    public List<String> listAll() {
        return Collections.emptyList();
    }
}
