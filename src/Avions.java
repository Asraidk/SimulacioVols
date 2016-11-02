
public class Avions {
	
	private String marca ="";
	private String model ="";
	private String matricula ="";
	private int coordenadaX=0;
	private int coordenadaY=0;
	private int coordenadaH=0;
	private double velocitat=0;
	private boolean trenAterratge=true;
	private boolean motor=false;
	private boolean aparcat=true;
	private int passatge=0;
	
	
	public Avions(String model, String marca, String matricula, int coordenadaX, int coordenadaY,int passatge){
		
		this.model=model;
		this.marca=marca;
		this.matricula=matricula;
		this.coordenadaX=coordenadaX;
		this.coordenadaY=coordenadaY;
		this.passatge=passatge;
	}
	
	public void mostrarInformacioAvio(){
		
		
		System.out.println("Informació de l'avio:\t");
		System.out.println("Marca:\t"+this.marca);
		System.out.println("Model:\t"+this.model);
		System.out.println("Matricula:\t"+this.matricula);
		System.out.println("X:\t"+this.coordenadaX);
		System.out.println("Y:\t"+this.coordenadaY);
		System.out.println("Alçada:\t"+this.coordenadaH);
		System.out.println("Velocitat:\t"+this.velocitat);
		System.out.println("Tren aterratge:\t"+booleanToString(this.trenAterratge));
		System.out.println("Motor:\t"+booleanToString(this.motor));
		System.out.println("Aparcat:\t"+booleanToString(this.aparcat));
		
	}
	
	public String booleanToString(boolean control){
		
		String mostrar;
		
		if(control==false){
			mostrar="OFF";
		}
		else{
			mostrar="ON";
		}
		
		return mostrar;
	}
	
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getCoordenadaX() {
		return coordenadaX;
	}
	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}
	public int getCoordenadaY() {
		return coordenadaY;
	}
	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	public int getCoordenadaH() {
		return coordenadaH;
	}
	public void setCoordenadaH(int coordenadaH) {
		this.coordenadaH = coordenadaH;
	}
	public double getVelocitat() {
		return velocitat;
	}
	public void setVelocitat(double velocitat) {
		this.velocitat = velocitat;
	}
	public boolean isTrenAterratge() {
		return trenAterratge;
	}
	public void setTrenAterratge(boolean trenAterratge) {
		this.trenAterratge = trenAterratge;
	}
	public boolean isMotor() {
		return motor;
	}
	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	public boolean isAparcat() {
		return aparcat;
	}
	public void setAparcat(boolean aparcat) {
		this.aparcat = aparcat;
	}
	public int getPassatge() {
		return passatge;
	}
	public void setPassatge(int passatge) {
		this.passatge = passatge;
	}
	
}
