
public class EspaiAeri {

	private Avions LlistaAvio[];
	private int numAvio=0;
	private int capacitat=0;
	private String nomEspaiAeri;
	
	
	public EspaiAeri(String nomEspaiAeri, int Capacitat){

		this.capacitat=Capacitat;
		this.nomEspaiAeri=nomEspaiAeri;
		LlistaAvio= new Avions[capacitat];
	}
	
	public void afegirAvio(String model, String marca, String matricula, int coordenadaX, int coordenadaY, int passatge){
			
		Avions avioTemporal =new Avions(model,marca,matricula,coordenadaX,coordenadaY,passatge);
		int index;
		int posicio=0;
		boolean trobat=false;
		
		//Control que no pasem la capacitat de la l'espai aeri
		if(numAvio<this.capacitat){
			//bucle de control per si el troba surtir y afeguirlo o si pasa la capacitat(control erro no cassella)
			while(trobat!=true && posicio<this.capacitat){
				//Busquem la matricula al array de objectes avio
				for(index=0;index<this.capacitat;index++){
					//condicio perque no peti si esta buid casella a null/casellas que no tenen  objecte 
					if (LlistaAvio[index]!=null){
						//condicio per trobar una matricula igual a la introduida
						if(LlistaAvio[index].getMatricula().equalsIgnoreCase(matricula) && trobat==false){
							trobat=true;
							System.out.println("Aquesta avio amb la matricula["+matricula+"] ja esta en actiu.");
						}
						//condicio que just en la posicio inicial a l'altura 0  no tinguem un avio ja
						if(LlistaAvio[index].getCoordenadaX()== coordenadaX &&LlistaAvio[index].getCoordenadaY()== coordenadaY 
								&&LlistaAvio[index].getCoordenadaH()== 0 &&trobat==false){
							trobat=true;
							System.out.println("Aqui ja tenim un avio en actiu.");
						}
						posicio++;
					}
					else{
						posicio++;
						//posicioSenseMatricula=true;
					}
				}
				//Si no a trobat una matricula igual introdum el avio al espai aeri
				if(trobat==false){
					System.out.println("Avio en actiu llest!");
					LlistaAvio[numAvio]=avioTemporal;
					numAvio++;
				}
			}	
		}
	}
	
	public void mostrarAvions()	{
	  System.out.println("Informació espari aeri de: " + nomEspaiAeri);
	  System.out.println("Te capacitat per: "+ capacitat+" avions" );
	  System.out.println("En aquests moments hi ha aquesta avions en actiu: ");
	  for (int i=0; i<numAvio; i++){
		  //control per nulls si borrem alguna cosa
		  if (LlistaAvio[i]!=null){
			  LlistaAvio[i].mostrarInformacioAvio();			  
		  }
	  }
	}
}