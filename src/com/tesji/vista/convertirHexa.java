package com.tesji.vista;

public class convertirHexa{
    public static void main (String [] args){
        int a=4, b=3, conta=0;
        String[] co= {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        int i=0, j=0;
        String[][] mat1=new String [a][b];
        
                         for(i=0; i<a; i++) {
				for(j=0; j<b; j++) {
					mat1[i][j]=co[conta];
                                        conta++;
				}
			}
			for(i=0; i<b; i++) {
				for(j=0; j<a; j++) {
					System.out.print("\t"+mat1[j][i]);
				}
				System.out.println();
			}
    }
}