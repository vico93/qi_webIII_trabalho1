package Model;

public class Aluno {
    // Atributos
    private String nomeAluno;
    private double nota1;
    private double nota2;
    private int faltas;
    private int totalAulas;
    // Accessores
    public String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public int getFaltas() {
        return faltas;
    }
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    public int getTotalAulas() {
        return totalAulas;
    }
    public void setTotalAulas(int totalAulas) {
        this.totalAulas = totalAulas;
    }

    // Métodos
    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }
    public int calcularFrequencia() {
        return (this.totalAulas - this.faltas) * 100 / this.totalAulas; // THANKS PROFE!
    }
    public String calcularResultadoFinal() {
        // Variáveis locais
        String resultadoFinal = "Reprovado";            // Reprovado por padrão, o ônus está pro aluno rsrsrs
        double mediaFinal = this.calcularMedia();       // Pra evitar repetição de método
        int frequencia = this.calcularFrequencia();  // mesma coisa

        if (mediaFinal > 2.0) {
            // Média entre 2 e 5,9
            if ((mediaFinal >= 2.0) && (mediaFinal <= 5.9)) {
                // Verifica a frequência
                if (frequencia >= 75) {
                    resultadoFinal = "Recuperação";
                }
                else {
                    resultadoFinal = "Reprovado por faltas";
                }
            }
            // Se a frequência for maior ou igual a 6.0
            else if (mediaFinal >= 6.0) {
                // Verifica se tem mais de oito e frquência maior que 80%
                if ((mediaFinal >= 8.0) && (frequencia >= 80)) {
                    resultadoFinal = "Aprovado com Láurea";
                }
                // Verifica a frequência
                else if (frequencia < 75) {
                    resultadoFinal = "Reprovado por faltas";
                }
                else {
                    resultadoFinal = "Aprovado";
                }
            }
        }
        else {
            resultadoFinal = "Reprovado por Nota";
        }

        return resultadoFinal;
    }

    // toString
    @Override
    public String toString() {
        return "Aluno: " + nomeAluno +
                "\nNota #1: " + String.format("%.1f", nota1) +
                "\nNota #2: " + String.format("%.1f", nota2) +
                "\nFaltas: " + faltas +
                "\nTotal de aulas ministradas: " + totalAulas;
    }
}
