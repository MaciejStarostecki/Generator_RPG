public class Talent {
    String name;
    String text;
    int maximum;

    public Talent(String name) {}

    public Talent(String name, String text, int maximum) {
        this.name = name;
        this.text = text;
        this.maximum = maximum;
    }

    void change() {};
}

class Aptekarz extends Talent{
     public Aptekarz (Character character) {
        super("Aptekarz", "Jesteś świetnym aptekarzem i lepiej od innych wyrabiasz pigułki, maści, smarowidła, olejki, kremy i im podobne. Możesz odwrócić kolejność kości nieudanego Testu Rzemiosła (Aptekarstwa), jeśli nowy wynik pozwoli ci odnieść sukces.", character.inteligencja/10);
    }

    void change() {

    }
}

class Arcydzielo extends Talent{
    public Arcydzielo (Character character) {
        super("Arcydzieło", "Jesteś niekwestionowanym mistrzem w swojej dziedzinie, tworzącym dzieła tak złożone, że inni mogą je tylko podziwiać, zachwycając się twoim geniuszem. Za każdym razem, gdy wykupujesz ten Talent, tworzysz niezwykłe dzieło, wykorzystując Umiejętność Sztuka lub Rzemiosło. Nie ma ono sobie równych, będzie po wieki inspirowało, zadziwiało i budziło zachwyt swoją wyjątkowością. MG określa premie, które ci przysługują z tej racji. Zwykle wpływają one na Testy Ogłady w  ontaktach z tymi, którzy podziwiają twoją sztukę. Sprzedaż dzieła powinna dać ci przynajmniej dziesięciokrotną wartość zwykłej ceny, a czasami nawet więcej.", 100000);
    }

    void change() {

    }
}

class Artylerzysta extends Talent{
    public Artylerzysta (Character character) {
        super("Artylerzysta", "Z łatwością przeładowujesz broń prochową. Dodaj PS równe liczbie wykupień tego Talentu do każdego Wydłużonego Testu związanego z przeładowaniem broni prochowej.", character.zrecznosc/10);
    }

    void change() {

    }
}

class AtakWyprzedzajacy extends Talent{
    public AtakWyprzedzajacy (Character character) {
        super("Atak Wyprzedzający", "Twoje błyskawiczne ciosy pozwalają na powalenie przeciwników, zanim oni sami zdążą zaatakować. Kiedy wróg na ciebie Szarżuje, wykonaj udany Wymagający (+0) Test Inicjatywy, by natychmiast wykonać Darmowy Atak poza normalną kolejnością  undy. Używasz broni, którą trzymasz w wiodącej ręce. Możesz wykonać tyle Ataków Wyprzedzających w Rundzie, ile razy wykupiłeś ten Talent, ale tylko raz na każdego szarżującego.", character.inicjatywa/10);
    }

    void change() {

    }
}

class Atrakcyjny extends Talent{
    public Atrakcyjny (Character character) {
        super("Atrakcyjny", "Może to przenikliwe spojrzenie lub zgrabna sylwetka, a może to, jak w uśmiechu odsłaniasz biel swoich zębów. Wiesz, jak najlepiej pokazać to, czym obdarzyli cię bogowie. Jeżeli uda ci się Test Charyzmy wobec osób, którym się podobasz,  możesz obliczyć PS normalnie albo uzyskać ich tyle, ile wypadło na kostce jedności. Na przykład udany Test przy wyrzuceniu 38 oznaczałby wtedy 8 PS.", character.oglada/10);
    }

    void change() {

    }
}

class BardzoSilny extends Talent{
    public BardzoSilny (Character character) {
        super("");
    }

    void change() {

    }
}

class BardzoSzybki extends Talent{
    public BardzoSzybki () {
        super("");
    }

    void change() {

    }
}

class BerserkerskaSzarza extends Talent{
    public BerserkerskaSzarza () {
        super("");
    }

    void change() {

    }
}

class Biczownik extends Talent{
    public Biczownik () {
        super("");
    }

    void change() {

    }
}

class BitewnaFuria extends Talent{
    public BitewnaFuria () {
        super("");
    }

    void change() {

    }
}

class BitewnyRefleks extends Talent{
    public BitewnyRefleks () {
        super("");
    }

    void change() {

    }
}

class BlekitnaKrew extends Talent{
    public BlekitnaKrew () {
        super("");
    }

    void change() {

    }
}

class Blogoslawienstwo extends Talent{
    public Blogoslawienstwo () {
        super("");
    }

    void change() {

    }
}

class BlyskawicznyStrzal extends Talent{
    public BlyskawicznyStrzal () {
        super("");
    }

    void change() {

    }
}

class Blyskotliwosc extends Talent{
    public Blyskotliwosc () {
        super("");
    }

    void change() {

    }
}

class CelnyStrzal extends Talent{
    public CelnyStrzal () {
        super("");
    }

    void change() {

    }
}

class Chirurgia extends Talent{
    public Chirurgia () {
        super("");
    }

    void change() {

    }
}

class Chodu extends Talent{
    public Chodu () {
        super("");
    }

    void change() {

    }
}

class Cien extends Talent{
    public Cien () {
        super("");
    }

    void change() {

    }
}

class CiosMierzony extends Talent{
    public CiosMierzony() {
        super("");
    }

    void change() {

    }
}

class CiosPonizejPasa extends Talent{
    public CiosPonizejPasa () {
        super("");
    }

    void change() {

    }
}

class Czarownica extends Talent{
    public Czarownica () {
        super("");
    }

    void change() {

    }
}

class CzlowiekGuma extends Talent{
    public CzlowiekGuma () {
        super("");
    }

    void change() {

    }
}

class Czujny extends Talent{
    public Czujny () {
        super("");
    }

    void change() {

    }
}

class CzystaDusza extends Talent{
    public CzystaDusza () {
        super("");
    }

    void change() {

    }
}

class CzytanieZRuchuWarg extends Talent{
    public CzytanieZRuchuWarg () {
        super("");
    }

    void change() {

    }
}

class CzytaniePisanie extends Talent{
    public CzytaniePisanie () {
        super("");
    }

    void change() {

    }
}

class Defraudant extends Talent{
    public Defraudant () {
        super("");
    }

    void change() {

    }
}

class DobrzePrzygotowany extends Talent{
    public DobrzePrzygotowany () {
        super("");
    }

    void change() {

    }
}

class DoswiadczonyWedrowiec extends Talent{
    public DoswiadczonyWedrowiec () {
        super("");
    }

    void change() {

    }
}

class DwieBronie extends Talent{
    public DwieBronie () {
        super("");
    }

    void change() {

    }
}

class Etykieta extends Talent{
    public Etykieta () {
        super("");
    }

    void change() {

    }
}

class Finta extends Talent{
    public Finta () {
        super("");
    }

    void change() {

    }
}

class Gadanina extends Talent{
    public Gadanina () {
        super("");
    }

    void change() {

    }
}

class GeniuszArytmetyczny extends Talent{
    public GeniuszArytmetyczny () {
        super("");
    }

    void change() {

    }
}

class GladkieSlowa extends Talent{
    public GladkieSlowa () {
        super("");
    }

    void change() {

    }
}

class Grozny extends Talent{
    public Grozny () {
        super("");
    }

    void change() {

    }
}

class Hulaka extends Talent{
    public Hulaka () {
        super("");
    }

    void change() {

    }
}

class Inspirujacy extends Talent{
    public Inspirujacy() {
        super("");
    }

    void change() {

    }
}

class Intrygant extends Talent{
    public Intrygant () {
        super("");
    }

    void change() {

    }
}

class Inwokacja extends Talent{
    public Inwokacja () {
        super("");
    }

    void change() {

    }
}

class Krasomostwo extends Talent{
    public Krasomostwo() {
        super("");
    }

    void change() {

    }
}

class Krzepki extends Talent{
    public Krzepki() {
        super("");
    }

    void change() {

    }
}

class Lapowkarz extends Talent{
    public Lapowkarz () {
        super("");
    }

    void change() {

    }
}

class MagBitewny extends Talent{
    public MagBitewny () {
        super("");
    }

    void change() {

    }
}

class MagiaChaosu extends Talent{
    String tradycja;
    public MagiaChaosu(String tradycja) {
        super("");
        this.tradycja = tradycja;
    }

    void change() {

    }
}

class MagiaProsta extends Talent{
    public MagiaProsta() {
        super("");
    }

    void change() {

    }
}

class MagiaTajemna extends Talent{
    String tradycja;
    public MagiaTajemna (String tradycja) {
        super("");
        this.tradycja = tradycja;
    }

    void change() {

    }
}

class Majetny extends Talent{
    public Majetny () {
        super("");
    }

    void change() {

    }
}

class Maly extends Talent{
    public Maly () {
        super("");
    }

    void change() {

    }
}

class MistrzCharakteryzacji extends Talent{
    public MistrzCharakteryzacji() {
        super("");
    }

    void change() {

    }
}

class MistrzRzemiosla extends Talent{
    String rzemioslo;
    public MistrzRzemiosla (String rzemioslo) {
        super("");
        this.rzemioslo = rzemioslo;
    }

    void change() {

    }
}

class MistrzWalki extends Talent{
    public MistrzWalki() {
        super("");
    }

    void change() {

    }
}

class MocnePlecy extends Talent{
    public MocnePlecy () {
        super("");
    }

    void change() {

    }
}

class MorderczyAtak extends Talent{
    public MorderczyAtak() {
        super("");
    }

    void change() {

    }
}

class MolKsiazkowy extends Talent{
    public MolKsiazkowy() {
        super("");
    }

    void change() {

    }
}

class Mowca extends Talent{
    public Mowca() {
        super("");
    }

    void change() {

    }
}

class Musztra extends Talent{
    public Musztra() {
        super("");
    }

    void change() {

    }
}

class NaCzteryLapy extends Talent{
    public NaCzteryLapy() {
        super("");
    }

    void change() {

    }
}

class Naciagacz extends Talent{
    public Naciagacz() {
        super("");
    }

    void change() {

    }
}

class Nasladowca extends Talent{
    public Nasladowca () {
        super("");
    }

    void change() {

    }
}

class NiegodnyUwagi extends Talent{
    public NiegodnyUwagi() {
        super("");
    }

    void change() {

    }
}

class Nienawisc extends Talent{
    public Nienawisc () {
        super("");
    }

    void change() {

    }
}

class Nieublagany extends Talent{
    public Nieublagany() {
        super("");
    }

    void change() {

    }
}

class Nieugiety extends Talent{
    public Nieugiety () {
        super("");
    }

    void change() {

    }
}

class Nieustepliwy extends Talent{
    public Nieustepliwy() {
        super("");
    }

    void change() {

    }
}

class Nieustraszony extends Talent{
    public Nieustraszony() {
        super("");
    }

    void change() {

    }
}

class Niewzruszony extends Talent{
    public Niewzruszony() {
        super("");
    }

    void change() {

    }
}

class NiezwykleOdporny extends Talent{
    public NiezwykleOdporny() {
        super("");
    }

    void change() {

    }
}

class NosDoKlopotow extends Talent{
    public NosDoKlopotow() {
        super("");
    }

    void change() {

    }
}

class Numizmatyka extends Talent{
    public Numizmatyka() {
        super("");
    }

    void change() {

    }
}

class Obiezyswiat extends Talent{
    public Obiezyswiat() {
        super("");
    }

    void change() {

    }
}

class Oburecznosc extends Talent{
    public Oburecznosc() {
        super("");
    }

    void change() {

    }
}

class OdpornyNaMagie extends Talent{
    public OdpornyNaMagie() {
        super("");
    }

    void change() {

    }
}

class OdpornoscPsychiczna extends Talent{
    public OdpornoscPsychiczna() {
        super("");
    }

    void change() {

    }
}

class OdpornyNaZagrozenie extends Talent{
    public OdpornyNaZagrozenie() {
        super("");
    }

    void change() {

    }
}

class OdwrocenieSzans extends Talent{
    public OdwrocenieSzans() {
        super("");
    }

    void change() {

    }
}

class Ogloszenie extends Talent{
    public Ogloszenie() {
        super("");
    }

    void change() {

    }
}

class OkoLowcy extends Talent{
    public OkoLowcy() {
        super("");
    }

    void change() {

    }
}

class PercepcjaMagiczna extends Talent{
    public PercepcjaMagiczna() {
        super("");
    }

    void change() {

    }
}

class PierwszaPomoc extends Talent{
    public PierwszaPomoc() {
        super("");
    }

    void change() {

    }
}

class Pilot extends Talent{
    public Pilot() {
        super("");
    }

    void change() {

    }
}

class PilotRzeczny extends Talent{
    public PilotRzeczny() {
        super("");
    }

    void change() {

    }
}

class Poliglota extends Talent{
    public Poliglota () {
        super("");
    }

    void change() {

    }
}

class Pomocny extends Talent{
    public Pomocny () {
        super("");
    }

    void change() {

    }
}

class PorywajacaGorliwosc extends Talent{
    public PorywajacaGorliwosc() {
        super("");
    }

    void change() {

    }
}

class PosluchUZwierzat extends Talent{
    public PosluchUZwierzat() {
        super("");
    }

    void change() {

    }
}

class PrecyzyjneInkantowanie extends Talent{
    public PrecyzyjneInkantowanie() {
        super("");
    }

    void change() {

    }
}

class ProstoMiedzyOczy extends Talent{
    public ProstoMiedzyOczy() {
        super("");
    }

    void change() {

    }
}

class Przekonujacy extends Talent{
    public Przekonujacy() {
        super("");
    }

    void change() {

    }
}

class Przestepca extends Talent{
    public Przestepca() {
        super("");
    }

    void change() {

    }
}

class PrzyrzadzanieMikstur extends Talent{
    public PrzyrzadzanieMikstur() {
        super("");
    }

    void change() {

    }
}

class Riposta extends Talent{
    public Riposta() {
        super("");
    }

    void change() {

    }
}

class Rozbrojenie extends Talent{
    public Rozbrojenie() {
        super("");
    }

    void change() {

    }
}

class RozpoznanieArtefaktu extends Talent{
    public RozpoznanieArtefaktu() {
        super("");
    }

    void change() {

    }
}

class RozproszenieUwagi extends Talent{
    public RozproszenieUwagi() {
        super("");
    }

    void change() {

    }
}

class RuchliweDlonie extends Talent{
    public RuchliweDlonie() {
        super("");
    }

    void change() {

    }
}

class Rybak extends Talent{
    public Rybak() {
        super("");
    }

    void change() {

    }
}

class SekretnaTozsamosc extends Talent{
    public SekretnaTozsamosc() {
        super("");
    }

    void change() {

    }
}

class SilneNogi extends Talent{
    public SilneNogi () {
        super("");
    }

    void change() {

    }
}

class SilnyCios extends Talent{
    public SilnyCios () {
        super("");
    }

    void change() {

    }
}

class SkrocenieDystansu extends Talent{
    public SkrocenieDystansu () {
        super("");
    }

    void change() {

    }
}

class SluchAbsolutny extends Talent{
    public SluchAbsolutny() {
        super("");
    }

    void change() {

    }
}

class Snajper extends Talent{
    public Snajper() {
        super("");
    }

    void change() {

    }
}

class Sprezynka extends Talent{
    public Sprezynka() {
        super("");
    }

    void change() {

    }
}

class Straszny extends Talent{
    public Straszny() {
        super("");
    }

    void change() {

    }
}

class StrzalPrzebijajacy extends Talent{
    public StrzalPrzebijajacy() {
        super("");
    }

    void change() {

    }
}

class StrzalWDziesiatke extends Talent{
    public StrzalWDziesiatke() {
        super("");
    }

    void change() {

    }
}

class StrzelecWyborowy extends Talent{
    public StrzelecWyborowy() {
        super("");
    }

    void change() {

    }
}

class SzalBojowy extends Talent{
    public SzalBojowy () {
        super("");
    }

    void change() {

    }
}

class Szczescie extends Talent{
    public Szczescie () {
        super("");
    }

    void change() {

    }
}

class SzczurTunelowy extends Talent{
    public SzczurTunelowy() {
        super("");
    }

    void change() {

    }
}

class SzostyZmysl extends Talent{
    public SzostyZmysl() {
        super("");
    }

    void change() {

    }
}

class Szuler extends Talent{
    public Szuler() {
        super("");
    }

    void change() {

    }
}

class SzulerKosciany extends Talent{
    public SzulerKosciany() {
        super("");
    }

    void change() {

    }
}

class SzybkiRefleks extends Talent{
    public SzybkiRefleks() {
        super("");
    }

    void change() {

    }
}

class SzybkieCzytanie extends Talent{
    public SzybkieCzytanie() {
        super("");
    }

    void change() {

    }
}

class SzybkiePrzeladowanie extends Talent{
    public SzybkiePrzeladowanie() {
        super("");
    }

    void change() {

    }
}

class Szybkobiegacz extends Talent{
    public Szybkobiegacz() {
        super("");
    }

    void change() {

    }
}

class Szycha extends Talent{
    public Szycha() {
        super("");
    }

    void change() {

    }
}

class SwietnyPlywak extends Talent{
    public SwietnyPlywak() {
        super("");
    }

    void change() {

    }
}

class SwietaNienawisc extends Talent{
    public SwietaNienawisc() {
        super("");
    }

    void change() {

    }
}

class SwieteWizje extends Talent{
    public SwieteWizje () {
        super("");
    }

    void change() {

    }
}

class TalentArtystyczny extends Talent{
    public TalentArtystyczny() {
        super("");
    }

    void change() {

    }
}

class Tarczownik extends Talent{
    public Tarczownik() {
        super("");
    }

    void change() {

    }
}

class Towarzyski extends Talent{
    public Towarzyski () {
        super("");
    }

    void change() {

    }
}

class Tragarz extends Talent{
    public Tragarz () {
        super("");
    }

    void change() {

    }
}

class Traper extends Talent{
    public Traper () {
        super("");
    }

    void change() {

    }
}

class Twardziel extends Talent{
    public Twardziel () {
        super("");
    }

    void change() {

    }
}

class Ulicznik extends Talent{
    public Ulicznik () {
        super("");
    }

    void change() {

    }
}

class UrodzonyWSiodle extends Talent{
    public UrodzonyWSiodle() {
        super("");
    }

    void change() {

    }
}

class UrodzonyWojownik extends Talent{
    public UrodzonyWojownik() {
        super("");
    }

    void change() {

    }
}

class UrodzonyZeglarz extends Talent{
    public UrodzonyZeglarz() {
        super("");
    }

    void change() {

    }
}

class WaleczneSerce extends Talent{
    public WaleczneSerce() {
        super("");
    }

    void change() {

    }
}

class WalkaWCiasnocie extends Talent{
    public WalkaWCiasnocie() {
        super("");
    }

    void change() {

    }
}

class WidzenieWCiemnosci extends Talent{
    public WidzenieWCiemnosci() {
        super("");
    }

    void change() {

    }
}

class WiezaPamieci extends Talent{
    public WiezaPamieci() {
        super("");
    }

    void change() {

    }
}

class WilkMorski extends Talent{
    public WilkMorski() {
        super("");
    }

    void change() {

    }
}

class WladczaPostura extends Talent{
    public WladczaPostura() {
        super("");
    }

    void change() {

    }
}

class Wloczykij extends Talent{
    public Wloczykij() {
        super("");
    }

    void change() {

    }
}

class Wodniak extends Talent{
    public Wodniak() {
        super("");
    }

    void change() {

    }
}

class Woltyzerka extends Talent{
    public Woltyzerka() {
        super("");
    }

    void change() {

    }
}

class Wodz extends Talent{
    public Wodz() {
        super("");
    }

    void change() {

    }
}

class WrozbaLosu extends Talent{
    public WrozbaLosu () {
        super("");
    }

    void change() {

    }
}

class Wstrzemiezliwy extends Talent{
    public Wstrzemiezliwy() {
        super("");
    }

    void change() {

    }
}

class WscieklyAtak extends Talent{
    public WscieklyAtak() {
        super("");
    }

    void change() {

    }
}

class WtargniecieZWlamaniem extends Talent{
    public WtargniecieZWlamaniem() {
        super("");
    }

    void change() {

    }
}

class WybornyWspinacz extends Talent{
    public WybornyWspinacz() {
        super("");
    }

    void change() {

    }
}

class WyczucieKierunku extends Talent{
    public WyczucieKierunku() {
        super("");
    }

    void change() {

    }
}

class WyczulonyZmysl extends Talent{
    public WyczulonyZmysl() {
        super("");
    }

    void change() {

    }
}

class WykrywanieMagii extends Talent{
    public WykrywanieMagii() {
        super("");
    }

    void change() {

    }
}

class Wytrwaly extends Talent{
    public Wytrwaly () {
        super("");
    }

    void change() {

    }
}

class Wytworca extends Talent{
    public Wytworca () {
        super("");
    }

    void change() {

    }
}

class ZBata extends Talent{
    public ZBata () {
        super("");
    }

    void change() {

    }
}

class Zabojca extends Talent{
    public Zabojca () {
        super("");
    }

    void change() {

    }
}

class ZbicieBroni extends Talent{
    public ZbicieBroni() {
        super("");
    }

    void change() {

    }
}

class ZejscieZLinii extends Talent{
    public ZejscieZLinii() {
        super("");
    }

    void change() {

    }
}

class ZimnaKrew extends Talent{
    public ZimnaKrew() {
        super("");
    }

    void change() {

    }
}

class ZlotaRaczka extends Talent{
    public ZlotaRaczka() {
        super("");
    }

    void change() {

    }
}

class ZmyslBitewny extends Talent{
    public ZmyslBitewny() {
        super("");
    }

    void change() {

    }
}

class ZmyslMagii extends Talent{
    public ZmyslMagii() {
        super("");
    }

    void change() {

    }
}

class Znawca extends Talent{
    String wiedza;
    public Znawca (String wiedza) {
        super("");
        this.wiedza = wiedza;
    }

    void change() {

    }
}

class Zreczny extends Talent{
    public Zreczny () {
        super("");
    }

    void change() {

    }
}

class ZelaznaSzczeka extends Talent{
    public ZelaznaSzczeka() {
        super("");
    }

    void change() {

    }
}

class ZelaznaWola extends Talent{
    public ZelaznaWola() {
        super("");
    }

    void change() {

    }
}

class Zylkahandlowa extends Talent{
    public Zylkahandlowa() {
        super("");
    }

    void change() {

    }
}