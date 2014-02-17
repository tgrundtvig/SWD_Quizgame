/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package impl;

import java.util.ArrayList;
import quizgame.Game;
import quizgame.Player;
import quizgame.Question;
import quizgame.QuestionBank;
import quizgame.Score;

/**
 *
 * @author tog
 */
public class GameImpl implements Game
{
    private ArrayList<Player> tmp;
    private Player[] players;
    private ScoreImpl score;
    private QuestionBank bank;

    public GameImpl(QuestionBank bank)
    {
        this.bank = bank;
        tmp = new ArrayList<>();
    }
    
    
    @Override
    public void addPlayer(Player p)
    {
       tmp.add(p);
    }

    @Override
    public Score runGame(int rounds)
    {
        players = new Player[tmp.size()];
        for(int i = 0; i < players.length; ++i)
        {
            players[i] = tmp.get(i);
        }
        tmp = null;
        score = new ScoreImpl(players);
        rounds = Math.min(rounds, bank.getNumberOfQuestions());
        for(int round = 0; round < rounds; ++round)
        {
            Question question = bank.getQuestion(round);
            for(int p = 0; p < players.length; ++p)
            { 
                if(players[p].answerQuestion(question))
                {
                    score.addPoint(p);
                }
            }
        }
        return score;
    }
    
}
