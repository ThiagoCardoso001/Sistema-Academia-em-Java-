import java.util.ArrayList;

public class Registro
{
   //---------------------------------Métodos de busca----------------------------------------
   
   /*
   //Busca através da matrícula os alunos cadastrados 
   public Aluno procurarAlunoCadastrado(int matricula){
       Aluno aux = new Aluno();
       for(Aluno a : alunos()){
           if (a.getMatricula() == matricula){
               aux = a;
           }
       }
       return aux;
   }
   
   //Busca através do código(matrícula) os instrutores cadastrados 
   public Instrutor procurarInstrutorCadastrado(int matricula){
       Instrutor aux = new Instrutor();
       for(Instrutor i : instrutores()){
           if (i.getMatricula() == matricula){
               aux = i;
           }
       }
       return aux;
   }
   */
   //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
   
   private static ArrayList<Aluno> alunosGinastica = new ArrayList<>();
   private static ArrayList<Aluno> alunosZumba = new ArrayList<>();
   private static ArrayList<Aluno> alunosBoxe = new ArrayList<>();
   private static ArrayList<Aluno> alunosMuayThai = new ArrayList<>();
    
   private static ArrayList<Instrutor> instrutorGinastica = new ArrayList<>();
   private static ArrayList<Instrutor> instrutorZumba = new ArrayList<>();
   private static ArrayList<Instrutor> instrutorBoxe = new ArrayList<>();
   private static ArrayList<Instrutor> instrutorMuayThai = new ArrayList<>();
   
    //Guardando as turmas no sistema
    //Alunos que irão fazer aula de ginástica
    public ArrayList<Aluno> alunosGinastica(){
        return alunosGinastica;
    }
    public void addAlunoGinastica(Aluno aluno){
        alunosGinastica.add(aluno);
    }
    
    
    //Instrutores que irão dar aula de ginástica
    public ArrayList<Instrutor> instrutorGinastica(){
        return instrutorGinastica;
    }
    public void addInstrutorGinastica(Instrutor instrutor){
        instrutorGinastica.add(instrutor);
    }
    
    
    //Alunos que irão fazer aula de zumba
    public ArrayList<Aluno> alunosZumba(){
        return alunosZumba;
    }
    public void addAlunoZumba(Aluno aluno){
        alunosZumba.add(aluno);
    }
    
    
    //Instrutores que irão dar aula de zumba
    public ArrayList<Instrutor> instrutorZumba(){
        return instrutorZumba;
    }
    public void addInstrutorZumba(Instrutor instrutor){
        instrutorZumba.add(instrutor);
    }
    
    
    //Alunos que irão fazer aula de boxe
    public ArrayList<Aluno> alunosBoxe(){
        return alunosBoxe;
    }
    public void addAlunoBoxe(Aluno aluno){
        alunosBoxe.add(aluno);
    }
    
    
    //Instrutores que irão dar aula de boxe
    public ArrayList<Instrutor> instrutorBoxe(){
        return instrutorBoxe;
    }
    public void addInstrutorBoxe(Instrutor instrutor){
        instrutorBoxe.add(instrutor);
    }
    
    
    //Alunos que irão fazer aula de muay thai
    public ArrayList<Aluno> alunosMuayThai(){
        return alunosMuayThai;
    }
    public void addAlunoMuayThai(Aluno aluno){
        alunosMuayThai.add(aluno);
    }
    
    //Instrutores que irão dar aula de muay thai
    public ArrayList<Instrutor> instrutorMuayThai(){
        return instrutorMuayThai;
    }
    public void addInstrutorMuayThai(Instrutor instrutor){
        instrutorMuayThai.add(instrutor);
    }
}

/*-----------------------------------------Anotações temporárias pra não esquecer--------------------------------------------------------------------------

 * Criar uma turma que ira receber os alunos dentro do limite de cada sala para pode acessar a posição de cada um deles. (Classe Aula) Depois registra Aula aqui.
 * 
 * OBS: Tanto os alunos quantos os instrutores tem seu cadastro salvo independentemente da aula que irão escolher, pq dessa forma um aluno pode realizar mais de uma aula no mesmo
 * dia desde que em horarios diferente de acordo com a Tabela Info.
 * 
 * Criar método que verifica se um aluno ou instrutor ja foi cadastrado e esta registrado aqui na Classe Registro.
 * Criar um método que verifica se o profissional está disponivel ou se ja está em aula e se ha outros professores disponiveis (os outros que foram registrados em suas respectivas categorias).
*/ 