import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Character {

    String name;
    String sex;
    Career career = new Career();
    String specie;
    Attribute walka_wrecz;
    Attribute umiejetnosci_strzeleckie;
    Attribute sila;
    Attribute wytrzymalosc;
    Attribute inicjatywa;
    Attribute zwinnosc;
    Attribute zrecznosc;
    Attribute inteligencja;
    Attribute sila_woli;
    Attribute oglada;
    int zywotnosc;
    int szybkosc;
    ArrayList<Skill> skills;
    ArrayList<Talent> talents;

    public Character() {
        generateSex();
        generateSpecie();
        generateName(sex, specie);
        generateCareer(specie);
        generateAttributes(specie);
        generateSkills(specie, career);
        generateTalents(specie, career);
    }

    private void generateSex() {
        Random random = new Random();
        if (random.nextInt()%2 == 0) this.sex = "Mężczyzna";
        else this.sex = "Kobieta";
    }
    private void generateSpecie(){
        int number;
        Random random = new Random();
        number = random.nextInt(100) + 1;

        if (number <= 90) specie = "Człowiek";
        else if (number > 90 && number < 95) specie = "Niziołek";
        else if (number >= 95 && number <= 98) specie = "Krasnolud";
        else if (number == 99) specie = "Wysoki Elf";
        else if (number == 100) specie = "Leśny Elf";
    }
    private void generateName(String sex, String specie) {
        int number;
        Random random = new Random();
        if (Objects.equals(specie, "Człowiek")) {
            switch (sex) {
                case "Mężczyzna":
                    number = random.nextInt(300) + 1;
                    switch (number) {
                        case 1:  name = "Abelhard"; break; case 2:  name = "Abelhelm"; break; case 3:  name = "Admund"; break; case 4:  name = "Adred"; break; case 5:  name = "Adric"; break; case 6:  name = "Agis"; break; case 7:  name = "Alaric"; break; case 8:  name = "Alberic"; break; case 9:  name = "Albrecht"; break; case 10:  name = "Aldebrand"; break;
                        case 11:  name = "Aldred"; break; case 12:  name = "Aldric"; break; case 13:  name = "Alfeid"; break; case 14:  name = "Altmar"; break; case 15:  name = "Alric"; break; case 16:  name = "Andre"; break; case 17:  name = "Andred"; break; case 18:  name = "Andric"; break; case 19:  name = "Anshelm"; break; case 20:  name = "Anton"; break;
                        case 21:  name = "Arne"; break; case 22:  name = "Arnulf"; break; case 23:  name = "Axel"; break; case 24:  name = "Axelbrand"; break; case 25:  name = "Baldred"; break; case 26:  name = "Baldric"; break; case 27:  name = "Baldwin"; break; case 28:  name = "Balthasar"; break; case 29:  name = "Barnabas"; break; case 30:  name = ""; break;
                        case 31:  name = "Bartolf"; break; case 32:  name = "Bartomar"; break; case 33:  name = "Bernolt"; break; case 34:  name = "Bertold"; break; case 35:  name = "Bertolf"; break; case 36:  name = "Boris"; break; case 37:  name = "Bruno"; break; case 38:  name = "Burgolf"; break; case 39:  name = "Calvin"; break; case 40:  name = "Casimir"; break;
                        case 41:  name = "Caspar"; break; case 42:  name = "Cedred"; break; case 43:  name = "Conrad"; break; case 44:  name = "Corvin"; break; case 45:  name = "Dagmar"; break; case 46:  name = "Dankmar"; break; case 47:  name = "Dankred"; break; case 48:  name = "Dekmar"; break; case 49:  name = "Detlef"; break; case 50:  name = "Diebold"; break;
                        case 51:  name = "Diel"; break; case 52:  name = "Dietfried"; break; case 53:  name = "Dieter"; break; case 54:  name = "Dietmar"; break; case 55:  name = "Dietmund"; break; case 56:  name = "Dietrich"; break; case 57:  name = "Dirk"; break; case 58:  name = "Donat"; break; case 59:  name = "Durnhelm"; break; case 60:  name = "Eber"; break;
                        case 61:  name = "Eckel"; break; case 62:  name = "Eckhart"; break; case 63:  name = "Edgar"; break; case 64:  name = "Edmund"; break; case 65:  name = "Edwin"; break; case 66:  name = "Ehrhart"; break; case 67:  name = "Ehrl"; break; case 68:  name = "Ehrwig"; break; case 69:  name = "Eldred"; break; case 70:  name = "Elmeric"; break;
                        case 71:  name = "Emil"; break; case 72:  name = "Engel"; break; case 73:  name = "Engelbert"; break; case 74:  name = "Engelbrecht"; break; case 75:  name = "Engelhart"; break; case 76:  name = "Eodred"; break; case 77:  name = "Eomund"; break; case 78:  name = "Erdman"; break; case 79:  name = "Erdred"; break; case 80:  name = "Erkenbrand"; break;
                        case 81:  name = "Erasmus"; break; case 82:  name = "Erich"; break; case 83:  name = "Erman"; break; case 84:  name = "Ernst"; break; case 85:  name = "Erwin"; break; case 86:  name = "Eugen"; break; case 87:  name = "Eustasius"; break; case 88:  name = "Ewald"; break; case 89:  name = "Fabian"; break; case 90:  name = "Faustus"; break;
                        case 91:  name = "Felix"; break; case 92:  name = "Ferdinand"; break; case 93:  name = "Fleugweiner"; break; case 94:  name = "Fosten"; break; case 95:  name = "Franz"; break; case 96:  name = "Frediger"; break; case 97:  name = "Fredric"; break; case 98:  name = "Friebald"; break; case 99:  name = "Friedrich"; break; case 100:  name = "Fulko"; break;
                        case 101:  name = "Gawin"; break; case 102:  name = "Gerber"; break; case 103:  name = "Gerhart"; break; case 104:  name = "Gerlach"; break; case 105:  name = "Gernar"; break; case 106:  name = "Gerolf"; break; case 107:  name = "Gilbrecht"; break; case 108:  name = "Gisbert"; break; case 109:  name = "Giselbrecht"; break; case 110:  name = "Gismar"; break;
                        case 111:  name = "Goran"; break; case 112:  name = "Gosbert"; break; case 113:  name = "Goswin"; break; case 114:  name = "Gotfried"; break; case 115:  name = "Gothard"; break; case 116:  name = "Gottolf"; break; case 117:  name = "Gotwin"; break; case 118:  name = "Gregor"; break; case 119:  name = "Greimold"; break; case 120:  name = "Grimwold"; break;
                        case 121:  name = "Griswold"; break; case 122:  name = "Guido"; break; case 123:  name = "Gundolf"; break; case 124:  name = "Gundred"; break; case 125:  name = "Gunnar"; break; case 126:  name = "Gunter"; break; case 127:  name = "Gunther"; break; case 128:  name = "Gustaf"; break; case 129:  name = "Hadred"; break; case 130:  name = "Hadwin"; break;
                        case 131:  name = "Hagar"; break; case 132:  name = "Hagen"; break; case 133:  name = "Haldred"; break; case 134:  name = "Halman"; break; case 135:  name = "Hamlyn"; break; case 136:  name = "Hans"; break; case 137:  name = "Harbrand"; break; case 138:  name = "Harman"; break; case 139:  name = "Hartmann"; break; case 140:  name = "Haug"; break;
                        case 141:  name = "Heidric"; break; case 142:  name = "Heimar"; break; case 143:  name = "Heinfried"; break; case 144:  name = "Heinman"; break; case 145:  name = "Heinrich"; break; case 146:  name = "Heinz"; break; case 147:  name = "Helmut"; break; case 148:  name = "Henlyn"; break; case 149:  name = "Hermann"; break; case 150:  name = "Herwin"; break;
                        case 151:  name = "Hieronymus"; break; case 152:  name = "Hildebart"; break; case 153:  name = "Hildebrand"; break; case 154:  name = "Hildemar"; break; case 155:  name = "Hildemund"; break; case 156:  name = "ildred"; break; case 157:  name = "Hildric"; break; case 158:  name = "Horst"; break; case 159:  name = "Hugo"; break; case 160:  name = "Igor"; break;
                        case 161:  name = "Ingwald"; break; case 162:  name = "Jander"; break; case 163:  name = "Jekil"; break; case 164:  name = "Jodokus"; break; case 165:  name = "Johann"; break; case 166:  name = "Jonas"; break; case 167:  name = "Jorg"; break; case 168:  name = "Jorn"; break; case 169:  name = "Josef"; break; case 170:  name = "Jost"; break;
                        case 171:  name = "Jurgen"; break; case 172:  name = "Karl"; break; case 173:  name = "Kaspar"; break; case 174:  name = "Klaus"; break; case 175:  name = "Kleber"; break; case 176:  name = "Konrad"; break; case 177:  name = "Konradin"; break; case 178:  name = "Kurt"; break; case 179:  name = "Lamprecht"; break; case 180:  name = "Lanfried"; break;
                        case 181:  name = "Lanric"; break; case 182:  name = "Lanwin"; break; case 183:  name = "Leo"; break; case 184:  name = "Leopold"; break; case 185:  name = "Levin"; break; case 186:  name = "Liebert"; break; case 187:  name = "Liebrecht"; break; case 188:  name = "Liebwin"; break; case 189:  name = "Lienhart"; break; case 190:  name = "Linus"; break;
                        case 191:  name = "Lodwig"; break; case 192:  name = "Lothar"; break; case 193:  name = "Lucius"; break; case 194:  name = "Ludwig"; break; case 195:  name = "Luitpold"; break; case 196:  name = "Lukas"; break; case 197:  name = "Lupold"; break; case 198:  name = "Lupus"; break; case 199:  name = "Luther"; break; case 200:  name = "Lutolf"; break;
                        case 201:  name = "Madred"; break; case 202:  name = "Magnus"; break; case 203:  name = "Mandred"; break; case 204:  name = "Manfred"; break; case 205:  name = "Mathias"; break; case 206:  name = "Max"; break; case 207:  name = "Maximillian"; break; case 208:  name = "Meiner"; break; case 209:  name = "Meinhart"; break; case 210:  name = "Meinolf"; break;
                        case 211:  name = "Mekel"; break; case 212:  name = "Merkel"; break; case 213:  name = "Nat"; break; case 214:  name = "Nathandar"; break; case 215:  name = "Nicodemus"; break; case 216:  name = "Odamar"; break; case 217:  name = "Odric"; break; case 218:  name = "Odwin"; break; case 219:  name = "Olbrecht"; break; case 220:  name = "Oldred"; break;
                        case 221:  name = "Oldric"; break; case 222:  name = "Ortlieb"; break; case 223:  name = "Ortolf"; break; case 224:  name = "Orwin"; break; case 225:  name = "Oswald"; break; case 226:  name = "Osric"; break; case 227:  name = "Oswin"; break; case 228:  name = "Otfried"; break; case 229:  name = "Otto"; break; case 230:  name = "Otwin"; break;
                        case 231:  name = "Paulus"; break; case 232:  name = "Prospero"; break; case 233:  name = "Ragen"; break; case 234:  name = "Ralf"; break; case 235:  name = "Rambrecht"; break; case 236:  name = "Randulf"; break; case 237:  name = "Ranulf"; break; case 238:  name = "Ranald"; break; case 239:  name = "Reikhard"; break; case 240:  name = "Rein"; break;
                        case 241:  name = "Reiner"; break; case 242:  name = "Reinhard"; break; case 243:  name = "Reinolt"; break; case 244:  name = "Reuban"; break; case 245:  name = "Rigo"; break; case 246:  name = "Roderic"; break; case 247:  name = "Rolf"; break; case 248:  name = "Ruben"; break; case 249:  name = "Rudel"; break; case 250:  name = "Rudgar"; break;
                        case 251:  name = "Rudolf"; break; case 252:  name = "Rufus"; break; case 253:  name = "Ruprecht"; break; case 254:  name = "Sebastian"; break; case 255:  name = "Semund"; break; case 256:  name = "Sepp"; break; case 257:  name = "Sieger"; break; case 258:  name = "Siegfried"; break; case 259:  name = "Siegmund"; break; case 260:  name = "Sigismund"; break;
                        case 261:  name = "Sigric"; break; case 262:  name = "Steffan"; break; case 263:  name = "Tankred"; break; case 264:  name = "Theoderic"; break; case 265:  name = "Tilmann"; break; case 266:  name = "Tomas"; break; case 267:  name = "Trubald"; break; case 268:  name = "Trubert"; break; case 269:  name = "Udo"; break; case 270:  name = "Ulli"; break;
                        case 271:  name = "Ulfred"; break; case 272:  name = "Ulfman"; break; case 273:  name = "Ulman"; break; case 274:  name = "Uto"; break; case 275:  name = "Valdred"; break; case 276:  name = "Valdric"; break; case 277:  name = "Varl"; break; case 278:  name = "Viggo"; break; case 279:  name = "Viktor"; break; case 280:  name = "Vilmar"; break;
                        case 281:  name = "Volker"; break; case 282:  name = "Volkhard"; break; case 283:  name = "Volkrad"; break; case 284:  name = "Volkin"; break; case 285:  name = "Voltz"; break; case 286:  name = "Walbrecht"; break; case 287:  name = "Waldor"; break; case 288:  name = "Waldred"; break; case 289:  name = "Walther"; break; case 290:  name = "Warmund"; break;
                        case 291:  name = "Werner"; break; case 292:  name = "Wilbert"; break; case 293:  name = "Wilfried"; break; case 294:  name = "Wilhelm"; break; case 295:  name = "Woldred"; break; case 296:  name = "Wolfram"; break; case 297:  name = "Wolfhart"; break; case 298:  name = "Wolfgang"; break; case 299:  name = "Wulf"; break; case 300:  name = "Xavier"; break;
                    }
                    break;
                case "Kobieta":
                    number = random.nextInt(236) + 1;
                    switch (number) {
                        case 1: name = "Abbie"; break; case 2: name = "Abighild"; break; case 3: name = "Abigeil"; break; case 4: name = "Abigunda"; break; case 5: name = "Ada"; break; case 6: name = "Adel"; break; case 7: name = "Adelind"; break; case 8: name = "Adeline"; break; case 9: name = "Adelyn"; break; case 10: name = "Adelle"; break;
                        case 11: name = "Agathe"; break; case 12: name = "Agnete"; break; case 13: name = "Aldreda"; break; case 14: name = "Alfreda"; break; case 15: name = "Alicia"; break; case 16: name = "Allane"; break; case 17: name = "Althea"; break; case 18: name = "Amalie"; break; case 19: name = "Amalinde"; break; case 20: name = "Amalyn"; break;
                        case 21: name = "Anhilda"; break; case 22: name = "Annabella"; break; case 23: name = "Anna"; break; case 24: name = "Anthea"; break; case 25: name = "Aarabella"; break; case 26: name = "Aver"; break; case 27: name = "Bechilda"; break; case 28: name = "Bella"; break; case 29: name = "Bellane"; break; case 30: name = "Benedicta"; break;
                        case 31: name = "Berlinda"; break; case 32: name = "Benrlyn"; break; case 33: name = "Bertha"; break; case 34: name = "Berthilda"; break; case 35: name = "Bess"; break; case 36: name = "Beth"; break; case 37: name = "Broncea"; break; case 38: name = "Brunhilda"; break; case 39: name = "Camilla"; break; case 40: name = "Carla"; break;
                        case 41: name = "Carlinda"; break; case 42: name = "Carlotta"; break; case 43: name = "Cilicia"; break; case 44: name = "Cilie"; break; case 45: name = "Clora"; break; case 46: name = "Clothilda"; break; case 47: name = "Connie"; break; case 48: name = "Constance"; break; case 49: name = "Constanza"; break; case 50: name = "Cordelia"; break;
                        case 51: name = "Dema"; break; case 52: name = "Demona"; break; case 53: name = "Desdemona"; break; case 54: name = "Dorthilda"; break; case 55: name = "Drachena"; break; case 56: name = "Drachilda"; break; case 57: name = "Edhilda"; break; case 58: name = "Edith"; break; case 59: name = "Edyth"; break; case 60: name = "Edythe"; break;
                        case 61: name = "Eleanor"; break; case 62: name = "Elinor"; break; case 63: name = "Elisinda"; break; case 64: name = "Elsina"; break; case 65: name = "Ella"; break; case 66: name = "Ellene"; break; case 67: name = "Ellinde"; break; case 68: name = "Eloise"; break; case 69: name = "Elsa"; break; case 70: name = "Elsbeth"; break;
                        case 71: name = "Elspeth"; break; case 72: name = "Elyn"; break; case 73: name = "Emagunda"; break; case 74: name = "Emelia"; break; case 75: name = "Emme"; break; case 76: name = "Emmalyn"; break; case 77: name = "Emmanuel"; break; case 78: name = "Emerlinde"; break; case 79: name = "Emerlyn"; break; case 80: name = "Erica"; break;
                        case 81: name = "Ermina"; break; case 82: name = "Erminlind"; break; case 83: name = "Ermintrude"; break; case 84: name = "Esmeralda"; break; case 85: name = "Estelle"; break; case 86: name = "Etheldreda"; break; case 87: name = "Ethelind"; break; case 88: name = "Ethelreda"; break; case 89: name = "Fay"; break; case 90: name = "Frieda"; break;
                        case 91: name = "Friedhilda"; break; case 92: name = "Friedrun"; break; case 93: name = "Friedrica"; break; case 94: name = "Gabby"; break; case 95: name = "Gabriele"; break; case 96: name = "Galina"; break; case 97: name = "Gena"; break; case 98: name = "Geneveva"; break; case 99: name = "Gerberga"; break; case 100: name = "Gerda"; break;
                        case 101: name = "Gerline"; break; case 102: name = "Getrie"; break; case 103: name = "Getrud"; break; case 104: name = "Greta"; break; case 105: name = "Gretchen"; break; case 106: name = "Grizelda"; break; case 107: name = "Grunhilda"; break; case 108: name = "Gudrun"; break; case 109: name = "Gudryn"; break; case 110: name = "Hanna"; break;
                        case 111: name = "Hedwig"; break; case 112: name = "Heidi"; break; case 113: name = "Heidrun"; break; case 114: name = "Helga"; break; case 115: name = "Herlinde"; break; case 116: name = "Herwig"; break; case 117: name = "Hilda"; break; case 118: name = "Hildegart"; break; case 119: name = "Hildegund"; break; case 120: name = "Honoria"; break;
                        case 121: name = "Ida"; break; case 122: name = "Ingrid"; break; case 123: name = "Ingrun"; break; case 124: name = "Ingrund"; break; case 125: name = "Irmella"; break; case 126: name = "Irmine"; break; case 127: name = "Isabella"; break; case 128: name = "Isadora"; break; case 129: name = "Isolde"; break; case 130: name = "Jocelin"; break;
                        case 131: name = "Johanna"; break; case 132: name = "Josie"; break; case 133: name = "Karin"; break; case 134: name = "Katarine"; break; case 135: name = "Katheryn"; break; case 136: name = "Katherina"; break; case 137: name = "Katerine"; break; case 138: name = "Keterlind"; break; case 139: name = "Keterlyn"; break; case 140: name = "Kitty"; break;
                        case 141: name = "Kristen"; break; case 142: name = "Kristena"; break; case 143: name = "Kristyn"; break; case 144: name = "Kirsten"; break; case 145: name = "Kirstyn"; break; case 146: name = "Lavina"; break; case 147: name = "Lavinia"; break; case 148: name = "Leanor"; break; case 149: name = "Leanora"; break; case 150: name = "Leticia"; break;
                        case 151: name = "Letty"; break; case 152: name = "Lena"; break; case 153: name = "Lenora"; break; case 154: name = "Lisa"; break; case 155: name = "Lisbeth"; break; case 156: name = "Lizzie"; break; case 157: name = "Lorinda"; break; case 158: name = "Lorna"; break; case 159: name = "Lucinda"; break; case 160: name = "Lucretia"; break;
                        case 161: name = "Lucie"; break; case 162: name = "Ludmilla"; break; case 163: name = "Mabel"; break; case 164: name = "Magde"; break; case 165: name = "Magdalyn"; break; case 166: name = "Maggie"; break; case 167: name = "Maghilda"; break; case 168: name = "Maglind"; break; case 169: name = "Maglyn"; break; case 170: name = "Magunda"; break;
                        case 171: name = "Magreta"; break; case 172: name = "Maida"; break; case 173: name = "Marien"; break; case 174: name = "Marietta"; break; case 175: name = "Margaret"; break; case 176: name = "Marget"; break; case 177: name = "Margreta"; break; case 178: name = "Marline"; break; case 179: name = "Marlyn"; break; case 180: name = "Mathilda"; break;
                        case 181: name = "Maude"; break; case 182: name = "May"; break; case 183: name = "Meg"; break; case 184: name = "Melicent"; break; case 185: name = "Miranda"; break; case 186: name = "Moll"; break; case 187: name = "Nathilda"; break; case 188: name = "Nellie"; break; case 189: name = "Nora"; break; case 190: name = "Olga"; break;
                        case 191: name = "Ophelia"; break; case 192: name = "Osterhild"; break; case 193: name = "Ostia"; break; case 194: name = "Ostelle"; break; case 195: name = "Ottagunda"; break; case 196: name = "Ottaline"; break; case 197: name = "Ottilda"; break; case 198: name = "Ottilyn"; break; case 199: name = "Perdita"; break; case 200: name = "Pergale"; break;
                        case 201: name = "Pergunda"; break; case 202: name = "Petronella"; break; case 203: name = "Philomelia"; break; case 204: name = "Reikhilda"; break; case 205: name = "Renata"; break; case 206: name = "Rosabel"; break; case 207: name = "Rosabella"; break; case 208: name = "Rosale"; break; case 209: name = "Rosalia"; break; case 210: name = "Rosalin"; break;
                        case 211: name = "Rosalinde"; break; case 212: name = "Rosamunde"; break; case 213: name = "Rosanne"; break; case 214: name = "Rose"; break; case 215: name = "Roz"; break; case 216: name = "Rozhilda"; break; case 217: name = "Salina"; break; case 218: name = "Saltza"; break; case 219: name = "Sigismunda"; break; case 220: name = "Sigrid"; break;
                        case 221: name = "Sigunda"; break; case 222: name = "Solla"; break; case 223: name = "Styrine"; break; case 224: name = "Talima"; break; case 225: name = "Theodora"; break; case 226: name = "Therese"; break; case 227: name = "Tilea"; break; case 228: name = "Ursula"; break; case 229: name = "Ulrica"; break; case 230: name = "Valeria"; break;
                        case 231: name = "Verena"; break; case 232: name = "Wilhelmina"; break; case 233: name = "Winifred"; break; case 234: name = "Wolfhilde"; break; case 235: name = "Zemelda"; break; case 236: name = "Zena"; break;
                    }
                    break;
            }
            number = random.nextInt(100) + 1;
            switch (number) {
                case 1: name += " Adelhof"; break; case 2: name += " Albrecht"; break; case 3: name += " Allenstag"; break; case 4: name += " Altmann"; break; case 5: name += " Atzwig"; break; case 6: name += " Bacher"; break; case 7: name += " Baer"; break; case 8: name += " Baumann"; break; case 9: name += " Becker"; break; case 10: name += " Behn"; break;
                case 11: name += " Betz"; break; case 12: name += " Beyer"; break; case 13: name += " Bischof"; break; case 14: name += " Boehm"; break; case 15: name += " Breitenbach"; break; case 16: name += " Breuer"; break; case 17: name += " Dahmbach"; break; case 18: name += " Delfholt"; break; case 19: name += " Drakenhof"; break; case 20: name += " Drauwulf"; break;
                case 21: name += " Durrbein"; break; case 22: name += " Ehrhard"; break; case 23: name += " Eisenhauer"; break; case 24: name += " Eschlimann"; break; case 25: name += " Falkenheim"; break; case 26: name += " Fehr"; break; case 27: name += " Fiegler"; break; case 28: name += " Fleischer"; break; case 29: name += " Frohlich"; break; case 30: name += " Frueh"; break;
                case 31: name += " Fuchs"; break; case 32: name += " Gaffwig"; break; case 33: name += " Gaertner"; break; case 34: name += " Gebauer"; break; case 35: name += " Godtgraf"; break; case 36: name += " Grunenwald"; break; case 37: name += " Guth"; break; case 38: name += " Haintz"; break; case 39: name += " Herz"; break; case 40: name += " Herzog"; break;
                case 41: name += " Hirtzel"; break; case 42: name += " Hoch"; break; case 43: name += " Hoefer"; break; case 44: name += " Hofstetter"; break; case 45: name += " Jaeger"; break; case 46: name += " Jochutz"; break; case 47: name += " Jutzenbach"; break; case 48: name += " Kalb"; break; case 49: name += " Kaltenbach"; break; case 50: name += " Kraemer"; break;
                case 51: name += " Krebs"; break; case 52: name += " Kuhn"; break; case 53: name += " Kummel"; break; case 54: name += " Koning"; break; case 55: name += " Koningsamen"; break; case 56: name += " Lang"; break; case 57: name += " Lankdorf"; break; case 58: name += " Liess"; break; case 59: name += " Lebengut"; break; case 60: name += " Lutzen"; break;
                case 61: name += " Machholt"; break; case 62: name += " Meusmann"; break; case 63: name += " Meyer"; break; case 64: name += " Mohr"; break; case 65: name += " Muller"; break; case 66: name += " Nachtmann"; break; case 67: name += " Naubhof"; break; case 68: name += " Netzhoch"; break; case 69: name += " Neumann"; break; case 70: name += " Niederlitz"; break;
                case 71: name += " Nuhr"; break; case 72: name += " Oberholtzer"; break; case 73: name += " Ohrsten"; break; case 74: name += " Otzlowe"; break; case 75: name += " Reichert"; break; case 76: name += " Reifsneider"; break; case 77: name += " Riese"; break; case 78: name += " Rohrig"; break; case 79: name += " Reiss"; break; case 80: name += " Schaffer"; break;
                case 81: name += " Schaumer"; break; case 82: name += " Scherer"; break; case 83: name += " Schultz"; break; case 84: name += " Schleiermacher"; break; case 85: name += " Schreiber"; break; case 86: name += " Schwalb"; break; case 87: name += " Steiner"; break; case 88: name += " Tabbeck"; break; case 89: name += " Teuber"; break; case 90: name += " Tolzen"; break;
                case 91: name += " Trachsel"; break; case 92: name += " Weber"; break; case 93: name += " Wechsler"; break; case 94: name += " Wirtz"; break; case 95: name += " Widmann"; break; case 96: name += " Widmer"; break; case 97: name += " Veit"; break; case 98: name += " Vogt"; break; case 99: name += " Vogel"; break; case 100: name += " Zumwald"; break;
            }
        }
        else if (Objects.equals(specie, "Niziołek")) {
            number = random.nextInt(100) + 1;
            switch (number) {
                case 1: name = "Bag"; break; case 2: name = "Balf"; break; case 3: name = "Berc"; break; case 4: name = "Bill"; break; case 5: name = "Bobb"; break; case 6: name = "Bodg"; break; case 7: name = "Bog"; break; case 8: name = "Bom"; break; case 9: name = "Bonn"; break; case 10: name = "Brog"; break;
                case 11: name = "Bulc"; break; case 12: name = "Bull"; break; case 13: name = "Bust"; break; case 14: name = "Cam"; break; case 15: name = "Cap"; break; case 16: name = "Ced"; break; case 17: name = "Chund"; break; case 18: name = "Clog"; break; case 19: name = "Clof"; break; case 20: name = "Cob"; break;
                case 21: name = "Cog"; break; case 22: name = "Crum"; break; case 23: name = "Crump"; break; case 24: name = "Curl"; break; case 25: name = "Dod"; break; case 26: name = "Dog"; break; case 27: name = "Dott"; break; case 28: name = "Dram"; break; case 29: name = "Drub"; break; case 30: name = "Drog"; break;
                case 31: name = "Dron"; break; case 32: name = "Durc"; break; case 33: name = "Elm"; break; case 34: name = "Enn"; break; case 35: name = "Ermin"; break; case 36: name = "Ethan"; break; case 37: name = "Falc"; break; case 38: name = "Fald"; break; case 39: name = "Falm"; break; case 40: name = "Far"; break;
                case 41: name = "Fild"; break; case 42: name = "Flac"; break; case 43: name = "Fogg"; break; case 44: name = "Frit"; break; case 45: name = "Ful"; break; case 46: name = "Func"; break; case 47: name = "Gaff"; break; case 48: name = "Galb"; break; case 49: name = "Gamm"; break; case 50: name = "Gert"; break;
                case 51: name = "Giff"; break; case 52: name = "Gild"; break; case 53: name = "Gon"; break; case 54: name = "Grop"; break; case 55: name = "Gudd"; break; case 56: name = "Gump"; break; case 57: name = "Ham"; break; case 58: name = "Hal"; break; case 59: name = "Hart"; break; case 60: name = "Harp"; break;
                case 61: name = "Jac"; break; case 62: name = "Jas"; break; case 63: name = "Jasp"; break; case 64: name = "Joc"; break; case 65: name = "Lac"; break; case 66: name = "Lil"; break; case 67: name = "Lob"; break; case 68: name = "Lott"; break; case 69: name = "Lud"; break; case 70: name = "Lurc"; break;
                case 71: name = "Mad"; break; case 72: name = "Mag"; break; case 73: name = "Man"; break; case 74: name = "May"; break; case 75: name = "Mer"; break; case 76: name = "Mul"; break; case 77: name = "Murc"; break; case 78: name = "Murd"; break; case 79: name = "Nag"; break; case 80: name = "Nell"; break;
                case 81: name = "Nobb"; break; case 82: name = "Od"; break; case 83: name = "Og"; break; case 84: name = "Old"; break; case 85: name = "Pipp"; break; case 86: name = "Podd"; break; case 87: name = "Porc"; break; case 88: name = "Riff"; break; case 89: name = "Rip"; break; case 90: name = "Rob"; break;
                case 91: name = "Sam"; break; case 92: name = "Supp"; break; case 93: name = "Taff"; break; case 94: name = "Talb"; break; case 95: name = "Talc"; break; case 96: name = "Tay"; break; case 97: name = "Tom"; break; case 98: name = "Wald"; break; case 99: name = "Watt"; break; case 100: name = "Will"; break;
            }
            switch (sex) {
                case "Męczyzna":
                    number = random.nextInt(14) + 1;
                    switch (number) {
                        case 1: name += "belly "; break; case 2: name += "er "; break; case 3: name += "fast "; break; case 4: name += "in "; break; case 5: name += "it "; break; case 6: name += "mutch "; break; case 7: name += "o "; break; case 8: name += "odoc "; break; case 9: name += "riadoc "; break; case 10: name += "regar "; break;
                        case 11: name += "wick "; break; case 12: name += "wise "; break; case 13: name += "wit "; break; case 14: name += "y "; break;
                    }
                    break;
                case "Kobieta":
                    number = random.nextInt(20) + 1;
                    switch (number) {
                        case 1: name += "a "; break; case 2: name += "adell "; break; case 3: name += "alot "; break; case 4: name += "apple "; break; case 5: name += "bell "; break; case 6: name += "berry "; break; case 7: name += "eena "; break; case 8: name += "ella "; break; case 9: name += "era "; break; case 10: name += "et "; break;
                        case 11: name += "ia "; break; case 12: name += "flower "; break; case 13: name += "lotta "; break; case 14: name += "petal "; break; case 15: name += "riella "; break; case 16: name += "sweet "; break; case 17: name += "trude "; break; case 18: name += "rose "; break; case 19: name += "willow "; break; case 20: name += "y "; break;
                    }
                    break;
            }
            number = random.nextInt(100) + 1;
            switch (number) {
                case 1: name += "Altannik"; break; case 2: name += "Badylarz"; break; case 3: name += "Beczułka"; break; case 4: name += "Bielinek"; break; case 5: name += "Brzuchacz"; break; case 6: name += "Byliniak"; break; case 7: name += "Brzeżek"; break; case 8: name += "Cichobieg"; break; case 9: name += "Cierniak"; break; case 10: if (Objects.equals(sex, "Mężczyzna")) name += "Długonosy"; else name += "Długonosa"; break;
                case 11: if (Objects.equals(sex, "Mężczyzna")) name += "Długouch"; else name += "Długoucha"; break; case 12: name += "Drapak"; break; case 13: name += "Drewniak"; break; case 14: name += "Dudziarz"; break; case 15: name += "Dziwaczek"; break; case 16: name += "Figlarz"; break; case 17: name += "Futrzak"; break; case 18: name += "Glistnik"; break; case 19: name += "Głuptak"; break; case 20: name += "Groszek"; break;
                case 21: name += "Grzechotek"; break; case 22: name += "Grzywacz"; break; case 23: name += "Gwizdawek"; break; case 24: name += "Iglarz"; break; case 25: name += "Jabłecznik"; break; case 26: name += "Jagódka"; break; case 27: name += "Jaskółka"; break; case 28: name += "Kaczeniec"; break; case 29: name += "Kasztanek"; break; case 30: name += "Kędziorek"; break;
                case 31: name += "Kociak"; break; case 32: name += "Kociołek"; break; case 33: name += "Kogut"; break; case 34: name += "Kolcownik"; break; case 35: name += "Koniczynka"; break; case 36: name += "Koralik"; break; case 37: name += "Kosturek"; break; case 38: name += "Kotlarz"; break; case 39: name += "Kret"; break; case 40: name += "Kręciołek"; break;
                case 41: name += "Kruczek"; break; case 42: name += "Krupnik"; break; case 43: name += "Kulawik"; break; case 44: name += "Kwietniak"; break; case 45: name += "Łazik"; break; case 46: name += "Łąkołaz"; break; case 47: name += "Łodyżek"; break; case 48: name += "Marudniak"; break; case 49: name += "Mieszek"; break; case 50: name += "Młynek"; break;
                case 51: name += "Morwa"; break; case 52: name += "Mroczek"; break; case 53: name += "Niemysł"; break; case 54: name += "Okruszek"; break; case 55: name += "Opijus"; break; case 56: name += "Otoczak"; break; case 57: name += "Owsianniak"; break; case 58: name += "Pagórek"; break; case 59: name += "Paluch"; break; case 60: name += "Piaszczak"; break;
                case 61: name += "Piwniak"; break; case 62: name += "Piwosz"; break; case 63: name += "Podpłomyk"; break; case 64: name += "Popiołek"; break; case 65: name += "Przebiśnieg"; break; case 66: name += "Radośnik"; break; case 67: name += "Robaczek"; break; case 68: name += "Rogaś"; break; case 69: name += "Ryjek"; break; case 70: name += "Rzęsawik"; break;
                case 71: name += "Sknerus"; break; case 72: name += "Skoblik"; break; case 73: name += "Skórniak"; break; case 74: name += "Słomnik"; break; case 75: name += "Stoczek"; break; case 76: name += "Stopowłaz"; break; case 77: name += "Stopowiąz"; break; case 78: name += "Sucharek"; break; case 79: name += "Szarak"; break; case 80: name += "Szarotek"; break;
                case 81: name += "Śnieżynka"; break; case 82: name += "Trzęsawiec"; break; case 83: name += "Warkoczyk"; break; case 84: name += "Wąsacz"; break; case 85: name += "Wąwoźnik"; break; case 86: name += "Wesołek"; break; case 87: name += "Węgielek"; break; case 88: name += "Wiatrownik"; break; case 89: name += "Wierzbek"; break; case 90: name += "Wietrzyk"; break;
                case 91: name += "Wilczomlecz"; break; case 92: name += "Wilkowyj"; break; case 93: name += "Wodniak"; break; case 94: name += "Wstążka"; break; case 95: name += "Zagórnik"; break; case 96: name += "Zawijas"; break; case 97: name += "Zielniak"; break; case 98: name += "Złocisz"; break; case 99: name += "Żarnik"; break; case 100: name += "Żniwiarz"; break;
            }
        }

        else if (Objects.equals(specie, "Krasnolud")) {
            number = random.nextInt(100) + 1;
            switch (number) {
                case 1: name = "Al"; break; case 2: name = "Ath"; break; case 3: name = "Athran"; break; case 4: name = "Bal"; break; case 5: name = "Bala"; break; case 6: name = "Bara"; break; case 7: name = "Bel"; break; case 8: name = "Bela"; break; case 9: name = "Ber"; break; case 10: name = "Bok"; break;
                case 11: name = "Bor"; break; case 12: name = "Bur"; break; case 13: name = "Da"; break; case 14: name = "Dam"; break; case 15: name = "Dora"; break; case 16: name = "Drok"; break; case 17: name = "Drong"; break; case 18: name = "Dur"; break; case 19: name = "Dwal"; break; case 20: name = "El"; break;
                case 21: name = "Ela"; break; case 22: name = "Elan"; break; case 23: name = "Elda"; break; case 24: name = "Fa"; break; case 25: name = "Far"; break; case 26: name = "Fara"; break; case 27: name = "Fim"; break; case 28: name = "Fima"; break; case 29: name = "Firen"; break; case 30: name = "Fur"; break;
                case 31: name = "Fura"; break; case 32: name = "Ga"; break; case 33: name = "Gim"; break; case 34: name = "Gol"; break; case 35: name = "Gollen"; break; case 36: name = "Got"; break; case 37: name = "Gota"; break; case 38: name = "Grim"; break; case 39: name = "Gro"; break; case 40: name = "Grun"; break;
                case 41: name = "Hak"; break; case 42: name = "Haka"; break; case 43: name = "Har"; break; case 44: name = "Hega"; break; case 45: name = "Hur"; break; case 46: name = "Kad"; break; case 47: name = "Kar"; break; case 48: name = "Kata"; break; case 49: name = "Kaz"; break; case 50: name = "Kaza"; break;
                case 51: name = "Krag"; break; case 52: name = "Logaz"; break; case 53: name = "Lok"; break; case 54: name = "Lun"; break; case 55: name = "Mo"; break; case 56: name = "Mola"; break; case 57: name = "Mora"; break; case 58: name = "No"; break; case 59: name = "Nola"; break; case 60: name = "Nor"; break;
                case 61: name = "Noran"; break; case 62: name = "Nun"; break; case 63: name = "Oda"; break; case 64: name = "Oka"; break; case 65: name = "Olla"; break; case 66: name = "Olf"; break; case 67: name = "Oth"; break; case 68: name = "Othra"; break; case 69: name = "Mor"; break; case 70: name = "Ro"; break;
                case 71: name = "Ror"; break; case 72: name = "Roran"; break; case 73: name = "Ska"; break; case 74: name = "Skalla"; break; case 75: name = "Skalf"; break; case 76: name = "Skar"; break; case 77: name = "Skor"; break; case 78: name = "Skora"; break; case 79: name = "Snor"; break; case 80: name = "Snora"; break;
                case 81: name = "Sven"; break; case 82: name = "Thar"; break; case 83: name = "Thor"; break; case 84: name = "Thora"; break; case 85: name = "Thron"; break; case 86: name = "Thrun"; break; case 87: name = "Thura"; break; case 88: name = "Un"; break; case 89: name = "Utha"; break; case 90: name = "Ulla"; break;
                case 91: name = "Vala"; break; case 92: name = "Var"; break; case 93: name = "Vara"; break; case 94: name = "Zak"; break; case 95: name = "Zaka"; break; case 96: name = "Zakan"; break; case 97: name = "Zar"; break; case 98: name = "Zara"; break; case 99: name = "Zam"; break; case 100: name = "Zama"; break;
            }
            switch (sex) {
                case "Mężczyzna":
                    number = random.nextInt(53) + 1;
                    switch (number) {
                        case 1: name += "bin"; break; case 2: name += "bor"; break; case 3: name += "dil"; break; case 4: name += "din"; break; case 5: name += "dok"; break; case 6: name += "dor"; break; case 7: name += "drin"; break; case 8: name += "fin"; break; case 9: name += "gan"; break; case 10: name += "gar"; break;
                        case 11: name += "gil"; break; case 12: name += "gin"; break; case 13: name += "gni"; break; case 14: name += "grom"; break; case 15: name += "grond"; break; case 16: name += "groth"; break; case 17: name += "grum"; break; case 18: name += "grund"; break; case 19: name += "grunt"; break; case 20: name += "gon"; break;
                        case 21: name += "gor"; break; case 22: name += "grim"; break; case 23: name += "grin"; break; case 24: name += "gul"; break; case 25: name += "gun"; break; case 26: name += "gund"; break; case 27: name += "ki"; break; case 28: name += "kin"; break; case 29: name += "krag"; break; case 30: name += "kri"; break;
                        case 31: name += "krin"; break; case 32: name += "li"; break; case 33: name += "lin"; break; case 34: name += "lik"; break; case 35: name += "lok"; break; case 36: name += "lun"; break; case 37: name += "min"; break; case 38: name += "mir"; break; case 39: name += "nin"; break; case 40: name += "nir"; break;
                        case 41: name += "rag"; break; case 42: name += "ri"; break; case 43: name += "rig"; break; case 44: name += "rik"; break; case 45: name += "rin"; break; case 46: name += "run"; break; case 47: name += "skin"; break; case 48: name += "tin"; break; case 49: name += "tok"; break; case 50: name += "trek"; break;
                        case 51: name += "trok"; break; case 52: name += "zin"; break; case 53: name += "zor"; break;
                    }
                    break;
                case "Kobieta":
                    number = random.nextInt(55) + 1;
                    switch (number) {
                        case 1: name += "bina"; break; case 2: name += "bora"; break; case 3: name += "dila"; break; case 4: name += "dina"; break; case 5: name += "dokina"; break; case 6: name += "dora"; break; case 7: name += "drinella"; break; case 8: name += "fina"; break; case 9: name += "fya"; break; case 10: name += "gana"; break;
                        case 11: name += "gara"; break; case 12: name += "gella"; break; case 13: name += "gina"; break; case 14: name += "groma"; break; case 15: name += "grondella"; break; case 16: name += "grotha"; break; case 17: name += "gruma"; break; case 18: name += "grunda"; break; case 19: name += "gruntina"; break; case 20: name += "gona"; break;
                        case 21: name += "gora"; break; case 22: name += "grimella"; break; case 23: name += "grina"; break; case 24: name += "gromina"; break; case 25: name += "gula"; break; case 26: name += "gunella"; break; case 27: name += "gundina"; break; case 28: name += "kina"; break; case 29: name += "kragella"; break; case 30: name += "krina"; break;
                        case 31: name += "kya"; break; case 32: name += "lina"; break; case 33: name += "likina"; break; case 34: name += "loka"; break; case 35: name += "luna"; break; case 36: name += "mina"; break; case 37: name += "mira"; break; case 38: name += "nina"; break; case 39: name += "nira"; break; case 40: name += "nya"; break;
                        case 41: name += "ragina"; break; case 42: name += "riga"; break; case 43: name += "rika"; break; case 44: name += "rina"; break; case 45: name += "runa"; break; case 46: name += "runella"; break; case 47: name += "skina"; break; case 48: name += "skinella"; break; case 49: name += "tina"; break; case 50: name += "toka"; break;
                        case 51: name += "treskella"; break; case 52: name += "treskina"; break; case 53: name += "troka"; break; case 54: name += "zina"; break; case 55: name += "zora"; break;
                    }
            }
        }

        else {
            number = random.nextInt(100) + 1;
            switch (number) {
                case 1: name = "Aed"; break; case 2: name = "Ael"; break; case 3: name = "Aelf"; break; case 4: name = "Aen"; break; case 5: name = "Aeth"; break; case 6: name = "Alth"; break; case 7: name = "An"; break; case 8: name = "And"; break; case 9: name = "Ar"; break; case 10: name = "Arg"; break;
                case 11: name = "Ast"; break; case 12: name = "Ath"; break; case 13: name = "Av"; break; case 14: name = "Ban"; break; case 15: name = "Bel"; break; case 16: name = "Beth"; break; case 17: name = "Cad"; break; case 18: name = "Cael"; break; case 19: name = "Caem"; break; case 20: name = "Caeth"; break;
                case 21: name = "Cal"; break; case 22: name = "Cam"; break; case 23: name = "Cel"; break; case 24: name = "Cir"; break; case 25: name = "El"; break; case 26: name = "Eld"; break; case 27: name = "Elth"; break; case 28: name = "En"; break; case 29: name = "End"; break; case 30: name = "Er"; break;
                case 31: name = "Ers"; break; case 32: name = "Fand"; break; case 33: name = "Fer"; break; case 34: name = "Ferg"; break; case 35: name = "Fim"; break; case 36: name = "Fin"; break; case 37: name = "Gal"; break; case 38: name = "Gald"; break; case 39: name = "Gaen"; break; case 40: name = "Gaes"; break;
                case 41: name = "Ged"; break; case 42: name = "Gen"; break; case 43: name = "Ges"; break; case 44: name = "Geth"; break; case 45: name = "Glor"; break; case 46: name = "Has"; break; case 47: name = "Hath"; break; case 48: name = "Hel"; break; case 49: name = "Heth"; break; case 50: name = "Hith"; break;
                case 51: name = "Ill"; break; case 52: name = "Ind"; break; case 53: name = "Ist"; break; case 54: name = "Ith"; break; case 55: name = "Iy"; break; case 56: name = "Kor"; break; case 57: name = "Ky"; break; case 58: name = "Kyr"; break; case 59: name = "La"; break; case 60: name = "Lan"; break;
                case 61: name = "Lil"; break; case 62: name = "Lim"; break; case 63: name = "Lith"; break; case 64: name = "Loth"; break; case 65: name = "Mal"; break; case 66: name = "Mar"; break; case 67: name = "Mas"; break; case 68: name = "Math"; break; case 69: name = "Me"; break; case 70: name = "Mes"; break;
                case 71: name = "Meth"; break; case 72: name = "Men"; break; case 73: name = "Mor"; break; case 74: name = "Mort"; break; case 75: name = "Nal"; break; case 76: name = "Nar"; break; case 77: name = "Nen"; break; case 78: name = "Nor"; break; case 79: name = "Norl"; break; case 80: name = "Ri"; break;
                case 81: name = "Riabb"; break; case 82: name = "Riann"; break; case 83: name = "Rid"; break; case 84: name = "Riell"; break; case 85: name = "Rien"; break; case 86: name = "Ruth"; break; case 87: name = "Ryn"; break; case 88: name = "Tab"; break; case 89: name = "Tal"; break; case 90: name = "Tan"; break;
                case 91: name = "Tar"; break; case 92: name = "Teth"; break; case 93: name = "Tel"; break; case 94: name = "Tor"; break; case 95: name = "Ty"; break; case 96: name = "Ul"; break; case 97: name = "Um"; break; case 98: name = "Ur"; break; case 99: name = "Yr"; break; case 100: name = "Yv"; break;
            }
            number = random.nextInt(50) + 1;
            switch (number) {
                case 1: name += "a"; break; case 2: name += "al"; break; case 3: name += "an"; break; case 4: name += "ar"; break; case 5: name += "as"; break; case 6: name += "e"; break; case 7: name += "el"; break; case 8: name += "en"; break; case 9: name += "er"; break; case 10: name += "es"; break;
                case 11: name += "fan"; break; case 12: name += "fen"; break; case 13: name += "fin"; break; case 14: name += "i"; break; case 15: name += "il"; break; case 16: name += "in"; break; case 17: name += "ir"; break; case 18: name += "is"; break; case 19: name += "o"; break; case 20: name += "ol"; break;
                case 21: name += "on"; break; case 22: name += "or"; break; case 23: name += "os"; break; case 24: name += "ra"; break; case 25: name += "ral"; break; case 26: name += "ran"; break; case 27: name += "re"; break; case 28: name += "rel"; break; case 29: name += "ren"; break; case 30: name += "ri"; break;
                case 31: name += "ril"; break; case 32: name += "rin"; break; case 33: name += "ro"; break; case 34: name += "rol"; break; case 35: name += "ron"; break; case 36: name += "ry"; break; case 37: name += "sa"; break; case 38: name += "sal"; break; case 39: name += "san"; break; case 40: name += "se"; break;
                case 41: name += "sel"; break; case 42: name += "sen"; break; case 43: name += "si"; break; case 44: name += "sil"; break; case 45: name += "sin"; break; case 46: name += "so"; break; case 47: name += "sol"; break; case 48: name += "son"; break; case 49: name += "u"; break; case 50: name += "ul"; break;
            }
            switch (sex) {
                case "Mężczyzna":
                    number = random.nextInt(100) + 1;
                    switch (number) {
                        case 1: name += "baen"; break; case 2: name += "baine"; break; case 3: name += "baire"; break; case 4: name += "bar"; break; case 5: name += "bhir"; break; case 6: name += "brier"; break; case 7: name += "brior"; break; case 8: name += "brin"; break; case 9: name += "daen"; break; case 10: name += "daine"; break;
                        case 11: name += "daire"; break; case 12: name += "dar"; break; case 13: name += "dhil"; break; case 14: name += "dhir"; break; case 15: name += "drel"; break; case 16: name += "drir"; break; case 17: name += "dror"; break; case 18: name += "eorl"; break; case 19: name += "eos"; break; case 20: name += "eoth"; break;
                        case 21: name += "fil"; break; case 22: name += "fin"; break; case 23: name += "fir"; break; case 24: name += "hil"; break; case 25: name += "hin"; break; case 26: name += "hir"; break; case 27: name += "hor"; break; case 28: name += "il"; break; case 29: name += "in"; break; case 30: name += "ion"; break;
                        case 31: name += "ir"; break; case 32: name += "is"; break; case 33: name += "ith"; break; case 34: name += "lael"; break; case 35: name += "laen"; break; case 36: name += "laer"; break; case 37: name += "laine"; break; case 38: name += "laire"; break; case 39: name += "lan"; break; case 40: name += "las"; break;
                        case 41: name += "len"; break; case 42: name += "les"; break; case 43: name += "lil"; break; case 44: name += "lin"; break; case 45: name += "lir"; break; case 46: name += "lis"; break; case 47: name += "lor"; break; case 48: name += "los"; break; case 49: name += "mael"; break; case 50: name += "maen"; break;
                        case 51: name += "mair"; break; case 52: name += "main"; break; case 53: name += "mal"; break; case 54: name += "mar"; break; case 55: name += "mil"; break; case 56: name += "min"; break; case 57: name += "mir"; break; case 58: name += "nael"; break; case 59: name += "naen"; break; case 60: name += "naer"; break;
                        case 61: name += "nail"; break; case 62: name += "nair"; break; case 63: name += "nal"; break; case 64: name += "nan"; break; case 65: name += "nar"; break; case 66: name += "nael"; break; case 67: name += "nean"; break; case 68: name += "near"; break; case 69: name += "nil"; break; case 70: name += "nin"; break;
                        case 71: name += "nir"; break; case 72: name += "nis"; break; case 73: name += "ran"; break; case 74: name += "rea"; break; case 75: name += "rel"; break; case 76: name += "ril"; break; case 77: name += "riol"; break; case 78: name += "rion"; break; case 79: name += "rior"; break; case 80: name += "riorl"; break;
                        case 81: name += "riorn"; break; case 82: name += "rir"; break; case 83: name += "ryel"; break; case 84: name += "taen"; break; case 85: name += "tair"; break; case 86: name += "tain"; break; case 87: name += "than"; break; case 88: name += "thar"; break; case 89: name += "thel"; break; case 90: name += "thil"; break;
                        case 91: name += "thir"; break; case 92: name += "thin"; break; case 93: name += "thril"; break; case 94: name += "thrin"; break; case 95: name += "thwe"; break; case 96: name += "til"; break; case 97: name += "tin"; break; case 98: name += "tis"; break; case 99: name += "we"; break; case 100: name += "yan"; break;
                    }
                    break;
                case "Kobieta":
                    number = random.nextInt(100) + 1;
                    switch (number) {
                        case 1: name += "a"; break; case 2: name += "aine"; break; case 3: name += "am"; break; case 4: name += "ann"; break; case 5: name += "arma"; break; case 6: name += "arna"; break; case 7: name += "arth"; break; case 8: name += "ath"; break; case 9: name += "beann"; break; case 10: name += "bet"; break;
                        case 11: name += "beth"; break; case 12: name += "brim"; break; case 13: name += "brys"; break; case 14: name += "deann"; break; case 15: name += "det"; break; case 16: name += "deth"; break; case 17: name += "dys"; break; case 18: name += "drian"; break; case 19: name += "driel"; break; case 20: name += "drys"; break;
                        case 21: name += "eann"; break; case 22: name += "aenna"; break; case 23: name += "earna"; break; case 24: name += "earth"; break; case 25: name += "elle"; break; case 26: name += "eth"; break; case 27: name += "eys"; break; case 28: name += "eyth"; break; case 29: name += "felle"; break; case 30: name += "fionn"; break;
                        case 31: name += "flys"; break; case 32: name += "fyll"; break; case 33: name += "fynn"; break; case 34: name += "fyr"; break; case 35: name += "fys"; break; case 36: name += "i"; break; case 37: name += "ille"; break; case 38: name += "ina"; break; case 39: name += "ira"; break; case 40: name += "isa"; break;
                        case 41: name += "ithi"; break; case 42: name += "itt"; break; case 43: name += "la"; break; case 44: name += "lam"; break; case 45: name += "lana"; break; case 46: name += "larna"; break; case 47: name += "lath"; break; case 48: name += "leann"; break; case 49: name += "leath"; break; case 50: name += "lel"; break;
                        case 51: name += "lelle"; break; case 52: name += "leth"; break; case 53: name += "let"; break; case 54: name += "lielle"; break; case 55: name += "lieth"; break; case 56: name += "lyann"; break; case 57: name += "nelle"; break; case 58: name += "nem"; break; case 59: name += "neth"; break; case 60: name += "ni"; break;
                        case 61: name += "niell"; break; case 62: name += "niella"; break; case 63: name += "nith"; break; case 64: name += "ras"; break; case 65: name += "reann"; break; case 66: name += "rell"; break; case 67: name += "relle"; break; case 68: name += "rielle"; break; case 69: name += "ris"; break; case 70: name += "rith"; break;
                        case 71: name += "rys"; break; case 72: name += "sar"; break; case 73: name += "sath"; break; case 74: name += "ser"; break; case 75: name += "seth"; break; case 76: name += "sir"; break; case 77: name += "sith"; break; case 78: name += "sor"; break; case 79: name += "soth"; break; case 80: name += "shar"; break;
                        case 81: name += "sher"; break; case 82: name += "shir"; break; case 83: name += "sys"; break; case 84: name += "tar"; break; case 85: name += "teal"; break; case 86: name += "teann"; break; case 87: name += "ter"; break; case 88: name += "thea"; break; case 89: name += "ther"; break; case 90: name += "thi"; break;
                        case 91: name += "thryn"; break; case 92: name += "thyn"; break; case 93: name += "tir"; break; case 94: name += "tos"; break; case 95: name += "tryan"; break; case 96: name += "trys"; break; case 97: name += "yll"; break; case 98: name += "yrs"; break; case 99: name += "tor"; break; case 100: name += "ys"; break;
                    }
                    break;
            }
            number = random.nextInt(100) + 1;
            switch (number) {
                case 1: if (Objects.equals(sex, "Mężczyzna")) name += " Białowłosy"; else name += " Białowłosa"; break;
                case 2: name += " Błękit Pióra"; break;
                case 3: name += " Błękit Skrzydła"; break;
                case 4: name += " Błysk Klingi"; break;
                case 5: name += " Błysk Pioruna"; break;
                case 6: name += " Błysk Stali"; break;
                case 7: name += " Bystrooki"; break;
                case 8: if (Objects.equals(sex, "Mężczyzna")) name += " Ciemnowłosy"; else name += " Ciemnowłosa"; break;
                case 9: name += " Cienista Dolina"; break;
                case 10: name += " Czarne Drzewo"; break;
                case 11: name += " Czarny Kurhan"; break;
                case 12: name += " Czysty Zdrój"; break;
                case 13: name += " Dech Lasu"; break;
                case 14: name += " Dębowy Konar"; break;
                case 15: name += " Dotyk Nocy"; break;
                case 16: name += " Dzikie Serce"; break;
                case 17: name += " Gwiazda Wieczorna"; break;
                case 18: name += " Gwiazda Zaranna"; break;
                case 19: name += " Gwiezdne Oko"; break;
                case 20: name += " Gwiezdny Ogień"; break;
                case 21: name += " Jasna Gwiazda"; break;
                case 22: if (Objects.equals(sex, "Mężczyzna")) name += " Jasnooki"; else name += " Jasnooka"; break;
                case 23: name += " Jastrzębie Oko"; break;
                case 24: if (Objects.equals(sex, "Mężczyzna")) name += " Jaśniejący"; else name += " Jaśniejąca"; break;
                case 25: name += " Gwiezdny Pył"; break;
                case 26: name += " Jeleni Skok"; break;
                case 27: name += " Kieł Wilka"; break;
                case 28: name += " Korona Słońca"; break;
                case 29: name += " Krzyk Puchacza"; break;
                case 30: name += " Księżycowy Blask"; break;
                case 31: name += " Księżycowy Mrok"; break;
                case 32: name += " Kwiat Młodości"; break;
                case 33: name += " Lot Sokoła"; break;
                case 34: name += " Lśniąca Góra"; break;
                case 35: name += " Lśniący Grot"; break;
                case 36: name += " Lśniący Księżyc"; break;
                case 37: name += " Mądre Serce"; break;
                case 38: name += " Mądrość Klanu"; break;
                case 39: name += " Mężne Serce"; break;
                case 40: name += " Młody Liść"; break;
                case 41: name += " Moc Dębu"; break;
                case 42: name += " Moc Korzeni"; break;
                case 43: name += " Moc Różdżki"; break;
                case 44: name += " Morska Fala"; break;
                case 45: name += " Morska Piana"; break;
                case 46: name += " Mroczne Ostrze"; break;
                case 47: name += " Nocny Łowca"; break;
                case 48: name += " Oko Wilka"; break;
                case 49: name += " Oko Wizji"; break;
                case 50: name += " Oko Zieleni"; break;
                case 51: name += " Opadający Liść"; break;
                case 52: name += " Opoka Siły"; break;
                case 53: name += " Orzeł Mroku"; break;
                case 54: name += " Ostre Ostrze"; break;
                case 55: name += " Ostry Grot"; break;
                case 56: name += " Pajęcza Nić"; break;
                case 57: name += " Patrzący w Dal"; break;
                case 58: name += " Podmuch Wichury"; break;
                case 59: name += " Poranna Rosa"; break;
                case 60: name += " Półksiężyc"; break;
                case 61: name += " Promyk Słońca"; break;
                case 62: name += " Przyjaciel Zwierząt"; break;
                case 63: name += " Radosne Serce"; break;
                case 64: name += " Różany Kwiat"; break;
                case 65: name += " Ryk Burzy"; break;
                case 66: if (Objects.equals(sex, "Mężczyzna")) name += " Silnoręki"; else name += " Silnoręka"; break;
                case 67: if (Objects.equals(sex, "Mężczyzna")) name += " Smoczy Brat"; else name += " Smocza Siostra"; break;
                case 68: name += " Smukłe Ostrze"; break;
                case 69: name += " Smukły Grot"; break;
                case 70: name += " Spokój Fal"; break;
                case 71: name += " Spokój Kamienia"; break;
                case 72: name += " Spokój Lasu"; break;
                case 73: if (Objects.equals(sex, "Mężczyzna")) name += " Srebrnowłosy"; else name += " Srebrnowłosa"; break;
                case 74: name += " Srebrny Liść"; break;
                case 75: name += " Srebrny Świt"; break;
                case 76: name += " Strzała Mocy"; break;
                case 77: name += " Szybki Grot"; break;
                case 78: name += " Szybkie Ostrze"; break;
                case 79: name += " Śnieżny Puch"; break;
                case 80: name += " Śpiew Dzikości"; break;
                case 81: name += " Śpiew Wiatru"; break;
                case 82: name += " Ukryty w Cieniu"; break;
                case 83: name += " Uśmiech Wiatru"; break;
                case 84: name += " Wartki Strumyk"; break;
                case 85: name += " Wędrowiec"; break;
                case 86: name += " Wiatr Wśród Traw"; break;
                case 87: name += " Wiatroskrzydły"; break;
                case 88: name += " Wieża Mądrości"; break;
                case 89: name += " Wodny Wir"; break;
                case 90: name += " Wschodzące Słońce"; break;
                case 91: name += " Wszechwidzący"; break;
                case 92: name += " Wyniosły Dąb"; break;
                case 93: name += " Wysoki Brzeg"; break;
                case 94: name += " Zachodzące Słońce"; break;
                case 95: name += " Zieleń Pióra"; break;
                case 96: name += " Zieleń Skrzydła"; break;
                case 97: name += " Zielona Dolina"; break;
                case 98: name += " Złocisty Obłok"; break;
                case 99: name += " Złota Struga"; break;
                case 100: if (Objects.equals(sex, "Mężczyzna")) name += " Złotowłosy"; else name += " Złotowłosa"; break;
            }
        }
    }

    private void generateCareer(String specie) {

    }

    private void generateAttributes(String specie){

    }

    private void generateSkills(String specie, Career career) {

    }

    private void generateTalents(String specie, Career career) {
        Random random = new Random();
        Talent talent;


    }



}
