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

    void change() {};
}

class Aptekarz extends Talent{
     public Aptekarz (Character character) {
        super("Aptekarz",
                "Jesteś świetnym aptekarzem i lepiej od innych wyrabiasz pigułki, maści, smarowidła, olejki, kremy i im podobne. Możesz odwrócić kolejność kości nieudanego Testu Rzemiosła (Aptekarstwa), jeśli nowy wynik pozwoli ci odnieść sukces.",
                character.inteligencja/10);
        super.poziom += 1;
    }

    void change() {
    }
}

class Arcydzielo extends Talent{
    public Arcydzielo (Character character) {
        super("Arcydzieło",
                "Jesteś niekwestionowanym mistrzem w swojej dziedzinie, tworzącym dzieła tak złożone, że inni mogą je tylko podziwiać, zachwycając się twoim geniuszem. Za każdym razem, gdy wykupujesz ten Talent, tworzysz niezwykłe dzieło, wykorzystując Umiejętność Sztuka lub Rzemiosło. Nie ma ono sobie równych, będzie po wieki inspirowało, zadziwiało i budziło zachwyt swoją wyjątkowością. MG określa premie, które ci przysługują z tej racji. Zwykle wpływają one na Testy Ogłady w  ontaktach z tymi, którzy podziwiają twoją sztukę. Sprzedaż dzieła powinna dać ci przynajmniej dziesięciokrotną wartość zwykłej ceny, a czasami nawet więcej.",
                100000);
        super.poziom += 1;
    }

    void change() {

    }
}

class Artylerzysta extends Talent{
    public Artylerzysta (Character character) {
        super("Artylerzysta",
                "Z łatwością przeładowujesz broń prochową. Dodaj PS równe liczbie wykupień tego Talentu do każdego Wydłużonego Testu związanego z przeładowaniem broni prochowej.",
                character.zrecznosc/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class AtakWyprzedzajacy extends Talent{
    public AtakWyprzedzajacy (Character character) {
        super("Atak Wyprzedzający",
                "Twoje błyskawiczne ciosy pozwalają na powalenie przeciwników, zanim oni sami zdążą zaatakować. Kiedy wróg na ciebie Szarżuje, wykonaj udany Wymagający (+0) Test Inicjatywy, by natychmiast wykonać Darmowy Atak poza normalną kolejnością  undy. Używasz broni, którą trzymasz w wiodącej ręce. Możesz wykonać tyle Ataków Wyprzedzających w Rundzie, ile razy wykupiłeś ten Talent, ale tylko raz na każdego szarżującego.",
                character.inicjatywa/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Atrakcyjny extends Talent{
    public Atrakcyjny (Character character) {
        super("Atrakcyjny",
                "Może to przenikliwe spojrzenie lub zgrabna sylwetka, a może to, jak w uśmiechu odsłaniasz biel swoich zębów. Wiesz, jak najlepiej pokazać to, czym obdarzyli cię bogowie. Jeżeli uda ci się Test Charyzmy wobec osób, którym się podobasz,  możesz obliczyć PS normalnie albo uzyskać ich tyle, ile wypadło na kostce jedności. Na przykład udany Test przy wyrzuceniu 38 oznaczałby wtedy 8 PS.",
                character.oglada/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class BardzoSilny extends Talent{
    public BardzoSilny (Character character) {
        super("Bardzo Silny",
                "Twoja początkowa Siła zostaje na stałe podniesiona o +5, co nie liczy się do sumy twoich Rozwinięć.",
                1);
        super.poziom += 1;
    }

    void change() {

    }
}

class BardzoSzybki extends Talent{
    public BardzoSzybki (Character character) {
        super("Bardzo Szybki",
                "Twoja Szybkość zwiększa się o +1.",
                1);
        super.poziom += 1;
    }

    void change() {

    }
}

class BerserkerskaSzarza extends Talent{
    public BerserkerskaSzarza (Character character) {
        super("Berserkerska Szarża",
                "Nie licząc się z niebezpieczeństwem, rzucasz się na przeciwników, by pędem i siłą zadawać mocniejsze ciosy. Kiedy Szarżujesz, zadajesz +1 punkt obrażeń we wszystkich atakach Walki Wręcz za każde wykupienie tego Talentu.",
                character.sila/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Biczownik extends Talent{
    public Biczownik (Character character) {
        super("Biczownik",
                "Swój ból ofiarowałeś wyznawanemu bogu. Każdego dnia musisz spędzić pół dzwonu (pół godziny) na modlitwie, otrzymując obrażenia na poziomie liczby wykupień tego Talentu. Jeśli posiadasz Talent Szał Bojowy, to do położenia się na najbliższy spoczynek możesz natychmiast wpaść w Szał Bojowy bez wykonywania Testów.\nSzał Bojowy zostaje dodany do listy Talentów dostępnych dla twojej bieżącej Profesji. Jeśli zaniedbasz biczowanie przez jeden dzień lub pozwolisz, by poszarpana skóra została uleczona, nie będziesz mógł wydawać Punktów Bohatera ani Determinacji, póki się znów nie wybiczujesz.",
                character.wytrzymalosc/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class BitewnaFuria extends Talent{
    public BitewnaFuria (Character character) {
        super("Bitewna Furia",
                "Jesteś w stanie lepiej kontrolować swój Szał Bojowy. Udany Test Opanowania pozwala ci otrząsnąć się z niego na końcu rundy.",
                character.sila_woli/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class BitewnyRefleks extends Talent{
    public BitewnyRefleks (Character character) {
        super("Bitewny Refleks",
                "Reagujesz szybko jak błyskawica, dlatego za każde wykupienie tego Talentu otrzymujesz +10 do Inicjatywy, gdy określana jest kolejność Inicjatywy.",
                character.inicjatywa/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class BlekitnaKrew extends Talent{
    public BlekitnaKrew (Character character) {
        super("Błękitna Krew",
                "Albo urodziłeś się w rodzinie szlacheckiej, albo zostałeś wywyższony już podczas gry. Jeśli jesteś odpowiednio ubrany, inni zawsze traktują cię jak kogoś ze sfer wyższych niż ich, chyba że ktoś z nich także posiada ten Talent. Wtedy normalnie porównuje się Status.",
                1);
        super.poziom += 1;
    }

    void change() {

    }
}

class Blogoslawienstwo extends Talent{
    public Blogoslawienstwo (Character character) {
        super("Błogosławieństwo",
                "Któryś z bogów czuwa nad tobą i odpowiada na twoje proste modlitwy. Możesz wykorzystywać błogosławieństwa swojego pana, co opisano w Rozdziale 7: Religie i wierzenia. Normalnie możesz znać tylko jedną boską tradycję na Talent Błogosławieństwo.",
                1);
        super.poziom += 1;
    }

    void change() {

    }
}

class BlyskawicznyStrzal extends Talent{
    public BlyskawicznyStrzal (Character character) {
        super("Błyskawiczny Strzał",
                "Jeśli posiadasz naładowaną broń dystansową, możesz z niej wystrzelić poza Kolejnością Inicjatywy, zanim zareaguje którykolwiek z uczestników walki. Rzut na trafienie wykonaj z uwzględnieniem wszystkich modyfikatorów. Użycie tego Talentu wymaga poświęcenia zarówno Akcji, jak i Ruchu z nadchodzącej Tury i kiedy nadejdzie twoja kolej, będą one traktowane jako wykorzystane. Jeśli ten Talent chcą wykorzystać dwie lub więcej postaci, pierwsza strzela ta, która wykupiła go więcej razy. Jeśli i na tym polu mamy remis, obydwie postacie strzelają równocześnie i wynik ich ataków powinien być rozliczony jednocześnie.",
                character.zwinnosc/10);
        super.poziom =+ 1;
    }

    void change() {

    }
}

class Blyskotliwosc extends Talent{
    public Blyskotliwosc (Character character) {
        super("Błyskotliwość",
                "Twoja początkowa Inteligencja zostaje zwiększona o +5, co nie liczy się do twojej sumy Rozwinięć.",
                1);
        super.poziom =+ 1;
    }

    void change() {

    }
}

class CelnyStrzal extends Talent{
    public CelnyStrzal (Character character) {
        super("Celny Strzał",
                "Jesteś strzelcem wyborowym i wiesz, gdzie posłać pocisk, by poczynić największe szkody. Używając broni strzeleckich, zadajesz dodatkowe obrażenia, równe liczbie wykupień tego Talentu.",
                character.umiejetnosci_strzeleckie/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Charyzmatyczny extends Talent{
    public Charyzmatyczny (Character character) {
        super("Charyzmatyczny",
                "Twoja początkowa Ogłada zwiększa się na stałe o +5 (co nie wlicza się do sumy Rozwinięć postaci).",
                1);
        super.poziom += 1;
    }

    void change() {

    }
}

class Chirurgia extends Talent{
    public Chirurgia (Character character) {
        super("Chirurgia",
                "Lata nauki trudnego rzemiosła chirurga pozwalają ci dokonywać cudu operacji, zabiegu niezbędnego przy leczeniu najgroźniejszych obrażeń. W opisie wybranych Trafień Krytycznych znajdziecie informację, że wymagają one interwencji chirurga. Właśnie ty jesteś w stanie im zaradzić. Operacja to Wydłużony Wymagający (+0) Test Leczenia. Liczba wymaganych PS jest ustalana przez MG, ale zwykle to 5-10. Podczas procedury zadajesz pacjentowi 1k10 obrażeń i nakładasz na niego Stan Krwawienie za każdym razem, gdy wykonujesz Test. To oznacza, że chory może umrzeć, a szansa na to jest wysoka. Po operacji pacjent musi wykonać Przeciętny (+20) Test Odporności, a jego niepowodzenie oznacza drobną infekcję.",
                character.inteligencja/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Chodu extends Talent{
    public Chodu (Character character) {
        super("Chodu!",
                "Kiedy na szali znajduje się twoje życie, potrafisz niezwykle sprawnie przebierać nogami. Podczas Ucieczki (patrz strona 165) twoja Szybkość jest traktowana, jakby była o 1 wyższa.",
                character.zwinnosc/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Cien extends Talent{
    public Cien (Character character) {
        super("Cień",
                "Wiesz, jak podążać za innymi, by nie zostać na tym przyłapanym. Możesz wykorzystywać zasady śledzenia ze strony 128 bez konieczności wykonywania Testu Łączonego. Wystarczy, że wykonasz rzut na Percepcję lub Skradanie, zależnie od tego, która wartość jest wyższa.",
                character.zwinnosc/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class CiosMierzony extends Talent{
    public CiosMierzony(Character character) {
        super("Cios Mierzony",
                "Czy w walce wręcz, czy strzelając, umiesz trafiać tam, gdzie najbardziej zaboli. Możesz zmodyfikować Miejsce Trafienia +/-10 za każde wykupienie tego Talentu. Na przykład, jeśli kupiłeś go dwa razy, a wynik 34 wskazuje na prawe ramię, to możesz zmniejszyć go do 14 i trafić w lewe ramię lub zwiększyć do 54 i ugodzić w korpus.",
                character.inicjatywa/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class CiosPonizejPasa extends Talent{
    public CiosPonizejPasa (Character character) {
        super("Cios Poniżej Pasa",
                "Nauczyłeś się brudnych sztuczek, stosowanych podczas walki bez broni. Zadajesz +1 punkt obrażeń za każde wykupienie tego Talentu, gdy trafisz przeciwnika, używając Umiejętności Broń Biała (Bijatyka).\\nUwaga: wykorzystanie tego Talentu w pojedynku bokserskim jest uważane za oszustwo.",
                character.walka_wrecz/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Czarownica extends Talent{
    public Czarownica(Character character) {
        super("Czarownica",
                "Sama z siebie nauczyłaś się, jak rzucać czary, często robiąc to metodą prób i błędów. Dodaj Język (Magiczny) do listy Umiejętności każdej bieżącej Profesji. Jeśli się już na niej znajduje, każde Rozwinięcie tej Umiejętności kosztuje cię o 5 PD mniej. Co więcej, możesz w dowolnym momencie wydać Punkt Bohatera, by Twoja postać mogła rzucić wybrane przez ciebie zaklęcie z dowolnej Tradycji Magii Tajemnej. Zostaje ono dodane do listy znanych postaci czarów. Możesz tak uczynić tyle razy, ile razy masz wykupiony ten Talent.",
                character.sila_woli/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class CzlowiekGuma extends Talent{
    public CzlowiekGuma (Character character) {
        super("Człowiek Guma",
                "Jesteś w stanie wyginać swoje ciało i manipulować nim na sposoby, które zdają się przeczyć naturze. Dzięki temu możesz przeciskać się przez niewielkie otwory lub zmuszać kończyny do nieprawdopodobnych rzeczy. Granice tego wyznacza MG i udany Test Zwinności.",
                character.zwinnosc/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Czujny extends Talent{
    public Czujny(Character character) {
        super("Czujny",
                "Swoją początkową Inicjatywę zwiększasz na stałe o +5, co nie liczy się do sumy Rozwinięć twojej postaci.",
                1);
        super.poziom += 1;
    }

    void change() {

    }
}

class CzystaDusza extends Talent{
    public CzystaDusza(Character character) {
        super("Czysta Dusza",
                "Twoja dusza jest nieskalana i odporna na zakusy Chaosu. Zanim będziesz musiał wykonać Test poddania się Zepsuciu, możesz przyjąć dodatkowe jego Punkty w liczbie równej liczbie wykupień tego Talentu.",
                character.sila_woli/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class CzytanieZRuchuWarg extends Talent{
    public CzytanieZRuchuWarg(Character character) {
        super("Czytanie z Ruchu Warg",
                "Patrząc na usta innych, potrafisz dowiedzieć się, co mówią. Jeśli możesz bez przeszkód obserwować dolną część twarzy istoty, wolno ci wykonać Test Percepcji, by zrozumieć, co mówi.",
                character.inicjatywa/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class CzytaniePisanie extends Talent{
    public CzytaniePisanie(Character character) {
        super("Czytanie/Pisanie",
                "Jesteś jednym z nielicznych piśmiennych Staroświatowców. Potrafisz czytać i pisać (o ile to możliwe) w każdym języku, którym umiesz się posługiwać.",
                1);
        super.poziom += 1;
    }

    void change() {

    }
}

class Defraudant extends Talent{
    public Defraudant(Character character) {
        super("Defraudant",
                "Potrafisz podprowadzać pieniądze swoich pryncypałów tak, by tego nie odkryli. Kiedy pozyskujesz dochód podczas zarabiania (w trakcie gry lub oddając się Zajęciu Dochód), możesz wykonać Przeciwstawny Test Inteligencji przeciwko swojemu  pracodawcy (jeśli masz takowego). Jeżeli wygrasz, niepostrzeżenie podprowadzasz 2k10 + PS miedzianych pensów, 1k10 + PS srebrnych szylingów lub 1 + PS złotych koron (w zależności od wysokości obrotów, co jest w gestii MG). Jeśli twój pracodawca wygra o +6 PS, zgarniasz pieniądze, ale zostajesz nakryty. Konsekwencje zależą od MG. Inne wyniki oznaczają, że nie udało ci się zrobić defraudacji i nie ukradłeś żadnych pieniędzy.",
                character.inteligencja/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class DobrzePrzygotowany extends Talent{
    public DobrzePrzygotowany(Character character) {
        super("Dobrze Przygotowany",
                "Dobrze przewidujesz, czego będą potrzebować inni i co przyda się tobie. Tyle razy na sesję, ile razy wykupiłeś ten Talent, możesz wyciągnąć z plecaka lub sakwy niezbędny przedmiot, jeśli jego ciężar w punktach obciążenia wynosi 0, mógł zostać niedawno kupiony i jego posiadanie nie jest czymś niezwykłym. Może to być butelka spirytusu, potrzebna do polania rany kompana, lub gwizdek, którego zabrakło występującemu cyrkowcowi. Kiedy użyjesz tego Talentu, odlicz pieniądze za przedmiot, pokazując tym, że wcześniej go kupiłeś.",
                character.inicjatywa/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class DoswiadczonyWedrowiec extends Talent{
    public DoswiadczonyWedrowiec(Character character) {
        super("Doświadczony Wędrowiec",
                "Masz doświadczenie w wędrówce przez dzicz i potrafisz dobrze wybierać drogę. Nie działają na ciebie negatywne modyfikatory wynikające z wpływu wybranego terenu. Oto lista przykładów: Lasy, Pustynie, Moczary, Teren Kamienisty, Tundra, Wybrzeża.",
                character.zwinnosc);
        super.poziom += 1;
    }

    void change() {

    }
}

class DwieBronie extends Talent{
    public DwieBronie(Character character) {
        super("Dwie Bronie",
                "Kiedy jesteś uzbrojony w dwie bronie, podczas swojej Akcji możesz zaatakować obydwiema naraz. Najpierw wykonaj Test trafienia dla broni, którą trzymasz w wiodącej ręce, a jeśli trafisz, określ normalnie obrażenia. Zostaw kości 1k100 na stole, przydadzą się za chwilę. Skoro pierwszy atak się udał i zostały zadane obrażenia, możesz użyć drugiej broni, by uderzyć jeszcze raz. Wykorzystujesz wynik pierwszego rzutu, ale odwracasz kolejność kostek. I tak rzut na trafienie 34 stanie się 43. Pamiętaj, by obniżyć go o modyfikator wynikający z walki słabszą ręką (-20, chyba że posiadasz Talent Oburęczność). Drugi atak też jest Testem Przeciwstawnym. Twój przeciwnik wykonuje Test obrony, na nowo określane są obrażenia. Wyjątkiem jest sytuacja, gdy pierwszy atak zakończył się Trafieniem Krytycznym. Jeśli tak się stanie, wykorzystaj wynik rzutu w Tabeli Trafień Krytycznych do określenia, czy drugi atak trafił, czy nie. Na przykład, jeśli pierwszy atak trafił przeciwnika krytycznie w głowę, a wynik rzutu w Tabeli Trafień Krytycznych to 56 (Poważna rana oka), to korzystasz z tego rezultatu jako wyniku rzutu na trafienie w drugim ataku. Jeśli atakujesz obydwiema broniami, twoje rzuty na obronę obarczone są modyfikatorem -10 do końca twojej następnej Tury. Nie zyskujesz Przewagi za trafienie lub zranienie przeciwnika, jeśli korzystasz z tego Talentu, chyba że trafisz obydwoma atakami.",
                character.zwinnosc);
        super.poziom += 1;
    }

    void change() {

    }
}

class Etykieta extends Talent{
    public Etykieta(Character character) {
        super("Etykieta",
                "Dopóki jesteś odpowiednio ubrany i zachowujesz się należycie, potrafisz wtopić się w tłum wybranej grupy społecznej. Oto przykłady kilku z nich: Członkowie Gildii lub Cechu, Kultyści, Przestępcy, Służba, Szlachta, Uczeni, Żołnierze. Jeśli nie posiadasz tego Talentu,ci, którzy go mają, łatwo zauważą, że nie pasujesz do obcego środowiska. Widać to w zachowaniu bohatera. To oczywiście zależy od odgrywania, ale MG może wprowadzić tu odpowiedni modyfikator do Testów Ogłady.",
                character.oglada/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Finta extends Talent{
    public Finta(Character character) {
        super("Finta",
                "Pilnie ćwiczyłeś pozorowane ataki w zwarciu, by zmylić przeciwnika. W ramach swojej Akcji możesz wykonać fintę przeciwko uzbrojonemu przeciwnikowi. O jej powodzeniu rozstrzyga Przeciwstawny Test Broni Białej (Szermierczej) przeciw Broni Białej wroga. Jeśli go wygrasz i przed końcem następnej rundy zaatakujesz tego samego przeciwnika, możesz dodać PS z finty do swojego Testu ataku.",
                character.walka_wrecz/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Gadanina extends Talent{
    public Gadanina(Character character) {
        super("Gadanina",
                "W Nordlandzie mówi się, że otwierasz usta, a kiszki przez ciebie przemawiają, w Ostlandzie zaś, że pleciesz bzdury. Gadanina to wylewanie strumienia słów lub niepotrzebne i kwieciste rozwodzenie się nad sprawami trywialnymi lub wręcz pozbawionymi sensu, by wprowadzić rozmówcę w zdumienie i zakłopotanie. Do Gadaniny wykorzystujesz Umiejętność Charyzma w Teście Przeciwstawnym z Inteligencją. Sukces oznacza, że twój rozmówca znajduje się w Stanie Oszołomienie. Każdy poziom Gadaniny sprawia, że cel otrzymuje Stan kolejny raz. Taka osoba bądź istota stoi oniemiała, próbując zrozumieć, o czym mówisz i czego chcesz. Kiedy zagadany osobnik otrząśnie się z oszołomienia i zrozumie, co się działo, może nie być szczęśliwy z tego, jak go zmieszałeś. Ostatecznie zawracałeś mu głowę głupotami. Kiedy przestaniesz nawijać, cel natychmiast otrząśnie się ze Stanu Oszołomienie spowodowanego Gadaniną. Tego Talentu możesz używać tylko raz na danej osobie podczas jednej sceny (a nawet jeszcze rzadziej, jeśli MG tak uzna). Może zdarzyć się tak, że ten sam człowiek drugi raz na twoje paplanie nie da się już nabrać.",
                character.oglada/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class GeniuszArytmetyczny extends Talent{
    public GeniuszArytmetyczny(Character character) {
        super("Geniusz Arytmetyczny",
                "Masz dar do cyferek i z łatwością potrafisz rozwiązywać problemy matematyczne. Na sesji wolno używać ci kalkulatora, by pokazać geniusz swojej postaci (chyba że go nie potrzebujesz i liczysz w pamięci).",
                character.inteligencja/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class GladkieSlowa extends Talent{
    public GladkieSlowa(Character character) {
        super("Gładkie Słowa",
                "Jak Ranald Podstępny, potrafisz tak przeplatać prawdę z kłamstwem, że nie można odróżnić jednego od drugiego. Gdy wykorzystujesz Charyzmę do kłamania, twoi rozmówcy nie mogą wykonywać Przeciwstawnego Testu Intuicji, by sprawdzić, czy przypadkiem ich nie okłamujesz.",
                character.oglada/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Grozny extends Talent{
    public Grozny(Character character) {
        super("Groźny",
                "Twoja postura i wygląd budzą obawę. Kiedy wykonujesz Test Zastraszania, uzyskujesz dodatkowe PS równe liczbie wykupień tego Talentu.",
                character.sila/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Hulaka extends Talent{
    public Hulaka(Character character) {
        super("Hualaka",
                "Wiesz, jak pić i jak dobrze się bawić. Możesz zamienić kostki nieudanego Testu Mocnej Głowy, jeśli nowy wynik będzie sukcesem.",
                character.wytrzymalosc/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Inspirujacy extends Talent{
    public Inspirujacy(Character character) {
        super("Inspirujący",
                "Twoje słowa i zachęty mogą przechylić szalę zwycięstwa w bitwie. Poniższa tabela pokazuje, ile osób ulegnie wpływowi Dowodzenia podczas wojny.",
                character.oglada/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Intrygant extends Talent{
    public Intrygant(Character character) {
        super("Intrygant",
                "Jesteś mistrzem intryg i za każdym rogiem węszysz spiski. Raz na sesję możesz zadać MG pytanie o sytuację polityczną i zagmatwaną sieć powiązań, a on wykona w tajemnicy Test Inteligencji i przekaże ci pewną ilość informacji, zależną od liczby PS uzyskanych dzięki rzutowi.",
                character.inteligencja/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Inwokacja extends Talent{
    public Inwokacja(Character character) {
        super("Inwokacja",
                "Zostałeś pobłogosławiony przez swego boskiego patrona, dzięki czemu zyskujesz zdolność czynienia jednego z jego Cudów. Możesz wykupywać kolejne cuda za 100 PD pomnożone przez liczbę obecnie znanych cudów. Pełne zasady tego, jak się ich uczysz, znajdują się w Rozdziale 7: Religie i wierzenia. W normalnych okolicznościach nie możesz wykupić tego Talentu więcej niż jeden raz. Co więcej, nie możesz też kupić Talentów Magia Prosta i Magia Tajemna, jeśli posiadasz Talent Inwokacja. Po wydaniu 100 PD możesz się pozbyć tego Talentu, ale natychmiast utracisz dostęp do wszystkich zapewnianych przez niego cudów. Narażasz się też na gniew swego boga, a MG obmyśli, jak będzie się on przejawiał.",
                1);
        super.poziom += 1;
    }

    void change() {

    }
}

class Krasomostwo extends Talent{
    public Krasomostwo(Character character) {
        super("Krasomówstwo",
                "Wiesz, jak porwać tłum. Kiedy wykonujesz Test Charyzmy podczas przemawiania do tłumu, otrzymujesz premię w wysokości tylu PS, ile razy wykupiłeś ten Talent.",
                character.oglada/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Krzepki extends Talent{
    public Krzepki(Character character){
        super("Krzepki",
                "Jesteś twardy jak skała i rany nie robią na tobie wrażenia. Zmniejszasz otrzymywane obrażenia o 1 za każde wykupienie tego Talentu. Zasada ta działa nawet wtedy, gdy nie mógłbyś pomniejszyć otrzymanych ran. Nie możesz w ten sposób zredukować obrażeń poniżej 1 punktu.",
                character.wytrzymalosc/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Lapowkarz extends Talent{
    public Lapowkarz(Character character) {
        super("Łapówkarz",
                "Wiesz, jak dawać w łapę. MG powinien obniżyć podstawę wyliczenia łapówki o 10% za każde wykupienie tego Talentu. Minimalna wartość łapówki nie może spaść poniżej 10% wyjściowej stawki.",
                character.oglada/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class MagBitewny extends Talent{
    public MagBitewny(Character character) {
        super("Mag Bitewny",
                "Zostałeś wyszkolony w rzucaniu czarów podczas bitwy. W swojej Turze możesz rzucić jeden czar o Poziomie Zaklęcia 5 lub niższym w Akcji Darmowej (Test wykonujesz normalnie). Nie używasz zatem pełnej Akcji i możesz ją wykorzystać w dowolny sposób. Jednak w tej Turze nie możesz już rzucić kolejnego czaru.",
                1);
        super.poziom += 1;
    }

    void change() {

    }
}

class MagiaChaosu extends Talent{
    String tradycja;
    public MagiaChaosu(Character character, String tradycja) {
        super("Magia Chaosu",
                "Przez przypadek (lub wręcz przeciwnie) część twojej duszy przypadła jednemu z Mrocznych Bogów i jesteś w stanie korzystać z wszetecznej magii Chaosu. Twój złowrogi patron zapewnia ci dostęp do jednego czaru z wybranej tradycji  najczęściej Nurgla, Slaanesha lub Tzeentcha), a wraz z nim otrzymujesz Punkt Zepsucia, gdy bluźniercza formuła wypalasię w twoim umyśle, byś nigdy jej nie zapomniał. Za każdym razem, gdy wykupujesz ten Talent, musisz zapłacić za niego 100 PD, a więc jest inaczej niż w przypadku innych tradycji. W zamian za to otrzymujesz czar z wybranej tradycji i 1 Punkt Zepsucia. Więcej informacji na temat czarów znajduje się w Rozdziale 8: Magia. W normalnych warunkach możesz znać tylko jedną tradycję magii Chaosu.",
                10);
        super.poziom += 1;
        this.tradycja = tradycja;
    }

    void change() {

    }
}

class MagiaProsta extends Talent{
    public MagiaProsta(Character character) {
        super("Magia Prosta",
                "Zawsze miałeś smykałkę do rzucania czarów i opanowałeś metody ich podstawowej kontroli. Kiedy wykupujesz ten Talent, uczysz się i zapamiętujesz tyle czarów, ile wynosi modyfikator z twojej Siły Woli (str 136).",
                1);
        super.poziom += 1;
    }

    void change() {

    }
}

class MagiaTajemna extends Talent{
    String tradycja;
    public MagiaTajemna (Character character, String tradycja) {
        super("Magia Tajemna",
                "Studiowałeś jedną z ośmiu tradycji magii: Cienia, Metalu, Niebios, Ognia, Śmierci, Światła, Zwierząt lub Życia albo praktykujesz którąś z mniej znanych: Guślarstwa czy Nekromancji (136)",
                1);
        super.poziom += 1;
        this.tradycja = tradycja;
    }

    void change() {

    }
}

class Majetny extends Talent{
    public Majetny(Character character) {
        super("Majętny",
                "Jesteś bajecznie bogaty i rzadko kiedy brakuje ci pieniędzy. Kiedy zarabiasz (włączając w to Zajęcie Dochód), zarabiasz +1 złotą koronę więcej za każdy poziom tego Talentu.",
                10000);
        super.poziom += 1;
    }

    void change() {

    }
}

class Maly extends Talent{
    public Maly(Character character) {
        super("Mały",
                "Jesteś niższy od większości mieszkańców Starego Świata. Zasady dotyczące rozmiaru znajdują się na stronie 320 w Rozdziale 12: Bestiariusz.",
                1);
        super.poziom += 1;
    }

    void change() {

    }
}

class MistrzCharakteryzacji extends Talent{
    public MistrzCharakteryzacji(Character character) {
        super("Mistrz Charakteryzacji",
                "Jesteś ekspertem, jeśli chodzi o przejmowanie manieryzmów i upodabnianie się do kogoś. Zmieniając postawę, wykrzywiając twarz i dobierając ubranie, przestajesz przypominać siebie, nawet jeśli nie masz pod ręką zestawu do charakteryzacji.",
                character.oglada/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class MistrzRzemiosla extends Talent{
    String rzemioslo;
    public MistrzRzemiosla(Character character, String rzemioslo) {
        super("Mistrz Rzemiosła",
                "Jesteś wybitnie wykwalifikowany w danym rzemiośle. Możesz zmniejszyć liczbę wymaganych PS podczas Testu Wydłużonego tego Rzemiosła o tyle, ile razy wykupiłeś ten Talent.",
                character.zrecznosc/10);
        super.poziom += 1;
        this.rzemioslo = rzemioslo;
    }


    void change() {

    }
}

class MistrzWalki extends Talent{
    public MistrzWalki(Character character) {
        super("Mistrz Walki",
                "Lata nagromadzonego doświadczenia pozwalają ci trzymać przeciwników w szachu. Każde wykupienie tego Talentu sprawia, że gdy określana jest przewaga liczebna w walce, ty liczysz się jak jedna osoba więcej (dwie przy pierwszym wykupieniu, trzy przy drugim itd.). Talent ten działa tylko wtedy, gdy przeciwników jest faktycznie więcej od grupy, w której znajduje się postać. Na stronie 162 znajdują się zasady mówiące o tym, jak stosować przewagę liczebną.",
                character.zwinnosc/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class MocnePlecy extends Talent{
    public MocnePlecy(Character character) {
        super("Mocne Plecy",
                "Twój kark jest twardy od ciężkiej harówki. Możesz dodać liczbę wykupień tego Talentu do PS Przeciwstawnych Testów Siły i nieść dodatkowy ekwipunek o wadze równej liczbie wykupień tego Talentu w punktach Obciążenia (patrz strona 293).",
                character.sila/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class MorderczyAtak extends Talent{
    public MorderczyAtak(Character character) {
        super("Morderczy Atak",
                "Wiesz dobrze, gdzie uderzyć, by wyrządzić jak najwięcej krzywdy. Kiedy zadasz Ranę Krytyczną, zwiększasz też obrażenia o tyle, ile razy wykupiłeś ten Talent.",
                character.inicjatywa/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class MolKsiazkowy extends Talent{
    public MolKsiazkowy(Character character) {
        super("Mól Książkowy",
                "W bibliotece czujesz się tak naturalnie, jak żeglarz na morzu czy rolnik na polu. Wykorzystując Umiejętność Badania Naukowe, możesz odwrócić kolejność kostek nieudanego Testu, jeśli zapewni ci to sukces.",
                character.inteligencja/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Mowca extends Talent{
    public Mowca(Character character) {
        super("Mówca",
                "Jesteś umiejętnym oratorem i wiesz, jak urabiać tłumy. Poniższa tabela wskazuje, ile osób ulegnie twojemu wpływowi, gdy wykonasz Test Charyzmy (patrz strona 119) podczas przemawiania.",
                character.oglada/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Musztra extends Talent{
    public Musztra(Character character) {
        super("Musztra",
                "Zostałeś wyszkolony w walce obok innych żołnierzy. Jeśli przeciwnik sprawi, że stracisz Przewagę, a znajdujesz się obok innej, aktywnej postaci z Talentem Musztra, możesz zachować 1 Przewagę za każde wykupienie tego Talentu.",
                character.walka_wrecz/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class NaCzteryLapy extends Talent{
    public NaCzteryLapy(Character character) {
        super("Na Cztery Łapy",
                "Jesteś zwinny jak kot i potrafisz utrzymać równowagę równie dobrze co on. Jeśli spadniesz, to nie ucierpisz tak bardzo jak inni. Kiedy dojdzie do upadku, wykonaj Test Atletyki. Jeśli zakończy się powodzeniem, to obliczając odniesione obrażenia, zmniejsz wysokość, z której spada postać, o 1 metr + 1 metr na każdy PS uzyskany podczas Testu.",
                character.zwinnosc/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Naciagacz extends Talent{
    public Naciagacz(Character character) {
        super("Naciągacz",
                "Doskonaliłeś się w żebraniu tak długo, że teraz wzruszysz nawet osobę o sercu z najtwardszego kamienia. Testy Charyzmy podczas żebrania wykonujesz co pół godziny, a nie co godzinę (patrz strona 120).",
                character.oglada/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Nasladowca extends Talent{
    public Nasladowca(Character character) {
        super("Naśladowca",
                "Masz ucho do gwar oraz do dialektów i potrafisz je naśladować. Jeśli osłuchasz się któregoś przez jeden dzień, możesz wykonać Test Inicjatywy (jeden na dzień) i jeśli się powiedzie, będziesz potrafił naśladować ten akcent. Miejscowi będą uważali, że gadasz po ichniemu i jesteś swój.",
                character.inicjatywa/10);
        super.poziom += 1;
    }
    void change() {

    }
}

class NiegodnyUwagi extends Talent{
    public NiegodnyUwagi(Character character) {
        super("Niegodny Uwagi",
                "Wielcy i możni nie zwracają na ciebie uwagi. Jeśli jesteś zwyczajnie ubrany i nie zachowujesz się niestosownie, osoby z wyższego poziomu Statusu nie przejmują się tobą, chyba że twoja obecność jest wybitnie niestosowna. Talent ten sprawia, że masz wiele okazji do podsłuchania rozmów, których nie powinieneś być świadkiem. Co więcej, osoby o wyższym poziomie Statusu nie otrzymują Przewagi za uderzenie ciebie lub zadanie obrażeń w walce, ponieważ pomiatanie takim łachudrą jak ty nie przynosi im żadnego honoru.",
                character.oglada/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Nienawisc extends Talent{
    public Nienawisc(Character character) {
        super("Nienawiść",
                "Coś w Starym Świecie powoduje twoją nienawiść, jak to opisano na stronie 190. Każde wykupienie tego Talentu to jej nowy obiekt, a przykładowe grupy to: Banici, Czarownice, Ożywieńcy, Potwory, Sigmaryci, Zielonoskórzy, Zwierzoludzie.",
                character.sila_woli/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Nieublagany extends Talent{
    public Nieublagany(Character character) {
        super("Nieubłagany",
                "Trzeba nie lada wysiłku, by cię wykończyć. Twojej postaci nie dotyczy utrata żywotności, spowodowana Stanem Krwawienie. Każde wykupienie tego Talentu powoduje, że możesz zignorować jedną ranę spowodowaną przez ten Stan.",
                character.wytrzymalosc/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Nieugiety extends Talent{
    public Nieugiety(Character character) {
        super("Nieugięty",
                "Ruszasz do walki z niezłomną, ponurą determinacją. Podczas Szarży dodaj liczbę wykupień tego Talentu do Bonusu z Siły.",
                character.sila/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Nieustepliwy extends Talent{
    public Nieustepliwy(Character character) {
        super("Nieustępliwy",
                "Kiedy skupisz się na celu, nie sposób cię powstrzymać przed dotarciem do niego. Jeśli wykorzystujesz Przewagę podczas Odwrotu, możesz zachować jej tyle, ile razy masz wykupiony ten Talent. Co więcej, możesz wykorzystać Przewagi do Odwrotu, nawet jeśli masz ich mniej niż przeciwnik.",
                character.zwinnosc/10);  super.poziom += 1;
    }

    void change() {

    }
}

class Nieustraszony extends Talent{
    public Nieustraszony(Character character) {
        super("Nieustraszony",
                "Jesteś tak odważny lub szalony, że strach przed pewnymi istotami jest dla ciebie wspomnieniem. Za pomocą jednego Przeciętnego (+20) Testu Opanowania możesz sprawić, że nie dotyczą cię efekty Zastraszania, Strachu i Grozy, powodowane przez określoną grupę wrogów. Oto typowe przykłady takich wrogów: Banici, Czarownice, Strażnicy, Wampiry, Zielonoskórzy, Zwierzoludzie.",
                character.sila_woli/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Niewzruszony extends Talent{
    public Niewzruszony(Character character) {
        super("Niewzruszony",
                "Jesteś twardym wiarusem, który przetrwał niejedną salwę z broni czarnoprochowej. Musisz wykonać Test Opanowania, by oprzeć się Stanowi Panika, dopiero kiedy zostaniesz zraniony przez broń prochową, a nie wtedy, gdy zostaniesz z niej tylko ostrzelany.",
                character.sila_woli/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class NiezwykleOdporny extends Talent{
    public NiezwykleOdporny(Character character) {
        super("Niezwykle Odporny",
                "Twoja początkowa Wytrzymałość zostaje na stałe podniesiona o +5, co nie liczy się do sumy twoich Rozwinięć.",
                1);
        super.poziom += 1;
    }

    void change() {

    }
}

class NosDoKlopotow extends Talent{
    public NosDoKlopotow(Character character) {
        super("Nos Do Kłopotów",
                "Wiesz, jak wpaść w kłopoty i – jeszcze lepiej – jak się z nich wyłgać. Możesz wykonać Test Intuicji, by zorientować się, kto potencjalnie może sprawiać problemy. Test ten przysługuje ci, nawet gdyby nie wolno ci było go wykonać (z powodu działania innych Talentów, czarów itp.). Test ów będzie zapewne Przeciwstawny, jeśli napastnicy się kryją. MG może go wykonać w ukryciu za ciebie, byś nie wiedział, czy zakończy się on porażką, czy sukcesem. Jeśli zauważony przez ciebie wichrzyciel rozpocznie walkę, nie działa na ciebie Stan Zaskoczenie.",
                character.inicjatywa/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Numizmatyka extends Talent{
    public Numizmatyka(Character character) {
        super("Numizmatyka",
                "Doskonale znasz się na różnych walutach Starego Świata i potrafisz oceniać ich wartość. Na podstawie swojego doświadczenia, bez konieczności wykonywania Testu, umiesz powiedzieć, ile warta jest moneta. Prosty Test Wyceny pozwoli ci wykryć podrabianą. Nie jest on przeciwstawiany PS uzyskanym wcześniej przez fałszerza.",
                character.inicjatywa/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Obiezyswiat extends Talent{
    public Obiezyswiat(Character character) {
        super("Obieżyświat",
                "Jesteś jednym z tych ciekawskich, którzy nie potrafią usiedzieć na miejscu i wędrują po świecie wszerz i wzdłuż, ucząc się wielu przydatnych informacji. Dodaj Umiejętność Wiedza (Lokalna) do swojej każdej bieżącej Profesji, a jeśli już jest na liście dostępnych, możesz wykupić na tym poziomie jedną dodatkową Wiedzę (Lokalną). Za Rozwinięcie każdej z takich Umiejętności płacisz zawsze 5 PD mniej. Przykładowe Specjalizacje to Altdorf, Vorbergland czy Ubersreik.",
                character.inteligencja/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Oburecznosc extends Talent{
    public Oburecznosc(Character character) {
        super("Oburęczność",
                "Twoja słabsza ręka jest sprawniejsza niż u innych ludzi. Być może zostałeś tego nauczony, być może to wrodzona cecha, ale efekt jest ten sam: modyfikator do Testów wykonywanych „drugą” ręką zostaje zmniejszony z -20 do -10. Jeśli wykupisz ten Talent drugi raz, modyfikatora nie stosuje się do twojej postaci.",
                2);
        super.poziom += 1;
    }

    void change() {

    }
}

class OdpornoscNaMagie extends Talent{
    public OdpornoscNaMagie(Character character) {
        super("Odporność na Magię",
                "Jesteś uodporniony na zaklęcia. Poziom Sukcesów czarów rzucanych na ciebie jest obniżony o 2 za każde wykupienie tego Talentu. Poziom Sukcesów jest obniżany tylko od najwyższej Odporności na Magię w obszarze oddziaływania czaru. Co więcej, nie możesz wykupić Talentów: Magia Tajemna, Błogosławieństwo, Inwokacja, Magia Prosta i Czarownica.",
                character.wytrzymalosc/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class OdpornoscPsychiczna extends Talent{
    public OdpornoscPsychiczna(Character character) {
        super("Odporność Psychiczna",
                "Jesteś uosobieniem determinacji i niezłomności. Dodaj tyle Punktów Determinacji do ich maksymalnej puli, ile razy wykupiłeś ten Talent.",
                character.sila_woli/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class OdpornyNaZagrozenie extends Talent{
    public OdpornyNaZagrozenie(Character character) {
        super("Odporny na (Zagrożenie)",
                "Twoja wielka wytrwałość pozwala ci poradzić sobie z niebezpieczeństwem. Automatycznie zdajesz pierwszy Test opierania się przeciwko konkretnemu typowi zagrożenia na danej sesji. Znane są Odporności na Choroby, Magię, Mutacje czy Trucizny. Jeśli w Teście ważne są Poziomy Sukcesu, to za ich liczbę przyjmujesz Bonus z Wytrzymałości.",
                character.wytrzymalosc/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class OdwrocenieSzans extends Talent{
    public OdwrocenieSzans(Character character) {
        super("Odwrócenie Szans",
                "Tak przywykłeś do rozpaczliwej walki o życie, że potrafisz obrócić na swoją korzyść nawet największe kłopoty. Jeśli wygrasz Przeciwstawny Test Walki Wręcz, to zamiast zdobywać +1 Przewagę, możesz zabrać przeciwnikowi jego wszystkie zebrane Przewagi. Jeśli się na to zdecydujesz, nie zadajesz wrogowi obrażeń, nawet jeśli to twoja Tura w Rundzie.",
                character.walka_wrecz);
        super.poziom += 1;
    }

    void change() {

    }
}

class Ogloszenie extends Talent{
    public Ogloszenie(Character character) {
        super("Ogłuszenie",
                "Wiesz, gdzie uderzyć, by wróg padł jak długi. Nie tyczy się ciebie negatywny modyfikator za atak mierzony w głowę, gdy używasz broni do Walki Wręcz z zaletą Ogłuszająca (patrz strona 298). Co więcej, w twoich rękach wszystkie bronie improwizowane są traktowane jako Ogłuszające.",
                character.walka_wrecz/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class OkoLowcy extends Talent{
    public OkoLowcy(Character character) {
        super("Oko Łowcy",
                "Jesteś dobrym myśliwym i znasz najlepsze sposoby szukania zwierzyny. Kiedy podróżujesz po bogatych w nią ziemiach, jesteś automatycznie w stanie wyżywić siebie i tylu towarzyszy, ile razy wykupiłeś ten Talent, jeśli tylko masz czas, by zapolować, oraz odpowiednie wyposażenie. Więcej pożywienia możesz zapewnić, wykorzystując zasady znajdujące się na stronie 129.",
                character.inicjatywa);
        super.poziom += 1;
    }

    void change() {

    }
}

class PercepcjaMagiczna extends Talent{
    public PercepcjaMagiczna(Character character) {
        super("Percepcja Magiczna",
                "Potrafisz dostrzegać zmienne Wiatry Magii, które dmą od Bram Chaosu na biegunach świata. Dzięki temu Talentowi posiadasz zdolność postrzegania magii (patrz strona 233).",
                character.inicjatywa/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class PierwszaPomoc extends Talent{
    public PierwszaPomoc(Character character) {
        super("Pierwsza Pomoc",
                "Potrafisz szybko opatrywać rany. Kiedy nie uda ci się Test Leczenia podczas używania Bandaży, możesz odwrócić kolejność kostek, jeśli to przyniesie ci sukces. Jeśli tak zrobisz, nie możesz uzyskać więcej niż +1 PS, ponieważ skupiasz się na szybkim, a nie dokładnym założeniu opatrunku.",
                character.inteligencja/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Pilot extends Talent{
    public Pilot(Character character) {
        super("Pilot",
                "Potrafisz kierować okrętem po zdradliwych akwenach. Kiedy nie powiedzie ci się Test na niepewnych wodach, możesz odwrócić kolejność kości, jeżeli nowy wynik pozwoli ci odnieść sukces. Maksymalnie możesz w ten sposób osiągnąć +1 PS, ponieważ w ostatniej chwili wypatrzyłeś niebezpieczeństwo.",
                character.inicjatywa);
        super.poziom += 1;
    }

    void change() {

    }
}

class PilotRzeczny extends Talent{
    public PilotRzeczny(Character character) {
        super("Pilot Rzeczny",
                "Znasz wszystkie tajniki żeglowania po rzekach. Nie musisz wykonywać Testu, by przeprowadzić jednostkę przez niebezpieczne wody, chyba że jego trudność wynosi -10 lub więcej. Łatwiejsze Testy automatycznie kończą się sukcesem. Co więcej, jeśli posiadasz Wiedzę (Okolica), w ogóle nie musisz przeprowadzać Testów, tak dobrze znasz te tereny i lokalny nurt.",
                character.inicjatywa/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Poliglota extends Talent{
    public Poliglota(Character character) {
        super("Poliglota",
                "Masz naturalną łatwość uczenia się języków. Wystarczy ci miesiąc obcowania z którymś i udany Test Inteligencji (można go powtórzyć raz na miesiąc), byś mógł traktować jego znajomość jako Umiejętność Podstawową. Uwaga: ten Talent działa tylko na języki, którymi często porozumiewają się istoty, a więc nie na Język (magiczny).",
                character.inteligencja/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Pomocny extends Talent{
    public Pomocny(Character character) {
        super("Pomocny",
                "Wiesz, co i kiedy powiedzieć oraz jak najlepiej wypaść w oczach szlachetniej od ciebie urodzonych. Kiedy z powodzeniem użyjesz Umiejętności, by wpłynąć na tych, którzy mają wyższy od ciebie Status, możesz wybrać, czy wykorzystać normalnie obliczaną liczbę PS, czy zamiast niej użyć cyfry jedności kości, którymi rzucałeś. W ten sposób rzut 46 może dać +6 PS.",
                character.oglada/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class PorywajacaGorliwosc extends Talent{
    public PorywajacaGorliwosc(Character character) {
        super("Porywająca Gorliwość",
                "Kiedy mówisz o czymś, co cię pasjonuje, o swoich przekonaniach czy religii, twoje słowa przepełnia gorliwość, a nawet fanatyzm. Możesz podwoić swoją Ogładę, gdy określasz liczbę osób, na które wpływa twój Talent Mówca (patrz strona 138), gdy poruszasz ważny dla ciebie temat.",
                character.oglada/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class PosluchUZwierzat extends Talent{
    public PosluchUZwierzat(Character character) {
        super("Posłuch u Zwierząt",
                "Dzikie zwierzęta dobrze się czują w twojej obecności i często są posłuszne twoim poleceniom. Wszystkie istoty o Cesze Zwierzę, których nie wytresowano, by były agresywne, uspokajają się w twojej obecności, chyba że mają powód, by zachować czujność. Ból, napaść czy naturalna wysoka agresja lub opieka nad młodymi mogą sprawić, że zwierzę nie podda się działaniu tego Talentu.",
                character.sila_woli/10);
         super.poziom += 1;
    }

    void change() {

    }
}

class PrecyzyjneInkantowanie extends Talent{
    public PrecyzyjneInkantowanie(Character character) {
        super("Precyzyjne Inkantowanie",
                "Instynktownie pojmujesz język magiczny i bez omyłki jesteś w stanie wypowiadać skomplikowane formuły. Jeśli rzucisz dublet podczas udanego Testu Języka (Magicznego), nie dochodzi do manifestacji.",
                character.inicjatywa/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class ProstoMiedzyOczy extends Talent{
    public ProstoMiedzyOczy(Character character) {
        super("Prosto Między Oczy",
                "Zawsze trafiasz wroga między oczy… albo tam, gdzie chcesz. Zamiast odwracać kolejność kości, by określić Miejsce Trafienia z Broni Zasięgowej, wybierasz, gdzie chciałeś trafić wroga.",
                1);  super.poziom += 1;
    }

    void change() {

    }
}

class Przekonujacy extends Talent{
    public Przekonujacy(Character character) {
        super("Przekonujący",
                "Przywykłeś do debatowania i obrony swojego zdania. Jeśli uda ci się Test Charyzmy, możesz normalnie obliczyć PS lub określić ich liczbę, odczytując wynik z kości jedności. Udany Test z wynikiem 24 może dać ci więc 4 PS.",
                character.oglada/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Przestepca extends Talent{
    public Przestepca(Character character) {
        super("Przestępca",
                "Jesteś bandytą, który zarabia na swojej działalności i niekiedy się z tym nie kryje. Jeśli w trakcie gry będziesz zarabiał lub oddasz się Zajęciu Dochód, odwołaj się do poniższej tabeli. Ponieważ nie kryjesz się ze swoją przestępczą naturą, inni automatycznie uważają cię za osobę niższego Statusu, chyba że sami posiadają ten Talent. Wtedy wasz Status jest ustalany normalnie. Od ciebie zależy, jak można poznać, że jesteś kryminalistą: czy to więzienne tatuaże, czy obcesowy sposób bycia. Lokalne władze i straże są wobec ciebie podejrzliwe i zawsze patrzą ci na ręce, a im więcej razy wykupisz ten Talent, tym za większego zbira uchodzisz. Bezpośrednie skutki zależą od MG. Kryminaliści bez Talentu Przestępca zarabiają znacznie mniejsze pieniądze, ale zachowują dawny Status. Za zgodą MG możesz wydać tyle PD, ile cię kosztował, by pozbyć się tego Talentu.",
                10000);
        super.poziom += 1;
    }

    void change() {

    }
}

class PrzyrzadzanieMikstur extends Talent{
    public PrzyrzadzanieMikstur(Character character) {
        super("Przyrządzanie Mikstur",
                "Wiesz, jak przyrządzać napary, wywary i susze. Możesz podjąć się jednego darmowego Zajęcia Wytwórstwa, by użyć Rzemiosła (Aptekarstwa) bez dostępu do Warsztatu. Pozostałe Zajęcia Wytwórstwa należy przeprowadzić normalnie.",
                character.inteligencja/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Riposta extends Talent{
    public Riposta(Character character) {
        super("Riposta",
                "Wyznajesz zasadę, że najlepszą obroną jest atak, dlatego w walce błyskawicznie kontratakujesz, gdy tylko przeciwnik wyprowadzi cios. Jeśli twoja broń posiada zaletę Szybka, możesz zadać obrażenia, gdy jesteś atakowany, jakbyś wykonywał swoją Akcję. Ripostę możesz wykonać tyle razy w Rundzie, ile razy wykupisz ten Talent.",
                character.zwinnosc/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Rozbrojenie extends Talent{
    public Rozbrojenie(Character character) {
        super("Rozbrojenie",
                "Celnym uderzeniem lub sprawnym ruchem nadgarstka jesteś w stanie wytrącić broń przeciwnikowi z dłoni. W ramach swojej Akcji wykonaj Przeciwstawny Test Broni Białej przeciwko wrogiemu Testowi Broni Białej. Jeśli ci się powiedzie, wybijasz broń z ręki przeciwnika, która odlatuje o 1k5 metrów w losowym kierunku. MG może zadecydować o tym, co dzieje się jeszcze. Jeśli wygrasz o 2 PS, ty decydujesz, jak daleko odleci broń, zamiast określać to losowo. Jeśli wygrasz o 4 PS, możesz też zadecydować, w którą stronę pofrunie. Jeżeli wygrasz Test o 6 PS lub więcej, łapiesz oręż przeciwnika, o ile masz wolną rękę. Ten Talent na nic się nie przyda, jeśli wróg nie używa broni lub jest większy od ciebie.",
                0);
        super.poziom += 1;
    }

    void change() {

    }
}

class RozpoznanieArtefaktu extends Talent{
    public RozpoznanieArtefaktu(Character character) {
        super("Rozpoznanie Artefaktu",
                "Jesteś w stanie wykryć, czy w danym przedmiocie zaklęta jest magia. Możesz wykonać Test Intuicji, gdy go dotykasz. Jeśli Test się powiedzie, każdy PS pozwala ci poznać jedną zasadę, która ma zastosowanie wobec przedmiotu (jeśli tak w ogóle jest). W zwykłych przypadkach możesz wykonać tylko jeden Test wobec danego artefaktu.",
                character.inicjatywa/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class RozproszenieUwagi extends Talent{
    public RozproszenieUwagi(Character character) {
        super("Rozproszenie Uwagi",
                "Jesteś wytrenowany tak, by twoje ruchy rozpraszały uwagę przeciwnika i ułatwiały jego zaskoczenie. Możesz wykorzystać swój Ruch, aby użyć Rozpraszania Uwagi. Jest to Test Przeciwstawny Atletyki przeciw Opanowaniu przeciwnika. Jeśli wygrasz, twój przeciwnik nie może zbierać Przewagi aż do końca następnej Rundy.",
                character.zwinnosc/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class RuchliweDlonie extends Talent{
    public RuchliweDlonie(Character character) {
        super("Ruchliwe dłonie",
                "Manipulujesz dłońmi z zaskakującą zręcznością. Gapiom i przypadkowym obserwatorom nie przysługuje bierny Test Percepcji, gdy wykorzystujesz Umiejętność Zwinne Palce, chyba że żywią oni wobec ciebie podejrzenia i obserwują twoje ruchy. Testy Broni Białej (Bijatyki) wykonywane, by dotknąć przeciwnika, wykonujesz z premią +10 x liczba wykupień tego Talentu.",
                character.zrecznosc/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Rybak extends Talent{
    public Rybak(Character character) {
        super("Rybak",
                "Jesteś obrotnym rybakiem i wiesz, jak zapełnić sieci. Jeżeli masz dostęp do odpowiednio dużego zbiornika wodnego, jesteś w stanie wyżywić siebie oraz tyle osób, ile razy wykupiłeś ten Talent, jeśli poświęcisz godzinę dziennie na wędkowanie. Liczbę złowionych ryb możesz zwiększyć, stosując zasady zbieractwa (patrz strona 129).",
                character.inicjatywa);
        super.poziom += 1;
    }

    void change() {

    }
}

class SekretnaTozsamosc extends Talent{
    public SekretnaTozsamosc(Character character) {
        super("Sekretna Tożsamość",
                "Posiadasz alter ego, które jest bogatszym lub biedniejszym człowiekiem od ciebie. Wybierz Profesję, na którą przystanie MG. Dopóki jesteś odpowiednio ubrany, dopóty możesz korzystać z oferowanego przez nią Statusu, zamiast swojego. To oznacza, że korzystasz z jej modyfikatorów do Testów Ogłady, a nawet możesz zignorować skutki działania Talentu Przestępca. Utrzymywanie sekretnej tożsamości wymaga udanych Testów Umiejętności Występy (Aktorstwo),gdy spotykasz kogoś, kto może cię przejrzeć. Każde wykupienie tego Talentu pozwala ci na stworzenie dodatkowej sekretnej tożsamości.",
                character.inteligencja/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class SilneNogi extends Talent{
    public SilneNogi(Character character) {
        super("Silne Nogi",
                "Masz silne nogi, dzięki którym jesteś w stanie wykonywać nieprawdopodobnie dalekie skoki. Dodaj liczbę wykupień tego Talentu do PS Testów Atletyki wiążących się ze skakaniem (patrz strona 166).",
                character.sila/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class SilnyCios extends Talent{
    public SilnyCios(Character character) {
        super("Silny Cios",
                "Wiesz, jak komuś przywalić! Posługując się bronią do Walki Wręcz, zadajesz obrażenia powiększone o tyle, ile razy masz wykupiony ten Talent.",
                character.sila/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class SkrocenieDystansu extends Talent{
    public SkrocenieDystansu(Character character) {
        super("Skrócenie Dystansu",
                "Wiesz, jak przyciągnąć do siebie przeciwnika, i nie dotyczą cię modyfikatory za walkę z wrogiem, który ma broń dłuższą niż Twoja. Jeśli używasz opcjonalnych zasad walki kontaktowej (patrz strona 297), otrzymujesz premię +10 do trafienia przeciwnika.",
                character.zrecznosc/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class SluchAbsolutny extends Talent{
    public SluchAbsolutny(Character character) {
        super("Słuch Absolutny",
                "Jesteś w stanie dokładnie powtórzyć i zidentyfikować notację nutową. Co więcej, dodaj Umiejętność Występy (Śpiewanie) do listy Umiejętności swojej każdej bieżącej Profesji, a jeśli znajduje się ona na liście, koszt każdego Rozwinięcia spada o 5 PD.",
                character.inicjatywa);
        super.poziom += 1;
    }

    void change() {

    }
}

class Snajper extends Talent{
    public Snajper(Character character) {
        super("Snajper",
                "Kiedy strzelasz, odległość nie ma dla ciebie znaczenia. Eliminujesz cele z taką samą łatwością, jakby były niedaleko. Strzelanie na daleki zasięg nie wiąże się dla ciebie z żadnymi negatywnymi modyfikatorami, a na bardzo daleki oznacza tylko połowiczne modyfikatory.",
                4);
        super.poziom += 1;
    }

    void change() {

    }
}

class Sprezynka extends Talent{
    public Sprezynka(Character character) {
        super("Sprężynka",
                "Ciebie nie da się obalić na ziemię. Możesz wykonać Wymagający (+0) Test Atletyki, by natychmiast wstać po tym, jak nałożony zostanie na ciebie Stan Powalony. Ten Test Atletyki jest modyfikowany przez siłę uderzenia, które posłało cię na ziemię. Za każde 10 punktów Siły wroga ponad twoją Wytrzymałość otrzymujesz modyfikator -10 do Testu Atletyki. Jeśli Siła przeciwnika była niższa od twojej Wytrzymałości, otrzymujesz +10 za każde 10 punktów różnicy.",
                1);
        super.poziom += 1;
    }

    void change() {

    }
}

class Straszny extends Talent{
    public Straszny(Character character) {
        super("Straszny",
                "Każdy przy zdrowych zmysłach pomyśli dwa razy, zanim do ciebie podejdzie. Możesz zadecydować, że w danej sytuacji wzbudzasz Strach na poziomie 1 (patrz strona 190). Każde wykupienie tego Talentu podwyższa siłę Strachu o +1.",
                character.sila/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class StrzalPrzebijajacy extends Talent{
    public StrzalPrzebijajacy(Character character) {
        super("Strzał Przebijający",
                "Wiesz, jak odszukać słaby punkt w pancerzu obranego celu. Kiedy trafisz, wykonując Test Broni Zasięgowej, możesz zignorować tyle Punktów Pancerza wroga, ile razy wykupiłeś ten Talent.",
                character.inicjatywa);
        super.poziom += 1;
    }

    void change() {

    }
}

class StrzalWDziesiatke extends Talent{
    public StrzalWDziesiatke(Character character) {
        super("Strzał w Dziesiątkę",
                "Strzelasz celnie w cel niezależnie od jego wielkości. Dzięki temu nie mają na ciebie wpływu negatywne modyfikatory strzelania, wynikające z rozmiaru celu.",
                1);
        super.poziom += 1;
    }

    void change() {

    }
}

class StrzelecWyborowy extends Talent{
    public StrzelecWyborowy(Character character) {
        super("Strzelec Wyborowy",
                "Otrzymujesz stałą premię +5 do początkowych Umiejętności Strzeleckich, która nie liczy się do sumy Rozwinięć.",
                1);
        super.poziom += 1;
    }

    void change() {

    }
}

class SzalBojowy extends Talent{
    public SzalBojowy(Character character) {
        super("Szał Bojowy",
                "Możesz wpaść w Szał Bojowy, co opisano na stronie 190.",
                1);
        super.poziom += 1;
    }

    void change() {

    }
}

class Szczescie extends Talent{
    public Szczescie(Character character) {
        super("Szczęście",
                "Powiadają, że kiedy się rodziłeś, Ranald się uśmiechnął. Maksymalna liczba twoich Punktów Szczęścia jest równa sumie liczby Punktów Przeznaczenia i liczby wykupień tego Talentu.",
                character.oglada/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class SzczurTunelowy extends Talent{
    public SzczurTunelowy(Character character) {
        super("Szczur Tunelowy",
                "W tunelach, kanałach ściekowych i pod powierzchnią ziemi jesteś na swoim terenie. Kiedy wykorzystujesz w takich warunkach Umiejętność Skradanie, istotom wokoło nie przysługuje pasywny Test Percepcji. Zauważyć cię mogą dopiero wtedy, gdy będą cię czynnie wyglądały lub szukały ukrytych przeciwników.",
                character.zwinnosc/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class SzostyZmysl extends Talent{
    public SzostyZmysl(Character character) {
        super("Szósty Zmysł",
                "Masz niepokojące przeczucia, kiedy coś ci grozi, i umiesz odpowiednio na nie zareagować. MG może cię ostrzec, kiedy znajdujesz się w sytuacji, w której może stać ci się krzywda, jeśli powiedzie się sekretny Test Intuicji wykonany w twoim imieniu. Co więcej, jeżeli uda ci się Test Intuicji, nie jesteś zaskoczony.",
                character.inicjatywa/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Szuler extends Talent{
    public Szuler(Character character) {
        super("Szuler",
                "Przywykłeś do tego, że w grze w karty zwykle wygrywasz, choć twoje metody mogą być odrobinę nieuczciwe. Jeśli powiedzie ci się Test Hazardu lub Zwinnych Palców, możesz wybrać, czy skorzystaćz normalnie uzyskanych PS, czy ich liczbę wyznaczyć, korzystając z cyfry jedności rzutu. W ten sposób wynik udanego Testu 28 oznaczałby uzyskanie +8 PS. Jeśli na sesji rzeczywiście używacie kart, możesz otrzymać w rozdaniu dodatkową liczbę kart, równą liczbie wykupień tego Talentu, wybrać najlepsze i odłożyć tyle, byś miał na ręku odpowiednią liczbę.",
                character.inteligencja/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class SzulerKosciany extends Talent{
    public SzulerKosciany(Character character) {
        super("Szuler Kościany",
                "Jesteś mistrzem gry w kości, a zarzuty oszustwa są nieuzasadnione. Kiedy z powodzeniem używasz Umiejętności Hazard czy Zwinne Palce podczas gry w kości, możesz albo zachować obliczoną normalnie liczbę PS, albo określić ich liczbę przez wynik na kości jedności. W ten sposób wynik rzutu 06 może oznaczać +6 PS. Jeśli podczas sesji będziecie naprawdę grali w kości, rzucasz tyloma więcej, ile razy wykupiłeś ten Talent, i wybierasz najlepsze rezultaty.",
                character.inteligencja/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class SzybkiRefleks extends Talent{
    public SzybkiRefleks(Character character) {
        super("Szybki Refleks",
                "Zyskujesz premię +5 do początkowej wartości Zwinności. Nie liczy się ona do sumy Rozwinięć.",
                1);
        super.poziom += 1;
    }

    void change() {

    }
}

class SzybkieCzytanie extends Talent{
    public SzybkieCzytanie(Character character) {
        super("Szybkie Czytanie",
                "Czytasz księgi z zadziwiającą szybkością. Możesz odwrócić kolejność kości nieudanego Testu Badań Naukowych, jeśli to przyniesie ci sukces. Jeżeli szybkie przeczytanie tekstu odgrywa rolę podczas walki, to w ciągu Rundy możesz przeanalizować tyle stron, ile PS uzyskasz dzięki udanemu Testowi Języków plus tyle, ile razy wykupiłeś ten Talent (minimum jedną, jeśli Test się nie powiódł).",
                character.inteligencja/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class SzybkiePrzeladowanie extends Talent{
    public SzybkiePrzeladowanie(Character character) {
        super("Szybkie Przeładowanie",
                "Potrafisz z łatwością przeładowywać bronie strzeleckie. Dodaj PS równe liczbie wykupień tego Talentu do Testów przeładowania broni dystansowej.",
                character.zrecznosc/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Szybkobiegacz extends Talent{
    public Szybkobiegacz(Character character) {
        super("Szybkobiegacz",
                "Żwawo przebierasz nogami. Podczas Biegu twoja Szybkość jest traktowana, jakby była o 1 wyższa.",
                character.sila/10);
        super.poziom += 1;
    }

    void change() {

    }
}

class Szycha extends Talent{
    public Szycha(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class SwietnyPlywak extends Talent{
    public SwietnyPlywak(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class SwietaNienawisc extends Talent{
    public SwietaNienawisc(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class SwieteWizje extends Talent{
    public SwieteWizje(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class TalentArtystyczny extends Talent{
    public TalentArtystyczny(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class Tarczownik extends Talent{
    public Tarczownik(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class Towarzyski extends Talent{
    public Towarzyski(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class Tragarz extends Talent{
    public Tragarz(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class Traper extends Talent{
    public Traper(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class Twardziel extends Talent{
    public Twardziel(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class Ulicznik extends Talent{
    public Ulicznik(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class UrodzonyWSiodle extends Talent{
    public UrodzonyWSiodle(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class UrodzonyWojownik extends Talent{
    public UrodzonyWojownik(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class UrodzonyZeglarz extends Talent{
    public UrodzonyZeglarz(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class WaleczneSerce extends Talent{
    public WaleczneSerce(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class WalkaWCiasnocie extends Talent{
    public WalkaWCiasnocie(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class WidzenieWCiemnosci extends Talent{
    public WidzenieWCiemnosci(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class WiezaPamieci extends Talent{
    public WiezaPamieci(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class WilkMorski extends Talent{
    public WilkMorski(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class WladczaPostura extends Talent{
    public WladczaPostura(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class Wloczykij extends Talent{
    public Wloczykij(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class Wodniak extends Talent{
    public Wodniak(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class Woltyzerka extends Talent{
    public Woltyzerka(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class Wodz extends Talent{
    public Wodz(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class WrozbaLosu extends Talent{
    public WrozbaLosu(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class Wstrzemiezliwy extends Talent{
    public Wstrzemiezliwy(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class WscieklyAtak extends Talent{
    public WscieklyAtak(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class WtargniecieZWlamaniem extends Talent{
    public WtargniecieZWlamaniem(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class WybornyWspinacz extends Talent{
    public WybornyWspinacz(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class WyczucieKierunku extends Talent{
    public WyczucieKierunku(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class WyczulonyZmysl extends Talent{
    public WyczulonyZmysl(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class WykrywanieMagii extends Talent{
    public WykrywanieMagii(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class Wytrwaly extends Talent{
    public Wytrwaly(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class Wytworca extends Talent{
    public Wytworca(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class ZBata extends Talent{
    public ZBata(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class Zabojca extends Talent{
    public Zabojca(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class ZbicieBroni extends Talent{
    public ZbicieBroni(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class ZejscieZLinii extends Talent{
    public ZejscieZLinii(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class ZimnaKrew extends Talent{
    public ZimnaKrew(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class ZlotaRaczka extends Talent{
    public ZlotaRaczka(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class ZmyslBitewny extends Talent{
    public ZmyslBitewny(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class ZmyslMagii extends Talent{
    public ZmyslMagii(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class Znawca extends Talent{
    String wiedza;
    public Znawca (Character character, String wiedza) {
        super("",
                "",
                0);  super.poziom += 1;
        this.wiedza = wiedza;
    }

    void change() {

    }
}

class Zreczny extends Talent{
    public Zreczny(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class ZelaznaSzczeka extends Talent{
    public ZelaznaSzczeka(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class ZelaznaWola extends Talent{
    public ZelaznaWola(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}

class Zylkahandlowa extends Talent{
    public Zylkahandlowa(Character character) {
        super("",
                "",
                0);  super.poziom += 1;
    }

    void change() {

    }
}