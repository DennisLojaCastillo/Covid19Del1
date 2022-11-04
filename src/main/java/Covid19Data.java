public class Covid19Data {
    private String region;
    private String aldersgruppe;
    private int tilf�lde;
    private int d�de;
    private int indlagteIntensiv;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, String aldersgruppe, int tilf�lde, int d�de, int indlagteIntensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.tilf�lde = tilf�lde;
        this.d�de = d�de;
        this.indlagteIntensiv = indlagteIntensiv;
        this.indlagte = indlagte;
        this.dato = String.valueOf(dato); // TODO Tjek efter
    }




    @Override
    public String toString() {
        return "\n[Region: " + region +
                " - Aldersgruppe: " + aldersgruppe +
                " - Tilf�lde: " + tilf�lde +
                " - D�de: " + d�de +
                " - Indlagte Intensiv: " + indlagteIntensiv +
                " - Indlagte: " + indlagte +
                " - Dato: " +
                "" + dato + "]";
    }
}


