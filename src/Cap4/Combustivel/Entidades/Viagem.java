package Cap4.Combustivel.Entidades;

public class Viagem {
    private int Kilometros;
    private int CombustivelUtilizado;
    public Viagem(int Kilometros, int CombustivelUtilizado){
        this.Kilometros = Kilometros;
        this.CombustivelUtilizado = CombustivelUtilizado;
    }

    public int getKilometros() {return Kilometros;}
    public int getCombustivelUtilizado() {return CombustivelUtilizado;}

    @Override
    public String toString() {
        return "Kilometros = " + Kilometros +"\n"+
                "Combustivel Utilizado = " + CombustivelUtilizado;
    }
}
