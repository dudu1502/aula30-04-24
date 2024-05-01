import java.util.Scanner;

public class Usuario {
    private String nome;
    private int idade;
    private String email;
    private String tipoUsuario;

    public String getNome(){
        return nome;
       }
    
       
       public void setNome(String nome){
        this.nome = nome ;
       }
    
       public int getIdade(){
        return idade;
       }
    
       
       public void setIdade(int idade){
        this.idade = idade ;
       }
    
       public String getEmail(){
        return email;
       }
    
       
       public void setEmail(String email){
        this.email = email ;
       }

       public String getTipoUsuario(){
        return tipoUsuario;
       }
    
       
       public void setTipoUsuario(String tipoUsuario){
        this.tipoUsuario = tipoUsuario;
       }

       public void identificarUsuario(){

        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o seu nome");
        setNome(scanner.nextLine());

        System.out.println("Digite a sua idade");
        setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Digite o seu email");
        setEmail(scanner.nextLine());

        System.out.println("Seja bem vindo " + usuario + nome);


       }
}
