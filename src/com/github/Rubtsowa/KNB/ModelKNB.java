package com.github.Rubtsowa.KNB;

public class ModelKNB {
    private  int oi;
    private  int oy;

    public ModelKNB(){
        oi = 0;
        oy = 0;
    }

    public int gener(){
        return (int) ( Math.random() * 3 );
    }

    public Pair<Integer> hod(int gy, int gi){
        //int gi = gener();
        Pair<Integer> result = new Pair<>(oi, oy);
        if (gi != gy){
            if ((gi==0 && gy==1)||(gi==1 && gy==2)||(gi==2 && gy==0)){
                //System.out.println("Я выиграл!");
                oi = oi + 1;
                result.setFirst(oi);
            }
            else{
                //System.out.println("Ты выиграл!");
                oy = oy + 1;
                result.setFirst(oy);
            }
        }
        //return oi, oy;
        return result;
    }

    public String strScore(){
        return (oi + ":" + oy);
    }

    /*public int getOi() {
        return oi;
    }

    public int getOy() {
        return oy;
    }*/
}
