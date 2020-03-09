package br.fai.exercicio6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.start();		

	}

	private void start() {
		// TODO Auto-generated method stub
String[] carros = new String[4];
        
        carros[0] = "civic";
        carros[1] = "gol";
        carros[2] = "palio";
        carros[3] = "uno";
        
        for(String carro : carros){
            System.out.println(carro);
        }
        
        carros[1] = "L200";
        
        System.out.println("\r\n");
        
        for(String carro : carros){
            System.out.println(carro);
        }
        
        carros[3] = "gol";
        
        System.out.println("\r\n");
        
        for(String carro : carros){
            System.out.println(carro);
        }
 
		
	}

}
