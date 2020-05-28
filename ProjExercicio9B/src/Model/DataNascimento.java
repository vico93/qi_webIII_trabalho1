package Model;

import java.util.Calendar;

public class DataNascimento {
    // Atributos
    private int anoNascimento;
    // Acessores
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    // Métodos
    public int calcularIdade(int tipo) {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int idadeFinal = 0;
        switch (tipo) {
            // em Anos
            case 1:
                idadeFinal = anoAtual - this.anoNascimento;
                break;
            // em Meses
            case 2:
                idadeFinal = (anoAtual - this.anoNascimento) * 12;
                break;
            // em Dias
            case 3:
                idadeFinal = (anoAtual - this.anoNascimento) * 365;
                break;
            // em Horas
            case 4:
                idadeFinal = (anoAtual - this.anoNascimento) * 8760;
                break;
            // em Minutos
            case 5:
                idadeFinal = (anoAtual - this.anoNascimento) * 525600;
                break;
            // em Segundos
            case 6:
                idadeFinal = (anoAtual - this.anoNascimento) * 31536000;
                break;
            // opção inválida
            default:
                idadeFinal = -1;
        }
        return idadeFinal;
    }

    // toString
    @Override
    public String toString() {
        return "Ano de nascimento: " + anoNascimento;
    }
}
