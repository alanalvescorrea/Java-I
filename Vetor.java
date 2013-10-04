public class Vetor {
	private int[] vetor;
	private int Tamanho = 0;
	private int TamanhoMax;
	
	public Vetor(int a){
 	TamanhoMax = a;
 	vetor = new int[TamanhoMax];
	}
	public void AdicionarElemento(int b){
 	
 	if(Tamanho<TamanhoMax) {
 	vetor[Tamanho] = b;
 	Tamanho = Tamanho + 1;
 }
 
 
 
	}
	public void RetirarElemento() {
 if(Tamanho > 0) { 
 	Tamanho = Tamanho - 1;
 	vetor[Tamanho] = -1;
 	}
	}
	public void TamanhoTotal() {
 	System.out.println(TamanhoMax);
	}
	public void TamanhoVetor(){
 	System.out.println(Tamanho);
	}
 public void RetornaElementos(){
 	int i;
 for(i=0;i<Tamanho;i++)
 System.out.println(vetor[i]);
 }
 public void OrdenarElementos(Vetor b) { 
 for (int pass = 0; pass < Tamanho; pass++) 
 	for (int i = 0; i < Tamanho-1; i++) 
 if (b.vetor[i] > b.vetor[i+1]){
 	int aux = 0;
 	aux = b.vetor[i];
 	b.vetor[i]=b.vetor[i+1];
 	b.vetor[i+1]=aux;
 }
 	
	} 
	
	public static void main (String args[]){
 Vetor v = new Vetor(10);
 	v.AdicionarElemento(60);
 	v.AdicionarElemento(6);
 	v.AdicionarElemento(3);
 	v.AdicionarElemento(7);
 	System.out.println("O Vetor e: ");
 	v.RetornaElementos();
 	v.OrdenarElementos(v);
 	System.out.println("------");
 	for (int i=0;i<v.Tamanho;i++)
 System.out.println(v.vetor[i]);
	}
}
