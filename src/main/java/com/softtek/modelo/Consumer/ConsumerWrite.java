package com.softtek.modelo.Consumer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;

class LogWriter {
    private static final String LOG_FILE_NAME = "event_log.txt";

    public static void main(String[] args) {
        String eventMessage = "Buenos días";
        writeEventToLog(eventMessage, message -> {
            File logFile = new File(LOG_FILE_NAME);

            try (FileWriter fileWriter = new FileWriter(logFile, true)) {
                fileWriter.write(message + System.lineSeparator());
                fileWriter.flush();
                System.out.println("Evento registrado: " + message);
            } catch (IOException e) {
                System.err.println("Error al escribir el archivo de registro: " + e.getMessage());
            }
        });
    }

    public static void writeEventToLog(String eventMessage, Consumer<String> writeFunction) {
        writeFunction.accept(eventMessage);
    }
}