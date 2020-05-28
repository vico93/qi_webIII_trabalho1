package Model;

public class Lista {
    // Atributos
    private int x;
    private int y;
    private int z;
    // Acessores
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }
    // Métodos
    public int mostrarMaior(){
        int numMaior;

        if (this.x > this.y && this.x > this.z)
        {
            numMaior = this.x;
        }
        else if(this.y > this.z)
        {
            numMaior = this.y;
        }
        else
        {
            numMaior = this.z;
        }

        return numMaior;
    }
    public int mostrarMenor(){
        int numMenor;

        if (this.x < this.y && this.x < this.z)
        {
            numMenor = this.x;
        }
        else if(this.y < this.z)
        {
            numMenor = this.y;
        }
        else
        {
            numMenor = this.z;
        }

        return numMenor;
    }

    // toString
    @Override
    public String toString() {
        return "X: " + x +
                "\nY: " + y +
                "\nZ: " + z;
    }
}
