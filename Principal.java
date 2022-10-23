import java.util.Scanner;

public class Principal
{
   static Scanner input = new Scanner(System.in);
   static Aula aula = new Aula();// Criando um objeto aula do tipo Aula
   static Registro registro = new Registro();//Criando um registro para acessar os alunos e instrutores matriculados nas aulas
   
   /* Menu principal de entrada do programa - parte funcional */
   public static void main(String[] args){
       
       while(true){
             int op = menu();
             
             if(op==8){
                 break;
             }
             
             else if (op == 1){
                menuInformacao();
             }
             
             else if (op == 2){
                 aulaGinastica();
             }
             
             else if (op == 3){
                 aulaZumba();
             }
             
             else if (op == 4){
                aulaBoxe();
             }
             
             else if (op == 5){
                aulaMuayThai();
             }
             
             else if (op == 6){
                consultarRegistro();
             }
             
             else if (op == 7){
                consultarFinancas();
             }
         }
   }
    
   /* Menu principal de entrada do programa - parte visual */
   public static int menu(){
        System.out.println("------------------ MENU -------------------");
        System.out.println("->      1 - Consultar Menu Informaçoes   <-");
        System.out.println("-------------------------------------------");
        System.out.println("->      2 - Matricular Turma Ginaśtica   <-");
        System.out.println("->      3 - Matricular Turma Zumba       <-");
        System.out.println("->      4 - Matricular Turma Boxe        <-");
        System.out.println("->      5 - Matricular Turma Muay Thai   <-");
        System.out.println("-------------------------------------------");
        System.out.println("->      6 - Consultar Registro           <-");
        System.out.println("->      7 - Consultar Finanças           <-");
        System.out.println("->      8 - Sair                         <-");
        System.out.println("------------------------------------------\n");
        return input.nextInt();
    }

   //--------------------------------------------------------Métodos de cadastro----------------------------------------------------------------------------------------
   // Cadastrar Alunos
  public static Aluno cadastrarAluno(){
       Aluno aluno = new Aluno();
       System.out.println("Informe os dados do aluno: ");
       System.out.println("Nome -> ");
       aluno.setNome(input.nextLine());
       aluno.setNome(input.nextLine());
       System.out.println("N° de matrícula -> ");
       aluno.setMatricula(input.nextInt());
       System.out.println("Cadastro realizado com sucesso!\n");
       return aluno;
   }
   
   // Cadastrar instrutores
   public static Instrutor cadastrarInstrutor(){
       Instrutor instrutor = new Instrutor();
       System.out.println("Informe os dados do instrutor: ");
       System.out.println("Nome -> ");
       instrutor.setNome(input.nextLine());
       instrutor.setNome(input.nextLine());
       System.out.println("Código de identificação ->");
       instrutor.setMatricula(input.nextInt());
       System.out.println("Cadastro realizado com sucesso!\n");
       return instrutor;
   }
   
   //1 - Consultar Menu Info
   /* Menu informativo - Tabela de horários, preços e capacidade de alunos  */
   public static void menuInformacao(){
        System.out.println("------------------------- Funcionamento ------------------------- ");
        System.out.println("->->                      Segunda à Sexta                     <-<-");
        System.out.println("                                                                  ");
        System.out.println("->            Ginástica : 14h - 16h >> Sala 1                   <-");
        System.out.println("->            Zumba : 9h - 10.30h >> Sala 1 Sala 3              <-");
        System.out.println("->            Boxe : 16h - 17h >> Sala 2                        <-");
        System.out.println("->            Muay Thai : 13h - 14:30h >> Sala 3                <-");
        System.out.println("                                                                  ");
        System.out.println("->            Sala 1 >> Limite de 12 pessoas                    <-");
        System.out.println("->            Sala 2 >> Limite de 6 pessoas                     <-");
        System.out.println("->            Sala 3 >> Limite de 10 pessoas                    <-");
        System.out.println("                                                                  ");
        System.out.println("                                                                  ");
        System.out.println("--------------------- Valor das Aulas(Diária) --------------------");
        System.out.println("->            Zumba: R$ 4.00                                    <-");
        System.out.println("->            Boxe: R$ 3.00                                     <-");
        System.out.println("->            Ginástica: R$ 3.50                                <-");
        System.out.println("->            Muay Thai: R$ 3.00                                <-");
        System.out.println("------------------------------------------------------------------\n");
    }
   
    //---------------------------------------Metodos de marcaçao de aula-----------------------------------------------
   public static void aulaGinastica(){
       int num;
                registro.addInstrutorGinastica(cadastrarInstrutor());
                // O for representa a sala de acordo com a sua capacidade, 12 alunos na sala1, 10 na sala2, etc...
                for (int i = 1; i <= 12; i++){
                    System.out.println("Digite 0 para sair ou 1 para matricular:");
                    num = input.nextInt();
                    if (num == 0){
                        break;
                    }
                    
                    else if(num == 1){
                        registro.addAlunoGinastica(cadastrarAluno());
                    }
                    
                    else if(i == 12){
                        System.out.println("A sala atingiu a capacidade limite de alunos por aula\n");
                    }
                }   
   }
   
   public static void aulaZumba(){
       int num;
                registro.addInstrutorZumba(cadastrarInstrutor());
                
                for (int i = 1; i <= 10; i++){
                    System.out.println("Digite 0 para sair ou 1 para matricular:");
                    num = input.nextInt();
                    if (num == 0){
                        break;
                    }
                    
                    else if(num == 1){
                        registro.addAlunoZumba(cadastrarAluno());
                    }
                    
                    else if(i == 10){
                        System.out.println("A sala atingiu a capacidade limite de alunos por aula\n");
                    }
                }
   }
   
   public static void aulaBoxe(){
       int num;
                registro.addInstrutorBoxe(cadastrarInstrutor());
                
                for (int i = 1; i <= 6; i++){
                    System.out.println("Digite 0 para sair ou 1 para matricular:");
                    num = input.nextInt();
                    if (num == 0){
                        break;
                    }
                    
                    else if(num == 1){
                        registro.addAlunoBoxe(cadastrarAluno());
                    }
                    
                    else if(i == 6){
                        System.out.println("A sala atingiu a capacidade limite de alunos por aula\n");
                    }
                }
   }
   
   public static void aulaMuayThai(){
       int num;
                registro.addInstrutorMuayThai(cadastrarInstrutor());
                
                System.out.println("Digite 0 para sair ou 1 para matricular:");
                num = input.nextInt();
                for (int i = 1; i <= 10; i++){
                    if (num == 0){
                        break;
                    }
                    
                    else if(num == 1){
                        registro.addAlunoMuayThai(cadastrarAluno());
                    }
                    
                    else if(i == 10){
                        System.out.println("A sala atingiu a capacidade limite de alunos por aula\n");
                    }
                }
   }
   
    /*-------------------------------Menus-----------------------------------*/
   //6 - Consultar Registro
   public static void consultarRegistro(){
       System.out.println("------------------------------------------");
       System.out.println(">>>>>>>>>>>>>>>>> Turmas <<<<<<<<<<<<<<<<<");
       
       imprimirTurmaGinastica();
       System.out.println("\n");
       
       imprimirTurmaZumba();
       System.out.println("\n");
       
       imprimirTurmaBoxe();
       System.out.println("\n");
      
       imprimirTurmaMuayThai();
       System.out.println("\n");
       
       System.out.println("-----------------------------------------\n");
   }
   
   public static void consultarFinancas(){
       System.out.println("------------------------------------------");
       System.out.println("------------------------------------------\n");
   }
   
   
   //----------------------------------------------Métodos de impressão----------------------------------------------------------------
   
   //Imprime no Consultar Registro os alunos de ginástica, zumba, boxe e muay thai
   
   
   //Imprime no Consultar Registro os professores de ginástica, zumba, boxe e muay thai
   public static void imprimirTurmaGinastica(){
       for(Instrutor i : registro.instrutorGinastica()){
           System.out.println(">>>            Ginástica               <<<\n");
           System.out.println("Instrutor>> " + i.getNome() + "-" + i.getMatricula() + "\n");
       }
       
       for(Aluno a : registro.alunosGinastica()){
           System.out.println("Aluno>> " + a.getNome() + "-" + a.getMatricula() + "\n");
       }
   }
   
   public static void imprimirTurmaZumba(){
       for(Instrutor i : registro.instrutorZumba()){
           System.out.println(">>>               Zumba               <<<\n");
           System.out.println("Instrutor>> " + i.getNome() + "-" + i.getMatricula() + "\n");
       }
       
       for(Aluno a : registro.alunosZumba()){
           System.out.println("Aluno>> " + a.getNome() + "-" + a.getMatricula() + "\n");
       }
   }
   
   public static void imprimirTurmaBoxe(){
       System.out.println(">>>               Boxe                <<<\n");
       for(Instrutor i : registro.instrutorBoxe()){
           System.out.println("Instrutor>> " + i.getNome() + "-" + i.getMatricula() + "\n");
       }
       
       for(Aluno a : registro.alunosBoxe()){
           System.out.println("Aluno>> " + a.getNome() + "-" + a.getMatricula() + "\n");
       }
   }
   
   public static void imprimirTurmaMuayThai(){
       for(Instrutor i : registro.instrutorMuayThai()){
           System.out.println(">>>             Muay Thai             <<<\n");
           System.out.println("Instrutor>> " + i.getNome() + "-" + i.getMatricula() + "\n");
       }
       
       for(Aluno a : registro.alunosMuayThai()){
           System.out.println("Aluno>> " + a.getNome() + "-" + a.getMatricula() + "\n");
       }
   }
   
   /*-------------------------Métodos de verificação---------------------------*/
  }