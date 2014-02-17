/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quizgame;

import humantextui.impl.ConsoleHuman;
import impl.GameImpl;
import impl.HumanPlayerImpl;
import impl.RamQuestionBankImpl;

/**
 *
 * @author tog
 */
public class Quizgame
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        QuestionBank bank = new RamQuestionBankImpl();
        QuestionBuilder bld = bank.newQuestion("Which of these are interfaces not good at?");
        bld.addAnswer("Polymorphism", false);
        bld.addAnswer("Contracts", false);
        bld.addAnswer("Type definition", false);
        bld.addAnswer("Code reuse", true);
        bld.done();
        bld = bank.newQuestion("What can break encapsulation?");
        bld.addAnswer("Inheritance", true);
        bld.addAnswer("Composition", false);
        bld.addAnswer("Interfaces", false);
        bld.addAnswer("Bulldozers", false);
        bld.done();
        
        Game game = new GameImpl(bank);
        game.addPlayer(new HumanPlayerImpl(new ConsoleHuman("Alice")));
        game.addPlayer(new HumanPlayerImpl(new ConsoleHuman("Bob")));
        game.addPlayer(new HumanPlayerImpl(new ConsoleHuman("Carol")));
        
        Score score = game.runGame(5);
        
        int size = score.getNumberOfPlayers();
        for(int i = 0; i < size; ++i)
        {
            System.out.println(score.getPlayerName(i) + " : " + score.getScore(i));
        }
    }
    
}
