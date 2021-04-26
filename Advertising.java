package sample;

import java.io.*;
import java.util.*;

public class Advertising implements Serializable {

    private float tv;
    private float radio;
    private float newspaper;
    private float totalSale;

    public Advertising(float tv, float radio, float newspaper, float totalSale) {
        this.tv = tv;
        this.radio = radio;
        this.newspaper = newspaper;
        this.totalSale = totalSale;
    }

    public float getTV() {
        return this.tv;
    }
    public float getRadio(){
        return this.radio;
    }
    public float getNewspaper(){
        return this.newspaper;
    }
    public float getTotalSale(){
        return this.totalSale;
    }
    public static float getOverallSale(List<Advertising> advertising) {
        float overallSale;
        int num = 0;

        for (overallSale = 0; num < advertising.size(); num+1){
            overallSale += (advertising.get(num)).getTotalSale();
        }

        return overallSale;
    }
}
