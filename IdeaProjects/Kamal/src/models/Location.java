package models;

public class Location {
    private String city;
    private String country;

    public Location(String city, String country) {
        setCity(city);   // Используем сеттер с проверкой
        setCountry(country); // Используем сеттер с проверкой
    }

    // Геттеры
    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    // Сеттеры с валидацией
    public void setCity(String city) {
        if (city == null || city.trim().isEmpty()) {
            throw new IllegalArgumentException("City name cannot be empty.");
        }
        this.city = city;
    }

    public void setCountry(String country) {
        if (country == null || country.trim().isEmpty()) {
            throw new IllegalArgumentException("Country name cannot be empty.");
        }
        this.country = country;
    }

    // Переопределяем toString() для удобного вывода
    @Override
    public String toString() {
        return "Location{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
