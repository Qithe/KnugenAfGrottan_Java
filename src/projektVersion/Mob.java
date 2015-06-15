/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektVersion;

/**
 *
 * @author erikkarlsson
 */
public class Mob {
    private int strength, vitality, intellegence, agility;
    
    Mob(){
        
    }
    
    Mob(int strength, int vitality, int intellegence, int agility){
        this.strength = strength;
        this.vitality = vitality;
        this.intellegence = intellegence;
        this.agility = agility;
    }
    
    public int getStrength(){
        return this.strength;
    }
    public int getVitality(){
        return this.vitality;
    }
    public int getIntellegence(){
        return this.intellegence;
    }
    public int getAgility(){
        return this.agility;
    }
    
    public void setStrength(int strength){
        this.strength = strength;
    }
    public void setvitality(int vitality){
        this.vitality = vitality;
    }
    public void setIntellegence(int intellegence){
        this.intellegence = intellegence;
    }
    public void setAgility(int agility){
        this.agility = agility;
    }
}
