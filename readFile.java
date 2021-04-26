package sample;

import java.io.*;
import java.util.*;

public class readFile {
    public static void main(String[] args) throws IOException {
        List<Advertising> advertising = reader.readInfo("advertising.csv");
        reader.main("advertising_copy.csv", advertising);
    }
}
