package edr.bhanuinfosystems.com.model;

public class physcial_examination {

     int height,weight,temp,bp,sugar;

    public physcial_examination(int height, int weight, int temp, int bp, int sugar) {
        this.height = height;
        this.weight = weight;
        this.temp = temp;
        this.bp = bp;
        this.sugar = sugar;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getTemp() {
        return temp;
    }

    public int getBp() {
        return bp;
    }

    public int getSugar() {
        return sugar;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public void setBp(int bp) {
        this.bp = bp;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }
}
