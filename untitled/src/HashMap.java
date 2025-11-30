import java.util.HashMap;

class CountryCapitals {
    public static void main(String[] args) {

        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("США", "Вашингтон");
        capitals.put("ранція", "Париж");
        capitals.put("Японія", "Токіо");
        capitals.put("Германія", "Берлін");
        capitals.put("Індія", "Нова Делхі");

        System.out.println("Country → Capital:");
        for (String country : capitals.keySet()) {
            System.out.println(country + " -> " + capitals.get(country));
        }
    }
}

