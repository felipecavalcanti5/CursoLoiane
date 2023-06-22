package aula16a17;

public class exer04 {
       public static void main(String[] args) {
              double PopA = 80000;
              double txCrescA = 0.03;

              double PopB = 200000;
              double txCrescB = 0.015;

              boolean ultrapassagem = false;

              int anosParaUltrapassagem = 0;

              do{
                     if(PopA >= PopB){
                            System.out.println("em " + anosParaUltrapassagem + "anos, a população de A irá ultrapassar a população de B.");
                            ultrapassagem = true;
                     }else {
                            PopA += PopA*txCrescA;
                            PopB += PopB*txCrescB;
                            anosParaUltrapassagem ++;
                     };

              }while (!ultrapassagem);
       }
}
