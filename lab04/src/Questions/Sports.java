/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

/**
 *
 * @author august.preuss
 */
public class Sports {

    private String sportName;
    private int numberOfInjuries;
    private boolean isFun;

    public Sports() {
        sportName = "unknown";
        numberOfInjuries = 0;
        isFun = false;
    }

    public Sports(String sportName, int numberOfInjuries, boolean isFun) {
        this.sportName = sportName;
        this.numberOfInjuries = numberOfInjuries;
        this.isFun = isFun;
    }

    public String getSportName() {
        return sportName;
    }

    public int getNumberOfInjuries() {
        return numberOfInjuries;
    }

    public boolean getIsFun() {
        return isFun;
    }

    public void setSportName(String newSportName) {
        sportName = newSportName;
    }

    public void setNumberOfInjuries(int newNumberOfInjuries) {
        numberOfInjuries = newNumberOfInjuries;
    }

    public void setIsFun(boolean newIsFun) {
        isFun = newIsFun;
    }

    public String toString() {
        return "Hi, my favorite sport is " + sportName + " and I have gotten " + numberOfInjuries + " injuries. I think it is " + isFun + " that this sport is fun.";
    }

}
