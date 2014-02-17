/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package impl;

import quizgame.Player;
import quizgame.Score;

/**
 *
 * @author tog
 */
public class ScoreImpl implements Score
{
    private final Player[] players;
    private final int[] points;

    public ScoreImpl(Player[] players)
    {
        this.players = players;
        this.points = new int[players.length];
    }
    
    
    @Override
    public int getNumberOfPlayers()
    {
        return players.length;
    }

    @Override
    public String getPlayerName(int i)
    {
        return players[i].getName();
    }

    @Override
    public int getScore(int i)
    {
        return points[i];
    }
    
    void addPoint(int playerIndex)
    {
        points[playerIndex]++;
    }
    
}
