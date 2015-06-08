/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektVersion;

import java.util.ArrayList;

/**
 *
 * @author erikkarlsson
 */
public class Main_Projekt_Metoder {
    
    static ArrayList<Player> saveFiles = new ArrayList<>();
    static ArrayList<CombatPlayer> combatPlayer = new ArrayList<>();
    
    public static void main(String[] args) {
        saveFiles = addNewPlayer(saveFiles);
        combatPlayer = readyForCombat(combatPlayer);
        
    }
    
    public static ArrayList<Player> addNewPlayer(ArrayList<Player> saveFiles){
        
        saveFiles.add(new Player(5, 5, 5, 5));
        
        return saveFiles;
    }
    public static ArrayList<CombatPlayer> readyForCombat(ArrayList<CombatPlayer> combatPlayer){
        
        combatPlayer.add(new CombatPlayer(saveFiles.get(0).getStrength(), saveFiles.get(0).getVitality(), saveFiles.get(0).getAgility(), saveFiles.get(0).getIntellegence(), saveFiles.get(0).getStrength(), saveFiles.get(0).getVitality(), saveFiles.get(0).getAgility(), saveFiles.get(0).getIntellegence()));
        
        combatPlayer.get(0).damageCalc();
        combatPlayer.get(0).healthCalc();
        combatPlayer.get(0).speedCalc();
        combatPlayer.get(0).spellDmgCalc();
        combatPlayer.get(0).setMilestones();
        
        return combatPlayer;
    }
    
    
}