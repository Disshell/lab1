package io.disshell.DAO;

import org.springframework.stereotype.Service;
import io.disshell.model.Question;
import io.disshell.utils.CsvParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionDAOImpl implements QuestionDAO {
    private final CsvParser csvParserFile;
    private List<Question> questionsList;

    public QuestionDAOImpl(CsvParser csvParserFile) {
        this.csvParserFile = csvParserFile;
    }

    @Override
    public List<Question> getAll() throws IOException {
        List<String[]> fullQuestions = csvParserFile.getFullQuestions();
        questionsList = new ArrayList<>();
        int index = 0;
        for(String[] fullQuestion: fullQuestions){
            questionsList.add(
                Question.builder()
                    .answer(fullQuestion[2])
                    .id(index)
                    .option(fullQuestion[1])
                    .question(fullQuestion[0])
                    .build());
            index++;
        }
        return questionsList;
    }
}
