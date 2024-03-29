package ch.mjava.piahelper;

import java.util.HashMap;
import java.util.Map;

/**
 */
public class Data {
    public static final Map<String, String> COMMUNITIES;

    static {
        COMMUNITIES = new HashMap<String, String>();
        COMMUNITIES.put("adliswil", "Stadt Adliswil\nGesundheit, Umwelt\nZuerichstr. 17\n 8134 Adliswil");
        COMMUNITIES.put("rueschlikon", "Gemeindeverwaltung Rüschlikon\nGesundheitsbehörde\nPostfach\n 8803 Rüschlikon");
        COMMUNITIES.put("richterswil", "Gemeinde Richterswil\nAbteilung Gesellschaft\nSeestr. 19\n 8805 Richterswil");
        COMMUNITIES.put("waedenswil", "Stadt Wädenswil\nGesellschaft\nFlorhofstr. 6\n8820 Wädenswil");
        COMMUNITIES.put("langnau", "Gemeindeverwaltung\nLangnau am Albis\nGesundheitsbehörde\n Neue Dorfstr. 14, Postfach\n8135 Langnau am Albis");
        COMMUNITIES.put("kilchberg", "Gemeindeverwaltung\nKilchberg\nGesundheitsbehörde\n Alte Landstr. 110\n8802 Kilchberg");
        COMMUNITIES.put("oberrieden", "Gemeinde\nOberrieden\nAbteilung Bevölkerung\n Alte Landstr. 32\nPostfach 178\n8942 Oberrieden");
        COMMUNITIES.put("horgen", "Abteilung Alter& Gesundheit\nBaumgaertlistrasse 12\n8810 Horgen");
        COMMUNITIES.put("hirzel", "Gemeindeverwaltung Hirzel\nGesundheitsbehörde\nBergstr. 6\n8816 Hirzel");


    }
}
