/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package impl;

import quizgame.Answer;

/**
 *
 * @author tog
 */
public class AnswerImpl implements Answer
{
    private final String text;
    private final boolean isCorrect;

    public AnswerImpl(String text, boolean isCorrect)
    {
        this.text = text;
        this.isCorrect = isCorrect;
    }
    
    @Override
    public String getText()
    {
        return text;
    }

    @Override
    public boolean isCorrect()
    {
        return isCorrect;
    }
    
}
