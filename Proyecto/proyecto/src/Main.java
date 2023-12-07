import java.util.Random;

public class Main {
    static String entrenamientoAux="";
    static int entrenamientoSumaAux=0;
    public static void main(String[] args) {
        int tipoUsuario=0;
        int usuarioXP = NumRandom(1000,1);
        if (usuarioXP <=500){
            System.out.println("Usuario Principiante");
            tipoUsuario=1;
        }
        if (usuarioXP >500){
            System.out.println("Usuaio Intermedio/Avanzado");
            tipoUsuario=2;
        }
        datos(tipoUsuario);
    }

    public static int NumRandom(int maximo, int minimo){
        Random random = new Random();
        int randomNum = random.nextInt((maximo - minimo) + 1) + minimo;
        return randomNum;
    }

    public static void datos(int tipoUsuario){
        String entrenamiento1="";
        String entrenamiento2;
        int cuerpoCompleto;
        int rutinaDividiva;
        int fuerzaP, tecnicaP, diaP, sinTecnicaDiaP, hipertrofiaConTecnicaP, hipertrofiaTecnicaDiaP, hipertrofiaSinTecnicaDiaP,
         fuerzaG, hipertrofiaG, fuerzaTecnicaG, fuerzaSinTecnicaG, hipertrofiaTecnicaG, hipertrofiaSinTecnicaG, fTecnicaDia1G, fTecnicaDia2G, fSinTecnicaDia1G, fSinTecnicaDia2G,
         hTecnicaDia1G, hTecnicaDia2G, hSinTecnicaDia1G, hSinTecnicaDia2G;

        if (tipoUsuario==1){
            //Se los puso de esta manera para que sea facil realizar cambios en los datos
            //CUERPO COMPLETO
            cuerpoCompleto=75;
            //PROBABILIDADES
            fuerzaP= 50; //PROBABILIDAD DE ENTRENAMIENTO DE FUERZA PESADA
            tecnicaP= 30; //PROBABILIDAD DE ENTRENAMIENTO DE FUERZA PESADA CON TECNICAS AVANZADAS
            diaP= 70; //PROBABILIDAD DE ENTRENAMIENTO DE FUERZA PESADA CON TECNICAS AVANZADAS EN 3-4 DIAS
            sinTecnicaDiaP= 70; //PROBABILIDAD DE ENTRENAMIENTO DE FUERZA PESADA SIN TECNICAS AVANZADAS EN 3-4 DIAS
            hipertrofiaConTecnicaP= 30; //PROBABILIDAD DE HIPERTROFIA CON TECNICAS AVANZADAS
            hipertrofiaTecnicaDiaP= 70; //PROBABILIDAD DE HIPERTROFIA CON TECNICAS AVANZADAS EN 3-4 DIAS
            hipertrofiaSinTecnicaDiaP= 70; //PROBABILIDAD DE HIPERTROFIA SIN TECNICAS AVANZADAS EN 3-4 DIAS
            //GANANCIA DE MASA
            fuerzaG= 75; //GANANCIA DE MASA EN FUERZA PESADA
            hipertrofiaG= 80; //GANANCIA DE MASA EN HIPERTROFIA
            fuerzaTecnicaG= 77; //GANANCIA DE MASA EN FUERZA PESADA CON TECNICA AVANZADA
            fuerzaSinTecnicaG= 72; //GANANCIA DE MASA EN FUERZA PESADA SIN TECNICA AVANZADA
            hipertrofiaTecnicaG= 77; //GANANCIA DE MASA EN HIPERTROFIA CON TECNICA AVANZADA
            hipertrofiaSinTecnicaG= 72; //GANANCIA DE MASA EN HIPERTROFIA SIN TECNICA AVANZADA
            fTecnicaDia1G= 77; //GANANCIA DE MASA EN FUERZA PESADA CON TECNICA AVANZADA EN 3-4 DIAS
            fTecnicaDia2G= 67; //GANANCIA DE MASA EN FUERZA PESADA CON TECNICA AVANZADA EN 5-6 DIAS
            fSinTecnicaDia1G= 77; //GANANCIA DE MASA EN FUERZA PESADA SIN TECNICA AVANZADA EN 3-4 DIAS
            fSinTecnicaDia2G= 67; //GANANCIA DE MASA EN FUERZA PESADA SIN TECNICA AVANZADA EN 5-6 DIAS
            hTecnicaDia1G= 77; //GANANCIA DE MASA EN HIPERTROFIA CON TECNICA AVANZADA EN 3-4 DIAS
            hTecnicaDia2G= 67; //GANANCIA DE MASA EN HIPERTROFIA CON TECNICA AVANZADA EN 5-6 DIAS
            hSinTecnicaDia1G= 77; //GANANCIA DE MASA EN HIPERTROFIA SIN TECNICA AVANZADA EN 3-4 DIAS
            hSinTecnicaDia2G= 67; //GANANCIA DE MASA EN HIPERTROFIA SIN TECNICA AVANZADA EN 5-6 DIAS

            simulacion(fuerzaP, tecnicaP, diaP, sinTecnicaDiaP, hipertrofiaConTecnicaP, hipertrofiaTecnicaDiaP, hipertrofiaSinTecnicaDiaP,
                    fuerzaG, hipertrofiaG, fuerzaTecnicaG, fuerzaSinTecnicaG, hipertrofiaTecnicaG, hipertrofiaSinTecnicaG, fTecnicaDia1G, fTecnicaDia2G, fSinTecnicaDia1G, fSinTecnicaDia2G,
                    hTecnicaDia1G, hTecnicaDia2G, hSinTecnicaDia1G, hSinTecnicaDia2G);
            cuerpoCompleto+=entrenamientoSumaAux;
            entrenamiento1="Entrenamiento cuerpo completo, " + entrenamientoAux;
            entrenamientoAux="";
            entrenamientoSumaAux=0;

            //RUTINA DIVIDIDA
            rutinaDividiva=65;
            //PROBABILIDADES
            fuerzaP= 50; //PROBABILIDAD DE ENTRENAMIENTO DE FUERZA PESADA
            tecnicaP= 30; //PROBABILIDAD DE ENTRENAMIENTO DE FUERZA PESADA CON TECNICAS AVANZADAS
            diaP= 30; //PROBABILIDAD DE ENTRENAMIENTO DE FUERZA PESADA CON TECNICAS AVANZADAS EN 3-4 DIAS
            sinTecnicaDiaP= 30; //PROBABILIDAD DE ENTRENAMIENTO DE FUERZA PESADA SIN TECNICAS AVANZADAS EN 3-4 DIAS
            hipertrofiaConTecnicaP= 30; //PROBABILIDAD DE HIPERTROFIA CON TECNICAS AVANZADAS
            hipertrofiaTecnicaDiaP= 30; //PROBABILIDAD DE HIPERTROFIA CON TECNICAS AVANZADAS EN 3-4 DIAS
            hipertrofiaSinTecnicaDiaP= 30; //PROBABILIDAD DE HIPERTROFIA SIN TECNICAS AVANZADAS EN 3-4 DIAS
            //GANANCIA DE MASA
            fuerzaG= 70; //GANANCIA DE MASA EN FUERZA PESADA
            hipertrofiaG= 70; //GANANCIA DE MASA EN HIPERTROFIA
            fuerzaTecnicaG= 74; //GANANCIA DE MASA EN FUERZA PESADA CON TECNICA AVANZADA
            fuerzaSinTecnicaG= 70; //GANANCIA DE MASA EN FUERZA PESADA SIN TECNICA AVANZADA
            hipertrofiaTecnicaG= 74; //GANANCIA DE MASA EN HIPERTROFIA CON TECNICA AVANZADA
            hipertrofiaSinTecnicaG= 70; //GANANCIA DE MASA EN HIPERTROFIA SIN TECNICA AVANZADA
            fTecnicaDia1G= 77; //GANANCIA DE MASA EN FUERZA PESADA CON TECNICA AVANZADA EN 3-4 DIAS
            fTecnicaDia2G= 67; //GANANCIA DE MASA EN FUERZA PESADA CON TECNICA AVANZADA EN 5-6 DIAS
            fSinTecnicaDia1G= 77; //GANANCIA DE MASA EN FUERZA PESADA SIN TECNICA AVANZADA EN 3-4 DIAS
            fSinTecnicaDia2G= 67; //GANANCIA DE MASA EN FUERZA PESADA SIN TECNICA AVANZADA EN 5-6 DIAS
            hTecnicaDia1G= 77; //GANANCIA DE MASA EN HIPERTROFIA CON TECNICA AVANZADA EN 3-4 DIAS
            hTecnicaDia2G= 67; //GANANCIA DE MASA EN HIPERTROFIA CON TECNICA AVANZADA EN 5-6 DIAS
            hSinTecnicaDia1G= 77; //GANANCIA DE MASA EN HIPERTROFIA SIN TECNICA AVANZADA EN 3-4 DIAS
            hSinTecnicaDia2G= 67; //GANANCIA DE MASA EN HIPERTROFIA SIN TECNICA AVANZADA EN 5-6 DIAS

            simulacion(fuerzaP, tecnicaP, diaP, sinTecnicaDiaP, hipertrofiaConTecnicaP, hipertrofiaTecnicaDiaP, hipertrofiaSinTecnicaDiaP,
                    fuerzaG, hipertrofiaG, fuerzaTecnicaG, fuerzaSinTecnicaG, hipertrofiaTecnicaG, hipertrofiaSinTecnicaG, fTecnicaDia1G, fTecnicaDia2G, fSinTecnicaDia1G, fSinTecnicaDia2G,
                    hTecnicaDia1G, hTecnicaDia2G, hSinTecnicaDia1G, hSinTecnicaDia2G);


            rutinaDividiva+=entrenamientoSumaAux;
            entrenamiento2="Rutina dividida, "+entrenamientoAux;
            if (cuerpoCompleto<rutinaDividiva){
                System.out.println("Ganancia de masa muscular esperada: "+rutinaDividiva);
                System.out.println("Entrenamiento sugerido: "+ entrenamiento2);
            }
            else {
                System.out.println("Ganancia de masa muscular esperada: "+cuerpoCompleto);
                System.out.println("Entrenamiento sugerido: "+ entrenamiento1);
            }

            entrenamientoAux="";
            entrenamientoSumaAux=0;
        }
        else{
            //CUERPO COMPLETO
            cuerpoCompleto=70;
            //PROBABILIDADES
            fuerzaP= 30; //PROBABILIDAD DE ENTRENAMIENTO DE FUERZA PESADA
            tecnicaP= 70; //PROBABILIDAD DE ENTRENAMIENTO DE FUERZA PESADA CON TECNICAS AVANZADAS
            diaP= 30; //PROBABILIDAD DE ENTRENAMIENTO DE FUERZA PESADA CON TECNICAS AVANZADAS EN 3-4 DIAS
            sinTecnicaDiaP= 30; //PROBABILIDAD DE ENTRENAMIENTO DE FUERZA PESADA SIN TECNICAS AVANZADAS EN 3-4 DIAS
            hipertrofiaConTecnicaP= 70; //PROBABILIDAD DE HIPERTROFIA CON TECNICAS AVANZADAS
            hipertrofiaTecnicaDiaP= 30; //PROBABILIDAD DE HIPERTROFIA CON TECNICAS AVANZADAS EN 3-4 DIAS
            hipertrofiaSinTecnicaDiaP= 30; //PROBABILIDAD DE HIPERTROFIA SIN TECNICAS AVANZADAS EN 3-4 DIAS
            //GANANCIA DE MASA
            fuerzaG= 82; //GANANCIA DE MASA EN FUERZA PESADA
            hipertrofiaG= 87; //GANANCIA DE MASA EN HIPERTROFIA
            fuerzaTecnicaG= 80; //GANANCIA DE MASA EN FUERZA PESADA CON TECNICA AVANZADA
            fuerzaSinTecnicaG= 75; //GANANCIA DE MASA EN FUERZA PESADA SIN TECNICA AVANZADA
            hipertrofiaTecnicaG= 83; //GANANCIA DE MASA EN HIPERTROFIA CON TECNICA AVANZADA
            hipertrofiaSinTecnicaG= 75; //GANANCIA DE MASA EN HIPERTROFIA SIN TECNICA AVANZADA
            fTecnicaDia1G= 75; //GANANCIA DE MASA EN FUERZA PESADA CON TECNICA AVANZADA EN 3-4 DIAS
            fTecnicaDia2G= 80; //GANANCIA DE MASA EN FUERZA PESADA CON TECNICA AVANZADA EN 5-6 DIAS
            fSinTecnicaDia1G= 75; //GANANCIA DE MASA EN FUERZA PESADA SIN TECNICA AVANZADA EN 3-4 DIAS
            fSinTecnicaDia2G= 80; //GANANCIA DE MASA EN FUERZA PESADA SIN TECNICA AVANZADA EN 5-6 DIAS
            hTecnicaDia1G= 75; //GANANCIA DE MASA EN HIPERTROFIA CON TECNICA AVANZADA EN 3-4 DIAS
            hTecnicaDia2G= 80; //GANANCIA DE MASA EN HIPERTROFIA CON TECNICA AVANZADA EN 5-6 DIAS
            hSinTecnicaDia1G= 75; //GANANCIA DE MASA EN HIPERTROFIA SIN TECNICA AVANZADA EN 3-4 DIAS
            hSinTecnicaDia2G= 80; //GANANCIA DE MASA EN HIPERTROFIA SIN TECNICA AVANZADA EN 5-6 DIAS

            simulacion(fuerzaP, tecnicaP, diaP, sinTecnicaDiaP, hipertrofiaConTecnicaP, hipertrofiaTecnicaDiaP, hipertrofiaSinTecnicaDiaP,
                    fuerzaG, hipertrofiaG, fuerzaTecnicaG, fuerzaSinTecnicaG, hipertrofiaTecnicaG, hipertrofiaSinTecnicaG, fTecnicaDia1G, fTecnicaDia2G, fSinTecnicaDia1G, fSinTecnicaDia2G,
                    hTecnicaDia1G, hTecnicaDia2G, hSinTecnicaDia1G, hSinTecnicaDia2G);
            cuerpoCompleto+=entrenamientoSumaAux;
            entrenamiento1="Entrenamiento cuerpo completo, " + entrenamientoAux;
            entrenamientoAux="";
            entrenamientoSumaAux=0;

            //RUTINA DIVIDIDA
            rutinaDividiva=60;
            //PROBABILIDADES
            fuerzaP= 50; //PROBABILIDAD DE ENTRENAMIENTO DE FUERZA PESADA
            tecnicaP= 70; //PROBABILIDAD DE ENTRENAMIENTO DE FUERZA PESADA CON TECNICAS AVANZADAS
            diaP= 30; //PROBABILIDAD DE ENTRENAMIENTO DE FUERZA PESADA CON TECNICAS AVANZADAS EN 3-4 DIAS
            sinTecnicaDiaP= 30; //PROBABILIDAD DE ENTRENAMIENTO DE FUERZA PESADA SIN TECNICAS AVANZADAS EN 3-4 DIAS
            hipertrofiaConTecnicaP= 70; //PROBABILIDAD DE HIPERTROFIA CON TECNICAS AVANZADAS
            hipertrofiaTecnicaDiaP= 30; //PROBABILIDAD DE HIPERTROFIA CON TECNICAS AVANZADAS EN 3-4 DIAS
            hipertrofiaSinTecnicaDiaP= 30; //PROBABILIDAD DE HIPERTROFIA SIN TECNICAS AVANZADAS EN 3-4 DIAS
            //GANANCIA DE MASA
            fuerzaG= 80; //GANANCIA DE MASA EN FUERZA PESADA
            hipertrofiaG= 85; //GANANCIA DE MASA EN HIPERTROFIA
            fuerzaTecnicaG= 78; //GANANCIA DE MASA EN FUERZA PESADA CON TECNICA AVANZADA
            fuerzaSinTecnicaG= 75; //GANANCIA DE MASA EN FUERZA PESADA SIN TECNICA AVANZADA
            hipertrofiaTecnicaG= 80; //GANANCIA DE MASA EN HIPERTROFIA CON TECNICA AVANZADA
            hipertrofiaSinTecnicaG= 78; //GANANCIA DE MASA EN HIPERTROFIA SIN TECNICA AVANZADA
            fTecnicaDia1G= 75; //GANANCIA DE MASA EN FUERZA PESADA CON TECNICA AVANZADA EN 3-4 DIAS
            fTecnicaDia2G= 80; //GANANCIA DE MASA EN FUERZA PESADA CON TECNICA AVANZADA EN 5-6 DIAS
            fSinTecnicaDia1G= 75; //GANANCIA DE MASA EN FUERZA PESADA SIN TECNICA AVANZADA EN 3-4 DIAS
            fSinTecnicaDia2G= 80; //GANANCIA DE MASA EN FUERZA PESADA SIN TECNICA AVANZADA EN 5-6 DIAS
            hTecnicaDia1G= 75; //GANANCIA DE MASA EN HIPERTROFIA CON TECNICA AVANZADA EN 3-4 DIAS
            hTecnicaDia2G= 80; //GANANCIA DE MASA EN HIPERTROFIA CON TECNICA AVANZADA EN 5-6 DIAS
            hSinTecnicaDia1G= 75; //GANANCIA DE MASA EN HIPERTROFIA SIN TECNICA AVANZADA EN 3-4 DIAS
            hSinTecnicaDia2G= 80; //GANANCIA DE MASA EN HIPERTROFIA SIN TECNICA AVANZADA EN 5-6 DIAS

            simulacion(fuerzaP, tecnicaP, diaP, sinTecnicaDiaP, hipertrofiaConTecnicaP, hipertrofiaTecnicaDiaP, hipertrofiaSinTecnicaDiaP,
                    fuerzaG, hipertrofiaG, fuerzaTecnicaG, fuerzaSinTecnicaG, hipertrofiaTecnicaG, hipertrofiaSinTecnicaG, fTecnicaDia1G, fTecnicaDia2G, fSinTecnicaDia1G, fSinTecnicaDia2G,
                    hTecnicaDia1G, hTecnicaDia2G, hSinTecnicaDia1G, hSinTecnicaDia2G);
            rutinaDividiva+=entrenamientoSumaAux;
            entrenamiento2="Rutina dividida, "+entrenamientoAux;

            if (cuerpoCompleto<rutinaDividiva){
                System.out.println("Ganancia de masa muscular esperada: "+rutinaDividiva);
                System.out.println("Entrenamiento sugerido: "+ entrenamiento2);
            }
            else {
                System.out.println("Ganancia de masa muscular esperada: "+cuerpoCompleto);
                System.out.println("Entrenamiento sugerido: "+ entrenamiento1);
            }
            entrenamientoAux="";
            entrenamientoSumaAux=0;
        }
    }

    //P=probabilidad
    //G = ganancia de masa
    public static void simulacion(int fuerzaP,int tecnicaP,int diaP,int sinTecnicaDiaP,int hipertrofiaConTecnicaP,int hipertrofiaTecnicaDiaP,int hipertrofiaSinTecnicaDiaP,
                                   int fuerzaG,int hipertrofiaG,int fuerzaTecnicaG,int fuerzaSinTecnicaG,int hipertrofiaTecnicaG,int hipertrofiaSinTecnicaG,int fTecnicaDia1G,int fTecnicaDia2G,int fSinTecnicaDia1G,int fSinTecnicaDia2G,
                                   int hTecnicaDia1G,int hTecnicaDia2G,int hSinTecnicaDia1G,int hSinTecnicaDia2G){
        int probabilidad;

        probabilidad=NumRandom(100,1);
        if (probabilidad<=fuerzaP){
            entrenamientoSumaAux+=fuerzaG;
            entrenamientoAux+= "Entrenamiento de fuerza pesada, ";
            probabilidad=NumRandom(100,1);
            if (probabilidad<=tecnicaP){
                entrenamientoSumaAux+=fuerzaTecnicaG;
                entrenamientoAux+= "Con tecnicas avanzada y de ";
                probabilidad=NumRandom(100,1);
                if (probabilidad<=diaP){
                    entrenamientoAux+= "3 a 4 dias de entrenamiento";
                    entrenamientoSumaAux+=fTecnicaDia1G;
                }
                else {
                    entrenamientoAux+= "5 a 6 dias de entrenamiento";
                    entrenamientoSumaAux+=fTecnicaDia2G;
                }
            }
            else{
                entrenamientoSumaAux+=fuerzaSinTecnicaG;
                entrenamientoAux+= "Sin tecnicas avanzada y de ";
                probabilidad=NumRandom(100,1);
                if (probabilidad<=sinTecnicaDiaP){
                    entrenamientoAux+= "3 a 4 dias de entrenamiento";
                    entrenamientoSumaAux+=fSinTecnicaDia1G;
                }
                else {
                    entrenamientoAux+= "5 a 6 dias de entrenamiento";
                    entrenamientoSumaAux+=fSinTecnicaDia2G;
                }
            }
        }
        else{
            entrenamientoSumaAux+=hipertrofiaG;
            entrenamientoAux+= "Enfoque en la hipertrofia, ";
            probabilidad=NumRandom(100,1);
            if (probabilidad<=hipertrofiaConTecnicaP){
                entrenamientoSumaAux+=hipertrofiaTecnicaG;
                entrenamientoAux+= "Con tecnicas avanzada y de ";
                probabilidad=NumRandom(100,1);
                if (probabilidad<=hipertrofiaTecnicaDiaP){
                    entrenamientoAux+= "3 a 4 dias de entrenamiento";
                    entrenamientoSumaAux+=hTecnicaDia1G;
                }
                else {
                    entrenamientoAux+= "5 a 6 dias de entrenamiento";
                    entrenamientoSumaAux+=hTecnicaDia2G;
                }
            }
            else{
                entrenamientoSumaAux+=hipertrofiaSinTecnicaG;
                entrenamientoAux+= "Sin tecnicas avanzada y de ";
                probabilidad=NumRandom(100,1);
                if (probabilidad<=hipertrofiaSinTecnicaDiaP){
                    entrenamientoAux+= "3 a 4 dias de entrenamiento";
                    entrenamientoSumaAux+=hSinTecnicaDia1G;
                }
                else {
                    entrenamientoAux+= "5 a 6 dias de entrenamiento";
                    entrenamientoSumaAux+=hSinTecnicaDia2G;
                }
            }
        }
    }
}