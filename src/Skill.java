public class Skill {
    String name = null;
    Attribute attribute = null;
    boolean advanced = false;
    boolean group = false;
    private int advances = 0;

    public Skill (String name) {
        this.name = name;
    }
    public Skill (String name, boolean advanced) {
        this.name = name;
        this.advanced = advanced;
    }

    public int getLevel() {
        return advances;
    }
    public int getSummaryLevel(Attribute attribute) {
        return attribute.summary + this.advances;
    }

    public void increaseSkill(int value) {
        this.advances += value;
    }

    @Override
    public String toString() {
        return name + ": " + advances + "\r\n";
    }
}
/*
class Atletyka extends Skill {
    public Atletyka() {
        super("Atletyka", false);
    }
}

class BadaniaNaukowe extends Skill {
    public BadaniaNaukowe() {
        super("Badania Naukowe", true);
    }
}

class BronBialaPodstawowa extends Skill {
    public BronBialaPodstawowa() {
        super("Broń Biała - Podstawowa", false);
    }
}

class BronBialaBijatyka extends Skill {
    public BronBialaBijatyka() {
        super("Broń Biała - Bijatyka", true);
    }
}

class BronBialaDrzewcowa extends Skill {
    public BronBialaDrzewcowa() {
        super("Broń Biała - Drzewcowa", true);
    }
}

class BronBialaDwureczna extends Skill {
    public BronBialaDwureczna() {
        super("Broń Biała - Dwuręczna", true);
    }
}

class BronBialaKawaleryjska extends Skill {
    public BronBialaKawaleryjska() {
        super("Broń Biała - Kawaleryjska", true);
    }
}

class BronBialaKorbacze extends Skill {
    public BronBialaKorbacze() {
        super("Broń Biała - Korbacze", true);
    }
}

class BronBialaParujaca extends Skill {
    public BronBialaParujaca() {
        super("Broń Biała - Parująca", true);
    }
}

class BronBialaSzermiercza extends Skill {
    public BronBialaSzermiercza() {
        super("Broń Biała - Szermiercza", true);
    }
}

class BronZasiegowaEksperymentalna extends Skill {
    public BronZasiegowaEksperymentalna() {
        super("Broń Zasięgowa - Broń Eksperymentalna", true);
    }
}

class BronZasiegowaMiotana extends Skill {
    public BronZasiegowaMiotana() {
        super("Broń Zasięgowa - Broń Miotana", true);
    }
}

class BronZasiegowaOplatujaca extends Skill {
    public BronZasiegowaOplatujaca() {
        super("Broń Zasięgowa - Broń Oplątująca", true);
    }
}

class BronZasiegowaProchowa extends Skill {
    public BronZasiegowaProchowa() {
        super("Broń Zasięgowa - Broń Prochowa", true);
    }
}

class BronZasiegowaKusze extends Skill {
    public BronZasiegowaKusze() {
        super("Broń Zasięgowa - Kusze", true);
    }
}

class BronZasiegowaLuki extends Skill {
    public BronZasiegowaLuki() {
        super("Broń Zasięgowa - Broń Łuki", true);
    }
}

class BronZasiegowaMaterialyWybuchowe extends Skill {
    public BronZasiegowaMaterialyWybuchowe() {
        super("Broń Zasięgowa - Materiały Wybuchowe", true);
    }
}

class BronZasiegowaProce extends Skill {
    public BronZasiegowaProce() {
        super("Broń Zasięgowa - Proce", true);
    }
}

class Charyzma extends Skill {
    public Charyzma() {
        super("Charyzma", false);
    }
}

class Dowodzenie extends Skill {
    public Dowodzenie() {
        super("Dowodzenie", false);
    }
}

class Hazard extends Skill {
    public Hazard() {
        super("Hazard", false);
    }
}

class Jezdziectwo extends Skill {
    public Jezdziectwo() {
        super("Jeździectwo", false);
    }
}

class JezykBitewny extends Skill {
    public JezykBitewny() {
        super("Język - Bitewny", true);
    }
}

class JezykBretonski extends Skill {
    public JezykBretonski() {
        super("Język Bretoński", true);
    }
}

class JezykKlasyczny extends Skill {
    public JezykKlasyczny() {
        super("Język Klasyczny", true);
    }
}

class JezykKhazalid extends Skill {
    public JezykKhazalid() {
        super("Język Khazalid", true);
    }
}

class JezykMagiczny extends Skill {
    public JezykMagiczny() {
        super("Język Magiczny", true);
    }
}

class JezykTileanski extends Skill {
    public JezykTileanski() {
        super("Język Tileański", true);
    }
}

class JezykZlodziei extends Skill {
    public JezykZlodziei() {
        super("Język Złodziei", true);
    }
}

class Kuglarstwo extends Skill {
    public Kuglarstwo() {
        super("Kuglarstwo", true);
    }
}

class Leczenie extends Skill {
    public Leczenie() {
        super("Leczenie", true);
    }
}

class MocnaGlowa extends Skill {
    public MocnaGlowa() {
        super(" Mocna Głowa", false);
    }
}

class Modlitwa extends Skill {
    public Modlitwa() {
        super("Modlitwa", true);
    }
}

class MuzykaDudy extends Skill {
    public MuzykaDudy() {
        super("Muzyka - Dudy", true);
    }
}

class MuzykaHarfa extends Skill {
    public MuzykaHarfa() {
        super("Muzyka - Harfa", true);
    }
}

class MuzykaLutnia extends Skill {
    public MuzykaLutnia() {
        super("Muzyka - Lutnia", true);
    }
}

class MuzykaOboj extends Skill {
    public MuzykaOboj() {
        super("Muzyka - Obój", true);
    }
}

class MuzykaSkrzypce extends Skill {
    public MuzykaSkrzypce() {
        super("Muzyka - Skrzypce", true);
    }
}

class Nawigacja extends Skill {
    public Nawigacja() {
        super("Nawigacja", false);
    }
}

class Modlitwa extends Skill {
    public Modlitwa() {
        super("Modlitwa", true);
    }
}

 */