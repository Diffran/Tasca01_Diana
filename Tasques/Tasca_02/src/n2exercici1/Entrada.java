package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    public static Scanner lector = new Scanner(System.in);

    //METODES EXCEPCIO INPUTMISMATCHEXCEPTION
    public static byte llegirByte(String missatge){
        int dadaUsu =-1;
        boolean esCorrecte=false;
        while(!esCorrecte){
            System.out.println(missatge);
            try{
                dadaUsu = lector.nextByte();
                esCorrecte = true;
            }catch(InputMismatchException e){
                System.out.println("Error: "+e);
                System.out.println("introdueix una dada de tipus byte");
                lector.next();
            }
        }
        return (byte)dadaUsu;
    }
    public static int llegirInt(String missatge){
        int dadaUsu=0;
        boolean esCorrecte=false;
        while(!esCorrecte){
            System.out.println(missatge);
            try{
                dadaUsu = lector.nextInt();
                esCorrecte = true;
            }catch(InputMismatchException e){
                System.out.println("Error: "+e);
                System.out.println("introdueix una dada de tipus int");
                lector.next();
            }
        }
        return dadaUsu;
    }
    public static float llegirFloat(String missatge){
        float dadaUsu=0f;
        boolean esCorrecte=false;
        while(!esCorrecte){
            System.out.println(missatge);
            try{
                dadaUsu = lector.nextFloat();
                esCorrecte = true;
            }catch(InputMismatchException e){
                System.out.println("Error: "+e);
                System.out.println("introdueix una dada de tipus float");
                lector.next();
            }
        }
        return dadaUsu;
    }
    public static double llegirDouble(String missatge){
        double dadaUsu=0;
        boolean esCorrecte=false;
        while(!esCorrecte){
            System.out.println(missatge);
            try{
                dadaUsu = lector.nextDouble();
                esCorrecte = true;
            }catch(InputMismatchException e){
                System.out.println("Error: "+e);
                System.out.println("introdueix una dada de tipus double");
                lector.next();
            }
        }
        return dadaUsu;
    }

    //METODES EXCEPCIO EXCEPTION
    public static char llegirChar(String missatge){
        String entrada= lector.nextLine();
        char dadaUsu='\0';
        boolean esCorrecte=false;
        while(!esCorrecte){
            System.out.println(missatge);
            try{
                entrada = lector.nextLine();
                if(entrada.length()==1){
                    dadaUsu = entrada.charAt(0);
                    esCorrecte = true;
                }else{
                    throw new Exception();
                }
            }catch(Exception e){
                System.out.println("Error: "+e);
                System.out.println("introdueix una dada de tipus char");
            }
        }
        return dadaUsu;
    }
    public static String llegirString(String missatge){
        String dadaUsu = lector.nextLine();;
        boolean esCorrecte=false;
        while(!esCorrecte){
            System.out.println(missatge);
            try{
                dadaUsu = lector.nextLine();
                if(dadaUsu.isEmpty()){
                    throw new Exception();
                }
                esCorrecte = true;
            }catch(Exception e){
                System.out.println("Error: "+e);
                System.out.println("introdueix una dada de tipus String");
            }
        }
        return dadaUsu;
    }
    public static boolean llegirSiNo(String missatge){
        String dadaUsu = lector.nextLine();;
        boolean esCorrecte=false;
        while(!esCorrecte){
            System.out.println(missatge);
            try{
                dadaUsu = lector.nextLine();
                if(dadaUsu.equals("s")||dadaUsu.equals("n")){
                      if (dadaUsu.equals("s")){
                          return true;
                      }else{
                          return false;
                      }
                }else{
                    throw new Exception();
                }
            }catch(Exception e){
                System.out.println("Error: "+e);
                System.out.println("introdueix una dada: 's' o 'n'");
            }
        }
        return false;
    }
}
