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
public class CombatPlayer {
    private int damage, health, speed, spellDmg;
    private int strengthMileStone, vitalityMileStone, agilityMileStone, intellegenceMileStone;
    
    CombatPlayer(){
        
    }
    
    CombatPlayer(int damage, int health, int speed, int spellDmg, int strengthMileStone,int vitalityMileStone,int agilityMileStone,int intellegenceMileStone){
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.spellDmg = spellDmg;
        this.strengthMileStone = strengthMileStone;
        this.vitalityMileStone = vitalityMileStone;
        this.agilityMileStone = agilityMileStone;
        this.intellegenceMileStone = intellegenceMileStone;
    }
    
    public int getDamage(){
        return this.damage;
    }
    public int getHealth(){
        return this.health;
    }
    public int getSpeed(){
        return this.speed;
    }
    public int getSpellDmg(){
        return this.spellDmg;
    }
    public int getStrengthMileStone(){
        return this.strengthMileStone;
    }
    public int getVitalityMileStone(){
        return this.vitalityMileStone;
    }
    public int getAgilityMileStone(){
        return this.agilityMileStone;
    }
    public int getIntellegenceMileStone(){
        return this.intellegenceMileStone;
    }
    
    public void setDamage(int damage){
        this.damage = damage;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setSpellDmg(int spellDmg){
        this.spellDmg = spellDmg;
    }
    public void setStrengthMileStone(int strengthMileStone){
        this.strengthMileStone = strengthMileStone;
    }
    public void setVitalityMileStone(int vitalityMileStone){
        this.vitalityMileStone = vitalityMileStone;
    }
    public void setAgilityMileStone(int agilityMileStone){
        this.agilityMileStone = agilityMileStone;
    }
    public void setIntellegenceMileStone(int intellegenceMileStone){
        this.intellegenceMileStone = intellegenceMileStone;
    }
    
    public void damageCalc(){
        this.damage = (int)(damage*1.5);
    }
    public void healthCalc(){
        this.health = (int)(health*4);
    }
    public void speedCalc(){
        this.speed = (int)(speed*1);
    }
    public void spellDmgCalc(){
        this.spellDmg = (int)(spellDmg*1.5);
    }
    
    public void setMilestones(){
        if(this.strengthMileStone >= 30){
            this.setStrengthMileStone(3);
        }
        else if(this.strengthMileStone >= 20){
            this.setStrengthMileStone(2);
        }
        else if(this.strengthMileStone >= 10){
            this.setStrengthMileStone(1);
        }
        else{
            this.setStrengthMileStone(0);
        }
        
        if(this.vitalityMileStone >= 30){
            this.setVitalityMileStone(3);
        }
        else if(this.vitalityMileStone >= 20){
            this.setVitalityMileStone(2);
        }
        else if(this.vitalityMileStone >= 10){
            this.setVitalityMileStone(1);
        }
        else{
            this.setVitalityMileStone(0);
        }
        
        if(this.agilityMileStone >= 30){
            this.setAgilityMileStone(3);
        }
        else if(this.agilityMileStone >= 20){
            this.setAgilityMileStone(2);
        }
        else if(this.agilityMileStone >= 10){
            this.setAgilityMileStone(1);
        }
        else{
            this.setAgilityMileStone(0);
        }
        
        if(this.intellegenceMileStone >= 30){
            this.setIntellegenceMileStone(3);
        }
        else if(this.intellegenceMileStone >= 20){
            this.setIntellegenceMileStone(2);
        }
        else if(this.intellegenceMileStone >= 10){
            this.setIntellegenceMileStone(1);
        }
        else{
            this.setIntellegenceMileStone(0);
        }
    }
}
