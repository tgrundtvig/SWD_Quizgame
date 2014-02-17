/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package impl;

import java.util.ArrayList;
import quizgame.Answer;
import quizgame.Question;
import quizgame.QuestionBank;
import quizgame.QuestionBuilder;

/**
 *
 * @author tog
 */
public class RamQuestionBankImpl implements QuestionBank
{
    private ArrayList<Question> questions;

    public RamQuestionBankImpl()
    {
        this.questions = new ArrayList<>();
    }
    
    @Override
    public int getNumberOfQuestions()
    {
        return questions.size();
    }

    @Override
    public Question getQuestion(int index)
    {
        return questions.get(index);
    }

    @Override
    public QuestionBuilder newQuestion(String text)
    {
        return new QuestionBuilderImpl(text); 
    }
    
    private class QuestionBuilderImpl implements QuestionBuilder
    {
        private final String text;
        private ArrayList<Answer> answers;

        public QuestionBuilderImpl(String text)
        {
            this.text = text;
            this.answers = new ArrayList<>();
        }
        
        
        @Override
        public void addAnswer(String text, boolean correct)
        {
            if(answers == null) throw new RuntimeException("You may not call addAnswer after done() has been called!");
            answers.add(new AnswerImpl(text, correct));
        }

        @Override
        public void done()
        {
            Answer[] finalAnswers = new Answer[answers.size()];
            for(int i = 0; i < finalAnswers.length; ++i)
            {
                finalAnswers[i] = answers.get(i);
            }
            questions.add(new QuestionImpl(text, finalAnswers));
            answers = null;
        }
        
    }
}
