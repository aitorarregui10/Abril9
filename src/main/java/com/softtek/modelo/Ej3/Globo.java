package com.softtek.modelo.Ej3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Globo {

    public static int ID=0;
    private int CONTADOR=1;

    public Globo() {
        this.ID = ++ID;
    }
}
