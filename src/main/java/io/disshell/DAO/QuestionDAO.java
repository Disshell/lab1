package io.disshell.DAO;

import io.disshell.model.Question;

import java.io.IOException;
import java.util.List;

public interface QuestionDAO {
    List<Question> getAll() throws IOException;
}
