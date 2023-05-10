public class Skill {
    String name = null;
    Attribute attribute = null;
    boolean advanced = false;
    boolean group = false;
    private int starting = 0;
    private int advances = 0;
    private int summary = starting + advances;
    public Skill (String name, boolean advanced, int level) {
        this.name = name;
        this.advanced = advanced;
        this.starting = level;
    }

    public int getLevel() {
        return summary;
    }

    public void increaseSkill(int value) {
        this.advances += value;
    }
}

class Atletyka extends Skill {
    public Atletyka(int level) {
        super("Atletyka", false, level);
    }
}

class BadaniaNaukowe extends Skill {
    public BadaniaNaukowe(int level) {
        super("Badania Naukowe", true, level);
    }
}

class BronBialaPodstawowa extends Skill {
    public BronBialaPodstawowa(int level) {
        super("Broń Biała - Podstawowa", false, level);
    }
}

class BronBialaBijatyka extends Skill {
    public BronBialaBijatyka(int level) {
        super("Broń Biała - Bijatyka", true, level);
    }
}

class BronBialaDrzewcowa extends Skill {
    public BronBialaDrzewcowa(int level) {
        super("Broń Biała - Drzewcowa", true, level);
    }
}

class BronBialaDwureczna extends Skill {
    public BronBialaDwureczna(int level) {
        super("Broń Biała - Dwuręczna", true, level);
    }
}

class BronBialaKawaleryjska extends Skill {
    public BronBialaKawaleryjska(int level) {
        super("Broń Biała - Kawaleryjska", true, level);
    }
}

class BronBialaKorbacze extends Skill {
    public BronBialaKorbacze(int level) {
        super("Broń Biała - Korbacze", true, level);
    }
}

class BronBialaParujaca extends Skill {
    public BronBialaParujaca(int level) {
        super("Broń Biała - Parująca", true, level);
    }
}

class BronBialaSzermiercza extends Skill {
    public BronBialaSzermiercza(int level) {
        super("Broń Biała - Szermiercza", true, level);
    }
}

class BronZasiegowaEksperymentalna extends Skill {
    public BronZasiegowaEksperymentalna(int level) {
        super("Broń Zasięgowa - Broń Eksperymentalna", true, level);
    }
}

class BronZasiegowaMiotana extends Skill {
    public BronZasiegowaMiotana(int level) {
        super("Broń Zasięgowa - Broń Miotana", true, level);
    }
}

class BronZasiegowaOplatujaca extends Skill {
    public BronZasiegowaOplatujaca(int level) {
        super("Broń Zasięgowa - Broń Oplątująca", true, level);
    }
}

class BronZasiegowaProchowa extends Skill {
    public BronZasiegowaProchowa(int level) {
        super("Broń Zasięgowa - Broń Prochowa", true, level);
    }
}

class BronZasiegowaKusze extends Skill {
    public BronZasiegowaKusze(int level) {
        super("Broń Zasięgowa - Kusze", true, level);
    }
}

class BronZasiegowaLuki extends Skill {
    public BronZasiegowaLuki(int level) {
        super("Broń Zasięgowa - Broń Łuki", true, level);
    }
}

class BronZasiegowaMaterialyWybuchowe extends Skill {
    public BronZasiegowaMaterialyWybuchowe(int level) {
        super("Broń Zasięgowa - Materiały Wybuchowe", true, level);
    }
}

class BronZasiegowaProce extends Skill {
    public BronZasiegowaProce(int level) {
        super("Broń Zasięgowa - Proce", true, level);
    }
}

class Charyzma extends Skill {
    public Charyzma(int level) {
        super("Charyzma", false, level);
    }
}

class Dowodzenie extends Skill {
    public Dowodzenie(int level) {
        super("Dowodzenie", false, level);
    }
}

class Hazard extends Skill {
    public Hazard(int level) {
        super("Hazard", false, level);
    }
}

class Jezdziectwo extends Skill {
    public Jezdziectwo(int level) {
        super("Jeździectwo", false, level);
    }
}

class JezykBitewny extends Skill {
    public JezykBitewny(int level) {
        super("Język - Bitewny", true, level);
    }
}