
package calculadora;

public class Calculadora {
    
    private int n1, n2;

    public Calculadora(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
 public Calculadora(int n1) {
        this.n1 = n1;
       
    }
    public Calculadora() {
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    public double somar(double n1, double n2){
    
    return n1+n2;
    
    }
     public double sub(double n1, double n2){
    
    return n1-n2;
    
    }
      public double mult(double n1, double n2){
    
    return n1*n2;
    
    }
       public double div(double n1, double n2){
    
    return n1/n2;
    
    }
        public double potencia (double n1, double n2){
    
    return Math.pow(n1,n2);
    
    }
        public double raiz (double n1){
    
    return Math.sqrt(n1);
       
    
    }
    public void calcular(){
       
       System.out.println("Menu:");
       System.out.println("1 - SOMAR");
       System.out.println("2 - SUBTRAIR");
       System.out.println("3 - DIVIDIR");
       System.out.println("4 - MULTIPLICAR");
       System.out.println("5 - POTENCIA");
       System.out.println("6 - RAIZ");
               
 
       }
        
}
