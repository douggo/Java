package LSM.Recap;

import java.util.ArrayList;
import java.util.Collections;

public class ManipulandoArrayList {
    
    private static ArrayList<String> cursos;

    private static int opcaoTradicional = 1;
    private static int opcaoForeach = 2;
    private static int opcaoLambdaExpression = 3;

    private static int iLambda = 1;

    public static void main(String[] args) {
        System.out.println();
        criaArrayListCursos();
        populaArrayListCursos();
        imprimeDadosArrayListCursos(opcaoTradicional);
        blank();
        removeCurso(6);
        blank();
        ordenaArrayListCursos();
    }

    private static void criaArrayListCursos() {
        cursos = new ArrayList<String>();
    }

    private static void populaArrayListCursos() {
        cursos.add("Git e Github: controle e compartilhe seu código");
        cursos.add("Java JRE e JDK: compile e execute o seu programa");
        cursos.add("Java OO: Entendendo a Orientação a Objetos");
        cursos.add("Java Polimorfismo: entenda herança e interfaces");
        cursos.add("Java e java.util: Coleções, Wrappers e Lambda Expressions");
        cursos.add("Java e java.io: Streams, Readers e Writers");
        cursos.add("Java Collections: Dominando Listas, Sets e Mapas");
    }

    private static void imprimeDadosArrayListCursos(int option) {
        switch (option) {
            case 1:
                imprimeTradicional();        
            break;
            case 2:
                imprimeForeach();
            break;
            case 3:
                imprimeLambdaExpression();
            break;
        }        
    }

    private static void imprimeTradicional() {
        System.out.println("Imprimindo a lista de cursos da forma tradicional:");
        System.out.println();
        for(int i = 0; i < cursos.size(); i++) {
            System.out.println(i + " - " + cursos.get(i));
        }
    }

    private static void imprimeForeach() {
        int i = 1;
        System.out.println("Imprimindo a lista de cursos utilizando o `foreach`:");
        System.out.println();
        for (String curso : cursos) {
            System.out.println(i++ + " - " + curso);
        }
    }

    private static void imprimeLambdaExpression() {
        System.out.println("Imprimindo a lista de cursos utilizando uma Lambda Expression:");
        System.out.println();
        cursos.forEach((curso) -> {
            System.out.println(iLambda++ + " - " + curso);
        });
    }

    private static void removeCurso(int i) {
        try {
            cursos.remove(i);
        } catch(Exception e) {
            System.out.println("Não foi possível remover o índice " + i + ": " + e.getMessage());
            return;
        }
        System.out.println("Exclusão do índice " + i + " realizada com sucesso!");
        blank();
        imprimeDadosArrayListCursos(opcaoForeach);
    }

    private static void ordenaArrayListCursos() {
        Collections.sort(cursos);
        System.out.println("Ordenação dos cursos realizada!!");
        blank();
        imprimeDadosArrayListCursos(opcaoLambdaExpression);
    }

    private static void blank() {
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
    }

}