import java.util.ArrayList;

public class Career {
    String profession;
    String career;
    int careerlevel;
    String status;
    int statusLevel;
    ArrayList<String> attributes = new ArrayList<>();
    ArrayList<String> skills = new ArrayList<>();
    ArrayList<String> talents = new ArrayList<>();

    public Career() {

    }
    public Career(String name, String career, String status, int statusLevel) {
        this.profession = name;
        this.career = career;
        this.status = status;
        this.statusLevel = statusLevel;
    }

}

class Aptekarka extends Career {
    public Aptekarka (int careerlevel) {
        if (careerlevel == 1) {
            profession = "Aptekarz";
            career = "Uczeń Aptekarza";
            status = "Brąz";
            statusLevel = 3;

            String attribute = "Wytrzymałość";
            attributes.add(attribute);
            attribute = "Zręczność";
            attributes.add(attribute);
            attribute = "Inteligencja";
            attributes.add(attribute);

            String skill = "Język - Klasyczny";
            skills.add(skill);
            skill = "Leczenie";
            skills.add(skill);
            skill = "Mocna Głowa";
            skills.add(skill);
            skill = "Rzemiosło (Aptekarstwo)";
            skills.add(skill);
            skill = "Rzemiosło (Truciciel)";
            skills.add(skill);
            skill = "Wiedza (Chemia)";
            skills.add(skill);
            skill = "Wiedza (Medycyna)";
            skills.add(skill);
            skill = "Wiedza (Rośliny)";
            skills.add(skill);

            String talent = "Czytanie/Pisanie";
            talents.add(talent);
            talent = "Etykieta";
            talents.add(talent);
            talent = "Przyrządzenie Mikstur";
            talents.add(talent);
            talent = "Wytwórca";
            talents.add(talent);
        }

        else if (careerlevel == 2) {
            profession = "Aptekarz";
            career = "Aptekarz";
            status = "Srebro";
            statusLevel = 1;

            String attribute = "Wytrzymałość";
            attributes.add(attribute);
            attribute = "Zręczność";
            attributes.add(attribute);
            attribute = "Inteligencja";
            attributes.add(attribute);
            attribute = "Ogłada";
            attributes.add(attribute);

            String skill = "Język - Klasyczny";
            skills.add(skill);
            skill = "Leczenie";
            skills.add(skill);
            skill = "Mocna Głowa";
            skills.add(skill);
            skill = "Rzemiosło (Aptekarstwo)";
            skills.add(skill);
            skill = "Rzemiosło (Truciciel)";
            skills.add(skill);
            skill = "Wiedza (Chemia)";
            skills.add(skill);
            skill = "Wiedza (Medycyna)";
            skills.add(skill);
            skill = "Wiedza (Rośliny)";
            skills.add(skill);
            skill = "Charyzma";
            skills.add(skill);
            skill = "Język (Gildii)";
            skills.add(skill);
            skill = "Percepcja";
            skills.add(skill);
            skill = "Plotkowanie";
            skills.add(skill);
            skill = "Targowanie";
            skills.add(skill);
            skill = "Wiedza (Nauka)";
            skills.add(skill);

            String talent = "Czytanie/Pisanie";
            talents.add(talent);
            talent = "Etykieta";
            talents.add(talent);
            talent = "Przyrządzenie Mikstur";
            talents.add(talent);
            talent = "Wytwórca";
            talents.add(talent);
            talent = "Aptekarz";
            talents.add(talent);
            talent = "Etykieta";
            talents.add(talent);
            talent = "Przestępca";
            talents.add(talent);
            talent = "Żyłka Handlowa";
            talents.add(talent);
        }
        else if (careerlevel == 3) {
            profession = "Aptekarz";
            career = "Farmaceuta";
            status = "Srebro";
            statusLevel = 3;

            String attribute = "Wytrzymałość";
            attributes.add(attribute);
            attribute = "Zręczność";
            attributes.add(attribute);
            attribute = "Inteligencja";
            attributes.add(attribute);
            attribute = "Ogłada";
            attributes.add(attribute);
            attribute = "Inicjatywa";
            attributes.add(attribute);

            String skill = "Język - Klasyczny";
            skills.add(skill);
            skill = "Leczenie";
            skills.add(skill);
            skill = "Mocna Głowa";
            skills.add(skill);
            skill = "Rzemiosło (Aptekarstwo)";
            skills.add(skill);
            skill = "Rzemiosło (Truciciel)";
            skills.add(skill);
            skill = "Wiedza (Chemia)";
            skills.add(skill);
            skill = "Wiedza (Medycyna)";
            skills.add(skill);
            skill = "Wiedza (Rośliny)";
            skills.add(skill);
            skill = "Charyzma";
            skills.add(skill);
            skill = "Język (Gildii)";
            skills.add(skill);
            skill = "Percepcja";
            skills.add(skill);
            skill = "Plotkowanie";
            skills.add(skill);
            skill = "Targowanie";
            skills.add(skill);
            skill = "Wiedza (Nauka)";
            skills.add(skill);
            skill = "Badania Naukowe";
            skills.add(skill);
            skill = "Dowodzenie";
            skills.add(skill);
            skill = "Intuicja";
            skills.add(skill);
            skill = "Sekretne Znaki (Cechu)";
            skills.add(skill);


            String talent = "Czytanie/Pisanie";
            talents.add(talent);
            talent = "Etykieta";
            talents.add(talent);
            talent = "Przyrządzenie Mikstur";
            talents.add(talent);
            talent = "Wytwórca";
            talents.add(talent);
            talent = "Aptekarz";
            talents.add(talent);
            talent = "Etykieta";
            talents.add(talent);
            talent = "Przestępca";
            talents.add(talent);
            talent = "Żyłka Handlowa";
            talents.add(talent);
            talent = "Błyskotliwość";
            talents.add(talent);
            talent = "Mistrz Rzemiosła";
            talents.add(talent);
            talent = "Mól Książkowy";
            talents.add(talent);
            talent = "Odporny na (Zagrożenie)";
            talents.add(talent);
        }

        else {
            profession = "Aptekarz";
            career = "Mistrz Aptekarstwa";
            status = "Złoto";
            statusLevel = 1;

            String attribute = "Wytrzymałość";
            attributes.add(attribute);
            attribute = "Zręczność";
            attributes.add(attribute);
            attribute = "Inteligencja";
            attributes.add(attribute);
            attribute = "Ogłada";
            attributes.add(attribute);
            attribute = "Inicjatywa";
            attributes.add(attribute);
            attribute = "Siła Woli";
            attributes.add(attribute);

            String skill = "Język - Klasyczny";
            skills.add(skill);
            skill = "Leczenie";
            skills.add(skill);
            skill = "Mocna Głowa";
            skills.add(skill);
            skill = "Rzemiosło (Aptekarstwo)";
            skills.add(skill);
            skill = "Rzemiosło (Truciciel)";
            skills.add(skill);
            skill = "Wiedza (Chemia)";
            skills.add(skill);
            skill = "Wiedza (Medycyna)";
            skills.add(skill);
            skill = "Wiedza (Rośliny)";
            skills.add(skill);
            skill = "Charyzma";
            skills.add(skill);
            skill = "Język (Gildii)";
            skills.add(skill);
            skill = "Percepcja";
            skills.add(skill);
            skill = "Plotkowanie";
            skills.add(skill);
            skill = "Targowanie";
            skills.add(skill);
            skill = "Wiedza (Nauka)";
            skills.add(skill);
            skill = "Badania Naukowe";
            skills.add(skill);
            skill = "Dowodzenie";
            skills.add(skill);
            skill = "Intuicja";
            skills.add(skill);
            skill = "Sekretne Znaki (Cechu)";
            skills.add(skill);
            skill = "Jeździectwo (Konie)";
            skills.add(skill);
            skill = "Zastraszanie";
            skills.add(skill);


            String talent = "Czytanie/Pisanie";
            talents.add(talent);
            talent = "Etykieta";
            talents.add(talent);
            talent = "Przyrządzenie Mikstur";
            talents.add(talent);
            talent = "Wytwórca";
            talents.add(talent);
            talent = "Aptekarz";
            talents.add(talent);
            talent = "Etykieta";
            talents.add(talent);
            talent = "Przestępca";
            talents.add(talent);
            talent = "Żyłka Handlowa";
            talents.add(talent);
            talent = "Błyskotliwość";
            talents.add(talent);
            talent = "Mistrz Rzemiosła";
            talents.add(talent);
            talent = "Mól Książkowy";
            talents.add(talent);
            talent = "Odporny na (Zagrożenie)";
            talents.add(talent);
            talent = "Mistrz Rzemiosła";
            talents.add(talent);
            talent = "Wyczulony Zmysł";
            talents.add(talent);
            talent = "Zimna Krew";
            talents.add(talent);
            talent = "Znawca";
            talents.add(talent);
        }

        super.careerlevel = careerlevel;
    }
}
