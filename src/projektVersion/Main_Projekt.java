package projektVersion;
import java.util.Scanner;
import java.util.Random;

public class Main_Projekt {

    //static int playerArmorFortyStart = 2, playerArmorStart = 4, PlayerArmorTotal = playerArmorStart + playerArmorFortyStart;
    //static int playerArmorFortyCur = playerArmorFortyStart, playerArmorCur = playerArmorStart, playerArmorTotalCur = playerArmorFortyCur + playerArmorCur;
    static int playerSpeedStart = 10, mobSpeedStart = 12, mobHpStart = 26,  playerHpStart = 100, playerDmgStart = 3,mobDmgStart = 12;
    static int playerSpeedCur = playerSpeedStart, mobSpeedCur = mobSpeedStart, mobHpCur = mobHpStart,  playerHpCur = playerHpStart, playerDmgCur = 3,mobDmgCur = mobDmgStart;
    static int score;
    static int turns;
    
    /*
    static int playerLevel=0, bowSkill=0, XBowSkill=0, stoneSkill=0, slingStoneSkill, throwKnifeSkill, throwAxeSkill, throwPotionSkill;
    static int swordSkill, axeSkill, maceSkill;
    static int playerArmorFortyStart = 2, playerArmorStart = 4, PlayerArmorTotal = playerArmorStart + playerArmorFortyStart;
    static int playerArmorFortyCur = 2, playerArmorCur = 4, playerArmorTotalCur = playerArmorFortyCur + playerArmorCur;
    static Scanner scan = new Scanner(System.in);
    static int playerSpeedStart = 10, mobSpeedStart = 12, mobHpStart = 10,  playerHpStart = 20, playerDmgStart = 4,mobDmgStart = 2;
    static int playerSpeedCur = 10, mobSpeedCur = 12, mobHpCur = 10,  playerHpCur = 20, playerDmgCur = 4,mobDmgCur = 2;
    static int score = 10;
    
    static String bowName = "Bow"; static int bowDmg = playerLevel*2 + bowSkill;
    static String XBowName = "Crossbow" ; static int XBowDmg = playerLevel* 3 + XBowSkill;
    static String stoneName = "Stone"; static int stoneDmg = playerLevel* 1 + stoneSkill;
    static String slingStoneName="Sling and Stone"; static int slingStoneDmg = playerLevel * 2 + slingStoneSkill;
    static String throwKnifeName= "Throwing Knife"; static int throwKifeDmg = playerLevel * 2 + throwKnifeSkill;
    static String throwAxeName="Tomahawk"; static int throwingAxeDmg = playerLevel * 2 + throwAxeSkill;
    static String throwPotionName="Throwing Potion Bottle"; static int throwPotionDmg = playerLevel *  + throwPotionSkill;
    
    static String Sword1hName="Sword"; static int Sword1hDmg = playerLevel * + swordSkill;
    static String Axe1hName="War axe"; static int Axe1hDmg = playerLevel * + axeSkill;
    static String Mace1hName="Mace"; static int Mace1hDmg = playerLevel * + maceSkill;
    static String Sword2hName="Great Sword"; static int Sword2hDmg = playerLevel * + swordSkill;
    static String Axe2hName="Dubble Headed Axe"; static int Axe2hDmg = playerLevel * + axeSkill;
    static String Mace2hName="War Hammer"; static int Mace2hDmg = playerLevel * + maceSkill;
    
    
    static String Name=""; static int Dmg = playerLevel * + skill;
    */
    
    static Scanner scanner = new Scanner(System.in);
    
    static boolean tomtRum;
    
    static int strength, vitality, agility, intellegence;
    
    static int svårighetsgrad, attributPoäng, rumNr, mobMot;
    
    static String mob1, mob2, mob3, mob4, mob5, mob6, mob7, mob8, mob9, mob10, svårighetsgradString;
    
    static int mobEncStrength [] = new int[10], mobEncVitality [] = new int[10], mobEncAgility [] = new int[10], 
            mobEncIntellegence [] = new int[10], rum [] = new int[1000];
    
    static String mobType [] = new String[10];
    
    static int varulvStrength, varulvVitality, varulvAgility, varulvIntellegence, spindelStrength, 
            spindelVitality, spindelAgility, spindelIntellegence, ryskSoldatStrength, ryskSoldatVitality, 
            ryskSoldatAgility, ryskSoldatIntellegence, trollKarlStrength, trollKarlVitality, trollKarlAgility, 
            trollKarlIntellegence;
    
    static Random random = new Random();
    
    public static void main(String[] args) {
        
        
        
        
        

        System.out.println("Knugen av Grottan\n");
        
        System.out.print("1: Starta eller 2: info?\n\nVal: ");
        int val = scanner.nextInt();
        
        if(val == 2){
            System.out.println("");
            info();
            System.out.println("Info fungerar inte så vi kör ändå ^^");
        }
        else{
        }
        System.out.println("");
        svårighetsgrad();
        spelet();
        
    }
    
    public static void info(){
        System.out.println("////////////////******************\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                       + "\n*                                                *"
                       + "\n*               Knugen av Grottan                *"
                       + "\n*                                                *"
                       + "\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\******************////////////////");
        
        
    }
    
    public static void svårighetsgrad(){
        boolean fortsätt = true;
        
        while(fortsätt){
            System.out.println("Välj svårighetsgrad: ");
            System.out.println("1 : Lätt");
            System.out.println("2 : Medel");
            System.out.println("3 : Svår\n");
        
            System.out.print("Val: ");
            svårighetsgrad = scanner.nextInt();
            if(svårighetsgrad == 1){
                svårighetsgradString = "Lätt";
            }
            else if(svårighetsgrad == 2){
                svårighetsgradString = "Medel";
            }
            else{
                svårighetsgradString = "Svår";
            }
            System.out.println("");
            if(svårighetsgrad != 1 && svårighetsgrad != 2 && svårighetsgrad != 3){
                System.out.println("Det är inget alternativ\n\nVälj igen:\n");
            }
            else{
                System.out.print("Du valde: " + svårighetsgradString + ". Är du nöjd med detta?\n1 : Ja\n2 : Nej\n\nVal:");
                int klar = scanner.nextInt();
                System.out.println("");
                if(klar == 2){
                    fortsätt = true;
                }
                else{
                    fortsätt = false;
                }
            }
        }
        
        attributer();
    }
    
    public static void attributer(){
        boolean fortsätt = true;
        boolean alltUtdelat = false;
        
        while(!alltUtdelat){
            
            intellegence = 0;
            strength = 0;
            agility = 0;
            vitality = 0;
            
            
            if(svårighetsgrad == 1){
                attributPoäng = 40;
                
                System.out.println("Du har valt svårighetsgraden: Lätt\n\nSå du har " + attributPoäng 
                        + " poäng som du får sätta ut på antingen: intellegence, \nstrength, agility eller"
                        + " vitality utöver dina 5 basic points.\n");
                
                
                
                while(fortsätt){
                    System.out.print("Intellegence: +");
                    intellegence = scanner.nextInt();
                    System.out.println("");
                    
                    if(intellegence > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på intellegence\n");
                    }
                    else if(intellegence < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= intellegence;
                        intellegence += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                
                while(fortsätt){
                    System.out.print("Strength: +");
                    strength = scanner.nextInt();
                    System.out.println("");
                    
                    if(strength > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på strength\n");
                    }
                    else if(strength < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= strength;
                        strength += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                
                while(fortsätt){
                    System.out.print("Agility: +");
                    agility = scanner.nextInt();
                    System.out.println("");
                    
                    if(agility > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på agility\n");
                    }
                    else if(agility < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= agility;
                        agility += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                
                while(fortsätt){
                    System.out.print("Vitality: +");
                    vitality = scanner.nextInt();
                    System.out.println("");
                    
                    if(vitality > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på vitality\n");
                    }
                    else if(vitality < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= vitality;
                        vitality += 5;
                        fortsätt = false;
                    }
                }
                
                fortsätt = true;
                attributPoäng = 60;
                
                
                
                
                
                
                
                
                
            }
            else if(svårighetsgrad == 2){
                attributPoäng = 30;
                
                System.out.println("Du har valt svårighetsgraden: Medel\n\nSå du har " + attributPoäng 
                        + " poäng som du får sätta ut på antingen: intellegence, \nstrength, agility eller"
                        + " vitality utöver dina 5 basic points.\n");
                
                while(fortsätt){
                    System.out.print("Intellegence: +");
                    intellegence = scanner.nextInt();
                    System.out.println("");
                    
                    if(intellegence > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på intellegence\n");
                    }
                    else if(intellegence < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= intellegence;
                        intellegence += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                
                while(fortsätt){
                    System.out.print("Strength: +");
                    strength = scanner.nextInt();
                    System.out.println("");
                    
                    if(strength > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på strength\n");
                    }
                    else if(strength < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= strength;
                        strength += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                
                while(fortsätt){
                    System.out.print("Agility: +");
                    agility = scanner.nextInt();
                    System.out.println("");
                    
                    if(agility > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på agility\n");
                    }
                    else if(agility < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= agility;
                        agility += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                
                while(fortsätt){
                    System.out.print("Vitality: +");
                    vitality = scanner.nextInt();
                    System.out.println("");
                    
                    if(vitality > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på vitality\n");
                    }
                    else if(vitality < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= vitality;
                        vitality += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                attributPoäng = 50;
            }
            
            else{
                attributPoäng = 20;
                
                System.out.println("Du har valt svårighetsgraden: Svår\n\nSå du har " + attributPoäng 
                        + " poäng som du får sätta ut på antingen: intellegence, \nstrength, agility eller"
                        + " vitality utöver dina 5 basic points.\n");
                
                while(fortsätt){
                    System.out.print("Intellegence: +");
                    intellegence = scanner.nextInt();
                    System.out.println("");
                    
                    if(intellegence > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på intellegence\n");
                    }
                    else if(intellegence < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= intellegence;
                        intellegence += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                
                while(fortsätt){
                    System.out.print("Strength: +");
                    strength = scanner.nextInt();
                    System.out.println("");
                    
                    if(strength > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på strength\n");
                    }
                    else if(strength < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= strength;
                        strength += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                
                while(fortsätt){
                    System.out.print("Agility: +");
                    agility = scanner.nextInt();
                    System.out.println("");
                    
                    if(agility > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på agility\n");
                    }
                    else if(agility < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= agility;
                        agility += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                
                while(fortsätt){
                    System.out.print("Vitality: +");
                    vitality = scanner.nextInt();
                    System.out.println("");
                    
                    if(vitality > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på vitality\n");
                    }
                    else if(vitality < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= vitality;
                        vitality += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                attributPoäng = 40;
            }
            if((intellegence + strength + agility + vitality) != attributPoäng){
                    System.out.println("Du spenderade inte alla dina poäng. Så du får välja om igen\n");
            }
            else{
                System.out.println("Så, nu har du:\nIntellegence = " + intellegence + "\nStrength = " + 
                        strength + "\nAgility = " + agility + "\nVitality = " + vitality + "\n");
                
                System.out.print("Är du nöjd med det?\n1 : Ja\n2 : Nej\nSvar: ");
                int svar = scanner.nextInt();
                System.out.println("");
                
                if(svar == 1){
                    System.out.println("Va bra. Då fortsätter vi\n");
                    alltUtdelat = true;
                }
                else{
                    System.out.println("Då väljer vi om igen\n");
                }
            }
        }
    }
    
    public static void mobVal(){
        System.out.println("Välj vilka monster du vill möta i grottan. \n\nOch kom ihåg att du kan lägga in ett"
                + " monster mer än 1 gång och då ökar du chansen att möta den.\n\nMobtyperna är: varulv,"
                + " ryskSoldat, spindel, trollKarl.\n\nSkriv in EXAKT som deras namn står åvan, annars så"
                + " registreras det inte");
        
        scanner.nextLine();
        System.out.println("Val:");
        for(int i = 0; i < 10; i++){
            System.out.print("\nMob " + (i + 1) + ": ");
            mobType [i] = scanner.nextLine();
        }
        scanner.nextLine();
        System.out.println("");
    }
    
    /*public static void mob1(){
        mob1 = mobType [0];
        mob1Strength = 6;
    }
    
    public static void mob2(){
        mob2 = mobType [1];
        mob2Strength = 3;
    }
    
    public static void mob3(){
        mob3 = mobType [2];
        mob3Strength = 3;
    }
    
    public static void mob4(){
        mob4 = mobType [3];
        mob4Strength = 3;
    }
    
    public static void mob5(){
        mob5 = mobType [4];
        mob5Strength = 3;
    }
    
    public static void mob6(){
        mob6 = mobType [5];
        mob6Strength = 3;
    }
    
    public static void mob7(){
        mob7 = mobType [6];
        mob7Strength = 3;
    }
    
    public static void mob8(){
        mob8 = mobType [7];
        mob8Strength = 3;
    }
    
    public static void mob9(){
        mob9 = mobType [8];
        mob9Strength = 3;
    }
    
    public static void mob10(){
        mob10 = mobType [9];
        mob10Strength = 3;
    }*/
    
    public static void varulv(){
        
        varulvStrength = 7 * svårighetsgrad;
        varulvVitality = 20 * svårighetsgrad;
        varulvAgility = 8 * svårighetsgrad;
        varulvIntellegence = 1 * svårighetsgrad;
        
        
    }
    
    public static void trollKarl(){
        
        trollKarlStrength = 5 * svårighetsgrad;
        trollKarlVitality = 23 * svårighetsgrad;
        trollKarlAgility = 6 * svårighetsgrad;
        trollKarlIntellegence = 4 * svårighetsgrad;
        
        
    }
    
    public static void spelet(){
        System.out.println("Nu ska du gå in i grottan.\n");
        //mobVal(); ska in senare
        statsUtdelning();
        grottIngång();
    }
    
    public static void statsUtdelning(){
        mobSlumpning();
        playerStats();
        varulv();
        trollKarl();
    }
    
    public static void playerStats(){
        playerSpeedCur = agility * 1;
        playerHpCur = vitality * 3;
        playerDmgCur = strength * 1;
        playerSpeedStart = agility * 1;
        playerHpStart = vitality * 3;
        playerDmgStart = strength * 1;
    }
    
    public static void mobSlumpning(){
        int monsterNummer;
        
        for(int i = 0 ; i < 10 ; i++){
            monsterNummer = random.nextInt(8);
            if(monsterNummer == 0 || monsterNummer == 1 || monsterNummer == 2 || monsterNummer == 3){
                mobType [i] = "varulv";
            }
            else{
                mobType [i] = "trollKarl";
            }
        }
    }
    
    public static boolean mobEncounter(int mob){
        boolean klar = false;
        
        if(mobType [mob] == "varulv"){
            mobEncStrength [mob] = varulvStrength;
            mobEncVitality [mob] = varulvVitality;
            mobEncAgility [mob] = varulvAgility;
            mobEncIntellegence [mob] = varulvIntellegence;
            klar = true;
        }
        else if(mobType [mob] == "trollKarl"){
            mobEncStrength [mob] = trollKarlStrength;
            mobEncVitality [mob] = trollKarlVitality;
            mobEncAgility [mob] = trollKarlAgility;
            mobEncIntellegence [mob] = trollKarlIntellegence;
            klar = true;
        }
        else{
            System.out.println("Det blev problem här du =(\n");
        }
        
        mobHpCur = mobEncVitality [mob];
        mobDmgCur = mobEncStrength [mob];
        mobSpeedCur = mobEncAgility [mob];
        mobHpStart = mobEncVitality [mob];
        mobDmgStart = mobEncStrength [mob];
        mobSpeedStart = mobEncAgility [mob];
        return klar;
        
        //att sätta in för att kalla på mobval
        /*boolean klar = false;
        
        while(klar){
            klar = mobEncounter(1);
        }*/
    }
    
    public static void grottIngång(){
        boolean encounter = false;
        
        int tal = random.nextInt(4);
        
        if(tal == 0 || tal == 1 || tal == 2){
            System.out.println("Det står ett monster i grottkammaren. Han hör dig gå in och vänder sig hastigt mot dig");
            encounter = true;
        }
        else if(tal == 3){
            System.out.println("Rummet är tomt och du kan vila ut för stunden. Du regenererar " + playerHpStart/10 
                    + "hp och du har lite extra tid att leta runt efter föremål");
            playerHpCur += (playerHpStart/10);
            tomtRum = true;
            encounter = false;
        }
        else{
            System.out.println("You crashed sonny :/");
        }
        
        if(encounter){
            boolean klar = false;
        
        while(!klar){
            int rNumberTxt = random.nextInt(10);
            klar = mobEncounter(rNumberTxt);
        }
            attackModule_Start();
        }
        else{
            kammarVal();
        }
    }
    
    public static void kammarVal(){
        boolean fortsätt = false;
        
        System.out.print("Du står nu ensam i kammaren och du funderar över om du ska\n\n1 : Gå direkt till"
                + " nästa rum eller om du ska\n\n2 : Gå och leta runt lite efter föremål\n\nVal: ");
        
        while(!fortsätt){
            int val = scanner.nextInt();
            if(val == 1){
                fortsätt = true;
                movement();
            }
            else if(val == 2){
                fortsätt = true;
                leta();
            }
            else{
                System.out.println("Det där var inget val du =). Välj igen");
            }
        }
    }
    
    public static void movement(){
        
        System.out.println("Du går in i nästa rum");
        rumNr ++;
        
        grottIngång();
    }
    
    public static void leta(){
        String föremål;
        int hittaFöremål;
        
        if(tomtRum){
            hittaFöremål = random.nextInt(3);
        }
        else{
            hittaFöremål = random.nextInt(2);
        }
        
        if(hittaFöremål == 0 || hittaFöremål == 2 ){
            föremål = "en yxa (som inte gör något ännu tyvärr)";
        }
        else{
            föremål = "ingenting";
        }
        
        System.out.println("Du letar runt lite efter föremål och hittar " + föremål + ". Sedan går du vidare till nästa rum\n");
        grottIngång();
    }
    
    
    
    public static void attackModule_Start(){
        mobMot = random.nextInt(10);
        System.out.println("Striden Startar!\nEn vild "+mobType [mobMot]+" står framför dig!\n\n");
        if (playerHpCur >= playerHpStart){
            playerHpCur = playerHpStart;
        }
        turns = 0;
        attackModule_Menu_Action();
    }   
    
    public static void attackModule_Stats(){
        System.out.println("\n\n\n ////////|||\\\\\\\\\\\\\\\\");
        System.out.println(" |||STATS:\n\n |||Din hp: "+playerHpCur+"/"+playerHpStart+"\n |||"+mobType [mobMot]+" hp: "+mobHpCur+"/"+mobHpStart);
        System.out.println(" \\\\\\\\\\\\\\\\|||//////// \n\n\n");
        attackModule_Menu_Action();
    }
    public static void attackModule_Menu_Action(){
        System.out.print("Vad är ditt val?\n");
            System.out.println("1.      Attackera\n2.      Försvarställning\n3.      Drycker\n4.      Föremål\n5.      Statestik\n");
            int attackModule_Menu_Action_Choice = scanner.nextInt();
            switch (attackModule_Menu_Action_Choice){
                case 1:attackModule_Attack();
                    break;
                case 2:attackModule_Fortify();
                    break;
                case 3: attackModule_Menu_PotionsMenu();
                    break;
                case 4: attackModule_Menu_ItemsMenu();
                    break;
                case 5: attackModule_Stats();
                    break;
                default: System.out.println("Gör om\n\n");
                    attackModule_Menu_Action();
                    break; 
            }
    }
    public static void attackModule_Attack(){
        turns++;
        if(playerSpeedCur > mobSpeedCur){
            attackModule_Attack_PlayerFirst();
        } else if (playerSpeedCur < mobSpeedCur) {
            attackModule_Attack_MobFirst();
        }
    }
    public static void attackModule_Attack_PlayerFirst(){
        mobHpCur = mobHpCur - playerDmgCur;
        System.out.println("Du svingar dit svärd mot "+mobType [mobMot]+" och gör "+playerDmgCur+" Skada\n\n");
            if(mobHpCur <= 0){
                attackModule_Victory();
            } 
            else if (mobHpCur > 0) {
                playerHpCur = playerHpCur - mobDmgCur;
                if(playerHpCur>0){
                    System.out.println(mobType [mobMot]+" Attakerar dig och gör "+mobDmgCur+" skada på dig\n\n");
                    attackModule_Menu_Action();
                } 
                else if (playerHpCur <= 0){
                    System.out.println(mobType [mobMot]+" Attakerar dig och gör "+mobDmgCur+" skada på dig\n\n");
                    attackModule_GameOver();
                }
            }
    }
    public static void attackModule_Attack_MobFirst(){
        playerHpCur = playerHpCur - mobDmgCur;
        System.out.println(mobType [mobMot]+" Attakerar dig och gör "+mobDmgCur+" skada på dig\n\n");
        if(playerHpCur<=0){
        attackModule_GameOver();  
        } 
        else if (playerHpCur>0){
            mobHpCur = mobHpCur - playerDmgCur;
            if(mobHpCur <= 0){
                System.out.println("Du svingar dit svärd mot "+mobType [mobMot]+" och gör "+playerDmgCur+" Skada\n\n");
                attackModule_Victory();
            }
            else if(mobHpCur > 0){
                System.out.println("Du svingar dit svärd mot "+mobType [mobMot]+" och gör "+playerDmgCur+" Skada\n\n");
                attackModule_Menu_Action();
            }
        }
    }
    
    public static void attackModule_Fortify(){
        turns++;
        System.out.println("Du reser din sköld som reducerar monstrenas attack och ger dig tid att återhämta dig\n\n");
        playerHpCur += (playerHpStart/10);
        if (playerHpCur >= playerHpStart){
            playerHpCur = playerHpStart;
        }
        System.out.println("Din hälsa ökade med: "+playerHpStart/10+"\n\n");
        
        playerHpCur = playerHpCur - mobDmgCur;
        System.out.println(mobType [mobMot]+"Attakerar dig och gör "+mobDmgCur/2+" skada på dig\n\n");
        if(playerHpCur<=0){
        attackModule_GameOver();
        }
        attackModule_Menu_Action();
        
    }
    public static void attackModule_Menu_PotionsMenu(){
        System.out.println("There is nothing here but us chickens\n\n");
        attackModule_Menu_Action();
    }
    public static void attackModule_Menu_ItemsMenu(){
        System.out.println("There is nothing here but us chickens\n\n");
        attackModule_Menu_Action();
    }
    public static void attackModule_Victory(){
        int addPoints= Points(turns);
        score = score + addPoints;
        System.out.println("Grattis, du vann!! Du fick "+addPoints+" Poäng! Men du vet inte vad som väntar runt krönet\n\n");
        grottIngång();
    }
    
    public static void attackModule_GameOver(){
        System.out.println("Du ligger på marken, det svartnar för ögonen. Du tänker: 'Jag förlorade?'\nDin poäng var: "+score+"\n\n");
    }
    public static int Points(int algoritmTurns){
        int points;
            if(algoritmTurns>=8){
                points = 2;
            
        }else{
            if(algoritmTurns == 0){
                points=10;
            }else{
                points=Points(algoritmTurns-1)-1;
            }
        }
        
        return points;
    }
}
