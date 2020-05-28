package Model;

public class Abastecimento {
    // Constantes
    // Peguei daqui: https://pt.globalpetrolprices.com/gasoline_prices/
    private static double LITRO_GASOLINA = 3.80;
    private static double LITRO_ETANOL = 2.53;
    private static double LITRO_GNV = 1.4972; // Esse achei aqui (http://www.sulgas.rs.gov.br/sulgas/veicular/tabela-de-precos) mas é em m³ em vez de litro, talvez por ser gás, enfim
    private static double LITRO_DIESEL = 3.01;
    // Atributos
    private double volumeAbastecido;
    private byte tipoCombustivel;
    // Acessores
    public double getVolumeAbastecido() {
        return volumeAbastecido;
    }
    public void setVolumeAbastecido(double volumeAbastecido) {
        this.volumeAbastecido = volumeAbastecido;
    }
    public byte getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(byte tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    // Métodos
    public double calcularValorPagar() {
        double valorTotal = 0.0;
        switch (this.tipoCombustivel) {
            // Gasolina
            case 1:
                valorTotal = LITRO_GASOLINA * this.volumeAbastecido;
                break;
            // Álcool/Etanol
            case 2:
                valorTotal = LITRO_ETANOL * this.volumeAbastecido;
                break;
            // GNV
            case 3:
                valorTotal = LITRO_GNV * this.volumeAbastecido;
                break;
            // Diesel
            case 4:
                valorTotal = LITRO_DIESEL * this.volumeAbastecido;
                break;
            // Entrada inválida
            default:
                valorTotal = -1.0;
        }
        return valorTotal;
    }

    // toString
    @Override
    public String toString() {
        String nomeTipo;
        switch (tipoCombustivel) {
            case 2:
                nomeTipo = "Álcool";
                break;
            case 3:
                nomeTipo = "GNV";
                break;
            case 4:
                nomeTipo = "Diesel";
                break;
            default:
                nomeTipo = "Gasolina";
        }
        return "Abastecimento: " +
                "\nVolume abastecido: " + volumeAbastecido + "L" +
                "\nTipo de combustível: " + nomeTipo;
    }
}
