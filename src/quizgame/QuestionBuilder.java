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
public interface QuestionBuilder
{
    public void addAnswer(String text, boolean correct);
    public void done();
}
