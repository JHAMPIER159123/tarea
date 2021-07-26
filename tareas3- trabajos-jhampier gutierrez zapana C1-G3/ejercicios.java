public class ejercicios {
    public void Textprint(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j]!=null && !matriz[i][j].equals("")){
                    System.out.print(matriz[i][j]+"\t");
                }else{
                    System.out.print("\t");
                }                
            }
            System.out.println("");
        }
    } 

    public void matriz05(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][(dimen-1)-j]=""+valInit;
                valInit++;
            }
        }
        Textprint(matriz);
    }

    public void matriz06(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][j]=""+valInit;    
                valInit++;
            }
        }
        Textprint(matriz);
    }

     public void matriz07(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0 ; j <= i; j++) {
                matriz[(dimen-1)-i][j]=""+valInit;
                valInit++;
            }
        }
        Textprint(matriz);
    }

    public void matriz10(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][i-j]=""+valInit;
                valInit++;
            }
        }
        Textprint(matriz);
    }


    public void matriz14(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i <= j; i++) {
                matriz[i][j]=""+valInit;
                valInit++;
            }
        }
        Textprint(matriz);
    }
    public void matriz16(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i <= j; i++) {
                matriz[(dimen-1)-i][j]=""+valInit;
                valInit++;
            }
        }
        Textprint(matriz);
    }
    public void matriz17(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i <= (dimen-1)-j; i++) {
                matriz[i][(dimen-1)-j]=""+valInit;
                valInit++;
            }
        }
        Textprint(matriz);
    }


    public void matriz18(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[j][(dimen-1)-i]=""+valInit;    
                valInit++;
            }
        }
        Textprint(matriz);
    }

   
   







    public void matriz26(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i <= dimen-1; i++) {
                matriz[j][(dimen-1)-i]=""+valInit;
                valInit++;
            }
        }
        Textprint(matriz);
    }



    public static void main(String[] args) {
        ejercicios tObj=new ejercicios();
        //tObj.matriz(5, 0);
        System.out.println("");
        tObj.matriz05(5, 0);
        System.out.println("");
        tObj.matriz06(5, 0);
        System.out.println("");
        tObj.matriz07(5, 0);
        System.out.println("");
        tObj.matriz10(5, 0);
        System.out.println("");
        tObj.matriz14(5, 0);
        System.out.println("");
        tObj.matriz16(5, 0);
        System.out.println("");
        tObj.matriz17(5, 0);
        System.out.println("");
        tObj.matriz18(5, 0);
        System.out.println("");
        
        tObj.matriz26(5, 0);
        System.out.println("");


}
}