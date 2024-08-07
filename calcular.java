import java.util.Scanner;

public class calcular{

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float n1,n2,mul,div,sub,adi;

        System.out.println("\ndigite o primeiro numero: ");
        n1= leia.nextFloat();
        System.out.println("digite o segundo numero: ");
        n2= leia.nextFloat();

        adi= n1+n2;
        sub = n1-n2;
        mul= n1*n2;
        div= n1/n2;

        System.out.println("os resultados sao : \n adicao: " +adi+ "\n subtracao: "+sub+" \n multiplicacao: "+mul+"\n divisao: "+div);

    }
}