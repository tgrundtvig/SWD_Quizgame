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
public interface Score
{
    public int getNumberOfPlayers();
    public String getPlayerName(int i);
    public int getScore(int i);
}
