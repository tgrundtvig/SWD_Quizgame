/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quizgame;

/**
 *
 * @author tog
 */
public interface Question
{
    public String getText();
    public int getNumberOfAnswers();
    public Answer getAnswer(int i);
}
