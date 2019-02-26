package by.bsu.Vector;

import by.bsu.Vector.Data.DataVectors;

import java.util.ArrayList;

public class MainVector {
    public static  void main(String[] args){
        DataVectors vector1 = new DataVectors(2,0, 2);
        DataVectors vector2 = new DataVectors(1, 2 ,0);
        ArrayList<DataVectors> vectors = new ArrayList();
        vectors.add(vector1);
        vectors.add(vector2);
        System.out.println("Check for orthogonal");
        for (int i=0; i<2;){
            if (vectors.get(i).getX() * vectors.get(i+1).getX() + vectors.get(i).getY() * vectors.get(i+1).getY() +
                    vectors.get(i).getZ() * vectors.get(i+1).getZ() == 0){
                System.out.println("Orthogonal"); break;
            }
            else {
                System.out.println("Not orthogonal"); break;
            }
        }
    }
}
