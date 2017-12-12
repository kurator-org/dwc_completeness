package org.datakurator.dwc_comp.ffdq_imp.util;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Utility for one time use. Converted annotated class CompletenessQC to use the new model in kurator-ffdq and
 * created a csv file for metadata about tests.
 */
public class ConverterUtil {
    public static void main(String[] args) throws IOException {
        String implementation = "https://github.com/kurator-org/dwc_completeness/blob/master/src/main/java/org/datakurator/dwc_comp/CompletenessQC.java";
        Map<String, String> terms = dwcTermsMapping();

        BufferedReader reader = new BufferedReader(new FileReader(new File("src/main/java/org/datakurator/dwc_comp/CompletenessQC.java")));
        StringBuilder sb = new StringBuilder();
        StringBuilder csv = new StringBuilder();

        String line;
        while((line = reader.readLine()) != null) {
            if (line.contains("@Mechanism")) {
                line = line.substring(line.indexOf("\"")+1);
                String mechanismGuid  = line.substring(0, line.indexOf("\""));
                sb.append("@DQClass(\"" + mechanismGuid + "\")\n");
            } else if (line.contains("@Provides")){

                line = line.substring(line.indexOf("\"")+1);
                String testGuid  = line.substring(0, line.indexOf("\""));

                sb.append("    @DQProvides(\"" + testGuid + "\")\n");
                csv.append("\"" + testGuid + "\",");

                boolean parsingTest = true;

                while (parsingTest) {
                    line = reader.readLine();
                    if (line.contains("@Measure")) {
                        line = line.substring(line.indexOf("\"")+1);
                        String[] parts = line.substring(0, line.indexOf("\"")).split("_");

                        StringBuilder label = new StringBuilder();

                        for (int i = 0; i < parts.length; i++) {
                            String str = parts[i];

                            if (terms.containsKey(str)) {
                                str = terms.get(str);
                            } else {
                                str = str.trim().toLowerCase();
                                str = str.substring(0, 1).toUpperCase() + str.substring(1);
                            }

                            label.append(str);

                            if (i < parts.length-1) {
                                label.append(" ");
                            }
                        }

                        csv.append("\"" + label + "\",");

                        boolean parsingDescription = true;
                        StringBuilder description = new StringBuilder();

                        line = line.substring(line.indexOf("description = "));

                        while (parsingDescription) {
                            line = line.substring(line.indexOf("\"")+1);
                            description.append(line.substring(0, line.indexOf("\"")));
                            if (line.contains("+")) {
                                line = reader.readLine();
                            } else {
                                parsingDescription = false;
                            }
                        }

                        csv.append("\"" + description + "\",\"Measure\",\"SingleRecord\",\"Completeness\",");

                    } else if (line.contains("@Specification")) {
                        line = line.substring(line.indexOf("\"")+1);
                        String specification = line.substring(0, line.indexOf("\""));
                    } else if (line.contains("@PreEnhancement") ||
                            line.contains("@PostEnhancement") ||
                            line.contains("@Enhancement")) {
                        // skip
                    } else if (line.contains("public static")) {
                        sb.append(line + "\n");

                        line = line.substring(line.indexOf("\"")+1);
                        String term = line.substring(0, line.indexOf("\""));
                        if (!term.contains(":")) {
                            term = "dwc:" + term;
                        }
                        csv.append("\"" + term + "\",\"Kurator\",\"" + implementation + "\"\n");
                    } else {
                        sb.append(line + "\n");
                        parsingTest = false;
                    }
                }
            } else {
                sb.append(line + "\n");
            }
        }
        //System.out.println(csv.toString());
        FileOutputStream out = new FileOutputStream(new File("CompletenessQC.java"));
        out.write(sb.toString().getBytes());
        out.close();

        System.out.println(sb.toString());
    }

    private static Map<String, String> dwcTermsMapping() {
        Map<String, String> terms = new HashMap<>();

        terms.put("BASISOFRECORD", "Basis Of Record");
        terms.put("CLASS", "Class");
        terms.put("CONTINENT", "Continent");
        terms.put("COORDINATEPRECISION", "Coordinate Precision");
        terms.put("COORDINATEUNCERTANTYINMETERS", "Coordinate Uncertanty In Meters");
        terms.put("COUNTRY", "Country");
        terms.put("COUNTRYCODE", "Country Code");
        terms.put("COUNTY", "County");
        terms.put("DATAGENERALIZATIONS", "Data Generalizations");
        terms.put("DATEIDENTIFIED", "Date Identified");
        terms.put("DAY", "Day");
        terms.put("DCTERMS", "Dcterms");
        terms.put("DECIMALLATITUDE", "Decimal Latitude");
        terms.put("DECIMALLONGITUDE", "Decimal Longitude");
        terms.put("DISPOSITION", "Disposition");
        terms.put("ENDDAYOFYEAR", "End Day Of Year");
        terms.put("ESTABLISHMENTMEANS", "Establishment Means");
        terms.put("EVENTDATE", "Event Date");
        terms.put("EVENTTIME", "Event Time");
        terms.put("FAMILY", "Family");
        terms.put("FOOTPRINTWKT", "Footprint WKT");
        terms.put("GENUS", "Genus");
        terms.put("GEODETICDATUM", "Geodetic Datum");
        terms.put("GEOREFERENCEDATE", "Georeference Sate");
        terms.put("GEOREFERENCEVERIFICATIONSTATUS", "Georeference Verification Status");
        terms.put("HIGHERCLASSIFICATION", "Higher Classification");
        terms.put("HIGHERGEOGRAPHY", "Higher Geography");
        terms.put("IDENTIFICATIONQUALIFIER", "Identification Qualifier");
        terms.put("INDIVIDUALCOUNT", "Individual Count");
        terms.put("INFRASPECIFICEPITHET", "Infraspecific Epithet");
        terms.put("ISLAND", "Island");
        terms.put("ISLANDGROUP", "Island Group");
        terms.put("KINGDOM", "Kingdom");
        terms.put("LIFESTAGE", "Life Stage");
        terms.put("LOCALITY", "Locality");
        terms.put("MAXIMUMDEPTHINMETERS", "Maximum Depth In Meters");
        terms.put("MAXIMUMELEVATIONINMETERS", "Maximum Wlevation In Meters");
        terms.put("MINIMUMDEPTHINMETERS", "Minimum Depth In Meters");
        terms.put("MINIMUMELEVATIONINMETERS", "Minimum Elevation In Meters");
        terms.put("MONTH", "Month");
        terms.put("MUNICIPALITY", "Municipality");
        terms.put("NAMEPUBLISHEDINYEAR", "Name Published In Year");
        terms.put("OCCURRENCEID", "Occurrence Id");
        terms.put("OCCURRENCESTATUS", "Occurrence Status");
        terms.put("ORDER", "Order");
        terms.put("PHYLUM", "Phylum");
        terms.put("PREPARATIONS", "Preparations");
        terms.put("RECORDEDBY", "Recorded By");
        terms.put("RECORDNUMBER", "Record Number");
        terms.put("RELATIONSHIPOFRESOURCE", "Relationship Of Resource");
        terms.put("REPRODUCTIVECONDITION", "Reproductive Condition");
        terms.put("SCIENTIFICNAME", "Scientific Name");
        terms.put("SCIENTIFICNAMEAUTHORSHIP", "Scientific Name Authorship");
        terms.put("SEX", "Sex");
        terms.put("SPECIFICEPITHET", "Specific Epithet");
        terms.put("STARTDAYOFYEAR", "Start Day Of Year");
        terms.put("STATEPROVINCE", "State Province");
        terms.put("SUBGENUS", "Subgenus");
        terms.put("TAXONRANK", "Taxon Rank");
        terms.put("TYPESTATUS", "Type Status");
        terms.put("VERBATIMCOORDINATES", "Verbatim Coordinates");
        terms.put("VERBATIMDEPTH", "Verbatim Depth");
        terms.put("VERBATIMELEVATION", "Verbatim Elevation");
        terms.put("VERBATIMEVENTDATE", "Verbatim Event Date");
        terms.put("VERBATIMLATITUDE", "Verbatim Latitude");
        terms.put("VERBATIMLONGITUDE", "Verbatim Longitude");
        terms.put("VERBATIMSRS", "Verbatim SRS");
        terms.put("VERNACULARNAME", "Vernacular Name");
        terms.put("WATERBODY", "Water Body");
        terms.put("YEAR", "Year");

        return terms;
    }
}
