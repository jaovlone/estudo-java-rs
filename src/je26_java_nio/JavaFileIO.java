package je26_java_nio;

import java.io.File;
import java.io.IOException;

public class JavaFileIO {
    public static void main(String[] args) {
        File diretorio = new File("c:\\rocket");
        System.out.println("diretório existe?" + diretorio.exists());
        if (!diretorio.exists()) {
            diretorio.mkdir();
            System.out.println("foi criado o diretorio");


        }

        try {
            File arquivo = new File( diretorio, "aula-java.txt");
            System.out.println(arquivo.exists());


            arquivo.createNewFile();
            System.out.println(arquivo.exists());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



