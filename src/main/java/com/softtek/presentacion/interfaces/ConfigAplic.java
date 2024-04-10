/*package com.softtek.presentacion.interfaces;

import java.util.function.Supplier;

public class ConfigurationExample {

    public interface Configuration {
        String getAppBaseDirectory();
        String getDbConnectionUrl();
    }

    public static class ConfigurationSupplier implements Supplier<Configuration> {

        @Override
        public Configuration get() {
            return new Configuration() {
                @Override
                public String getAppBaseDirectory() {
                    return "/path/to/app";
                }

                @Override
                public String getDbConnectionUrl() {
                    return "jdbc:mysql://localhost:3

                }
            };
        };
    }
*/