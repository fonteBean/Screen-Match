package screenmatch.utils;

public class recomendationsFilter {
    public void filter(Classificable classificable){
        if (classificable.getClassification() >= 4 ){
            System.out.println("Está entre os recomendados");
        }else if (classificable.getClassification() >=2){
            System.out.println("Muito bem avaliado!");
        }
    }
}
