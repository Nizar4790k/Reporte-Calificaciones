public class Estudiante {

    private String matricula;
    private int asistencia;
    private int primerParcial;
    private int practicas;
    private int examenFinal;

    public Estudiante(String matricula, int asistencia, int primerParcial, int practicas, int examenFinal) {
        this.matricula = matricula;
        this.asistencia = asistencia;
        this.primerParcial = primerParcial;
        this.practicas = practicas;
        this.examenFinal = examenFinal;
    }

    public int calcularNotaFinal(){
        return asistencia+practicas+primerParcial+examenFinal;
    }

    private String calcularNotaLiteral(int notaFinal){

        if(notaFinal>=90){
            return "A";
        }else if( notaFinal>=80){
            return "B";
        }else if(notaFinal>=75){
            return "C";
        }else if(notaFinal>=70){
            return "D";
        }else {
            return "F";
        }
    }

    @Override
    public String toString(){

        int notaFinal = calcularNotaFinal();
        String notaLiteral =calcularNotaLiteral(notaFinal);

        return matricula+"  "+asistencia+"      "+ primerParcial+"     "+practicas+"    "+examenFinal+"         "
                +notaFinal+"           "+notaLiteral;
    }

}
