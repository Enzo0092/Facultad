/**
 * clase Semi Exclusivo hereda casi todo de la superclase cargo
 * @Author Enzo Romero
 * @Author Francisco Morales
 * @version 
 */

public class SemiExclusivo extends Cargo{
    private int horasDeInvestigacion;
    public SemiExclusivo ( String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horasDeDocencia,int p_horasDeInvestigacion ){
     super(p_nombreCargo,p_sueldoBasico, p_anioIngreso, p_horasDeDocencia);   
     this.setHorasDeInvestigacion(p_horasDeInvestigacion);
    }
    private void setHorasDeInvestigacion(int p_horasDeInvestigacion){
        this.horasDeInvestigacion=p_horasDeInvestigacion;
    }
    public int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }
    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("---- Cargo de caracter SemiExclusivo ----");
        System.out.println("Horas invetigacion :" + this.getHorasDeInvestigacion());
    }
}