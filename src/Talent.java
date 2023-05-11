public class Talent extends Character {
    String name;
    String text;
    int maximum;
    int poziom = 0;

    public Talent(String name, String text, int maximum) {
        this.name = name;
        this.text = text;
        this.maximum = maximum;
        poziom += 1;
    }

    void change() {}
}

class Aptekarz extends Talent{
     public Aptekarz (Attribute inteligencja) {
        super("Aptekarz",
                "Jesteś świetnym aptekarzem i lepiej od innych wyrabiasz pigułki, maści, smarowidła, olejki, kremy i im podobne. Możesz odwrócić kolejność kości nieudanego Testu Rzemiosła (Aptekarstwa), jeśli nowy wynik pozwoli ci odnieść sukces.",
                inteligencja.summary/10);
        super.poziom += 1;
    }
}

class Arcydzielo extends Talent{
    public Arcydzielo () {
        super("Arcydzieło",
                "Jesteś niekwestionowanym mistrzem w swojej dziedzinie, tworzącym dzieła tak złożone, że inni mogą je tylko podziwiać, zachwycając się twoim geniuszem. Za każdym razem, gdy wykupujesz ten Talent, tworzysz niezwykłe dzieło, wykorzystując Umiejętność Sztuka lub Rzemiosło. Nie ma ono sobie równych, będzie po wieki inspirowało, zadziwiało i budziło zachwyt swoją wyjątkowością. MG określa premie, które ci przysługują z tej racji. Zwykle wpływają one na Testy Ogłady w  ontaktach z tymi, którzy podziwiają twoją sztukę. Sprzedaż dzieła powinna dać ci przynajmniej dziesięciokrotną wartość zwykłej ceny, a czasami nawet więcej.",
                100000);
        super.poziom += 1;
    }
}

class Artylerzysta extends Talent{
    public Artylerzysta (Attribute zrecznosc) {
        super("Artylerzysta",
                "Z łatwością przeładowujesz broń prochową. Dodaj PS równe liczbie wykupień tego Talentu do każdego Wydłużonego Testu związanego z przeładowaniem broni prochowej.",
                zrecznosc.summary/10);
        super.poziom += 1;
    }
}

class AtakWyprzedzajacy extends Talent{
    public AtakWyprzedzajacy (Attribute inicjatywa) {
        super("Atak Wyprzedzający",
                "Twoje błyskawiczne ciosy pozwalają na powalenie przeciwników, zanim oni sami zdążą zaatakować. Kiedy wróg na ciebie Szarżuje, wykonaj udany Wymagający (+0) Test Inicjatywy, by natychmiast wykonać Darmowy Atak poza normalną kolejnością  undy. Używasz broni, którą trzymasz w wiodącej ręce. Możesz wykonać tyle Ataków Wyprzedzających w Rundzie, ile razy wykupiłeś ten Talent, ale tylko raz na każdego szarżującego.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }
}

class Atrakcyjny extends Talent{
    public Atrakcyjny (Attribute oglada) {
        super("Atrakcyjny",
                "Może to przenikliwe spojrzenie lub zgrabna sylwetka, a może to, jak w uśmiechu odsłaniasz biel swoich zębów. Wiesz, jak najlepiej pokazać to, czym obdarzyli cię bogowie. Jeżeli uda ci się Test Charyzmy wobec osób, którym się podobasz,  możesz obliczyć PS normalnie albo uzyskać ich tyle, ile wypadło na kostce jedności. Na przykład udany Test przy wyrzuceniu 38 oznaczałby wtedy 8 PS.",
                oglada.summary/10);
        super.poziom += 1;
    }
}

class BardzoSilny extends Talent{
    public BardzoSilny (Attribute sila) {
        super("Bardzo Silny",
                "Twoja początkowa Siła zostaje na stałe podniesiona o +5, co nie liczy się do sumy twoich Rozwinięć.",
                1);
        super.poziom += 1;
        change(sila);
    }

    void change(Attribute sila) {
        sila.starting += 5;
    }
}

class BardzoSzybki extends Talent{
    public BardzoSzybki (int szybkosc) {
        super("Bardzo Szybki",
                "Twoja Szybkość zwiększa się o +1.",
                1);
        super.poziom += 1;
        change(szybkosc);
    }

    void change(int szybkosc) {
        szybkosc += 1;
    }
}

class BerserkerskaSzarza extends Talent{
    public BerserkerskaSzarza (Attribute sila) {
        super("Berserkerska Szarża",
                "Nie licząc się z niebezpieczeństwem, rzucasz się na przeciwników, by pędem i siłą zadawać mocniejsze ciosy. Kiedy Szarżujesz, zadajesz +1 punkt obrażeń we wszystkich atakach Walki Wręcz za każde wykupienie tego Talentu.",
                sila.summary/10);
        super.poziom += 1;
    }
}

class BiczownikTalent extends Talent{
    public BiczownikTalent (Attribute wytrzymalosc) {
        super("Biczownik",
                "Swój ból ofiarowałeś wyznawanemu bogu. Każdego dnia musisz spędzić pół dzwonu (pół godziny) na modlitwie, otrzymując obrażenia na poziomie liczby wykupień tego Talentu. Jeśli posiadasz Talent Szał Bojowy, to do położenia się na najbliższy spoczynek możesz natychmiast wpaść w Szał Bojowy bez wykonywania Testów.\nSzał Bojowy zostaje dodany do listy Talentów dostępnych dla twojej bieżącej Profesji. Jeśli zaniedbasz biczowanie przez jeden dzień lub pozwolisz, by poszarpana skóra została uleczona, nie będziesz mógł wydawać Punktów Bohatera ani Determinacji, póki się znów nie wybiczujesz.",
                wytrzymalosc.summary/10);
        super.poziom += 1;
    }
}

class BitewnaFuria extends Talent{
    public BitewnaFuria (Attribute sila_woli) {
        super("Bitewna Furia",
                "Jesteś w stanie lepiej kontrolować swój Szał Bojowy. Udany Test Opanowania pozwala ci otrząsnąć się z niego na końcu rundy.",
                sila_woli.summary/10);
        super.poziom += 1;
    }
}

class BitewnyRefleks extends Talent{
    public BitewnyRefleks (Attribute inicjatywa) {
        super("Bitewny Refleks",
                "Reagujesz szybko jak błyskawica, dlatego za każde wykupienie tego Talentu otrzymujesz +10 do Inicjatywy, gdy określana jest kolejność Inicjatywy.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }
}

class BlekitnaKrew extends Talent{
    public BlekitnaKrew () {
        super("Błękitna Krew",
                "Albo urodziłeś się w rodzinie szlacheckiej, albo zostałeś wywyższony już podczas gry. Jeśli jesteś odpowiednio ubrany, inni zawsze traktują cię jak kogoś ze sfer wyższych niż ich, chyba że ktoś z nich także posiada ten Talent. Wtedy normalnie porównuje się Status.",
                1);
        super.poziom += 1;
    }
}

class Blogoslawienstwo extends Talent{
    public Blogoslawienstwo () {
        super("Błogosławieństwo",
                "Któryś z bogów czuwa nad tobą i odpowiada na twoje proste modlitwy. Możesz wykorzystywać błogosławieństwa swojego pana, co opisano w Rozdziale 7: Religie i wierzenia. Normalnie możesz znać tylko jedną boską tradycję na Talent Błogosławieństwo.",
                1);
        super.poziom += 1;
    }
}

class BlyskawicznyStrzal extends Talent{
    public BlyskawicznyStrzal (Attribute zwinnosc) {
        super("Błyskawiczny Strzał",
                "Jeśli posiadasz naładowaną broń dystansową, możesz z niej wystrzelić poza Kolejnością Inicjatywy, zanim zareaguje którykolwiek z uczestników walki. Rzut na trafienie wykonaj z uwzględnieniem wszystkich modyfikatorów. Użycie tego Talentu wymaga poświęcenia zarówno Akcji, jak i Ruchu z nadchodzącej Tury i kiedy nadejdzie twoja kolej, będą one traktowane jako wykorzystane. Jeśli ten Talent chcą wykorzystać dwie lub więcej postaci, pierwsza strzela ta, która wykupiła go więcej razy. Jeśli i na tym polu mamy remis, obydwie postacie strzelają równocześnie i wynik ich ataków powinien być rozliczony jednocześnie.",
                zwinnosc.summary/10);
        super.poziom =+ 1;
    }
}

class Blyskotliwosc extends Talent{
    public Blyskotliwosc (Attribute inteligencja) {
        super("Błyskotliwość",
                "Twoja początkowa Inteligencja zostaje zwiększona o +5, co nie liczy się do twojej sumy Rozwinięć.",
                1);
        super.poziom =+ 1;
        change(inteligencja);
    }

    void change(Attribute inteligencja) {
        inteligencja.starting += 5;
    }
}

class CelnyStrzal extends Talent{
    public CelnyStrzal (Attribute umiejetnosci_strzeleckie) {
        super("Celny Strzał",
                "Jesteś strzelcem wyborowym i wiesz, gdzie posłać pocisk, by poczynić największe szkody. Używając broni strzeleckich, zadajesz dodatkowe obrażenia, równe liczbie wykupień tego Talentu.",
                umiejetnosci_strzeleckie.summary/10);
        super.poziom += 1;
    }
}

class Charyzmatyczny extends Talent{
    public Charyzmatyczny (Attribute oglada) {
        super("Charyzmatyczny",
                "Twoja początkowa Ogłada zwiększa się na stałe o +5 (co nie wlicza się do sumy Rozwinięć postaci).",
                1);
        super.poziom += 1;
        change(oglada);
    }

    void change(Attribute oglada) {
        oglada.starting += 5;
    }
}

class Chirurgia extends Talent{
    public Chirurgia (Attribute inteligencja) {
        super("Chirurgia",
                "Lata nauki trudnego rzemiosła chirurga pozwalają ci dokonywać cudu operacji, zabiegu niezbędnego przy leczeniu najgroźniejszych obrażeń. W opisie wybranych Trafień Krytycznych znajdziecie informację, że wymagają one interwencji chirurga. Właśnie ty jesteś w stanie im zaradzić. Operacja to Wydłużony Wymagający (+0) Test Leczenia. Liczba wymaganych PS jest ustalana przez MG, ale zwykle to 5-10. Podczas procedury zadajesz pacjentowi 1k10 obrażeń i nakładasz na niego Stan Krwawienie za każdym razem, gdy wykonujesz Test. To oznacza, że chory może umrzeć, a szansa na to jest wysoka. Po operacji pacjent musi wykonać Przeciętny (+20) Test Odporności, a jego niepowodzenie oznacza drobną infekcję.",
                inteligencja.summary/10);
        super.poziom += 1;
    }
}

class Chodu extends Talent{
    public Chodu (Attribute zwinnosc) {
        super("Chodu!",
                "Kiedy na szali znajduje się twoje życie, potrafisz niezwykle sprawnie przebierać nogami. Podczas Ucieczki (patrz strona 165) twoja Szybkość jest traktowana, jakby była o 1 wyższa.",
                zwinnosc.summary/10);
        super.poziom += 1;
    }
}

class Cien extends Talent{
    public Cien (Attribute zwinnosc) {
        super("Cień",
                "Wiesz, jak podążać za innymi, by nie zostać na tym przyłapanym. Możesz wykorzystywać zasady śledzenia ze strony 128 bez konieczności wykonywania Testu Łączonego. Wystarczy, że wykonasz rzut na Percepcję lub Skradanie, zależnie od tego, która wartość jest wyższa.",
                zwinnosc.summary/10);
        super.poziom += 1;
    }
}

class CiosMierzony extends Talent{
    public CiosMierzony(Attribute inicjatywa) {
        super("Cios Mierzony",
                "Czy w walce wręcz, czy strzelając, umiesz trafiać tam, gdzie najbardziej zaboli. Możesz zmodyfikować Miejsce Trafienia +/-10 za każde wykupienie tego Talentu. Na przykład, jeśli kupiłeś go dwa razy, a wynik 34 wskazuje na prawe ramię, to możesz zmniejszyć go do 14 i trafić w lewe ramię lub zwiększyć do 54 i ugodzić w korpus.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }
}

class CiosPonizejPasa extends Talent{
    public CiosPonizejPasa (Attribute walka_wrecz) {
        super("Cios Poniżej Pasa",
                "Nauczyłeś się brudnych sztuczek, stosowanych podczas walki bez broni. Zadajesz +1 punkt obrażeń za każde wykupienie tego Talentu, gdy trafisz przeciwnika, używając Umiejętności Broń Biała (Bijatyka).\\nUwaga: wykorzystanie tego Talentu w pojedynku bokserskim jest uważane za oszustwo.",
                walka_wrecz.summary/10);
        super.poziom += 1;
    }
}

class Czarownica extends Talent{
    public Czarownica(Attribute sila_woli) {
        super("Czarownica",
                "Sama z siebie nauczyłaś się, jak rzucać czary, często robiąc to metodą prób i błędów. Dodaj Język (Magiczny) do listy Umiejętności każdej bieżącej Profesji. Jeśli się już na niej znajduje, każde Rozwinięcie tej Umiejętności kosztuje cię o 5 PD mniej. Co więcej, możesz w dowolnym momencie wydać Punkt Bohatera, by Twoja postać mogła rzucić wybrane przez ciebie zaklęcie z dowolnej Tradycji Magii Tajemnej. Zostaje ono dodane do listy znanych postaci czarów. Możesz tak uczynić tyle razy, ile razy masz wykupiony ten Talent.",
                sila_woli.summary/10);
        super.poziom += 1;
    }
}

class CzlowiekGuma extends Talent{
    public CzlowiekGuma (Attribute zwinnosc) {
        super("Człowiek Guma",
                "Jesteś w stanie wyginać swoje ciało i manipulować nim na sposoby, które zdają się przeczyć naturze. Dzięki temu możesz przeciskać się przez niewielkie otwory lub zmuszać kończyny do nieprawdopodobnych rzeczy. Granice tego wyznacza MG i udany Test Zwinności.",
                zwinnosc.summary/10);
        super.poziom += 1;
    }
}

class Czujny extends Talent{
    public Czujny(Attribute inicjatywa) {
        super("Czujny",
                "Swoją początkową Inicjatywę zwiększasz na stałe o +5, co nie liczy się do sumy Rozwinięć twojej postaci.",
                1);
        super.poziom += 1;
        change(inicjatywa);
    }

    void change(Attribute inicjatywa) {
        inicjatywa.starting += 5;
    }
}

class CzystaDusza extends Talent{
    public CzystaDusza(Attribute sila_woli) {
        super("Czysta Dusza",
                "Twoja dusza jest nieskalana i odporna na zakusy Chaosu. Zanim będziesz musiał wykonać Test poddania się Zepsuciu, możesz przyjąć dodatkowe jego Punkty w liczbie równej liczbie wykupień tego Talentu.",
                sila_woli.summary/10);
        super.poziom += 1;
    }
}

class CzytanieZRuchuWarg extends Talent{
    public CzytanieZRuchuWarg(Attribute inicjatywa) {
        super("Czytanie z Ruchu Warg",
                "Patrząc na usta innych, potrafisz dowiedzieć się, co mówią. Jeśli możesz bez przeszkód obserwować dolną część twarzy istoty, wolno ci wykonać Test Percepcji, by zrozumieć, co mówi.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }
}

class CzytaniePisanie extends Talent{
    public CzytaniePisanie() {
        super("Czytanie/Pisanie",
                "Jesteś jednym z nielicznych piśmiennych Staroświatowców. Potrafisz czytać i pisać (o ile to możliwe) w każdym języku, którym umiesz się posługiwać.",
                1);
        super.poziom += 1;
    }
}

class Defraudant extends Talent{
    public Defraudant(Attribute inteligencja) {
        super("Defraudant",
                "Potrafisz podprowadzać pieniądze swoich pryncypałów tak, by tego nie odkryli. Kiedy pozyskujesz dochód podczas zarabiania (w trakcie gry lub oddając się Zajęciu Dochód), możesz wykonać Przeciwstawny Test Inteligencji przeciwko swojemu  pracodawcy (jeśli masz takowego). Jeżeli wygrasz, niepostrzeżenie podprowadzasz 2k10 + PS miedzianych pensów, 1k10 + PS srebrnych szylingów lub 1 + PS złotych koron (w zależności od wysokości obrotów, co jest w gestii MG). Jeśli twój pracodawca wygra o +6 PS, zgarniasz pieniądze, ale zostajesz nakryty. Konsekwencje zależą od MG. Inne wyniki oznaczają, że nie udało ci się zrobić defraudacji i nie ukradłeś żadnych pieniędzy.",
                inteligencja.summary/10);
        super.poziom += 1;
    }
}

class DobrzePrzygotowany extends Talent{
    public DobrzePrzygotowany(Attribute inicjatywa) {
        super("Dobrze Przygotowany",
                "Dobrze przewidujesz, czego będą potrzebować inni i co przyda się tobie. Tyle razy na sesję, ile razy wykupiłeś ten Talent, możesz wyciągnąć z plecaka lub sakwy niezbędny przedmiot, jeśli jego ciężar w punktach obciążenia wynosi 0, mógł zostać niedawno kupiony i jego posiadanie nie jest czymś niezwykłym. Może to być butelka spirytusu, potrzebna do polania rany kompana, lub gwizdek, którego zabrakło występującemu cyrkowcowi. Kiedy użyjesz tego Talentu, odlicz pieniądze za przedmiot, pokazując tym, że wcześniej go kupiłeś.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }
}

class DoswiadczonyWedrowiec extends Talent{
    public DoswiadczonyWedrowiec(Attribute zwinnosc) {
        super("Doświadczony Wędrowiec",
                "Masz doświadczenie w wędrówce przez dzicz i potrafisz dobrze wybierać drogę. Nie działają na ciebie negatywne modyfikatory wynikające z wpływu wybranego terenu. Oto lista przykładów: Lasy, Pustynie, Moczary, Teren Kamienisty, Tundra, Wybrzeża.",
                zwinnosc.summary/10);
        super.poziom += 1;
    }
}

class DwieBronie extends Talent{
    public DwieBronie(Attribute zwinnosc) {
        super("Dwie Bronie",
                "Kiedy jesteś uzbrojony w dwie bronie, podczas swojej Akcji możesz zaatakować obydwiema naraz. Najpierw wykonaj Test trafienia dla broni, którą trzymasz w wiodącej ręce, a jeśli trafisz, określ normalnie obrażenia. Zostaw kości 1k100 na stole, przydadzą się za chwilę. Skoro pierwszy atak się udał i zostały zadane obrażenia, możesz użyć drugiej broni, by uderzyć jeszcze raz. Wykorzystujesz wynik pierwszego rzutu, ale odwracasz kolejność kostek. I tak rzut na trafienie 34 stanie się 43. Pamiętaj, by obniżyć go o modyfikator wynikający z walki słabszą ręką (-20, chyba że posiadasz Talent Oburęczność). Drugi atak też jest Testem Przeciwstawnym. Twój przeciwnik wykonuje Test obrony, na nowo określane są obrażenia. Wyjątkiem jest sytuacja, gdy pierwszy atak zakończył się Trafieniem Krytycznym. Jeśli tak się stanie, wykorzystaj wynik rzutu w Tabeli Trafień Krytycznych do określenia, czy drugi atak trafił, czy nie. Na przykład, jeśli pierwszy atak trafił przeciwnika krytycznie w głowę, a wynik rzutu w Tabeli Trafień Krytycznych to 56 (Poważna rana oka), to korzystasz z tego rezultatu jako wyniku rzutu na trafienie w drugim ataku. Jeśli atakujesz obydwiema broniami, twoje rzuty na obronę obarczone są modyfikatorem -10 do końca twojej następnej Tury. Nie zyskujesz Przewagi za trafienie lub zranienie przeciwnika, jeśli korzystasz z tego Talentu, chyba że trafisz obydwoma atakami.",
                zwinnosc.summary/10);
        super.poziom += 1;
    }
}

class Etykieta extends Talent{
    public Etykieta(Attribute oglada) {
        super("Etykieta",
                "Dopóki jesteś odpowiednio ubrany i zachowujesz się należycie, potrafisz wtopić się w tłum wybranej grupy społecznej. Oto przykłady kilku z nich: Członkowie Gildii lub Cechu, Kultyści, Przestępcy, Służba, Szlachta, Uczeni, Żołnierze. Jeśli nie posiadasz tego Talentu,ci, którzy go mają, łatwo zauważą, że nie pasujesz do obcego środowiska. Widać to w zachowaniu bohatera. To oczywiście zależy od odgrywania, ale MG może wprowadzić tu odpowiedni modyfikator do Testów Ogłady.",
                oglada.summary/10);
        super.poziom += 1;
    }
}

class Finta extends Talent{
    public Finta(Attribute walka_wrecz) {
        super("Finta",
                "Pilnie ćwiczyłeś pozorowane ataki w zwarciu, by zmylić przeciwnika. W ramach swojej Akcji możesz wykonać fintę przeciwko uzbrojonemu przeciwnikowi. O jej powodzeniu rozstrzyga Przeciwstawny Test Broni Białej (Szermierczej) przeciw Broni Białej wroga. Jeśli go wygrasz i przed końcem następnej rundy zaatakujesz tego samego przeciwnika, możesz dodać PS z finty do swojego Testu ataku.",
                walka_wrecz.summary/10);
        super.poziom += 1;
    }
}

class Gadanina extends Talent{
    public Gadanina(Attribute oglada) {
        super("Gadanina",
                "W Nordlandzie mówi się, że otwierasz usta, a kiszki przez ciebie przemawiają, w Ostlandzie zaś, że pleciesz bzdury. Gadanina to wylewanie strumienia słów lub niepotrzebne i kwieciste rozwodzenie się nad sprawami trywialnymi lub wręcz pozbawionymi sensu, by wprowadzić rozmówcę w zdumienie i zakłopotanie. Do Gadaniny wykorzystujesz Umiejętność Charyzma w Teście Przeciwstawnym z Inteligencją. Sukces oznacza, że twój rozmówca znajduje się w Stanie Oszołomienie. Każdy poziom Gadaniny sprawia, że cel otrzymuje Stan kolejny raz. Taka osoba bądź istota stoi oniemiała, próbując zrozumieć, o czym mówisz i czego chcesz. Kiedy zagadany osobnik otrząśnie się z oszołomienia i zrozumie, co się działo, może nie być szczęśliwy z tego, jak go zmieszałeś. Ostatecznie zawracałeś mu głowę głupotami. Kiedy przestaniesz nawijać, cel natychmiast otrząśnie się ze Stanu Oszołomienie spowodowanego Gadaniną. Tego Talentu możesz używać tylko raz na danej osobie podczas jednej sceny (a nawet jeszcze rzadziej, jeśli MG tak uzna). Może zdarzyć się tak, że ten sam człowiek drugi raz na twoje paplanie nie da się już nabrać.",
                oglada.summary/10);
        super.poziom += 1;
    }
}

class GeniuszArytmetyczny extends Talent{
    public GeniuszArytmetyczny(Attribute inteligencja) {
        super("Geniusz Arytmetyczny",
                "Masz dar do cyferek i z łatwością potrafisz rozwiązywać problemy matematyczne. Na sesji wolno używać ci kalkulatora, by pokazać geniusz swojej postaci (chyba że go nie potrzebujesz i liczysz w pamięci).",
                inteligencja.summary/10);
        super.poziom += 1;
    }
}

class GladkieSlowa extends Talent{
    public GladkieSlowa(Attribute oglada) {
        super("Gładkie Słowa",
                "Jak Ranald Podstępny, potrafisz tak przeplatać prawdę z kłamstwem, że nie można odróżnić jednego od drugiego. Gdy wykorzystujesz Charyzmę do kłamania, twoi rozmówcy nie mogą wykonywać Przeciwstawnego Testu Intuicji, by sprawdzić, czy przypadkiem ich nie okłamujesz.",
                oglada.summary/10);
        super.poziom += 1;
    }
}

class Grozny extends Talent{
    public Grozny(Attribute sila) {
        super("Groźny",
                "Twoja postura i wygląd budzą obawę. Kiedy wykonujesz Test Zastraszania, uzyskujesz dodatkowe PS równe liczbie wykupień tego Talentu.",
                sila.summary/10);
        super.poziom += 1;
    }
}

class Hulaka extends Talent{
    public Hulaka(Attribute wytrzymalosc) {
        super("Hualaka",
                "Wiesz, jak pić i jak dobrze się bawić. Możesz zamienić kostki nieudanego Testu Mocnej Głowy, jeśli nowy wynik będzie sukcesem.",
                wytrzymalosc.summary/10);
        super.poziom += 1;
    }
}

class Inspirujacy extends Talent{
    public Inspirujacy(Attribute oglada) {
        super("Inspirujący",
                "Twoje słowa i zachęty mogą przechylić szalę zwycięstwa w bitwie. Poniższa tabela pokazuje, ile osób ulegnie wpływowi Dowodzenia podczas wojny.",
                oglada.summary/10);
        super.poziom += 1;
    }
}

class Intrygant extends Talent{
    public Intrygant(Attribute inteligencja) {
        super("Intrygant",
                "Jesteś mistrzem intryg i za każdym rogiem węszysz spiski. Raz na sesję możesz zadać MG pytanie o sytuację polityczną i zagmatwaną sieć powiązań, a on wykona w tajemnicy Test Inteligencji i przekaże ci pewną ilość informacji, zależną od liczby PS uzyskanych dzięki rzutowi.",
                inteligencja.summary/10);
        super.poziom += 1;
    }
}

class Inwokacja extends Talent{
    public Inwokacja() {
        super("Inwokacja",
                "Zostałeś pobłogosławiony przez swego boskiego patrona, dzięki czemu zyskujesz zdolność czynienia jednego z jego Cudów. Możesz wykupywać kolejne cuda za 100 PD pomnożone przez liczbę obecnie znanych cudów. Pełne zasady tego, jak się ich uczysz, znajdują się w Rozdziale 7: Religie i wierzenia. W normalnych okolicznościach nie możesz wykupić tego Talentu więcej niż jeden raz. Co więcej, nie możesz też kupić Talentów Magia Prosta i Magia Tajemna, jeśli posiadasz Talent Inwokacja. Po wydaniu 100 PD możesz się pozbyć tego Talentu, ale natychmiast utracisz dostęp do wszystkich zapewnianych przez niego cudów. Narażasz się też na gniew swego boga, a MG obmyśli, jak będzie się on przejawiał.",
                1);
        super.poziom += 1;
    }
}

class Krasomostwo extends Talent{
    public Krasomostwo(Attribute oglada) {
        super("Krasomówstwo",
                "Wiesz, jak porwać tłum. Kiedy wykonujesz Test Charyzmy podczas przemawiania do tłumu, otrzymujesz premię w wysokości tylu PS, ile razy wykupiłeś ten Talent.",
                oglada.summary/10);
        super.poziom += 1;
    }
}

class Krzepki extends Talent{
    public Krzepki(Attribute wytrzymalosc){
        super("Krzepki",
                "Jesteś twardy jak skała i rany nie robią na tobie wrażenia. Zmniejszasz otrzymywane obrażenia o 1 za każde wykupienie tego Talentu. Zasada ta działa nawet wtedy, gdy nie mógłbyś pomniejszyć otrzymanych ran. Nie możesz w ten sposób zredukować obrażeń poniżej 1 punktu.",
                wytrzymalosc.summary/10);
        super.poziom += 1;
    }
}

class Lapowkarz extends Talent{
    public Lapowkarz(Attribute oglada) {
        super("Łapówkarz",
                "Wiesz, jak dawać w łapę. MG powinien obniżyć podstawę wyliczenia łapówki o 10% za każde wykupienie tego Talentu. Minimalna wartość łapówki nie może spaść poniżej 10% wyjściowej stawki.",
                oglada.summary/10);
        super.poziom += 1;
    }
}

class MagBitewny extends Talent{
    public MagBitewny() {
        super("Mag Bitewny",
                "Zostałeś wyszkolony w rzucaniu czarów podczas bitwy. W swojej Turze możesz rzucić jeden czar o Poziomie Zaklęcia 5 lub niższym w Akcji Darmowej (Test wykonujesz normalnie). Nie używasz zatem pełnej Akcji i możesz ją wykorzystać w dowolny sposób. Jednak w tej Turze nie możesz już rzucić kolejnego czaru.",
                1);
        super.poziom += 1;
    }
}

class MagiaChaosu extends Talent{
    String tradycja;
    public MagiaChaosu(String tradycja) {
        super("Magia Chaosu",
                "Przez przypadek (lub wręcz przeciwnie) część twojej duszy przypadła jednemu z Mrocznych Bogów i jesteś w stanie korzystać z wszetecznej magii Chaosu. Twój złowrogi patron zapewnia ci dostęp do jednego czaru z wybranej tradycji  najczęściej Nurgla, Slaanesha lub Tzeentcha), a wraz z nim otrzymujesz Punkt Zepsucia, gdy bluźniercza formuła wypalasię w twoim umyśle, byś nigdy jej nie zapomniał. Za każdym razem, gdy wykupujesz ten Talent, musisz zapłacić za niego 100 PD, a więc jest inaczej niż w przypadku innych tradycji. W zamian za to otrzymujesz czar z wybranej tradycji i 1 Punkt Zepsucia. Więcej informacji na temat czarów znajduje się w Rozdziale 8: Magia. W normalnych warunkach możesz znać tylko jedną tradycję magii Chaosu.",
                10);
        super.poziom += 1;
        this.tradycja = tradycja;
    }
}

class MagiaProsta extends Talent{
    public MagiaProsta() {
        super("Magia Prosta",
                "Zawsze miałeś smykałkę do rzucania czarów i opanowałeś metody ich podstawowej kontroli. Kiedy wykupujesz ten Talent, uczysz się i zapamiętujesz tyle czarów, ile wynosi modyfikator z twojej Siły Woli (str 136).",
                1);
        super.poziom += 1;
    }
}

class MagiaTajemna extends Talent{
    String tradycja;
    public MagiaTajemna (String tradycja) {
        super("Magia Tajemna",
                "Studiowałeś jedną z ośmiu tradycji magii: Cienia, Metalu, Niebios, Ognia, Śmierci, Światła, Zwierząt lub Życia albo praktykujesz którąś z mniej znanych: Guślarstwa czy Nekromancji (136)",
                1);
        super.poziom += 1;
        this.tradycja = tradycja;
    }
}

class Majetny extends Talent{
    public Majetny() {
        super("Majętny",
                "Jesteś bajecznie bogaty i rzadko kiedy brakuje ci pieniędzy. Kiedy zarabiasz (włączając w to Zajęcie Dochód), zarabiasz +1 złotą koronę więcej za każdy poziom tego Talentu.",
                10000);
        super.poziom += 1;
    }
}

class Maly extends Talent{
    public Maly() {
        super("Mały",
                "Jesteś niższy od większości mieszkańców Starego Świata. Zasady dotyczące rozmiaru znajdują się na stronie 320 w Rozdziale 12: Bestiariusz.",
                1);
        super.poziom += 1;
    }
}

class MistrzCharakteryzacji extends Talent{
    public MistrzCharakteryzacji(Attribute oglada) {
        super("Mistrz Charakteryzacji",
                "Jesteś ekspertem, jeśli chodzi o przejmowanie manieryzmów i upodabnianie się do kogoś. Zmieniając postawę, wykrzywiając twarz i dobierając ubranie, przestajesz przypominać siebie, nawet jeśli nie masz pod ręką zestawu do charakteryzacji.",
                oglada.summary/10);
        super.poziom += 1;
    }
}

class MistrzRzemiosla extends Talent{
    String rzemioslo;
    public MistrzRzemiosla(Attribute zrecznosc, String rzemioslo) {
        super("Mistrz Rzemiosła",
                "Jesteś wybitnie wykwalifikowany w danym rzemiośle. Możesz zmniejszyć liczbę wymaganych PS podczas Testu Wydłużonego tego Rzemiosła o tyle, ile razy wykupiłeś ten Talent.",
                zrecznosc.summary/10);
        super.poziom += 1;
        this.rzemioslo = rzemioslo;
    }
}

class MistrzWalki extends Talent{
    public MistrzWalki(Attribute zwinnosc) {
        super("Mistrz Walki",
                "Lata nagromadzonego doświadczenia pozwalają ci trzymać przeciwników w szachu. Każde wykupienie tego Talentu sprawia, że gdy określana jest przewaga liczebna w walce, ty liczysz się jak jedna osoba więcej (dwie przy pierwszym wykupieniu, trzy przy drugim itd.). Talent ten działa tylko wtedy, gdy przeciwników jest faktycznie więcej od grupy, w której znajduje się postać. Na stronie 162 znajdują się zasady mówiące o tym, jak stosować przewagę liczebną.",
                zwinnosc.summary/10);
        super.poziom += 1;
    }
}

class MocnePlecy extends Talent{
    public MocnePlecy(Attribute sila) {
        super("Mocne Plecy",
                "Twój kark jest twardy od ciężkiej harówki. Możesz dodać liczbę wykupień tego Talentu do PS Przeciwstawnych Testów Siły i nieść dodatkowy ekwipunek o wadze równej liczbie wykupień tego Talentu w punktach Obciążenia (patrz strona 293).",
                sila.summary/10);
        super.poziom += 1;
    }
}

class MorderczyAtak extends Talent{
    public MorderczyAtak(Attribute inicjatywa) {
        super("Morderczy Atak",
                "Wiesz dobrze, gdzie uderzyć, by wyrządzić jak najwięcej krzywdy. Kiedy zadasz Ranę Krytyczną, zwiększasz też obrażenia o tyle, ile razy wykupiłeś ten Talent.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }
}

class MolKsiazkowy extends Talent{
    public MolKsiazkowy(Attribute inteligencja) {
        super("Mól Książkowy",
                "W bibliotece czujesz się tak naturalnie, jak żeglarz na morzu czy rolnik na polu. Wykorzystując Umiejętność Badania Naukowe, możesz odwrócić kolejność kostek nieudanego Testu, jeśli zapewni ci to sukces.",
                inteligencja.summary/10);
        super.poziom += 1;
    }
}

class Mowca extends Talent{
    public Mowca(Attribute oglada) {
        super("Mówca",
                "Jesteś umiejętnym oratorem i wiesz, jak urabiać tłumy. Poniższa tabela wskazuje, ile osób ulegnie twojemu wpływowi, gdy wykonasz Test Charyzmy (patrz strona 119) podczas przemawiania.",
                oglada.summary/10);
        super.poziom += 1;
    }
}

class Musztra extends Talent{
    public Musztra(Attribute walka_wrecz) {
        super("Musztra",
                "Zostałeś wyszkolony w walce obok innych żołnierzy. Jeśli przeciwnik sprawi, że stracisz Przewagę, a znajdujesz się obok innej, aktywnej postaci z Talentem Musztra, możesz zachować 1 Przewagę za każde wykupienie tego Talentu.",
                walka_wrecz.summary/10);
        super.poziom += 1;
    }
}

class NaCzteryLapy extends Talent{
    public NaCzteryLapy(Attribute zwinnosc) {
        super("Na Cztery Łapy",
                "Jesteś zwinny jak kot i potrafisz utrzymać równowagę równie dobrze co on. Jeśli spadniesz, to nie ucierpisz tak bardzo jak inni. Kiedy dojdzie do upadku, wykonaj Test Atletyki. Jeśli zakończy się powodzeniem, to obliczając odniesione obrażenia, zmniejsz wysokość, z której spada postać, o 1 metr + 1 metr na każdy PS uzyskany podczas Testu.",
                zwinnosc.summary/10);
        super.poziom += 1;
    }
}

class Naciagacz extends Talent{
    public Naciagacz(Attribute oglada) {
        super("Naciągacz",
                "Doskonaliłeś się w żebraniu tak długo, że teraz wzruszysz nawet osobę o sercu z najtwardszego kamienia. Testy Charyzmy podczas żebrania wykonujesz co pół godziny, a nie co godzinę (patrz strona 120).",
                oglada.summary/10);
        super.poziom += 1;
    }
}

class Nasladowca extends Talent{
    public Nasladowca(Attribute inicjatywa) {
        super("Naśladowca",
                "Masz ucho do gwar oraz do dialektów i potrafisz je naśladować. Jeśli osłuchasz się któregoś przez jeden dzień, możesz wykonać Test Inicjatywy (jeden na dzień) i jeśli się powiedzie, będziesz potrafił naśladować ten akcent. Miejscowi będą uważali, że gadasz po ichniemu i jesteś swój.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }
}

class NiegodnyUwagi extends Talent{
    public NiegodnyUwagi(Attribute oglada) {
        super("Niegodny Uwagi",
                "Wielcy i możni nie zwracają na ciebie uwagi. Jeśli jesteś zwyczajnie ubrany i nie zachowujesz się niestosownie, osoby z wyższego poziomu Statusu nie przejmują się tobą, chyba że twoja obecność jest wybitnie niestosowna. Talent ten sprawia, że masz wiele okazji do podsłuchania rozmów, których nie powinieneś być świadkiem. Co więcej, osoby o wyższym poziomie Statusu nie otrzymują Przewagi za uderzenie ciebie lub zadanie obrażeń w walce, ponieważ pomiatanie takim łachudrą jak ty nie przynosi im żadnego honoru.",
                oglada.summary/10);
        super.poziom += 1;
    }
}

class Nienawisc extends Talent{
    public Nienawisc(Attribute sila_woli) {
        super("Nienawiść",
                "Coś w Starym Świecie powoduje twoją nienawiść, jak to opisano na stronie 190. Każde wykupienie tego Talentu to jej nowy obiekt, a przykładowe grupy to: Banici, Czarownice, Ożywieńcy, Potwory, Sigmaryci, Zielonoskórzy, Zwierzoludzie.",
                sila_woli.summary/10);
        super.poziom += 1;
    }
}

class Nieublagany extends Talent{
    public Nieublagany(Attribute wytrzymalosc) {
        super("Nieubłagany",
                "Trzeba nie lada wysiłku, by cię wykończyć. Twojej postaci nie dotyczy utrata żywotności, spowodowana Stanem Krwawienie. Każde wykupienie tego Talentu powoduje, że możesz zignorować jedną ranę spowodowaną przez ten Stan.",
                wytrzymalosc.summary/10);
        super.poziom += 1;
    }
}

class Nieugiety extends Talent{
    public Nieugiety(Attribute sila) {
        super("Nieugięty",
                "Ruszasz do walki z niezłomną, ponurą determinacją. Podczas Szarży dodaj liczbę wykupień tego Talentu do Bonusu z Siły.",
                sila.summary/10);
        super.poziom += 1;
    }
}

class Nieustepliwy extends Talent{
    public Nieustepliwy(Attribute zwinnosc) {
        super("Nieustępliwy",
                "Kiedy skupisz się na celu, nie sposób cię powstrzymać przed dotarciem do niego. Jeśli wykorzystujesz Przewagę podczas Odwrotu, możesz zachować jej tyle, ile razy masz wykupiony ten Talent. Co więcej, możesz wykorzystać Przewagi do Odwrotu, nawet jeśli masz ich mniej niż przeciwnik.",
                zwinnosc.summary/10);
        super.poziom += 1;
    }
}

class Nieustraszony extends Talent{
    public Nieustraszony(Attribute sila_woli) {
        super("Nieustraszony",
                "Jesteś tak odważny lub szalony, że strach przed pewnymi istotami jest dla ciebie wspomnieniem. Za pomocą jednego Przeciętnego (+20) Testu Opanowania możesz sprawić, że nie dotyczą cię efekty Zastraszania, Strachu i Grozy, powodowane przez określoną grupę wrogów. Oto typowe przykłady takich wrogów: Banici, Czarownice, Strażnicy, Wampiry, Zielonoskórzy, Zwierzoludzie.",
                sila_woli.summary/10);
        super.poziom += 1;
    }
}

class Niewzruszony extends Talent{
    public Niewzruszony(Attribute sila_woli) {
        super("Niewzruszony",
                "Jesteś twardym wiarusem, który przetrwał niejedną salwę z broni czarnoprochowej. Musisz wykonać Test Opanowania, by oprzeć się Stanowi Panika, dopiero kiedy zostaniesz zraniony przez broń prochową, a nie wtedy, gdy zostaniesz z niej tylko ostrzelany.",
                sila_woli.summary/10);
        super.poziom += 1;
    }

}

class NiezwykleOdporny extends Talent{
    public NiezwykleOdporny(Attribute wytrzymalosc) {
        super("Niezwykle Odporny",
                "Twoja początkowa Wytrzymałość zostaje na stałe podniesiona o +5, co nie liczy się do sumy twoich Rozwinięć.",
                1);
        super.poziom += 1;
        change(wytrzymalosc);
    }

    void change(Attribute wytrzymalosc) {
        wytrzymalosc.starting += 5;
    }
}

class NosDoKlopotow extends Talent{
    public NosDoKlopotow(Attribute inicjatywa) {
        super("Nos Do Kłopotów",
                "Wiesz, jak wpaść w kłopoty i – jeszcze lepiej – jak się z nich wyłgać. Możesz wykonać Test Intuicji, by zorientować się, kto potencjalnie może sprawiać problemy. Test ten przysługuje ci, nawet gdyby nie wolno ci było go wykonać (z powodu działania innych Talentów, czarów itp.). Test ów będzie zapewne Przeciwstawny, jeśli napastnicy się kryją. MG może go wykonać w ukryciu za ciebie, byś nie wiedział, czy zakończy się on porażką, czy sukcesem. Jeśli zauważony przez ciebie wichrzyciel rozpocznie walkę, nie działa na ciebie Stan Zaskoczenie.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class Numizmatyka extends Talent{
    public Numizmatyka(Attribute inicjatywa) {
        super("Numizmatyka",
                "Doskonale znasz się na różnych walutach Starego Świata i potrafisz oceniać ich wartość. Na podstawie swojego doświadczenia, bez konieczności wykonywania Testu, umiesz powiedzieć, ile warta jest moneta. Prosty Test Wyceny pozwoli ci wykryć podrabianą. Nie jest on przeciwstawiany PS uzyskanym wcześniej przez fałszerza.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class Obiezyswiat extends Talent{
    public Obiezyswiat(Attribute inteligencja) {
        super("Obieżyświat",
                "Jesteś jednym z tych ciekawskich, którzy nie potrafią usiedzieć na miejscu i wędrują po świecie wszerz i wzdłuż, ucząc się wielu przydatnych informacji. Dodaj Umiejętność Wiedza (Lokalna) do swojej każdej bieżącej Profesji, a jeśli już jest na liście dostępnych, możesz wykupić na tym poziomie jedną dodatkową Wiedzę (Lokalną). Za Rozwinięcie każdej z takich Umiejętności płacisz zawsze 5 PD mniej. Przykładowe Specjalizacje to Altdorf, Vorbergland czy Ubersreik.",
                inteligencja.summary/10);
        super.poziom += 1;
    }

}

class Oburecznosc extends Talent{
    public Oburecznosc() {
        super("Oburęczność",
                "Twoja słabsza ręka jest sprawniejsza niż u innych ludzi. Być może zostałeś tego nauczony, być może to wrodzona cecha, ale efekt jest ten sam: modyfikator do Testów wykonywanych „drugą” ręką zostaje zmniejszony z -20 do -10. Jeśli wykupisz ten Talent drugi raz, modyfikatora nie stosuje się do twojej postaci.",
                2);
        super.poziom += 1;
    }

}

class OdpornoscNaMagie extends Talent{
    public OdpornoscNaMagie(Attribute wytrzymalosc) {
        super("Odporność na Magię",
                "Jesteś uodporniony na zaklęcia. Poziom Sukcesów czarów rzucanych na ciebie jest obniżony o 2 za każde wykupienie tego Talentu. Poziom Sukcesów jest obniżany tylko od najwyższej Odporności na Magię w obszarze oddziaływania czaru. Co więcej, nie możesz wykupić Talentów: Magia Tajemna, Błogosławieństwo, Inwokacja, Magia Prosta i Czarownica.",
                wytrzymalosc.summary/10);
        super.poziom += 1;
    }

}

class OdpornoscPsychiczna extends Talent{
    public OdpornoscPsychiczna(Attribute sila_woli) {
        super("Odporność Psychiczna",
                "Jesteś uosobieniem determinacji i niezłomności. Dodaj tyle Punktów Determinacji do ich maksymalnej puli, ile razy wykupiłeś ten Talent.",
                sila_woli.summary/10);
        super.poziom += 1;
    }

}

class OdpornyNaZagrozenie extends Talent{
    public OdpornyNaZagrozenie(Attribute wytrzymalosc) {
        super("Odporny na (Zagrożenie)",
                "Twoja wielka wytrwałość pozwala ci poradzić sobie z niebezpieczeństwem. Automatycznie zdajesz pierwszy Test opierania się przeciwko konkretnemu typowi zagrożenia na danej sesji. Znane są Odporności na Choroby, Magię, Mutacje czy Trucizny. Jeśli w Teście ważne są Poziomy Sukcesu, to za ich liczbę przyjmujesz Bonus z Wytrzymałości.",
                wytrzymalosc.summary/10);
        super.poziom += 1;
    }

}

class OdwrocenieSzans extends Talent{
    public OdwrocenieSzans(Attribute walka_wrecz) {
        super("Odwrócenie Szans",
                "Tak przywykłeś do rozpaczliwej walki o życie, że potrafisz obrócić na swoją korzyść nawet największe kłopoty. Jeśli wygrasz Przeciwstawny Test Walki Wręcz, to zamiast zdobywać +1 Przewagę, możesz zabrać przeciwnikowi jego wszystkie zebrane Przewagi. Jeśli się na to zdecydujesz, nie zadajesz wrogowi obrażeń, nawet jeśli to twoja Tura w Rundzie.",
                walka_wrecz.summary/10);
        super.poziom += 1;
    }

}

class Ogloszenie extends Talent{
    public Ogloszenie(Attribute walka_wrecz) {
        super("Ogłuszenie",
                "Wiesz, gdzie uderzyć, by wróg padł jak długi. Nie tyczy się ciebie negatywny modyfikator za atak mierzony w głowę, gdy używasz broni do Walki Wręcz z zaletą Ogłuszająca (patrz strona 298). Co więcej, w twoich rękach wszystkie bronie improwizowane są traktowane jako Ogłuszające.",
                walka_wrecz.summary/10);
        super.poziom += 1;
    }

}

class OkoLowcy extends Talent{
    public OkoLowcy(Attribute inicjatywa) {
        super("Oko Łowcy",
                "Jesteś dobrym myśliwym i znasz najlepsze sposoby szukania zwierzyny. Kiedy podróżujesz po bogatych w nią ziemiach, jesteś automatycznie w stanie wyżywić siebie i tylu towarzyszy, ile razy wykupiłeś ten Talent, jeśli tylko masz czas, by zapolować, oraz odpowiednie wyposażenie. Więcej pożywienia możesz zapewnić, wykorzystując zasady znajdujące się na stronie 129.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class PercepcjaMagiczna extends Talent{
    public PercepcjaMagiczna(Attribute inicjatywa) {
        super("Percepcja Magiczna",
                "Potrafisz dostrzegać zmienne Wiatry Magii, które dmą od Bram Chaosu na biegunach świata. Dzięki temu Talentowi posiadasz zdolność postrzegania magii (patrz strona 233).",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class PierwszaPomoc extends Talent{
    public PierwszaPomoc(Attribute inteligencja) {
        super("Pierwsza Pomoc",
                "Potrafisz szybko opatrywać rany. Kiedy nie uda ci się Test Leczenia podczas używania Bandaży, możesz odwrócić kolejność kostek, jeśli to przyniesie ci sukces. Jeśli tak zrobisz, nie możesz uzyskać więcej niż +1 PS, ponieważ skupiasz się na szybkim, a nie dokładnym założeniu opatrunku.",
                inteligencja.summary/10);
        super.poziom += 1;
    }

}

class Pilot extends Talent{
    public Pilot(Attribute inicjatywa) {
        super("Pilot",
                "Potrafisz kierować okrętem po zdradliwych akwenach. Kiedy nie powiedzie ci się Test na niepewnych wodach, możesz odwrócić kolejność kości, jeżeli nowy wynik pozwoli ci odnieść sukces. Maksymalnie możesz w ten sposób osiągnąć +1 PS, ponieważ w ostatniej chwili wypatrzyłeś niebezpieczeństwo.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class PilotRzeczny extends Talent{
    public PilotRzeczny(Attribute inicjatywa) {
        super("Pilot Rzeczny",
                "Znasz wszystkie tajniki żeglowania po rzekach. Nie musisz wykonywać Testu, by przeprowadzić jednostkę przez niebezpieczne wody, chyba że jego trudność wynosi -10 lub więcej. Łatwiejsze Testy automatycznie kończą się sukcesem. Co więcej, jeśli posiadasz Wiedzę (Okolica), w ogóle nie musisz przeprowadzać Testów, tak dobrze znasz te tereny i lokalny nurt.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class Poliglota extends Talent{
    public Poliglota(Attribute inteligencja) {
        super("Poliglota",
                "Masz naturalną łatwość uczenia się języków. Wystarczy ci miesiąc obcowania z którymś i udany Test Inteligencji (można go powtórzyć raz na miesiąc), byś mógł traktować jego znajomość jako Umiejętność Podstawową. Uwaga: ten Talent działa tylko na języki, którymi często porozumiewają się istoty, a więc nie na Język (magiczny).",
                inteligencja.summary/10);
        super.poziom += 1;
    }

}

class Pomocny extends Talent{
    public Pomocny(Attribute oglada) {
        super("Pomocny",
                "Wiesz, co i kiedy powiedzieć oraz jak najlepiej wypaść w oczach szlachetniej od ciebie urodzonych. Kiedy z powodzeniem użyjesz Umiejętności, by wpłynąć na tych, którzy mają wyższy od ciebie Status, możesz wybrać, czy wykorzystać normalnie obliczaną liczbę PS, czy zamiast niej użyć cyfry jedności kości, którymi rzucałeś. W ten sposób rzut 46 może dać +6 PS.",
                oglada.summary/10);
        super.poziom += 1;
    }

}

class PorywajacaGorliwosc extends Talent{
    public PorywajacaGorliwosc(Attribute oglada) {
        super("Porywająca Gorliwość",
                "Kiedy mówisz o czymś, co cię pasjonuje, o swoich przekonaniach czy religii, twoje słowa przepełnia gorliwość, a nawet fanatyzm. Możesz podwoić swoją Ogładę, gdy określasz liczbę osób, na które wpływa twój Talent Mówca (patrz strona 138), gdy poruszasz ważny dla ciebie temat.",
                oglada.summary/10);
        super.poziom += 1;
    }

}

class PosluchUZwierzat extends Talent{
    public PosluchUZwierzat(Attribute sila_woli) {
        super("Posłuch u Zwierząt",
                "Dzikie zwierzęta dobrze się czują w twojej obecności i często są posłuszne twoim poleceniom. Wszystkie istoty o Cesze Zwierzę, których nie wytresowano, by były agresywne, uspokajają się w twojej obecności, chyba że mają powód, by zachować czujność. Ból, napaść czy naturalna wysoka agresja lub opieka nad młodymi mogą sprawić, że zwierzę nie podda się działaniu tego Talentu.",
                sila_woli.summary/10);
         super.poziom += 1;
    }

}

class PrecyzyjneInkantowanie extends Talent{
    public PrecyzyjneInkantowanie(Attribute inicjatywa) {
        super("Precyzyjne Inkantowanie",
                "Instynktownie pojmujesz język magiczny i bez omyłki jesteś w stanie wypowiadać skomplikowane formuły. Jeśli rzucisz dublet podczas udanego Testu Języka (Magicznego), nie dochodzi do manifestacji.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class ProstoMiedzyOczy extends Talent{
    public ProstoMiedzyOczy() {
        super("Prosto Między Oczy",
                "Zawsze trafiasz wroga między oczy… albo tam, gdzie chcesz. Zamiast odwracać kolejność kości, by określić Miejsce Trafienia z Broni Zasięgowej, wybierasz, gdzie chciałeś trafić wroga.",
                1);
        super.poziom += 1;
    }

}

class Przekonujacy extends Talent{
    public Przekonujacy(Attribute oglada) {
        super("Przekonujący",
                "Przywykłeś do debatowania i obrony swojego zdania. Jeśli uda ci się Test Charyzmy, możesz normalnie obliczyć PS lub określić ich liczbę, odczytując wynik z kości jedności. Udany Test z wynikiem 24 może dać ci więc 4 PS.",
                oglada.summary/10);
        super.poziom += 1;
    }

}

class Przestepca extends Talent{
    public Przestepca() {
        super("Przestępca",
                "Jesteś bandytą, który zarabia na swojej działalności i niekiedy się z tym nie kryje. Jeśli w trakcie gry będziesz zarabiał lub oddasz się Zajęciu Dochód, odwołaj się do poniższej tabeli. Ponieważ nie kryjesz się ze swoją przestępczą naturą, inni automatycznie uważają cię za osobę niższego Statusu, chyba że sami posiadają ten Talent. Wtedy wasz Status jest ustalany normalnie. Od ciebie zależy, jak można poznać, że jesteś kryminalistą: czy to więzienne tatuaże, czy obcesowy sposób bycia. Lokalne władze i straże są wobec ciebie podejrzliwe i zawsze patrzą ci na ręce, a im więcej razy wykupisz ten Talent, tym za większego zbira uchodzisz. Bezpośrednie skutki zależą od MG. Kryminaliści bez Talentu Przestępca zarabiają znacznie mniejsze pieniądze, ale zachowują dawny Status. Za zgodą MG możesz wydać tyle PD, ile cię kosztował, by pozbyć się tego Talentu.",
                10000);
        super.poziom += 1;
    }

}

class PrzyrzadzanieMikstur extends Talent{
    public PrzyrzadzanieMikstur(Attribute inteligencja) {
        super("Przyrządzanie Mikstur",
                "Wiesz, jak przyrządzać napary, wywary i susze. Możesz podjąć się jednego darmowego Zajęcia Wytwórstwa, by użyć Rzemiosła (Aptekarstwa) bez dostępu do Warsztatu. Pozostałe Zajęcia Wytwórstwa należy przeprowadzić normalnie.",
                inteligencja.summary/10);
        super.poziom += 1;
    }

}

class Riposta extends Talent{
    public Riposta(Attribute zwinnosc) {
        super("Riposta",
                "Wyznajesz zasadę, że najlepszą obroną jest atak, dlatego w walce błyskawicznie kontratakujesz, gdy tylko przeciwnik wyprowadzi cios. Jeśli twoja broń posiada zaletę Szybka, możesz zadać obrażenia, gdy jesteś atakowany, jakbyś wykonywał swoją Akcję. Ripostę możesz wykonać tyle razy w Rundzie, ile razy wykupisz ten Talent.",
                zwinnosc.summary/10);
        super.poziom += 1;
    }

}

class Rozbrojenie extends Talent{
    public Rozbrojenie(Attribute inicjatywa) {
        super("Rozbrojenie",
                "Celnym uderzeniem lub sprawnym ruchem nadgarstka jesteś w stanie wytrącić broń przeciwnikowi z dłoni. W ramach swojej Akcji wykonaj Przeciwstawny Test Broni Białej przeciwko wrogiemu Testowi Broni Białej. Jeśli ci się powiedzie, wybijasz broń z ręki przeciwnika, która odlatuje o 1k5 metrów w losowym kierunku. MG może zadecydować o tym, co dzieje się jeszcze. Jeśli wygrasz o 2 PS, ty decydujesz, jak daleko odleci broń, zamiast określać to losowo. Jeśli wygrasz o 4 PS, możesz też zadecydować, w którą stronę pofrunie. Jeżeli wygrasz Test o 6 PS lub więcej, łapiesz oręż przeciwnika, o ile masz wolną rękę. Ten Talent na nic się nie przyda, jeśli wróg nie używa broni lub jest większy od ciebie.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class RozpoznanieArtefaktu extends Talent{
    public RozpoznanieArtefaktu(Attribute inicjatywa) {
        super("Rozpoznanie Artefaktu",
                "Jesteś w stanie wykryć, czy w danym przedmiocie zaklęta jest magia. Możesz wykonać Test Intuicji, gdy go dotykasz. Jeśli Test się powiedzie, każdy PS pozwala ci poznać jedną zasadę, która ma zastosowanie wobec przedmiotu (jeśli tak w ogóle jest). W zwykłych przypadkach możesz wykonać tylko jeden Test wobec danego artefaktu.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class RozproszenieUwagi extends Talent{
    public RozproszenieUwagi(Attribute zwinnosc) {
        super("Rozproszenie Uwagi",
                "Jesteś wytrenowany tak, by twoje ruchy rozpraszały uwagę przeciwnika i ułatwiały jego zaskoczenie. Możesz wykorzystać swój Ruch, aby użyć Rozpraszania Uwagi. Jest to Test Przeciwstawny Atletyki przeciw Opanowaniu przeciwnika. Jeśli wygrasz, twój przeciwnik nie może zbierać Przewagi aż do końca następnej Rundy.",
                zwinnosc.summary/10);
        super.poziom += 1;
    }

}

class RuchliweDlonie extends Talent{
    public RuchliweDlonie(Attribute zrecznosc) {
        super("Ruchliwe dłonie",
                "Manipulujesz dłońmi z zaskakującą zręcznością. Gapiom i przypadkowym obserwatorom nie przysługuje bierny Test Percepcji, gdy wykorzystujesz Umiejętność Zwinne Palce, chyba że żywią oni wobec ciebie podejrzenia i obserwują twoje ruchy. Testy Broni Białej (Bijatyki) wykonywane, by dotknąć przeciwnika, wykonujesz z premią +10 x liczba wykupień tego Talentu.",
                zrecznosc.summary/10);
        super.poziom += 1;
    }

}

class Rybak extends Talent{
    public Rybak(Attribute inicjatywa) {
        super("Rybak",
                "Jesteś obrotnym rybakiem i wiesz, jak zapełnić sieci. Jeżeli masz dostęp do odpowiednio dużego zbiornika wodnego, jesteś w stanie wyżywić siebie oraz tyle osób, ile razy wykupiłeś ten Talent, jeśli poświęcisz godzinę dziennie na wędkowanie. Liczbę złowionych ryb możesz zwiększyć, stosując zasady zbieractwa (patrz strona 129).",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class SekretnaTozsamosc extends Talent{
    public SekretnaTozsamosc(Attribute inteligencja) {
        super("Sekretna Tożsamość",
                "Posiadasz alter ego, które jest bogatszym lub biedniejszym człowiekiem od ciebie. Wybierz Profesję, na którą przystanie MG. Dopóki jesteś odpowiednio ubrany, dopóty możesz korzystać z oferowanego przez nią Statusu, zamiast swojego. To oznacza, że korzystasz z jej modyfikatorów do Testów Ogłady, a nawet możesz zignorować skutki działania Talentu Przestępca. Utrzymywanie sekretnej tożsamości wymaga udanych Testów Umiejętności Występy (Aktorstwo),gdy spotykasz kogoś, kto może cię przejrzeć. Każde wykupienie tego Talentu pozwala ci na stworzenie dodatkowej sekretnej tożsamości.",
                inteligencja.summary/10);
        super.poziom += 1;
    }

}

class SilneNogi extends Talent{
    public SilneNogi(Attribute sila) {
        super("Silne Nogi",
                "Masz silne nogi, dzięki którym jesteś w stanie wykonywać nieprawdopodobnie dalekie skoki. Dodaj liczbę wykupień tego Talentu do PS Testów Atletyki wiążących się ze skakaniem (patrz strona 166).",
                sila.summary/10);
        super.poziom += 1;
    }

}

class SilnyCios extends Talent{
    public SilnyCios(Attribute sila) {
        super("Silny Cios",
                "Wiesz, jak komuś przywalić! Posługując się bronią do Walki Wręcz, zadajesz obrażenia powiększone o tyle, ile razy masz wykupiony ten Talent.",
                sila.summary/10);
        super.poziom += 1;
    }

}

class SkrocenieDystansu extends Talent{
    public SkrocenieDystansu(Attribute zrecznosc) {
        super("Skrócenie Dystansu",
                "Wiesz, jak przyciągnąć do siebie przeciwnika, i nie dotyczą cię modyfikatory za walkę z wrogiem, który ma broń dłuższą niż Twoja. Jeśli używasz opcjonalnych zasad walki kontaktowej (patrz strona 297), otrzymujesz premię +10 do trafienia przeciwnika.",
                zrecznosc.summary/10);
        super.poziom += 1;
    }

}

class SluchAbsolutny extends Talent{
    public SluchAbsolutny(Attribute inicjatywa) {
        super("Słuch Absolutny",
                "Jesteś w stanie dokładnie powtórzyć i zidentyfikować notację nutową. Co więcej, dodaj Umiejętność Występy (Śpiewanie) do listy Umiejętności swojej każdej bieżącej Profesji, a jeśli znajduje się ona na liście, koszt każdego Rozwinięcia spada o 5 PD.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class Snajper extends Talent{
    public Snajper() {
        super("Snajper",
                "Kiedy strzelasz, odległość nie ma dla ciebie znaczenia. Eliminujesz cele z taką samą łatwością, jakby były niedaleko. Strzelanie na daleki zasięg nie wiąże się dla ciebie z żadnymi negatywnymi modyfikatorami, a na bardzo daleki oznacza tylko połowiczne modyfikatory.",
                4);
        super.poziom += 1;
    }

}

class Sprezynka extends Talent{
    public Sprezynka() {
        super("Sprężynka",
                "Ciebie nie da się obalić na ziemię. Możesz wykonać Wymagający (+0) Test Atletyki, by natychmiast wstać po tym, jak nałożony zostanie na ciebie Stan Powalony. Ten Test Atletyki jest modyfikowany przez siłę uderzenia, które posłało cię na ziemię. Za każde 10 punktów Siły wroga ponad twoją Wytrzymałość otrzymujesz modyfikator -10 do Testu Atletyki. Jeśli Siła przeciwnika była niższa od twojej Wytrzymałości, otrzymujesz +10 za każde 10 punktów różnicy.",
                1);
        super.poziom += 1;
    }

}

class Straszny extends Talent{
    public Straszny(Attribute sila) {
        super("Straszny",
                "Każdy przy zdrowych zmysłach pomyśli dwa razy, zanim do ciebie podejdzie. Możesz zadecydować, że w danej sytuacji wzbudzasz Strach na poziomie 1 (patrz strona 190). Każde wykupienie tego Talentu podwyższa siłę Strachu o +1.",
                sila.summary/10);
        super.poziom += 1;
    }

}

class StrzalPrzebijajacy extends Talent{
    public StrzalPrzebijajacy(Attribute inicjatywa) {
        super("Strzał Przebijający",
                "Wiesz, jak odszukać słaby punkt w pancerzu obranego celu. Kiedy trafisz, wykonując Test Broni Zasięgowej, możesz zignorować tyle Punktów Pancerza wroga, ile razy wykupiłeś ten Talent.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class StrzalWDziesiatke extends Talent{
    public StrzalWDziesiatke() {
        super("Strzał w Dziesiątkę",
                "Strzelasz celnie w cel niezależnie od jego wielkości. Dzięki temu nie mają na ciebie wpływu negatywne modyfikatory strzelania, wynikające z rozmiaru celu.",
                1);
        super.poziom += 1;
    }

}

class StrzelecWyborowy extends Talent{
    public StrzelecWyborowy(Attribute umiejetnosci_strzeleckie) {
        super("Strzelec Wyborowy",
                "Otrzymujesz stałą premię +5 do początkowych Umiejętności Strzeleckich, która nie liczy się do sumy Rozwinięć.",
                1);
        super.poziom += 1;
        change(umiejetnosci_strzeleckie);
    }

    void change(Attribute umiejetnosci_strzeleckie) {
        umiejetnosci_strzeleckie.starting += 5;
    }
}

class SzalBojowy extends Talent{
    public SzalBojowy() {
        super("Szał Bojowy",
                "Możesz wpaść w Szał Bojowy, co opisano na stronie 190.",
                1);
        super.poziom += 1;
    }

}

class Szczescie extends Talent{
    public Szczescie(Attribute oglada) {
        super("Szczęście",
                "Powiadają, że kiedy się rodziłeś, Ranald się uśmiechnął. Maksymalna liczba twoich Punktów Szczęścia jest równa sumie liczby Punktów Przeznaczenia i liczby wykupień tego Talentu.",
                oglada.summary/10);
        super.poziom += 1;
    }

}

class SzczurTunelowy extends Talent{
    public SzczurTunelowy(Attribute zwinnosc) {
        super("Szczur Tunelowy",
                "W tunelach, kanałach ściekowych i pod powierzchnią ziemi jesteś na swoim terenie. Kiedy wykorzystujesz w takich warunkach Umiejętność Skradanie, istotom wokoło nie przysługuje pasywny Test Percepcji. Zauważyć cię mogą dopiero wtedy, gdy będą cię czynnie wyglądały lub szukały ukrytych przeciwników.",
                zwinnosc.summary/10);
        super.poziom += 1;
    }

}

class SzostyZmysl extends Talent{
    public SzostyZmysl(Attribute inicjatywa) {
        super("Szósty Zmysł",
                "Masz niepokojące przeczucia, kiedy coś ci grozi, i umiesz odpowiednio na nie zareagować. MG może cię ostrzec, kiedy znajdujesz się w sytuacji, w której może stać ci się krzywda, jeśli powiedzie się sekretny Test Intuicji wykonany w twoim imieniu. Co więcej, jeżeli uda ci się Test Intuicji, nie jesteś zaskoczony.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class Szuler extends Talent{
    public Szuler(Attribute inteligencja) {
        super("Szuler",
                "Przywykłeś do tego, że w grze w karty zwykle wygrywasz, choć twoje metody mogą być odrobinę nieuczciwe. Jeśli powiedzie ci się Test Hazardu lub Zwinnych Palców, możesz wybrać, czy skorzystaćz normalnie uzyskanych PS, czy ich liczbę wyznaczyć, korzystając z cyfry jedności rzutu. W ten sposób wynik udanego Testu 28 oznaczałby uzyskanie +8 PS. Jeśli na sesji rzeczywiście używacie kart, możesz otrzymać w rozdaniu dodatkową liczbę kart, równą liczbie wykupień tego Talentu, wybrać najlepsze i odłożyć tyle, byś miał na ręku odpowiednią liczbę.",
                inteligencja.summary/10);
        super.poziom += 1;
    }

}

class SzulerKosciany extends Talent{
    public SzulerKosciany(Attribute inteligencja) {
        super("Szuler Kościany",
                "Jesteś mistrzem gry w kości, a zarzuty oszustwa są nieuzasadnione. Kiedy z powodzeniem używasz Umiejętności Hazard czy Zwinne Palce podczas gry w kości, możesz albo zachować obliczoną normalnie liczbę PS, albo określić ich liczbę przez wynik na kości jedności. W ten sposób wynik rzutu 06 może oznaczać +6 PS. Jeśli podczas sesji będziecie naprawdę grali w kości, rzucasz tyloma więcej, ile razy wykupiłeś ten Talent, i wybierasz najlepsze rezultaty.",
                inteligencja.summary/10);
        super.poziom += 1;
    }

}

class SzybkiRefleks extends Talent{
    public SzybkiRefleks(Attribute zwinnosc) {
        super("Szybki Refleks",
                "Zyskujesz premię +5 do początkowej wartości Zwinności. Nie liczy się ona do sumy Rozwinięć.",
                1);
        super.poziom += 1;
        change(zwinnosc);
    }

    void change(Attribute zwinnosc) {
        zwinnosc.starting += 5;
    }
}

class SzybkieCzytanie extends Talent{
    public SzybkieCzytanie(Attribute inteligencja) {
        super("Szybkie Czytanie",
                "Czytasz księgi z zadziwiającą szybkością. Możesz odwrócić kolejność kości nieudanego Testu Badań Naukowych, jeśli to przyniesie ci sukces. Jeżeli szybkie przeczytanie tekstu odgrywa rolę podczas walki, to w ciągu Rundy możesz przeanalizować tyle stron, ile PS uzyskasz dzięki udanemu Testowi Języków plus tyle, ile razy wykupiłeś ten Talent (minimum jedną, jeśli Test się nie powiódł).",
                inteligencja.summary/10);
        super.poziom += 1;
    }

}

class SzybkiePrzeladowanie extends Talent{
    public SzybkiePrzeladowanie(Attribute zrecznosc) {
        super("Szybkie Przeładowanie",
                "Potrafisz z łatwością przeładowywać bronie strzeleckie. Dodaj PS równe liczbie wykupień tego Talentu do Testów przeładowania broni dystansowej.",
                zrecznosc.summary/10);
        super.poziom += 1;
    }

}

class Szybkobiegacz extends Talent{
    public Szybkobiegacz(Attribute sila) {
        super("Szybkobiegacz",
                "Żwawo przebierasz nogami. Podczas Biegu twoja Szybkość jest traktowana, jakby była o 1 wyższa.",
                sila.summary/10);
        super.poziom += 1;
    }

}

class Szycha extends Talent{
    public Szycha() {
        super("Szycha",
                "Pomimo powiązań z półświatkiem otacza cię aura szacunku. Twojej postaci nie dotyczy utrata Statusu spowodowana przez Talent Przestępca.",
                1);
        super.poziom += 1;
    }

}

class SwietnyPlywak extends Talent{
    public SwietnyPlywak(Attribute sila) {
        super("Świetny Pływak",
                "Bardzo dobrze pływasz i potrafisz na długo wstrzymać oddech pod wodą. Kiedy obliczasz, jak długo jesteś w stanie wytrzymać pod powierzchnią wody, do Bonusu z Wytrzymałości dodaj liczbę wykupień tego Talentu.",
                sila.summary/10);
        super.poziom += 1;
    }

}

class SwietaNienawisc extends Talent{
    public SwietaNienawisc(Attribute oglada) {
        super("Święta Nienawiść",
                "Twoje modlitwy ociekają nienawiścią wobec bluźnierców. Swoimi cudami zadajesz +1 punkt obrażeń za każde wykupienie tego Talentu.",
                oglada.summary/10);
        super.poziom += 1;
    }

}

class SwieteWizje extends Talent{
    public SwieteWizje(Attribute inicjatywa) {
        super("Święte Wizje",
                "Wyraźnie widzisz boskie dzieła wokół siebie. Zawsze wiesz, kiedy wkraczasz na świętą ziemię, i możesz wykonać Test Intuicji, by zstąpiła na ciebie wizja (często niejasna i postrzegana przez paradygmat twojej wiary lub osobistych wartości) opisująca okolicę i to, co najważniejszego się w niej wydarzyło w przeszłości.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class TalentArtystyczny extends Talent{
    public TalentArtystyczny(Attribute zrecznosc) {
        super("Talent Artystyczny",
                "Posiadasz wrodzoną smykałkę do którejś z dziedzin sztuki. Szkice czy wprawki jesteś w stanie zrobić praktycznie od ręki, pod warunkiem, że posiadasz odpowiednie przybory. Swój talent możesz spożytkować na wiele sposobów: narysować afisz z wizerunkiem ściganego, prowadzić dokładne dzienniki graficzne lub wykorzystać go w inny, zaaprobowany przez MG, sposób. Co więcej, dodajesz Umiejętność Sztuka (Dowolna) do swojej każdej bieżącej Profesji, a jeśli znajduje się ona na liście, koszt każdego Rozwinięcia spada o 5 PD.",
                zrecznosc.summary/10);
        super.poziom += 1;
    }

}

class Tarczownik extends Talent{
    public Tarczownik(Attribute sila) {
        super("Tarczownik",
                "Potrafisz tak posługiwać się tarczą, by wrogowie znaleźli się tam, gdzie chcesz, i umiesz wykorzystywać wynikającą z tego przewagę. Jeśli używasz tarczy do obrony i przegrasz Test Przeciwstawny, to mimo wszystko zyskujesz tyle punktów Przewagi, ile razy masz wykupiony ten Talent.",
                sila.summary/10);
        super.poziom += 1;
    }

}

class Towarzyski extends Talent{
    public Towarzyski(Attribute oglada) {
        super("Towarzyski",
                "Po prostu lubisz sobie pogadać z ludźmi, a oni z tobą. Możesz odwrócić kolejność kostek nieudanego Testu Plotkowania, jeśli nowy wynik będzie oznaczał udany Test.",
                oglada.summary/10);
        super.poziom += 1;
    }

}

class Tragarz extends Talent{
    public Tragarz(Attribute sila) {
        super("Tragarz",
                "Twoje krępe ciało świetnie nadaje się do tego, by dźwigać ciężary. Liczba punktów obciążenia, które możesz nosić, zwiększa się o liczbę wykupień tego Talentu x2.",
                sila.summary/10);
        super.poziom += 1;
    }

}

class Traper extends Talent{
    public Traper(Attribute inicjatywa) {
        super("Traper",
                "Wiesz, jak używać wnyków, i możesz wykonać Test Percepcji, by je zauważyć, bez konieczności deklarowania poszukiwań. MG będzie pewnie wolał wykonać go samemu, na wypadek gdyby rzut okazał się nieudany.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class Twardziel extends Talent{
    public Twardziel(Attribute wytrzymalosc) {
        super("Twardziel",
                "Na stałe zwiększasz swoją Żywotność o Bonus z Wytrzymałości. Jeśli ten się zwiększy, wraz z nim wzrośnie również twoja Żywotność wynikająca z tego Talentu.",
                wytrzymalosc.summary/10);
        super.poziom += 1;
    }

}

class Ulicznik extends Talent{
    public Ulicznik(Attribute inicjatywa) {
        super("Ulicznik",
                "Wśród cieni zaułków czujesz się jak w domu. Kiedy wykorzystujesz Umiejętność Skradanie (Miasto) i jeśli Test ci się nie powiedzie, możesz zamienić kolejność kości, jeśli nowy wynik zapewniłby ci sukces.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class UrodzonyWSiodle extends Talent{
    public UrodzonyWSiodle(Attribute zwinnosc) {
        super("Urodzony w Siodle",
                "W siodle czujesz się jak w domu i nie straszne ci najtrudniejsze warunki. Wiesz, jak najlepiej wykorzystać wierzchowca w walce. Jeśli posiadasz Umiejętność Jeździectwo, możesz pokierować koniem tak, by podjął Akcję, a nie tylko wykonywał Ruch. Nie musisz w tym celu wykonywać do tego Testu Jeździectwa.",
                zwinnosc.summary/10);
        super.poziom += 1;
    }

}

class UrodzonyWojownik extends Talent{
    public UrodzonyWojownik(Attribute walka_wrecz) {
        super("Urodzony Wojownik",
                "Twoja początkowa Walka Wręcz zostaje na stałe podniesiona o +5, co nie liczy się do sumy twoich Rozwinięć.",
                walka_wrecz.summary/10);
        super.poziom += 1;
        change(walka_wrecz);
    }

    void change(Attribute walka_wrecz) {
        walka_wrecz.starting += 5;
    }
}


class UrodzonyZeglarz extends Talent{
    public UrodzonyZeglarz(Attribute wytrzymalosc) {
        super("Urodzony Żeglarz",
                "Przywykłeś do kołysania fal morskich i mało prawdopodobne, byś zachorował na chorobę morską, nawet podczas najsilniejszych sztormów. W spokojnych warunkach nie musisz przeprowadzać Testu, by sprawdzić, czy na morzu chwycą cię mdłości. Gdy rozpęta się sztorm lub gdy chorobę morską powoduje magia, nie dotyczą cię modyfikatory negatywnie wpływające na opieranie się tej przypadłości.",
                wytrzymalosc.summary/10);
        super.poziom += 1;
    }

}

class WaleczneSerce extends Talent{
    public WaleczneSerce(Attribute wytrzymalosc) {
        super("Waleczne Serce",
                "Nieważne, jak fatalne jest twoje położenie, ty się po prostu nie poddajesz. Na koniec swojej Tury i na koniec całej Rundy możesz wykonać Test Opanowania, by otrząsnąć się ze Stanu Panika (patrz strona 168).",
                wytrzymalosc.summary/10);
        super.poziom += 1;
    }

}

class WalkaWCiasnocie extends Talent{
    public WalkaWCiasnocie(Attribute zwinnosc) {
        super("Walka w Ciasnocie",
                "Nauczyłeś się, jak najlepiej wykorzystywać w walce zamknięte przestrzenie. Nie dotyczą cię modyfikatory do Testów Broni Białej wynikające z walki w ciasnocie tuneli, okopów, jam gladiatorskich i im podobnych. Co więcej, możesz wykonywać Unik nawet wtedy, gdy nie mógłbyś tego zrobić z braku miejsca.",
                zwinnosc.summary/10);
        super.poziom += 1;
    }

}

class WidzenieWCiemnosci extends Talent{
    public WidzenieWCiemnosci(Attribute inicjatywa) {
        super("Widzenie w Ciemności",
                "Bardzo dobrze widzisz w naturalnych ciemnościach. Jeśli masz źródło choćby słabego blasku (światło gwiazd, księżyca czy bioluminescencję), widzisz wyraźnie na 20 metrów na każde wykupienie tego Talentu. To nie koniec. Dla ciebie oświetlenie okolicy sięga dalej o 20 metrów na każde wykupienie tego Talentu.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class WiezaPamieci extends Talent{
    public WiezaPamieci(Attribute inteligencja) {
        super("Wieża Pamięci",
                "Ta technika pamięciowa została opracowana przez kult Vereny, a swoje korzenie ma w praktykach elfich mistrzów wiedzy z Hoeth. Wieża Pamięci pozwala ci bezbłędnie przypomnieć sobie fakty i wydarzenia, ponieważ kolekcjonujesz je w wyimaginowanej wieży. Przywoływanie sekwencji tylu wspomnień, ile wynosi twoja Inteligencja, nie wymaga żadnego Testu, ale zapamiętywanie każdych dodatkowych 10 informacji wymaga Testu Inteligencji o zwiększającym się stopniu trudności, by je sobie poprawnie przypomnieć. Stopień trudności zaczyna się od Bardzo Łatwego (+60) dla 10 faktów, później staje się Łatwy (+40) dla 20, Przeciętny (+20) dla 30 i tak dalej. Jednym z najoczywistszych zastosowań tego Talentu są gry hazardowe, Talent może dać premię od +20 do +60 do Testów Umiejętności Hazard, w zależności od tego, jak bardzo pomocna w grze jest pamięć. MG może uznać, że Wieża Pamięci przyda się w innych sytuacjach, odpowiednio modyfikując Testy. Za każdym razem, gdy wykupujesz ten Talent, możesz zapamiętać dodatkową sekwencję (odpowiednią wartości Inteligencji) faktów bez potrzeby usuwania z pamięci poprzedniej.",
                inteligencja.summary/10);
        super.poziom += 1;
    }

}

class WilkMorski extends Talent{
    public WilkMorski(Attribute zwinnosc) {
        super("Wilk Morski",
                "Jesteś doświadczonym żeglarzem i przywykłeś do życia na morzu. Nie dotyczą cię negatywne modyfikatory do Testów spowodowane przez kiepską pogodę, kołysanie statku itp. Co więcej, liczysz się za dwóch członków załogi, gdy trzeba obsadzić jednostkę wychodzącą w morze.",
                zwinnosc.summary/10);
        super.poziom += 1;
    }

}

class WladczaPostura extends Talent{
    public WladczaPostura(Attribute oglada) {
        super("Władcza Postura",
                "Twoja fizjonomia powoduje u innych cichy podziw i zachwyt. Aura władczości sprawia, że ci o niższym Statusie nie mogą przeciwstawiać się swoją Siłą Woli, gdy inicjujesz Test Dowodzenia. Wrogowie będą bardziej oporni na działanie twej aury, ale pospolity gmin rzadko ośmieli się sprzeciwić.",
                oglada.summary/10);
        super.poziom += 1;
    }

}

class Wloczykij extends Talent{
    public Wloczykij(Attribute zrecznosc) {
        super("Włóczykij",
                "W dziczy czujesz się jak u siebie i kiedy wykorzystujesz Umiejętność Skradanie, inni nie mogą wykonywać biernych Testów Percepcji, by cię zauważyć. Mogą im one przysługiwać, jeśli przeciwnicy stoją na straży lub wypatrują ukrytych napastników.",
                zrecznosc.summary/10);
        super.poziom += 1;
    }

}

class Wodniak extends Talent{
    public Wodniak(Attribute zwinnosc) {
        super("Wodniak",
                "Jesteś doświadczonym żeglarzem śródlądowym i jak mało kto znasz się na jednostkach rzecznych. Kiedy jesteś na pokładzie jednej z nich, nie stosują się do ciebie negatywne modyfikatory wynikające z falowania wód, kołysania pokładu, niepewnego podłoża itp. Co więcej, liczysz się za dwóch członków załogi, gdy trzeba zapewnić minimalną liczbę członków załogi, by wypłynąć na rzekę.",
                zwinnosc.summary/10);
        super.poziom += 1;
    }

}

class Woltyzerka extends Talent{
    public Woltyzerka(Attribute zwinnosc) {
        super("Woltyżerka",
                "Jesteś w stanie wykonywać nieprawdopodobne rzeczy na końskim grzbiecie. W siodle możesz podejmować Testy Umiejętności Kuglarstwo i nie masz ujemnych modyfikatorów do Uniku. Co więcej, kiedy jesteś na koniu, możesz wykonać Ruch na początku Rundy, a nie w swojej Turze.",
                zwinnosc.summary/10);
        super.poziom += 1;
    }

}

class Wodz extends Talent{
    public Wodz(Attribute oglada) {
        super("Wódz",
                "Twój niewzruszony wzrok i inspirujące słowa popychają żołnierzy do jeszcze zacieklejszej walki. Podkomendni, którzy cię widzą, w jednym Teście Siły Woli na Rundę zyskują dodatkowe PS równe temu, ile razy masz wykupiony ten Talent. Dany wojownik może korzystać z premii tylko jednego dowódcy naraz.",
                oglada.summary/10);
        super.poziom += 1;
    }

}

class WrozbaLosu extends Talent{
    public WrozbaLosu() {
        super("Wróżba Losu",
                "Gdy miałeś 10 lat kapłan Morra, zwany Czarnowidzem, zabrał cię do siebie, by na osobności przepowiedzieć ci twą zgubę. Dokonało się to podczas obrzędu w oparach kadzidła, nazywanego Wróżbą Losu. Omówcie tę sprawę z MG i wymyślcie coś odpowiedniego. Jeśli twoja postać zginie w okolicznościach, które przypominają te z przepowiedni, kolejna postać którą stworzysz otrzymuje połowę jej punktów doświadczenia, które pierwsza zdobyła podczas gry.",
                1);
        super.poziom += 1;
    }

}

class Wstrzemiezliwy extends Talent{
    public Wstrzemiezliwy(Attribute wytrzymalosc) {
        super("Wstrzemięźliwy",
                "Przywykłeś do tego, że jesz niewiele, i potrafisz przetrwać chude czasy. Jedząc połowę tego, co potrzebujesz, nie odczuwasz negatywnych skutków głodowania, chociaż jesteś nieco rozdrażniony. Testy głodu wykonujesz co 3 dni, a nie co 2 (patrz strona 181).",
                wytrzymalosc.summary/10);
        super.poziom += 1;
    }

}

class WscieklyAtak extends Talent{
    public WscieklyAtak(Attribute zwinnosc) {
        super("Wściekły Atak",
                "Lawinowo zadajesz ciosy, zasypując wroga furią Ulryka. Raz na Rundę, jeśli trafisz przeciwnika w Walce Wręcz, możesz zużyć Przewagę albo spożytkować Ruch (zakładając, że w tej Rundzie możesz się jeszcze ruszyć), by wykonać od razu dodatkowy atak.",
                zwinnosc.summary/10);
        super.poziom += 1;
    }

}

class WtargniecieZWlamaniem extends Talent{
    public WtargniecieZWlamaniem(Attribute sila) {
        super("Wtargnięcie z Włamaniem",
                "Jesteś ekspertem od wykopywania drzwi z zawiasów i niszczenia sprzętów. Zadajesz +1 punkt obrażeń za każdy wykupiony Talent Wtargnięcie z Włamaniem, kiedy próbujesz wybić okna, wyważyć drzwi, podważyć wieko skrzyni itp.",
                sila.summary/10);
        super.poziom += 1;
    }

}

class WybornyWspinacz extends Talent{
    public WybornyWspinacz(Attribute sila) {
        super("Wyborny Wspinacz",
                "Jesteś świetny we wdrapywaniu się i chodzeniu po górach. Możesz próbować wspinać się na z pozoru niezdobyte zbocza czy szczyty. Nie straszne ci zamkowe blanki, szelfy lodowe, gipsowane ścianyi im podobne. Nie tyczą się ciebie negatywne modyfikatory Wspinaczki, wymuszane przez trudność, jaką sprawia powierzchnia, po której się pniesz.",
                sila.summary/10);
        super.poziom += 1;
    }

}

class WyczucieKierunku extends Talent{
    public WyczucieKierunku(Attribute inicjatywa) {
        super("Wyczucie Kierunku",
                "Instynktownie wyczuwasz kierunki świata. Zawsze wiesz, gdzie jest północ, jeśli tylko możesz zerknąć na gwiazdy, drzewa czy jakąkolwiek inną wskazówkę.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class WyczulonyZmysl extends Talent{
    public WyczulonyZmysl(Attribute inicjatywa) {
        super("Wyczulony Zmysł",
                "Jeden z twoich pięciu zmysłów jest tak wyczulony, że wyczuwasz to, co umyka innym. Możesz wykonać Test Percepcji, by dowiedzieć się czegoś więcej niż inni, opierając się na tym szczególnym zmyśle. Przykładowo może to być dostrzeżenie dalekiego orła, którego nie widzą inni, wywęszenie prawie niewyczuwalnej trucizny, dosłyszenie bicia serca myszy kryjącej się w ścianie, wyczucie dotykiem ukrytej wiadomości wyskrobanej na papierze czy porównanie smaku dwóch piw od tego samego piwowara, by dowiedzieć się, czy zostały nalane z dwóch różnych beczek.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class WykrywanieMagii extends Talent{
    public WykrywanieMagii(Attribute inicjatywa) {
        super("Wykrywanie Magii",
                "Potrafisz wyczuć obecność Wiatrów Magii w innych. Możesz wykonać Przeciętny (+20) Test Intuicji, gdy spotykasz się z osobą władającą czarami. Jeśli się on powiedzie, wyczuwasz jej zdolności. To nie wszystko, jeśli osiągniesz Zdumiewający (+6) Sukces możesz także określić najwyższą Specjalizację Splatania Magii tej osoby.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class Wytrwaly extends Talent{
    public Wytrwaly(Attribute wytrzymalosc) {
        super("Wytrwały",
                "Bez względu na okoliczności i powagę sytuacji ty przenigdy się nie poddajesz. Podwajasz czas opierania się przeciwnościom, zapewniany przez udany Test Odporności. Wytrzymujesz długą jazdę, wystawienie na warunki atmosferyczne, rytuały i tym podobne trudności.",
                wytrzymalosc.summary/10);
        super.poziom += 1;
    }

}

class Wytworca extends Talent{
    public Wytworca(Attribute zrecznosc) {
        super("Wytwórca",
                "Jesteś prawdziwie uzdolniony. Dodaj rzemiosło powiązane z tym Talentem do listy Umiejętności aktualnej Profesji. Jeśli już wcześniej było na niej wymienione, za każde jego Rozwinięcie płacisz 5 PD mniej.",
                zrecznosc.summary/10);
        super.poziom += 1;
    }

}

class ZBata extends Talent{
    public ZBata(Attribute zrecznosc) {
        super("Z Bata",
                "Wiesz, jak zmusić zwierzę do większego wysiłku. Kiedy Ucieka ono lub Biegnie, jego szybkość zwiększa się o +1, gdy popędzasz je batem lub biczem.",
                zrecznosc.summary/10);
        super.poziom += 1;
    }

}

class Zabojca extends Talent{
    public Zabojca() {
        super("Zabójca",
                "Kiedy określasz wysokość obrażeń, możesz wykorzystać Bonus z Wytrzymałości wroga zamiast swojego Bonusu z Siły, oczywiście jeśli jest wyższy. Musisz to zrobić, zanim zmodyfikujesz swoją Siłę lub wynikający z niej modyfikator. Co więcej, jeśli twój wróg jest od ciebie większy, a ty zadasz Trafienie Krytyczne (patrz strona 159), pomnóż zadawane obrażenia o tyle kategorii wielkości, ile was dzieli. Na przykład: dwie kategorie oznaczają obrażenia x2, trzy kategorie obrażenia x3 i tak dalej. Mnożnik jest określany i stosowany dopiero po uwzględnieniu wszystkich innych modyfikatorów. Więcej informacji na temat rozmiaru znajduje się na stronie 340.",
                1);
        super.poziom += 1;
    }

}

class ZbicieBroni extends Talent{
    public ZbicieBroni(Attribute walka_wrecz) {
        super("Zbicie Broni",
                "Zostałeś wyszkolony w zadawaniu krótkich i gwałtownych uderzeń w oręż przeciwnika, dzięki czemu możesz sam zaatakować lub powstrzymać nadchodzący cios. W ramach swojej Akcji możesz zadeklarować Zbicie Broni przed rzutem. Wykonaj Test Broni Białej, a jeśli się powiedzie, twój przeciwnik traci -1 Przewagę oraz kolejną -1 za każdy twój PS. Ten Test nie jest Testem Przeciwstawnym. Nie możesz korzystać z tego Talentu, jeśli wrogowie nie używają broni lub są większego rozmiaru niż ty (patrz strona 340).",
                walka_wrecz.summary/10);
        super.poziom += 1;
    }

}

class ZejscieZLinii extends Talent{
    public ZejscieZLinii(Attribute zwinnosc) {
        super("Zejście z Linii",
                "Wiesz, jak znaleźć się tam, gdzie nie sięga oręż wroga. Jeśli wykorzystujesz Umiejętność Unik, by zejść z linii ciosu, i wygrasz Test Przeciwstawny, możesz poruszyć się na odległość do 2 metrów i nie liczysz się jako związany walką. Przeciwnicy nie mogą wykonać przeciwko tobie darmowych ataków.",
                zwinnosc.summary/10);
        super.poziom += 1;
    }

}

class ZimnaKrew extends Talent{
    public ZimnaKrew(Attribute sila_woli) {
        super("Zimna Krew",
                "Zyskujesz premię +5 do początkowej wartości Siły Woli, co nie wlicza się do sumy Rozwinięć.",
                1);
        super.poziom += 1;
        change(sila_woli);
    }

    void change(Attribute sila_woli) {
        sila_woli.starting += 5;
    }
}

class ZlotaRaczka extends Talent{
    public ZlotaRaczka(Attribute zrecznosc) {
        super("Złota Rączka",
                "Jesteś w stanie naprawić dosłownie wszystko, a kiedy coś reperujesz, traktujesz wszystkie niemagiczne Umiejętności Rzemiosła jako podstawowe.",
                zrecznosc.summary/10);
        super.poziom += 1;
    }

}

class ZmyslBitewny extends Talent{
    public ZmyslBitewny(Attribute inicjatywa) {
        super("Zmysł Bitewny",
                "Szybki rzut oka na pole bitwy pozwala ci błyskawicznie ocenić sytuację i podjąć decyzję, co robić. Możesz wykonać Wymagający (+0) Test Percepcji, by nie być zaskoczonym. Trudność tego Testu może być modyfikowana przez warunki na polu walki.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class ZmyslMagii extends Talent{
    public ZmyslMagii(Attribute inicjatywa) {
        super("Zmysł Magii",
                "Twoje doświadczenie, wrodzony talent i wyszkolenie pozwalają ci bezpiecznie manipulować Wiatrami Magii. Jeśli rzucisz dublet podczas udanego Testu Splatania Magii, nie działa na ciebie zasada manifestacji.",
                inicjatywa.summary/10);
        super.poziom += 1;
    }

}

class Znawca extends Talent{
    String wiedza;
    public Znawca (Attribute inteligencja, String wiedza) {
        super("Znawca",
                "Jesteś prawdziwym ekspertem w wybranej dziedzinie wiedzy. Automatycznie potrafisz przytoczyć tyle poprawnych informacji na dany temat, ile razy wykupiłeś ten Talent, i nie musisz wykonywać Testu Wiedzy. Udany da ci dodatkowe wiadomości, określane przez MG według normalnych zasad.",
                inteligencja.summary/10);
        super.poziom += 1;
        this.wiedza = wiedza;
    }

}

class Zreczny extends Talent{
    public Zreczny(Attribute zrecznosc) {
        super("Zręczny",
                "Zyskujesz premię +5 do początkowej wartości Zręczności. Nie liczy się ona do sumy Rozwinięć.",
                1);
        super.poziom += 1;
        change(zrecznosc);
    }

    void change(Attribute zrecznosc) {
        zrecznosc.starting += 5;
    }
}

class ZelaznaSzczeka extends Talent{
    public ZelaznaSzczeka(Attribute wytrzymalosc) {
        super("Żelazna Szczęka",
                "Jesteś twardy i potrafisz wytrzymać najsilniejsze ciosy. Jeśli jakiś efekt nakłada na postać co najmniej jeden Stan Oszołomienie, gracz może wykonać Wymagający (+0) Test Wytrzymałości, by go zignorować. Każdy PS pozwala ci uniknąć dodatkowego Stanu.",
                wytrzymalosc.summary/10);
        super.poziom += 1;
    }

}

class ZelaznaWola extends Talent{
    public ZelaznaWola(Attribute sila_woli) {
        super("Żelazna Wola",
                "Masz w sobie niezłomną wolę i sam z siebie nigdy się nie cofniesz. Wykorzystanie przeciwko tobie Zastraszania nie powoduje u ciebie Strachu i nie uciszy cię w wygłaszaniu poglądów przeciwko agresorom.",
                sila_woli.summary/10);
        super.poziom += 1;
    }

}

class Zylkahandlowa extends Talent{
    public Zylkahandlowa(Attribute oglada) {
        super("Żyłka Handlowa",
                "Jesteś sprawnym przekupniem i znasz sposoby na dobicie targu. Kiedy używasz Umiejętności Targowanie, obniżasz lub podwyższasz cenę o dodatkowe 10%.",
                oglada.summary/10);
        super.poziom += 1;
    }

}