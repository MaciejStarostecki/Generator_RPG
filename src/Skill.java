public class Skill {
    String name = null;
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