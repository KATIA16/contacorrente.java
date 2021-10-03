/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
  public static void main (String[]args)
  {
      ContaCorrente c = new ContaCorrente();
      String nome;
      String cpf;
      c.setSaldo(2000);
    System.out.println ("Seu saldo é: "  +c.getSaldo());
    System.out.println ("cpf = 000.000.000-00" +c.getcpf());
    System.out.println ("nome =  João da Silva "  +c.getNome());
      
      
  }
  
}
