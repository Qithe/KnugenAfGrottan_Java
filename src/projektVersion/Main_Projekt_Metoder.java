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
 * @edited by Qithe
 */
public class Main_Projekt_Metoder {
    
    static ArrayList<Mob> saveFiles = new ArrayList<>();
    static ArrayList<CombatMob> combatMobs = new ArrayList<>();
    
    
    
    public static void main(String[] args) {
        saveFiles = addNewPlayer(saveFiles);
        combatMobs = readyForCombat(combatMobs);
        
        Mob Player = new Mob();
        Mob Varulv = new Mob();
        
    }
    
    public static ArrayList<Mob> addNewPlayer(ArrayList<Mob> saveFiles){
        
        saveFiles.add(new Mob(5, 5, 5, 5));
        
        return saveFiles;
    }
    public static ArrayList<Mob> addMobs(ArrayList<Mob> saveFiles){
        
        saveFiles.add(new Mob(5, 5, 5, 5));
        saveFiles.add(new Mob(5, 5, 5, 5));
        saveFiles.add(new Mob(5, 5, 5, 5));
        return saveFiles;
    }
    public static ArrayList<CombatMob> readyForCombat(ArrayList<CombatMob> combatMobs){
        
        combatMobs.add(new CombatMob(saveFiles.get(0).getStrength(), saveFiles.get(0).getVitality(), saveFiles.get(0).getAgility(), saveFiles.get(0).getIntellegence(), saveFiles.get(0).getStrength(), saveFiles.get(0).getVitality(), saveFiles.get(0).getAgility(), saveFiles.get(0).getIntellegence()));
        
        combatMobs.get(0).damageCalc();
        combatMobs.get(0).healthCalc();
        combatMobs.get(0).speedCalc();
        combatMobs.get(0).spellDmgCalc();
        combatMobs.get(0).setMilestones();
        
        return combatMobs;
    }
    
    
}