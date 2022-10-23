public class Instrutor extends Pessoa
{
    private int aulaExercida;
    
    public void setAula(int aulaExercida){
        this.aulaExercida = aulaExercida;
    }
    
    public int getAula(){
        return aulaExercida;
    }
    
    /* Criar um método para cada tipo de aula (zumba, ginastica, etc...)
       Para que de acordo com o que foi escolhido no Main, o professor seja armazenado dentro da sua respectiva aula exercida
       Se foi digitado (B) por exemplo, o instrutor ficará armazenado em um método so para professores de boxe, para depois ser utilizado na aula
    */
}
