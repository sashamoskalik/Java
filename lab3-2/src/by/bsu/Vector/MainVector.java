/*Определить класс Вектор в R3. Реализовать методы для проверки векторов
на ортогональность, проверки пересечения неортогональных векторов,
сравнения векторов. Создать массив из m объектов. Определить компланарные векторы.*/
package by.bsu.Vector;

import by.bsu.Vector.Data.DataVectors;

import java.util.ArrayList;
import java.util.Scanner;

public class MainVector {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int z = 0;
        boolean flag = true;
        boolean flagIntersect = true;
        int min = 1;
        int max = 5;
        System.out.println("Enter number vectors");
        int m = input.nextInt();
        DataVectors[] arrayvectors = new DataVectors[m];
        for (int i=0; i<m; i++){
            x = min + (int)(Math.random() * max);
            y = min + (int)(Math.random() * max);
            z = min + (int)(Math.random() * max);
            arrayvectors[i] = new DataVectors(x, y, z);
        }
        System.out.println("Vectors: ");
        for (int i=0; i<m; i++){
            System.out.println("Vector "+ i + "  " + arrayvectors[i].toString());
        }


        //Othogonal vectors
        for (int i=0; i<m; i++){
            for (int j=i+1; j<m; j++){
                if (arrayvectors[i].getX() * arrayvectors[j].getX() + arrayvectors[i].getY() * arrayvectors[j].getY() +
                        arrayvectors[i].getZ() * arrayvectors[j].getZ() == 0){
                    flag = false;
                    System.out.println("Vector " + i + " and " + " Vector " + j + " Orthogonal");
                }
            }
        }
        if (flag == true){
            System.out.println("No orthogonal vectors");
        }


        //Equal vectors
        flag = true;
        for (int i=0; i<m; i++){
            for (int j=i+1; j<m; j++){
                if (Math.sqrt(Math.pow(arrayvectors[i].getX(), 2.0) + Math.pow(arrayvectors[i].getY(), 2.0) +
                        Math.pow(arrayvectors[i].getZ(), 2.0)) == Math.sqrt(Math.pow(arrayvectors[j].getX(), 2.0) +
                        Math.pow(arrayvectors[j].getY(), 2.0) + Math.pow(arrayvectors[j].getZ(), 2.0))){
                    flag = false;
                    System.out.println("Vector " + i + " and " + "Vector " + j + " are equal");
                }
            }
        }
        if (flag == true){
            System.out.println("No equal vectors");
        }


        flag = true;
        for (int i=0; i<m; i++){
            for (int j=i+1; j<m;j++){
                for (int k=i+2; k<m; k++){
                    if (j==k){
                        break;
                    }
                    if (arrayvectors[i].getX()*(arrayvectors[j].getY()*arrayvectors[k].getZ()-
                            arrayvectors[j].getZ()*arrayvectors[k].getY()) + arrayvectors[i].getY()*
                            (arrayvectors[j].getZ()*arrayvectors[k].getX() - arrayvectors[j].getX()*arrayvectors[k].getZ())+
                            arrayvectors[i].getZ()*(arrayvectors[j].getX()*arrayvectors[k].getY() - arrayvectors[j].getY()*
                            arrayvectors[k].getX()) == 0){
                        flag = false;
                        System.out.println("Vector " + i + " Vector " + j + " Vector " + k + " are complanar ");
                        if (arrayvectors[i].getX()/arrayvectors[j].getX() == arrayvectors[i].getY()/arrayvectors[j].getY() &&
                                arrayvectors[i].getZ()/arrayvectors[j].getZ() == arrayvectors[i].getY()/arrayvectors[j].getY()){
                        }
                        else {
                            flagIntersect = false;
                            System.out.println("Vector " + i + " Vector " + j + " are intersect");
                        }
                        if (arrayvectors[i].getX()/arrayvectors[k].getX() == arrayvectors[i].getY()/arrayvectors[k].getY() &&
                                arrayvectors[i].getZ()/arrayvectors[k].getZ() == arrayvectors[i].getY()/arrayvectors[k].getY()){
                        }
                        else {
                            flagIntersect = false;
                            System.out.println("Vector " + i + " Vector " + k + " are intersect");
                        }
                        if (arrayvectors[j].getX()/arrayvectors[k].getX() == arrayvectors[j].getY()/arrayvectors[k].getY() &&
                                arrayvectors[j].getZ()/arrayvectors[k].getZ() == arrayvectors[j].getY()/arrayvectors[k].getY()){
                        }
                        else {
                            flagIntersect = false;
                            System.out.println("Vector " + j + " Vector " + k + " are intersect");
                        }
                    }
                }
            }
        }
        if (flagIntersect == true){
            System.out.println("No intersect vectors");
        }
        if (flag == true){
            System.out.println("No complanar vectors");
        }
    }
}
