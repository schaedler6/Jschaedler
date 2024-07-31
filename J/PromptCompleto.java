import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class PromptCompleto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao prompt completo!");

        // 1. Leia um número inteiro e imprima sua tabuada
        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // 2. Leia um texto e imprima suas palavras em ordem alfabética
        System.out.print("Informe um texto: ");
        String texto = scanner.next();
        String[] palavras = texto.split(" ");
        ArrayList<String> listaPalavras = new ArrayList<>();
        Collections.addAll(listaPalavras, palavras);
        Collections.sort(listaPalavras);
        System.out.println("Palavras em ordem alfabética:");
        for (String palavra : listaPalavras) {
            System.out.println(palavra);
        }

        // 3. Leia um número real e imprima sua raiz quadrada
        System.out.print("Informe um número real: ");
        double numeroReal = scanner.nextDouble();
        double raizQuadrada = Math.sqrt(numeroReal);
        DecimalFormat formato = new DecimalFormat("#.##");
        System.out.println("Raiz quadrada de " + numeroReal + " = " + formato.format(raizQuadrada));

        // 4. Leia um caractere e imprima sua tabela ASCII
        System.out.print("Informe um caractere: ");
        char caractere = scanner.next().charAt(0);
        System.out.println("Tabela ASCII do caractere '" + caractere + "':");
        for (int i = 0; i < 256; i++) {
            System.out.print((char) i + " - " + i + "\t");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        // 5. Leia uma data e imprima a diferença entre a data atual e a data informada
        System.out.print("Informe uma data (dd/MM/yyyy): ");
        String dataInformada = scanner.next();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataAtual = LocalDate.now();
        LocalDate data = LocalDate.parse(dataInformada, formatoData);
        long diferencaDias = ChronoUnit.DAYS.between(data, dataAtual);
        System.out.println("Diferença entre a data atual e a data informada: " + diferencaDias + " dias");

        // 6. Leia um arquivo e imprima seu conteúdo
        System.out.print("Informe o caminho do arquivo: ");
        String caminhoArquivo = scanner.next();
        File arquivo = new File(caminhoArquivo);
        if (arquivo.exists()) {
            try {
                String conteudo = new String(Files.readAllBytes(Paths.get(caminhoArquivo)));
                System.out.println("Conteúdo do arquivo:");
                System.out.println(conteudo);
            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            }
        } else {
            System.out.println("Arquivo não encontrado");
        }

        // 7. Leia um texto e imprima seu hash MD5
        System.out.print("Informe um texto: ");
        String textoHash = scanner.next();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] bytes = md.digest(textoHash.getBytes());
            String hash = Base64.getEncoder().encodeToString(bytes);
            System.out.println("Hash MD5 do texto: " + hash);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Erro ao calcular o hash MD5: " + e.getMessage());
        }

        // 8. Leia um arquivo e imprima suas informações
        System.out.print("Informe o caminho do arquivo