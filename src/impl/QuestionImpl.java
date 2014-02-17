/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package impl;

import quizgame.Answer;
import quizgame.Question;

/**
 *
 * @author tog
 */
public class QuestionImpl implements Question
{
    private final String text;
    private final Answer[] answers;

    public QuestionImpl(String text, Answer[] answers)
    {
        this.text = text;
        this.answers = answers;
    }
    
    @Override
    public String getText()
    {
        return text;
    }

    @Override
    public int getNumberOfAnswers()
    {
        return answers.length;
    }

    @Override
    public Answer getAnswer(int i)
    {
        return answers[i];
    }
    
}
