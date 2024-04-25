package com.aluracursos.challenge.metodos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Conversor {
    private static final String apiKey = "3c9fb1b60c7962602d3da75a";
    private static final String urlBase = "https://v6.exchangerate-api.com/v6/";

    public static void convertir(String monedaOrigen, String monedaDestino) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad a convertir (" + monedaOrigen + "): ");
        double cantidad = scanner.nextDouble();

        try {
// Construir la URL con la API Key y el tipo de moneda
            String urlStr = urlBase + apiKey + "/latest/" + monedaOrigen;

// Realizar la solicitud HTTP
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

// Leer la respuesta de la API
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

// Parsear la respuesta JSON
            Gson gson = new GsonBuilder().create();
            JsonObject jsonObject = gson.fromJson(response.toString(), JsonObject.class);

// Obtener la tasa de cambio
            double tasaDeCambio = jsonObject.getAsJsonObject("conversion_rates").get(monedaDestino).getAsDouble();

// Calcular la cantidad convertida
            double cantidadConvertida = cantidad * tasaDeCambio;

// Imprimir el resultado
            System.out.println(cantidad + " " + monedaOrigen + " equivalen a " + cantidadConvertida + " " + monedaDestino);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
