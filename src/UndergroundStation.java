import java.util.Scanner;

public class UndergroundStation {

    public static void main(String[] args) {

        String[] tubeStation = new String[]{"Aldgate", "Borough", "Bank", "Edgware Road", "Aldgate east",
                "Greenoark", "Euston", "Liverpool Street", "London Bridge", "Waterloo", "Regent's park", "Holborn", "Baker Street",
                "Paddington", "Liverpool Street", "Bond Street", "Picaadilly Circus", "Warren Street", "Moorgate", "Oxford Circus",
                "St. Paul's", "Farringdon", "Bayswater", "Moorgate", "Westminster", "Leicester Square", "Barbican", "Old Street",
                "Warren Street", "barbican", "Covent Garden", "Green Park"};

        System.out.println(tubeStation.length);
        int length = tubeStation.length;

        String[][] underground = new String[12][length];

        underground[0][0] = "Metropolitan";
        underground[0][1] = "Liverpool Street";
        underground[0][2] = "Morrgate";
        underground[0][3] = "Barican";

        underground[1][0] = "Northern";
        underground[1][1] = "Borough";
        underground[1][2] = "London Bridge";
        underground[1][3] = "Moorgate";
        underground[1][4] = "Old Street";

        underground[2][0] = "Waterloo & City";
        underground[2][1] = "Bank";
        underground[2][2] = "Waterloo";

        underground[3][0] = "Bakerloo";
        underground[3][1] = "Baker Street";
        underground[3][2] = "Regent Park";
        underground[3][3] = "Oxford Circus";
        underground[3][4] = "Picaadily Circus";

        underground[4][0] = "Central";
        underground[4][1] = "Bank";
        underground[4][2] = "Holborn";
        underground[4][3] = "St. paul's";
        underground[4][4] = "Bond Street";

        underground[5][0] = "Circle";
        underground[5][1] = "Edgware";
        underground[5][2] = "Baker Street";
        underground[5][3] = "Farringdon";
        underground[5][4] = "Barbican";

        underground[6][0] = "DLR";
        underground[6][1] = "Bank";

        underground[7][0] = "District";
        underground[7][1] = "Edgware Road";
        underground[7][2] = " Paddington";
        underground[7][3] = "Bayswater";

        underground[8][0] = "Hammersmith  & City";
        underground[8][1] = "Aldgate East";
        underground[8][2] = "Liverpool Street";
        underground[8][3] = "Moorgate";
        underground[8][4] = "Barbican";

        underground[9][0] = "Jubilee";
        underground[9][1] = "Baker Street";
        underground[9][2] = "Bond Street";
        underground[9][3] = "Westminister";
        underground[9][4] = "Waterloo";

        underground[10][0] = "Piccadilly";
        underground[10][1] = "Green Oark";
        underground[10][2] = "Picaadilly Circus";
        underground[10][3] = "Leicester Square";
        underground[10][4] = "Covent Garden";

        underground[10][0] = "Victoria";
        underground[10][1] = "Euston";
        underground[10][2] = "Warren street";
        underground[10][3] = "Oxford Circus";
        underground[10][4] = "Green Park";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the tube station's name of zone 1 :");

        String userTubeStation = scanner.nextLine();
        String catchStationName = "";
        for (int i = 0; i < tubeStation.length; i++) {
            if (userTubeStation.equalsIgnoreCase(tubeStation[i])) {
                catchStationName = tubeStation[i];
            }
        }
        if (userTubeStation.equalsIgnoreCase(catchStationName)) {
            System.out.println(userTubeStation + " Station is in the zone 1");
            System.out.println("-------------------------------------------");
            System.out.println("Following lines passing through the given Tube Station:" + userTubeStation);
            System.out.println("--------------------------------------------");

            for (int x = 0; x < underground.length; x++) {
                for (int y = 1; y < underground.length; y++) {
                    String match = underground[x][y];

                    if (userTubeStation.equalsIgnoreCase(match)) {
                        System.out.println(underground[x][0]);
                    }
                }


            }
        } else {
            System.out.println("Tube station is not in zone 1");

        }
    }
}
