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
public interface Game
{
    public void addPlayer(Player p);
    public Score runGame(int rounds);
}
