/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package impl;

import humantextui.TextHuman;
import java.util.ArrayList;
import java.util.Collections;
import quizgame.Answer;
import quizgame.Player;
import quizgame.Question;

/**
 *
 * @author tog
 */
public class HumanPlayerImpl implements Player
{
    private final TextHuman human;

    public HumanPlayerImpl(TextHuman human)
    {
        this.human = human;
    }
    
    @Override
    public String getName()
    {
        return human.getName();
    }

    @Override
    public boolean answerQuestion(Question question)
    {
        int size = question.getNumberOfAnswers();
        ArrayList<Answer> answers = new ArrayList<>(size);
        for(int i = 0; i < size; ++i)
        {
            answers.add(question.getAnswer(i));
        }
        Collections.shuffle(answers);
        String[] choices = new String[size];
        for(int i = 0; i < size; ++i)
        {
            choices[i] = answers.get(i).getText();
        }
        int ans = human.askChoice(question.getText(), choices) - 1;
        return answers.get(ans).isCorrect();
    }
    
}
