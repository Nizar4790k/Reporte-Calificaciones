public class Main {

    public static void main(String[] args) {
	Estudiante [] estudiantes = {
	        new Estudiante("001-P03-1-001",8,14,17,45),
            new Estudiante("001-P03-1-002",5,12,16,40),
            new Estudiante("001-P03-1-003",4,11,18,46),
            new Estudiante("001-P03-1-004",7,13,15,38),
            new Estudiante("001-P03-1-005",10,20,18,44),
            new Estudiante("001-P03-1-006",6,14,13,40),
            new Estudiante("001-P03-1-007",3,10,20,37),
            new Estudiante("001-P03-1-008",4,9,18,30),
            new Estudiante("001-P03-1-009",7,8,20,45),
            new Estudiante("001-P03-1-010",9,15,18,48),
            new Estudiante("001-P03-1-011",7,13,16,46),
            new Estudiante("001-P03-1-012",2,8,14,42),
            new Estudiante("001-P03-1-013",4,14,20,44),
            new Estudiante("001-P03-1-014",8,15,13,43),
            new Estudiante("001-P03-1-015",3,12,19,43),
            new Estudiante("001-P03-1-016",9,18,17,38),


	};
        imprimirResultados(estudiantes);
    }

    public static void imprimirResultados(Estudiante [] estudiantes){

        int notaMayor = 0;
        int notaMenor=100;
        int acumulador=0;

        System.out.println("              UNIVERSIDAD DOMINICANA O&M"+"\n"+
                           "            Departamento de Registro Académico"+"\n"+
                           "               Reporte de Calificaciones"+"\n"+
                           "             Periodo: Enero – Abril 2021 "+"\n"

        );

        System.out.println("****************************************************************************"+"\n");
        System.out.println("Carrera.........: Ingeniería Industria"+"\n"+
                           "Asignatura…: PROGRAMACION ESTRUCTURADA"+"\n"+
                           "Sección.........: 0410"+"\n"+
                           "Profesor........: JOSE RAFAEL ROJAS"+"\n");

        System.out.println("*****************************************************************************"
                +"\n"+"\n"+"\n");

        System.out.println("*****************************************************************************");

        System.out.println("Matrícula      "+"AS      "+"PP      "+"TP      "+"EF      "+"NOTA      "+"NL      ");

        System.out.println("*****************************************************************************");

        for(Estudiante estudiante:estudiantes){

            int notaFinal = estudiante.calcularNotaFinal();
            acumulador+=notaFinal;

            if(notaFinal>notaMayor){
            notaMayor=notaFinal;
            }

            if(notaFinal<notaMenor){
                notaMenor=notaFinal;
            }

            System.out.println(estudiante);




        }

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Cantidad de Estudiantes: "+estudiantes.length+"\n"+
                           "Nota Mayor: "+notaMayor+"\n"+
                           "Nota Menor: "+notaMenor+"\n"+
                           "Nota Promedio:  "+acumulador/estudiantes.length);


    }
}
