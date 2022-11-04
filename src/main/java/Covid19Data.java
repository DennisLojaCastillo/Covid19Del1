public class Covid19Data {
    private String region;
    private String aldersgruppe;
    private int tilfælde;
    private int døde;
    private int indlagteIntensiv;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, String aldersgruppe, int tilfælde, int døde, int indlagteIntensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.tilfælde = tilfælde;
        this.døde = døde;
        this.indlagteIntensiv = indlagteIntensiv;
        this.indlagte = indlagte;
        this.dato = String.valueOf(dato); // TODO Tjek efter
    }




    @Override
    public String toString() {
        return "\n[Region: " + region +
                " - Aldersgruppe: " + aldersgruppe +
                " - Tilfælde: " + tilfælde +
                " - Døde: " + døde +
                " - Indlagte Intensiv: " + indlagteIntensiv +
                " - Indlagte: " + indlagte +
                " - Dato: " +
                "" + dato + "]";
    }
}


