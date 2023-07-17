package Logica;
public class Sede {

    private String sede;
    private String paisSede;

    public Sede(String sede, String paisSede) {
        this.sede = sede;
        this.paisSede = paisSede;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getPaisSede() {
        return paisSede;
    }

    public void setPaisSede(String paisSede) {
        this.paisSede = paisSede;
    }
}